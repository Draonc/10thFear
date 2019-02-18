package dev.Sandefur.fear.entities.creatures.NPC;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.Trade.Cookies;
import dev.Sandefur.fear.entities.Static.Trade.DressTrade;
import dev.Sandefur.fear.entities.Static.Trade.Vegtables;
import dev.Sandefur.fear.entities.creatures.Creature;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;

public class Horse extends NPC {

	//Animations
	private Animation animDown, animUp, animLeft, animRight;
		
	public Horse(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 15;
		bounds.y = 28;
		bounds.width = 36;
		bounds.height = 37;
		//Animatons
		animDown = new Animation(300, Assets.greyHorse_down);
		animUp = new Animation(300, Assets.greyHorse_up);
		animLeft = new Animation(300, Assets.greyHorse_left);
		animRight = new Animation(300, Assets.greyHorse_right);
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
		walk();
		move();
		}
	
	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), 
				    (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	
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