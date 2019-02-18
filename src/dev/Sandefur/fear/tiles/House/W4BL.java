package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W4BL extends Tile {

	public W4BL(int id) {
		super(Assets.w4BotLef, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
