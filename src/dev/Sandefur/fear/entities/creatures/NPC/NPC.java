package dev.Sandefur.fear.entities.creatures.NPC;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.Random;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.Dialogues.Dialogue;
import dev.Sandefur.fear.entities.Entity;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.Trade.Bear;
import dev.Sandefur.fear.entities.Static.Trade.Book;
import dev.Sandefur.fear.entities.Static.Trade.Cape;
import dev.Sandefur.fear.entities.Static.Trade.Cookies;
import dev.Sandefur.fear.entities.Static.Trade.DressTrade;
import dev.Sandefur.fear.entities.Static.Trade.Med;
import dev.Sandefur.fear.entities.Static.Trade.Portrait;
import dev.Sandefur.fear.entities.Static.Trade.Recipe1;
import dev.Sandefur.fear.entities.Static.Trade.Recipe2;
import dev.Sandefur.fear.entities.Static.Trade.TradeBag;
import dev.Sandefur.fear.entities.Static.Trade.Vegtables;
import dev.Sandefur.fear.entities.creatures.Creature;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;
import dev.Sandefur.fear.utils.Timer;
import dev.Sandefur.fear.worlds.ForgottenWorld;

public abstract class NPC extends Creature {
	
	protected Entity target = null;
	protected static final float DAMPING = 0.5f;
	protected Boolean touched = false, shouldSet = true, resting = false;
	protected static Boolean speaking = false;
	protected String name;
	protected Timer timer = new Timer();
	protected int startX, startY;
	
	protected float speedx, speedy;
	protected float maxSpeed = speed * DAMPING;
	protected float minSpeed = -speed * DAMPING;
	
	protected String speak = null;
	
	protected Random rand = new Random();

	

	public NPC(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);

		startX = (int) x;
		startY = (int) y;
		
	}
	
	//Looks to see if the player is close.
	public void look(){
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32, y + 32) < 32)
			setTarget(EntityManager.getPlayer());
		else
			setTarget(null);
		
		
		xMove = 0;
		yMove = 0;
		}

	public void action(){
		if(target == null){
			look();
			idle();
		}else{
			speedx = 0;
			speedy = 0;
		}
	}
	
	
	//Creature chooses a random direction and walks when not chasing player
	public void idle(){
		if (CreaturesUtil.dist(startX, startY, x, y) < 500){
			if (!resting){
				if(shouldSet){
					speedx = chooseDirection(); 
					speedy = chooseDirection();
					shouldSet = false;
					timer.Start();
				}else if (timer.run(2)){
					resting = true;
					shouldSet = true;
					timer.Start();
				}
			}else if(timer.run(5)){
				speedx = 0;
				speedy = 0;
				resting = false;
			}
		}else{
			speedx = startX - x;
			speedy = startY - y;
		}
	}
		
	public int chooseDirection(){
		int[] randDirection = new int[3];
		randDirection[0] = 0;
		randDirection[1] = 1;
		randDirection[2] = -1;
		int randChoice = rand.nextInt(3);
		return randDirection[randChoice];
	}
	
	public void walk(){
		if(speedx > maxSpeed)
			speedx = maxSpeed;
		if(speedx < minSpeed)
			speedx = minSpeed;
		
		if(speedy > maxSpeed)
			speedy = maxSpeed;
		if(speedy < minSpeed)
			speedy = minSpeed;
		
		xMove = xMove + speedx;
		yMove = yMove + speedy;
	}
	
	public void setTarget(Entity o){
		target = o;
	}
	
	public Entity getTarget(){
		return target;
	}
	
	public String Speak(int num){
		if (Interact() && handler.getKeyManager().interact){
			speak = Dialogue.loadFileAsString("/dialogue/dialogue1", num);
			timer.Start();
			speaking = true;
		}
		return speak;
	}
	
	public static Boolean getSpeaking(){
		return speaking;
	}

	public boolean Interact(){
		return(CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32, y + 32) < 32);
	}
		
	@Override
	public abstract void tick();

	@Override
	public void render(Graphics2D g){

		if(speak != null){			
			g.drawImage(Assets.textBox, 0, 640, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 2, null);
			g.setColor(Color.BLACK);
			g.setFont(new Font("Serif", Font.BOLD, 25));
			g.drawString(name, 110, 670);
			g.drawString(speak, 110, 710);
			if (timer.run(3.5f)){
				speaking = false;
				speak = null;
			}	
		}
	}
}
