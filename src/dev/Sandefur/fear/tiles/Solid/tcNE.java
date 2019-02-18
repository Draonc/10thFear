package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class tcNE extends Tile {

	public tcNE(int id) {
		super(Assets.tcNE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
