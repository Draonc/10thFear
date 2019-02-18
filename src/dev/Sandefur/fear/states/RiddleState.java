package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.RiddleWorld;
import dev.Sandefur.fear.worlds.World;

public class RiddleState extends State {
	private World world;

	public RiddleState(Handler handler) {
		super(handler);
		world = new RiddleWorld(handler, "/worlds/Riddle.txt");
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
