package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class tfNE extends Tile {

	public tfNE(int id) {
		super(Assets.tfNE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
