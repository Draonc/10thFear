package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class SolidGDL extends Tile {

	public SolidGDL(int id) {
		super(Assets.sgdN, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
