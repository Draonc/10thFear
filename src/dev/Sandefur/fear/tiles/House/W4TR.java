package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W4TR extends Tile {

	public W4TR(int id) {
		super(Assets.w4TopRig, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
