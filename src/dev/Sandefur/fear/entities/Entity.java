package dev.Sandefur.fear.entities;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import dev.Sandefur.fear.Handler;

public abstract class Entity {

	protected Handler handler;
	protected float x, y;
	protected static int width;
	protected int height;
	protected Rectangle bounds;
	public static int mode;
	
	public Entity(Handler handler, float x, float y, int width, int height){
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		bounds = new Rectangle(0, 0, width, height);
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics2D g);
	
	public boolean checkEntityCollisions(float xOffset, float yOffset){
				
		for(Entity e : handler.getWorld().getEntityManager().getEntities()){
			if(e.equals(this))
				continue;
			if(e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
				return true;
		}
		return false;
	}
	
	public boolean checkPlayerCollision(float xOffset, float yOffset){
		Entity e = this;
		if (e.getCollisionBounds(xOffset, yOffset).intersects(handler.getWorld().getEntityManager().getPlayer().getCollisionBounds(0f, 0f)))
			return true;
		else
			return false;
	}
	
	public Rectangle getCollisionBounds(float xOffset, float yOffset){
		return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset),bounds.width,bounds.height);
	}
	
	public boolean intersects(Entity o) {
		return getRectangle().intersects(o.getRectangle());
	}
		
	public Rectangle getRectangle() {
		return new Rectangle((int) x,(int) y, width, height);
	} 
	
	public Rectangle getBounds() {
		return bounds;
	} 
	

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
