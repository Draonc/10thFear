package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W1BR extends Tile {

	public W1BR(int id) {
		super(Assets.w1BotRig, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
