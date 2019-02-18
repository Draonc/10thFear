package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class WallSE extends Tile {

	public WallSE(int id) {
		super(Assets.wSE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
