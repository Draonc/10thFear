package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class BT extends Tile {

	public BT(int id) {
		super(Assets.b1Top, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
