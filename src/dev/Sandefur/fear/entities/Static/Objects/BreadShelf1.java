package dev.Sandefur.fear.entities.Static.Objects;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.StaticEntity;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class BreadShelf1 extends StaticEntity {

	public BreadShelf1(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.x = 0;
		bounds.y = 15;
		bounds.width = 64;
		bounds.height = 49 + (Tile.TILEHEIGHT* 2);
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.breadShelf1,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height * 3, null);
		
	}

}
