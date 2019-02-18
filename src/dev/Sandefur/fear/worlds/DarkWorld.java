package dev.Sandefur.fear.worlds;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.Potion;
import dev.Sandefur.fear.entities.Static.SideChest;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDark;
import dev.Sandefur.fear.entities.creatures.PlatformerPlayer;
import dev.Sandefur.fear.entities.creatures.Enemies.GreyBlob;
import dev.Sandefur.fear.entities.creatures.Enemies.Possium;
import dev.Sandefur.fear.entities.creatures.Enemies.Spider;
import dev.Sandefur.fear.tiles.Tile;

public class DarkWorld extends World {

	
	
		public DarkWorld(Handler handler, String path){
			super(handler, path);
		entityManager = new EntityManager(handler, new PlatformerPlayer(handler, spawnX, spawnY, false, true));
			
		populateEntities();
		JukeBox.load("/Music/DarkBG.mp3", "DBG");
		JukeBox.setVolume("DBG", -10);
		JukeBox.loop("DBG");
	}
	
	public void populateEntities(){
		//Enemies
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 7));
		
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new GreyBlob(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new GreyBlob(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 43, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 9));
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new GreyBlob(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new GreyBlob(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT));
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 73, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 90, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 97, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new GreyBlob(handler, Tile.TILEWIDTH * 131, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 140, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 146, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 150, Tile.TILEHEIGHT * 6));
		
		entityManager.addEntity(new GreyBlob(handler, Tile.TILEWIDTH * 166, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new GreyBlob(handler, Tile.TILEWIDTH * 182, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 177, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 176, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 196, Tile.TILEHEIGHT * 9));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 208, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new GreyBlob(handler, Tile.TILEWIDTH * 217, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 230, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 229, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 235, Tile.TILEHEIGHT * 9));
		entityManager.addEntity(new GreyBlob(handler, Tile.TILEWIDTH * 237, Tile.TILEHEIGHT * 3));
	
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 259, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new Spider(handler, Tile.TILEWIDTH * 277, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Possium(handler, Tile.TILEWIDTH * 284, Tile.TILEHEIGHT * 9));
		
		
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 105, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 121, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 156, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 175, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 265, Tile.TILEHEIGHT * 8));
		
		entityManager.addEntity(new SideChest(handler, Tile.TILEWIDTH * 55, 0, 4));
		entityManager.addEntity(new SideChest(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 8, 5));
		entityManager.addEntity(new SideChest(handler, Tile.TILEWIDTH * 246, Tile.TILEHEIGHT * 7, 6));
		
		
		entityManager.addEntity(new TokenDark(handler, Tile.TILEWIDTH * 298, Tile.TILEHEIGHT * 7));
		
		//Chests
		
		//Potions
		
		//Enemies
	}
	
	public void tick(){
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
	
		//Entities
		entityManager.render(g);
		
		
		//g.drawImage(Assets.lightMask,0,0, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 12, null);
		
		
	}
}