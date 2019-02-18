package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W1BM extends Tile {

	public W1BM(int id) {
		super(Assets.w1BotMid, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
