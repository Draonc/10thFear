package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class DungeonSW extends Tile {

	public DungeonSW(int id) {
		super(Assets.dwSW, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
