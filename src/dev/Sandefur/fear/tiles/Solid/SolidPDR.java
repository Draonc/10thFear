
package dev.Sandefur.fear.tiles.Solid;

import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class SolidPDR extends Tile {

	public SolidPDR(int id) {
		super(Assets.PDNE, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
