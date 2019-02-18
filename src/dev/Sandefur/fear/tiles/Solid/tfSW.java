package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class tfSW extends Tile {

	public tfSW(int id) {
		super(Assets.tfSW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
