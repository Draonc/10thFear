package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W2TR extends Tile {

	public W2TR(int id) {
		super(Assets.w2TopRig, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
