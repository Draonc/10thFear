package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class WallSW extends Tile {

	public WallSW(int id) {
		super(Assets.wSW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
