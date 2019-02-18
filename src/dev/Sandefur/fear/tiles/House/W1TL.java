package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W1TL extends Tile {

	public W1TL(int id) {
		super(Assets.w1TopLef, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
