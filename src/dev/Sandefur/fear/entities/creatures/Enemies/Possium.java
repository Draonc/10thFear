package dev.Sandefur.fear.entities.creatures.Enemies;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.creatures.Creature;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;

public class Possium extends PlatformerEnemy {

	//Animations
	private Animation animLeft, animRight;
		
	public Possium(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT, 5, 1);
		
		bounds.x = 15;
		bounds.y = 28;
		bounds.width = 36;
		bounds.height = 35;
		
		//Animatons
		animLeft = new Animation(300, Assets.possium_left);
		animRight = new Animation(300, Assets.possium_right);
	}
	
	

	@Override
	public void tick() {
		//Animations
		animRight.tick();
		animLeft.tick();
		
		//Action
		idle();
		attack();
		walk();
		move();
		damage();
		death();
		}
	
	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), 
				    (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		//g.setColor(Color.blue);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	
	}
	
	
	private BufferedImage getCurrentAnimationFrame(){
		if(xMove < 0){
			return animLeft.getCurrentFrame();
		}else
			return animRight.getCurrentFrame();
	}
}

