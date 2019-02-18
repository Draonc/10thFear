package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class tfNW extends Tile {

	public tfNW(int id) {
		super(Assets.tfNW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
