package dev.Sandefur.fear.entities.Static.Houses;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.StaticEntity;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class Serp3O extends StaticEntity {

	public Serp3O(Handler handler, float x, float y) {
		super(handler, x, y,Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 14;
		bounds.y = 20;
		bounds.width = Tile.TILEWIDTH * 6;
		bounds.height = (Tile.TILEHEIGHT * 8) - 10;
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.serp3O, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 10, null);
	}

}
