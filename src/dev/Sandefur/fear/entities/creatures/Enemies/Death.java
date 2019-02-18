package dev.Sandefur.fear.entities.creatures.Enemies;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.creatures.Creature;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.utils.CreaturesUtil;
import dev.Sandefur.fear.worlds.FailureWorld;

public class Death extends Enemy {

	//Animations
	private Animation animDown, animUp, animLeft, animRight;
	private Boolean dead;
		
	public Death(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT, 15);
		
		bounds.x = 75;
		bounds.y = 28;
		bounds.width = 36;
		bounds.height = 47;
		dead = false;
		
		//Animatons
		animDown = new Animation(500, Assets.death_down);
		animUp = new Animation(500, Assets.death_up);
		animLeft = new Animation(500, Assets.death_left);
		animRight = new Animation(500, Assets.death_right);
	}
	
	

	public Boolean getDead() {
		return dead;
	}



	public void setDead(Boolean dead) {
		this.dead = dead;
	}
	
	public void death() {
		if (health <= 0) {
			JukeBox.play("EDie");
			setDead(true);
			handler.getWorld().getEntityManager().removeEntity(this);
			FailureWorld.kill();
			
		}
	}



	@Override
	public void tick() {
		//Animations
		animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();
		
		//Action
		look();
		action();
		attack();
		walk();
		move();
		damage();
		death();
		}
	
	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), 
				    (int) (y - handler.getGameCamera().getyOffset()), width * 3,(int)(height * 1.5), null);
		
		//g.setColor(Color.blue);
	//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//	(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	
	}
	
	public void attack() {
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager
				.getPlayer().getY() + 32, x + bounds.x, y + bounds.y) < 47) {
			touched = true;
		} else
			touched = false;

		if (touched && timer.run(.7f)) {
			CourageBar.decCourage();
			timer.Start();
			if (up) {
				handler.getWorld().getEntityManager().getPlayer().setxMove(-speed * 20);
				handler.getWorld().getEntityManager().getPlayer().setyMove(0);
			}

			if (down) {
				handler.getWorld().getEntityManager().getPlayer().setxMove(speed * 20);
				handler.getWorld().getEntityManager().getPlayer().setyMove(0);
			}

			if (left) {
				handler.getWorld().getEntityManager().getPlayer().setyMove(speed * 20);
				handler.getWorld().getEntityManager().getPlayer().setxMove(0);
			}

			if (right) {
				handler.getWorld().getEntityManager().getPlayer().setyMove(-speed * 20);
				handler.getWorld().getEntityManager().getPlayer().setxMove(0);
			}
		}
	}
	
	
	private BufferedImage getCurrentAnimationFrame(){
		if(xMove < 0){
			return animLeft.getCurrentFrame();
		}else if(xMove > 0){
			return animRight.getCurrentFrame();
		}else if(yMove < 0){
			return animUp.getCurrentFrame();
		}else{
			return animDown.getCurrentFrame();
		}
	}
}

