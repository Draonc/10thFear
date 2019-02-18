package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.worlds.InjuryWorld;
import dev.Sandefur.fear.worlds.World;



public class InjuryState extends State {
	
	private World world;
	
	public InjuryState(Handler handler){
		super(handler);

		world = new InjuryWorld(handler, "/worlds/Injury1.txt");
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
