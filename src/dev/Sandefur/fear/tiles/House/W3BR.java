package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W3BR extends Tile {

	public W3BR(int id) {
		super(Assets.w3BotRig, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
