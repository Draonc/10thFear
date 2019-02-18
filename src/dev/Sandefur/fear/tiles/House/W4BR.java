package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W4BR extends Tile {

	public W4BR(int id) {
		super(Assets.w4BotRig, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
