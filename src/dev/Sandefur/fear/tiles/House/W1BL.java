package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W1BL extends Tile {

	public W1BL(int id) {
		super(Assets.w1BotLef, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
