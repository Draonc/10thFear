package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.DarkWorld;
import dev.Sandefur.fear.worlds.World;

public class DarkState extends State{
	private World world;

	public DarkState(Handler handler) {
		super(handler);
		world =  new DarkWorld(handler, "/worlds/Dark1.txt");
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