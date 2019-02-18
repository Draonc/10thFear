package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class Branch extends Tile {

	public Branch(int id) {
		super(Assets.branch, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
