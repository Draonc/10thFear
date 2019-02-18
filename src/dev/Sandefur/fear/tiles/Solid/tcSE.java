package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class tcSE extends Tile {

	public tcSE(int id) {
		super(Assets.tcSE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
