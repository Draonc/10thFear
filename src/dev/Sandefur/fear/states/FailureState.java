package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.FailureWorld;
import dev.Sandefur.fear.worlds.World;

public class FailureState extends State {
	private World world;

	public FailureState(Handler handler) {
		super(handler);
		world = new FailureWorld(handler, "/worlds/Failure.txt");
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
