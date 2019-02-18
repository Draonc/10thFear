package dev.Sandefur.fear.entities.creatures.NPC;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.Trade.Cookies;
import dev.Sandefur.fear.entities.Static.Trade.DressTrade;
import dev.Sandefur.fear.entities.creatures.Creature;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;

public class Annis extends NPC {

	//Animations
	private Animation animDown, animUp, animLeft, animRight;
	private int dia, trade;
	private Boolean used = false;
		
	public Annis(Handler handler, float x, float y, int dia, int trade) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		name = "Annis";
		
		bounds.x = 15;
		bounds.y = 28;
		bounds.width = 36;
		bounds.height = 37;
		this.dia = dia;
		this.trade = trade;
		
		//Animatons
		animDown = new Animation(500, Assets.Annis_down);
		animUp = new Animation(500, Assets.Annis_up);
		animLeft = new Animation(500, Assets.Annis_left);
		animRight = new Animation(500, Assets.Annis_right);
	}
	
	

	@Override
	public void tick() {
		//Animations
		animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();
		
		//Action
		trade();
		look();
		action();
		Interact();
		walk();
		move();
		setDia();
		Speak(dia);
		}
	
	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), 
				    (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		super.render(g);
	
	}
	
	private void trade(){
		if(trade == 6 && handler.getKeyManager().interact && DressTrade.getHave() && Interact() && !used){
			DressTrade.setHave(false);
			used = true;
			Cookies.setHave(true);
		}
	}
	
	private void setDia(){
		if(DressTrade.getHave())
			dia = 48;
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