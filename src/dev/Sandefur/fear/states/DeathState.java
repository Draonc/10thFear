package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.DeathWorld;
import dev.Sandefur.fear.worlds.World;

public class DeathState extends State {
	private World world;

	public DeathState(Handler handler) {
		super(handler);
		world = new DeathWorld(handler, "/worlds/Death.txt");
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
