package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class tcSW extends Tile {

	public tcSW(int id) {
		super(Assets.tcSW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
