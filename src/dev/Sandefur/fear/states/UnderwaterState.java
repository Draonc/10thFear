package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.UnderWaterWorld;
import dev.Sandefur.fear.worlds.World;

public class UnderwaterState extends State {
	private World world;

	public UnderwaterState(Handler handler) {
		super(handler);
		world = new UnderWaterWorld(handler,"/worlds/Drowning2.txt");
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
