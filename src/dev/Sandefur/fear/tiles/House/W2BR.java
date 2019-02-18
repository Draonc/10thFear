package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W2BR extends Tile {

	public W2BR(int id) {
		super(Assets.w2BotRig, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
