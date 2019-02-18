package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class BL extends Tile {

	public BL(int id) {
		super(Assets.b1Left, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
