package dev.Sandefur.fear.entities.Static.Houses;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.StaticEntity;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class Serp2S extends StaticEntity {

	public Serp2S(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.y = 54;
		bounds.width = (Tile.TILEWIDTH * 6) - 18;
		bounds.height = (Tile.TILEHEIGHT * 11) + 3;
	}

	@Override
	public void tick() {	
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.serp2S, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 14, null);
	}

}
