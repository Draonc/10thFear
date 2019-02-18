package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class SolidPDL extends Tile {

	public SolidPDL(int id) {
		super(Assets.PDNW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
