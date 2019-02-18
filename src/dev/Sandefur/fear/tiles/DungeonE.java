package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class DungeonE extends Tile {

	public DungeonE(int id) {
		super(Assets.dwE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
