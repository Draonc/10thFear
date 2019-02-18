package dev.Sandefur.fear.entities.Static;

import java.awt.Color;
import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;
import dev.Sandefur.fear.utils.Timer;

public class Range extends StaticEntity {
	private int w = 0, h = 0;
	private Timer timer;
	
	public EntityManager entityManager = handler.getWorld().getEntityManager();
	
	public Range(Handler handler, float x, float y, int w, int h) {
			super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
			
			this.w = w;
			this.h = h;
			bounds.width = Tile.TILEWIDTH * w;
			bounds.height = Tile.TILEHEIGHT * h;
			timer = new Timer();
			timer.Start();
	}
	
	@Override
	public void tick() {
		damage();
	}
	
	private void damage(){
		if (checkPlayerCollision(-5f, -5f) && timer.run(2)){
			CourageBar.decCourage();
			timer.Start();
		}
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.range,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), Tile.TILEWIDTH * w, Tile.TILEHEIGHT * h, null);
		//g.setColor(Color.red);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),	(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}

}