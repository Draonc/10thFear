package dev.Sandefur.fear.entities.Static.Houses;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.StaticEntity;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class Serp1R extends StaticEntity {

	public Serp1R(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.y = 54;
		bounds.width = Tile.TILEWIDTH * 8;
		bounds.height = (Tile.TILEHEIGHT * 17) - 11;
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.serp1R, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 18, null);
	}

}
