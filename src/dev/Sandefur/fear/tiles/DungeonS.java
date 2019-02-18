package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class DungeonS extends Tile {

	public DungeonS(int id) {
		super(Assets.dwS, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
