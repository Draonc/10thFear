package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W2BM extends Tile {

	public W2BM(int id) {
		super(Assets.w2BotMid, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
