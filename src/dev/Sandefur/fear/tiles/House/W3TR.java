package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W3TR extends Tile {

	public W3TR(int id) {
		super(Assets.w3TopRig, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
