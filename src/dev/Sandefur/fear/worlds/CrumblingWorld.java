package dev.Sandefur.fear.worlds;



import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.Tokens.TokenCrumble;
import dev.Sandefur.fear.entities.creatures.RunningPlayer;
import dev.Sandefur.fear.tiles.Tile;

public class CrumblingWorld extends World {

	public CrumblingWorld(Handler handler, String path) {
		super(handler, path);
		
		entityManager = new EntityManager(handler, new RunningPlayer( handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 148));
		populateEntities();
		 JukeBox.load("/Music/CrumbleBG.mp3", "CBG");
		JukeBox.setVolume("CBG", -10);
		JukeBox.loop("CBG");
		
	}
	
	public void populateEntities(){
		//Enemies
		entityManager.addEntity(new TokenCrumble(handler, (Tile.TILEWIDTH * 8) + 32, Tile.TILEHEIGHT));
	
	
	}

	@Override
	public void tick() {
		entityManager.tick();
	}
	
	public void render(Graphics2D g){
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart;y < yEnd;y++){
			for(int x = xStart;x < xEnd;x++){
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		entityManager.render(g);
	}

}
