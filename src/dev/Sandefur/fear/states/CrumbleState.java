package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.CrumblingWorld;
import dev.Sandefur.fear.worlds.World;

public class CrumbleState extends State {
	private World world;

	public CrumbleState(Handler handler) {
		super(handler);
		world = new CrumblingWorld(handler, "/worlds/WorldCrumbling1.txt");
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
