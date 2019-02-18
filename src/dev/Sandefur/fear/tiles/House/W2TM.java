package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W2TM extends Tile {

	public W2TM(int id) {
		super(Assets.w2TopMid, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
