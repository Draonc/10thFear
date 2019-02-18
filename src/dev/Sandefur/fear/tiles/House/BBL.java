package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class BBL extends Tile {

	public BBL(int id) {
		super(Assets.b1BL, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
