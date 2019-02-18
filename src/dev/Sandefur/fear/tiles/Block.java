package dev.Sandefur.fear.tiles;

import dev.Sandefur.fear.gfx.Assets;

public class Block extends Tile {

	public Block(int id) {
		super(Assets.block, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
