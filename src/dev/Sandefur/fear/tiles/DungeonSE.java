package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class DungeonSE extends Tile {

	public DungeonSE(int id) {
		super(Assets.dwSE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
