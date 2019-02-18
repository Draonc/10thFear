package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class DungeonW extends Tile {

	public DungeonW(int id) {
		super(Assets.dwW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
