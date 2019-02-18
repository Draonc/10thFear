package dev.Sandefur.fear.entities.Static;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Entity;

public abstract class StaticEntity extends Entity {
	
	public StaticEntity(Handler handler, float x, float y, int width, int height){
		super(handler, x, y, width, height);
		
		bounds.x = 0;
		bounds.y = 15;
		bounds.width = 64;
		bounds.height = 49;
	}

}
