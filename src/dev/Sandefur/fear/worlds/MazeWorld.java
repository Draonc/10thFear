package dev.Sandefur.fear.worlds;



import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.Chest;
import dev.Sandefur.fear.entities.Static.Potion;
import dev.Sandefur.fear.entities.Static.Tokens.TokenLost;
import dev.Sandefur.fear.entities.creatures.MainPlayer;
import dev.Sandefur.fear.entities.creatures.Enemies.Dragon;
import dev.Sandefur.fear.entities.creatures.Enemies.Fox;
import dev.Sandefur.fear.entities.creatures.Enemies.Rat;
import dev.Sandefur.fear.entities.creatures.Enemies.SludgeMan;
import dev.Sandefur.fear.tiles.Tile;

public class MazeWorld extends World {

	public MazeWorld(Handler handler, String path) {
		super(handler, path);
		
		entityManager = new EntityManager(handler, new MainPlayer( handler, spawnX, spawnY));
		populateEntities();
		JukeBox.load("/Music/LostBG.mp3", "LBG");
		
		JukeBox.setVolume("LBG", -10);
		JukeBox.loop("LBG");
		
	}
	
	public void populateEntities(){
		//Enemies
		entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 19));
		entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 19));
		entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 33));
		entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 40));
		entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 51));
		entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 38));
		entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 28));
		entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 12));
		entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 13));
		entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 19));
		entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 20));
		entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * 49, Tile.TILEHEIGHT * 35));
		entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 35));
		entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 44));
		entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 54));
		entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 58));
		entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 53));
		entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 53));
	
		
		
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 14));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 27));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 37));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 43));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 54));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 47));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 50));
		
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 23, 13));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 39, 14));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 44, 15));
		
		
		entityManager.addEntity(new TokenLost(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 58));
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
