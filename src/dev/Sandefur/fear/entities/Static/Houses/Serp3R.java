package dev.Sandefur.fear.entities.Static.Houses;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.StaticEntity;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class Serp3R extends StaticEntity {

	public Serp3R(Handler handler, float x, float y) {
		super(handler, x, y,Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 16;
		bounds.y = 16;
		bounds.width = Tile.TILEWIDTH * 6;
		bounds.height = (Tile.TILEHEIGHT * 8) - 8;
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.serp3R, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 10, null);
	}

}
