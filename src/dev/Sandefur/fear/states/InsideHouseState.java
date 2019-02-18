package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.InsideHouse;
import dev.Sandefur.fear.worlds.World;

public class InsideHouseState extends State{
	private World world;

	public InsideHouseState(Handler handler) {
		super(handler);
		world =  new InsideHouse(handler, "/worlds/InsideHouses.txt");
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
