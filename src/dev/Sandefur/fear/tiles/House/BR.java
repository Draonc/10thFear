package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class BR extends Tile {

	public BR(int id) {
		super(Assets.b1Right, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
