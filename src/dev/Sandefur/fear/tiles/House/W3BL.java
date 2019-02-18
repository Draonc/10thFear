package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W3BL extends Tile {

	public W3BL(int id) {
		super(Assets.w3BotLef, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
