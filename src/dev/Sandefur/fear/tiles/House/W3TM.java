package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W3TM extends Tile {

	public W3TM(int id) {
		super(Assets.w3TopMid, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
