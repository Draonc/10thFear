package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W2BL extends Tile {

	public W2BL(int id) {
		super(Assets.w2BotLef, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
