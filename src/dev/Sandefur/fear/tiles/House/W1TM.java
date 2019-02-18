package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W1TM extends Tile {

	public W1TM(int id) {
		super(Assets.w1TopMid, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
