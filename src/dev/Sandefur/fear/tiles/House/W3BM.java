package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W3BM extends Tile {

	public W3BM(int id) {
		super(Assets.w3BotMid, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
