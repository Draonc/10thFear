package dev.Sandefur.fear.worlds;

import java.awt.Graphics2D;
import java.util.Random;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.entities.Entity;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.Mountian;
import dev.Sandefur.fear.entities.Static.Range;
import dev.Sandefur.fear.entities.Static.Ray;
import dev.Sandefur.fear.entities.Static.Sun;
import dev.Sandefur.fear.entities.Static.Tokens.TokenHeights;
import dev.Sandefur.fear.entities.creatures.FlyingPlayer;
import dev.Sandefur.fear.tiles.Tile;

public class SkyWorld extends World {
	private Random rand = new Random();
	private int num;

	public SkyWorld(Handler handler, String path, int length) {
		super(handler, path);
		entityManager = new EntityManager(handler, new FlyingPlayer(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 6));
		JukeBox.load("/Music/HeightsBG.mp3", "HBG");
		JukeBox.setVolume("HBG", -10);
		JukeBox.loop("HBG");

		num = 175;
		setObs();
		populateEntities();
	}

	public void populateEntities() {
		entityManager.addEntity(new TokenHeights(handler, Tile.TILEWIDTH * 180, Tile.TILEHEIGHT * 4));
	}
	
	public void setObs(){
		int height;
		int space = Tile.TILEHEIGHT * 3;
		for(int i = 25; i < num ; i +=7){
			height = rand.nextInt(8);
			entityManager.addEntity(new Sun(handler, (Tile.TILEWIDTH * i),  Tile.TILEHEIGHT * (8 - height)));
			entityManager.addEntity(new Ray(handler, (Tile.TILEWIDTH * i), 0, 1, (8 - height) + 1));
			
			entityManager.addEntity(new Range(handler, (Tile.TILEWIDTH * i), (Tile.TILEHEIGHT * (8 - height) + space), 1, (8 - height) + space));
			entityManager.addEntity(new Mountian(handler, (Tile.TILEWIDTH * i), (Tile.TILEHEIGHT * (8 - height) + space)));
		}
	}

	public void tick() {
		entityManager.tick();

	}

	public void render(Graphics2D g) {
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width,
				(handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height,
				(handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);

		for (int y = yStart; y < yEnd; y++) {
			for (int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		// Entities
		entityManager.render(g);

	}
}