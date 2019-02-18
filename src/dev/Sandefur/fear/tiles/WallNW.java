package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class WallNW extends Tile {

	public WallNW(int id) {
		super(Assets.wNW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
