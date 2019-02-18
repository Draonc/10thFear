package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class SolidD extends Tile {

	public SolidD(int id) {
		super(Assets.dirt, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
