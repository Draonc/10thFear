package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class Mountian extends StaticEntity {
	
	public EntityManager entityManager = handler.getWorld().getEntityManager();
	
	public Mountian(Handler handler, float x, float y) {
			super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
			bounds.width = 0;
			bounds.height = 0;
	}
	
	@Override
	public void tick() {	
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.mnt,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
