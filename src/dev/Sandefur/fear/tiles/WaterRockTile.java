package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class WaterRockTile extends Tile {

	public WaterRockTile(int id) {
		super(Assets.waterRock, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
