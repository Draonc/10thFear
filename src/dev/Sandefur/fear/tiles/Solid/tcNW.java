package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class tcNW extends Tile {

	public tcNW(int id) {
		super(Assets.tcNW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
