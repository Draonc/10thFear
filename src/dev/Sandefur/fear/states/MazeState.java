package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.MazeWorld;
import dev.Sandefur.fear.worlds.World;

public class MazeState extends State {
	private World world;

	public MazeState(Handler handler) {
		super(handler);
		world = new MazeWorld(handler, "/worlds/Maze1-1.txt");
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
