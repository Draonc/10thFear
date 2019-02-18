package dev.Sandefur.fear.entities.creatures.Enemies;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.creatures.Creature;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class Bee extends PlatformerEnemy {

	//Animations
	private Animation animLeft, animRight;
	private int xStart, xEnd;
		
	public Bee(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT, 5, 1);
		
		bounds.x = 15;
		bounds.y = 28;
		bounds.width = 36;
		bounds.height = 35;
		xStart = -2;
		xEnd = Tile.TILEWIDTH * 16;

		
		//Animatons
		animLeft = new Animation(500, Assets.bee_left);
		animRight = new Animation(500, Assets.bee_right);
	}
	
	public void chooseDirection() {
		int ty2 = (int) (y + yMove + bounds.y + 1) / Tile.TILEHEIGHT;
		if (collisionWithTile((int) (x + bounds.x - 1) / Tile.TILEWIDTH, ty2)) {
			moveRight = true;
			moveLeft = false;
		}

		if (collisionWithTile((int) (x + bounds.x + bounds.width + 1) / Tile.TILEWIDTH, ty2)) {
			moveRight = false;
			moveLeft = true;
		}
	}
	
	

	@Override
	public void tick() {
		//Animations
		animRight.tick();
		animLeft.tick();
		
		//Action
		wrap();
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
	
	private void wrap() {
			if (x > xEnd)
				x = xStart;

			if (x < xStart)
				x = xEnd - 10;

	}
	
	
	private BufferedImage getCurrentAnimationFrame(){
		if(xMove < 0){
			return animLeft.getCurrentFrame();
		}else
			return animRight.getCurrentFrame();
	}
}

