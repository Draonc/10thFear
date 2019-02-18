package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W4TL extends Tile {

	public W4TL(int id) {
		super(Assets.w4TopLef, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
