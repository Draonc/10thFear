package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W3TL extends Tile {

	public W3TL(int id) {
		super(Assets.w3TopLef, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
