package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.SkyWorld;
import dev.Sandefur.fear.worlds.World;

public class HeightsState extends State{
	private World world;

	public HeightsState(Handler handler) {
		super(handler);
		world =  new SkyWorld(handler, "/worlds/Height.txt", 8);
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
