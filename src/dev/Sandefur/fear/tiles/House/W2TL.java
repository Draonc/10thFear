package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W2TL extends Tile {

	public W2TL(int id) {
		super(Assets.w2TopLef, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
