package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class W4BM extends Tile {

	public W4BM(int id) {
		super(Assets.w4BotMid, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
