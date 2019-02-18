package dev.Sandefur.fear.worlds;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.Utils;

public abstract class World {
	
	protected Handler handler;
	protected int width;
	protected int height;
	protected int tWidth = Tile.TILEWIDTH;
	protected int tHeight = Tile.TILEHEIGHT;
	protected int spawnX;
	protected int spawnY;
	protected int level;
	private int[][] tiles;
	
	//Entities
		protected static EntityManager entityManager;
		
		public World(Handler handler, String path){
			this.handler = handler;
			loadWorld(path);
		}
		
		public abstract void  populateEntities();
		
		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public abstract void tick();
		
		public abstract void render(Graphics2D g);
		
		public Tile getTile(int x, int y){
			if(x < 0 || y < 0 || x >= width || y >= height)
				return Tile.shortGrassTile;
			
			Tile t = Tile.tiles[tiles[x][y]];
			if(t == null)
				return Tile.dirtTile;
			return t;
		}
		
		private void loadWorld(String path){
			String file = Utils.loadFileAsString(path);
			String[] tokens = file.split("\\s+");
			width = Utils.parseInt(tokens[0]);
			height = Utils.parseInt(tokens[1]);
			spawnX = Utils.parseInt(tokens[2]);
			spawnY = Utils.parseInt(tokens[3]);
			
			tiles = new int[width][height];
			for(int y = 0;y < height;y++){
				for(int x = 0;x < width;x++){
					tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
				}
			}
		}
		
		public int getWidth(){
			return width;
		}
		
		public int getHeight(){
			return height;
		}

		public static EntityManager getEntityManager() {
			return entityManager;
		}
}
