package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class BB extends Tile {

	public BB(int id) {
		super(Assets.b1Bot, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
