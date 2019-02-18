package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W4TM extends Tile {

	public W4TM(int id) {
		super(Assets.w4TopMid, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
