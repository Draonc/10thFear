package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class SolidGDR extends Tile {

	public SolidGDR(int id) {
		super(Assets.sgdNE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
