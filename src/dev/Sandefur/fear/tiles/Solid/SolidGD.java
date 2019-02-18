package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class SolidGD extends Tile {

	public SolidGD(int id) {
		super(Assets.sgdNW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
