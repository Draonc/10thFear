package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class DungeonN extends Tile {

	public DungeonN(int id) {
		super(Assets.dwN, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
