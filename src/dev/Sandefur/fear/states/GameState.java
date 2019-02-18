package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.OverWorld;
import dev.Sandefur.fear.worlds.World;



public class GameState extends State {
	
	private World world;
	
	public GameState(Handler handler){
		super(handler);
		world = new OverWorld(handler, "/worlds/world1.txt");
		handler.setWorld(world);
	}
	
	@Override
	public void tick() {
		world.tick();
	}

	@Override
	public void render(Graphics2D g) {
		world.render(g);
	}

}
