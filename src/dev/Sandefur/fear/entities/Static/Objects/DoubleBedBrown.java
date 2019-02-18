package dev.Sandefur.fear.entities.Static.Objects;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.StaticEntity;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class DoubleBedBrown extends StaticEntity {

	public DoubleBedBrown(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
	}


	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.doubleBedBrown,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width * 2, height * 2, null);
		
	}

}
