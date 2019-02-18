package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;

public class BossDoor extends StaticEntity {
	private Boolean open;
	
	public BossDoor(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		open = false;
	}
	
	
	private void open(){
			if (checkPlayerCollision(0, -5) && BossKey.getRecieved()) {
				open = true;
				BossKey.useKey();
			}
			
		if (open){			
			if (checkPlayerCollision(0, -5)) {
				handler.getWorld().getEntityManager().getPlayer().setX((Tile.TILEWIDTH * 113) + 32);
				handler.getWorld().getEntityManager().getPlayer().setY(Tile.TILEHEIGHT * 71);
			}
		}
	}

	@Override
	public void tick() {
		open();		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.bossDoor,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
