package dev.Sandefur.fear.worlds;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.Potion;
import dev.Sandefur.fear.entities.Static.SideChest;
import dev.Sandefur.fear.entities.Static.Tokens.TokenInjury;
import dev.Sandefur.fear.entities.creatures.PlatformerPlayer;
import dev.Sandefur.fear.entities.creatures.Enemies.Bee;
import dev.Sandefur.fear.entities.creatures.Enemies.Plant;
import dev.Sandefur.fear.entities.creatures.Enemies.Slug;
import dev.Sandefur.fear.tiles.Tile;

public class InjuryWorld extends World{
	
	public InjuryWorld(Handler handler, String path){
		super(handler, path);
		entityManager = new EntityManager(handler, new PlatformerPlayer(handler, Tile.TILEWIDTH * 5 , Tile.TILEHEIGHT * 146, true, false));				
		populateEntities();
		JukeBox.load("/Music/InjuryBG.mp3", "IBG");
		
		JukeBox.setVolume("IBG", -10);
		JukeBox.loop("IBG");
	}
	
	public void populateEntities(){
		//Enemies
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 125));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 141));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 138));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 131));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 121));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 113));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 111));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 107));
		
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 104));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 98));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 95));
		entityManager.addEntity(new Bee(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 85));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 81));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 81));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 60));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 54));
		entityManager.addEntity(new Bee(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 101));

		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 45));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 44));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new Bee(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 39));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 37));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 37));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 34));
		entityManager.addEntity(new Bee(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 24));
		entityManager.addEntity(new Bee(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 15));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 13));
		entityManager.addEntity(new Slug(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new Plant(handler, Tile.TILEWIDTH, Tile.TILEHEIGHT * 12));
		
		entityManager.addEntity(new TokenInjury(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 2));
		
		
		
		
		//Potions
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH, Tile.TILEHEIGHT * 131));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 115));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 48));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 44));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 27));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 12));
		
		
		//chests
		entityManager.addEntity(new SideChest(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 134, 7));
		entityManager.addEntity(new SideChest(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 70, 8));
		entityManager.addEntity(new SideChest(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 27, 9));
		
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
		
	}	
}