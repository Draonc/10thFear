package dev.Sandefur.fear.worlds;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.BreathBar;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.AirBubble;
import dev.Sandefur.fear.entities.Static.Potion;
import dev.Sandefur.fear.entities.Static.SideChest;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDrowning;
import dev.Sandefur.fear.entities.creatures.SwimmingPlayer;
import dev.Sandefur.fear.entities.creatures.Enemies.Fish;
import dev.Sandefur.fear.tiles.Tile;

public class UnderWaterWorld extends World{
	private BreathBar bBar = new BreathBar(handler, 100, 500);;
	
	public UnderWaterWorld(Handler handler, String path){
		super(handler, path);
		entityManager = new EntityManager(handler, new SwimmingPlayer(handler, Tile.TILEWIDTH, Tile.TILEHEIGHT * 20));				
		populateEntities();
		
		
		JukeBox.load("/Music/DrowningBG.mp3", "DrBG");
		JukeBox.setVolume("DrBG", -10);
		JukeBox.loop("DrBG");
	}
	
	
	public void populateEntities(){
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 12));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 12));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 22));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 28));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 30));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 9));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 46, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 71, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 16));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 14));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 72, Tile.TILEHEIGHT * 15));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 72, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 22));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 26));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 22));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 27));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 22));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 25));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 14));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 28));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 27));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 67, Tile.TILEHEIGHT * 33));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 78, Tile.TILEHEIGHT * 33));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 78, Tile.TILEHEIGHT * 25));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 78, Tile.TILEHEIGHT * 14));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 78, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 21));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 16));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 48, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 16));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 19));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 19));
		entityManager.addEntity(new AirBubble(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 17));
		
		
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 22));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 14));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 28));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 19));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 27));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 32));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 25));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 14));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 48, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 67, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 73, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 75, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 77, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 23));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 30));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 33));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 49, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new Fish(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 23));
		
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 20));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 48, Tile.TILEHEIGHT * 27));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 33));
		
		entityManager.addEntity(new SideChest(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 17, 1));
		entityManager.addEntity(new SideChest(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 20, 2));
		entityManager.addEntity(new SideChest(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 30, 3));
		
		
		entityManager.addEntity(new TokenDrowning(handler, Tile.TILEWIDTH * 79, Tile.TILEHEIGHT * 2));
		
		
		
	}
	
	public void tick(){
		entityManager.tick();
		bBar.tick();
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
		bBar.render(g);
	}	
}