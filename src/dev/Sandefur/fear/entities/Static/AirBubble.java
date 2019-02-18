package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.BreathBar;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;

public class AirBubble extends StaticEntity {
	
	public EntityManager entityManager = handler.getWorld().getEntityManager();
	public Rectangle rec = new Rectangle(0,0,64,64);
	
	public AirBubble(Handler handler, float x, float y) {
			super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
			bounds.width = 0;
			bounds.height = 0;
	
	}
		
	//If the air bubble is touched it is removed and the max breath is refilled
	public void interact(){
		if(CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32, y + 32) < 32){
			BreathBar.setBreath(6);
			JukeBox.play("Bubble");
			entityManager.removeEntity(this);
		}
	}
	
	@Override
	public void tick() {
		interact();
	}

	@Override
	public void render(Graphics2D g) {
	g.drawImage(Assets.airBubbleFull,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
