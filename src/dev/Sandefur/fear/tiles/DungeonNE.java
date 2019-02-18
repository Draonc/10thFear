package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class DungeonNE extends Tile {

	public DungeonNE(int id) {
		super(Assets.dwNE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
