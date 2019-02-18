package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class DungeonNW extends Tile {

	public DungeonNW(int id) {
		super(Assets.dwNW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
