package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;

public class Potion extends StaticEntity {
	
	public EntityManager entityManager = handler.getWorld().getEntityManager();
	
	public Potion(Handler handler, float x, float y) {
			super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
			bounds.width = 0;
			bounds.height = 0;
	}
	
	public void remove(){
		entityManager.removeEntity(this);
	}
	
	public void interact(){
		if(CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32, y + 32) < 25){
			CourageBar.replenishC(3);
			JukeBox.play("Potion");
			remove();
		}
	}
	
	@Override
	public void tick() {
		interact();	
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.potion,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
