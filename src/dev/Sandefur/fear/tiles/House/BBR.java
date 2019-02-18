package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class BBR extends Tile {

	public BBR(int id) {
		super(Assets.b1BR, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
