package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class BTL extends Tile {

	public BTL(int id) {
		super(Assets.b1TL, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
