package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class WallNE extends Tile {

	public WallNE(int id) {
		super(Assets.wNE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
