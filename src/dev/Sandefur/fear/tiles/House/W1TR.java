package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W1TR extends Tile {

	public W1TR(int id) {
		super(Assets.w1TopRig, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
