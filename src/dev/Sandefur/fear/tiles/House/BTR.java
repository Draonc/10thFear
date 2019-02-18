package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class BTR extends Tile {

	public BTR(int id) {
		super(Assets.b1TR, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
