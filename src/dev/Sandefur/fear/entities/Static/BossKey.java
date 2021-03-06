package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;

public class BossKey extends StaticEntity{
	private static Boolean recieved = false;

	public BossKey(Handler handler, float x, float y) {
		super(handler, x + 32, y + 32, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.width = 0;
		bounds.height = 0;
	}
	
	private void getKey(){
		if(CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 16, y + 16) < 16){
		recieved = true;
		handler.getWorld().getEntityManager().removeEntity(this);
		}
	}
	
	public static void useKey(){
			recieved = false;
	}
	
	public static boolean getRecieved(){
		return recieved;
	}

	@Override
	public void tick() {
		getKey();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.bossKey,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width/2, height/2, null);
		
	}

}
