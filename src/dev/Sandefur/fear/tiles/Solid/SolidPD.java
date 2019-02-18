package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class SolidPD extends Tile {

	public SolidPD(int id) {
		super(Assets.PDN, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
