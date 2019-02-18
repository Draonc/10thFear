package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;

public class Key extends StaticEntity{
	private static int keys = 0;

	public Key(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.width = 0;
		bounds.height = 0;
	}
	
	private void getKey(){
		if(CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 16, y + 16) < 32){
		keys++;
		handler.getWorld().getEntityManager().removeEntity(this);
		}
	}
	
	public static void useKey(){
			keys--;
	}
	
	public static int getKeys(){
		return keys;
	}

	@Override
	public void tick() {
		if(keys < 0)
			keys = 0;
		getKey();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.key,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width/2, height/2, null);
		
	}

}
