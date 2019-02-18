package dev.Sandefur.fear.tiles.House;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class Blank extends Tile {

	public Blank(int id) {
		super(Assets.blank, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
	
	public boolean isDeep(){
		return true;
	}

}
