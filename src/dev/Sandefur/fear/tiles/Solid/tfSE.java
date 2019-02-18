package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class tfSE extends Tile {

	public tfSE(int id) {
		super(Assets.tfSE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
