package dev.Sandefur.fear.entities.creatures.NPC;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.Trade.Bear;
import dev.Sandefur.fear.entities.Static.Trade.Cape;
import dev.Sandefur.fear.entities.creatures.Creature;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;

public class Tag extends NPC {

	//Animations
	private Animation animDown, animUp, animLeft, animRight;
	private static Boolean cape = true;
	private int dia, trade;
	private Boolean used = false;
		
	public Tag(Handler handler, float x, float y, int dia, int trade) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		name = "Tag";
		
		bounds.x = 15;
		bounds.y = 28;
		bounds.width = 36;
		bounds.height = 37;
		this.dia = dia;
		this.trade = trade;
		
		cape();
	}
	
	public static void setCape(boolean b){
		cape = b;
	}
	
	public void cape(){
		if(cape){
			//Animatons
			animDown = new Animation(500, Assets.Tag_down);
			animUp = new Animation(500, Assets.Tag_up);
			animLeft = new Animation(500, Assets.Tag_left);
			animRight = new Animation(500, Assets.Tag_right);
			}
			
			if(!cape){
				animDown = new Animation(500, Assets.Blake_down);
				animUp = new Animation(500, Assets.Blake_up);
				animLeft = new Animation(500, Assets.Blake_left);
				animRight = new Animation(500, Assets.Blake_right);
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
		Interact();
		walk();
		move();
		trade();
		setDia();
		Speak(dia);
		}
	
	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), 
				    (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		super.render(g);
	
	}
	
	private void setDia(){
		if(cape)
			dia = 11;
	}
	
	public void trade(){
		if(trade == 2 && handler.getKeyManager().interact && Cape.getHave() && Interact() && !used){
			Cape.setHave(false);
			used = true;
			Bear.setHave(true);
			Tag.setCape(true);
			cape();
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

