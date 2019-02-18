package dev.Sandefur.fear.worlds;



import java.awt.Font;
import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.BossDoor;
import dev.Sandefur.fear.entities.Static.BossKey;
import dev.Sandefur.fear.entities.Static.Chest;
import dev.Sandefur.fear.entities.Static.DungeonDoorL;
import dev.Sandefur.fear.entities.Static.DungeonDoorU;
import dev.Sandefur.fear.entities.Static.Key;
import dev.Sandefur.fear.entities.Static.Potion;
import dev.Sandefur.fear.entities.Static.StairDungeon;
import dev.Sandefur.fear.entities.Static.Objects.Headstone;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDeath;
import dev.Sandefur.fear.entities.creatures.MainPlayer;
import dev.Sandefur.fear.entities.creatures.Enemies.Bat;
import dev.Sandefur.fear.entities.creatures.Enemies.Death;
import dev.Sandefur.fear.entities.creatures.Enemies.DeathJR;
import dev.Sandefur.fear.entities.creatures.Enemies.RedBlob;
import dev.Sandefur.fear.entities.creatures.Enemies.Skeleton;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class DeathWorld extends World {
	
	private Death death;

	public DeathWorld(Handler handler, String path) {
		super(handler, path);
		
		death = new Death(handler, Tile.TILEWIDTH * 113, Tile.TILEHEIGHT * 77);
		
		entityManager = new EntityManager(handler, new MainPlayer( handler, (Tile.TILEWIDTH * 9) + 32, Tile.TILEHEIGHT * 13));
		populateEntities();
		
		JukeBox.load("/Music/DeathBG.mp3", "DeBG");
		
		JukeBox.setVolume("DeBG", -10);
		JukeBox.loop("DeBG");
		
	}
	
	public void populateEntities(){
		//Enemies
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 27, (Tile.TILEHEIGHT * 76) + 32, 6, 3));
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 53, (Tile.TILEHEIGHT * 76) + 32, 7, 3));
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 44, (Tile.TILEHEIGHT * 99) + 32, 8, 4));
	
		
		//room1
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 9) + 32, Tile.TILEHEIGHT * 1, 2, 1));
		
		//room2
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 35) + 32, Tile.TILEHEIGHT * 14, 1, 2));
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 27, (Tile.TILEHEIGHT * 7) + 32, 1, 3));
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 44, (Tile.TILEHEIGHT * 7) + 32, 3, 4));
		
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 10));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 12));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 7));
		
		
		//room3
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 70, (Tile.TILEHEIGHT * 7) + 32, 3, 4));
		entityManager.addEntity(new DungeonDoorL(handler, (Tile.TILEWIDTH * 61) + 32, Tile.TILEHEIGHT * 1, 2, 1));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 53, (Tile.TILEHEIGHT * 7) + 32, 7, 3));
		
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 67, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 9));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 12));
				
		//room4
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 87) + 32, Tile.TILEHEIGHT * 14, 6, 2));
		
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 95, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 95, Tile.TILEHEIGHT * 13));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 13));

		
		//room5
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 122, (Tile.TILEHEIGHT * 7) + 32, 5, 4));
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 113) + 32, Tile.TILEHEIGHT * 14, 9, 2));
		
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 110, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 116, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 118, Tile.TILEHEIGHT * 5));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 117, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 113, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 113, Tile.TILEHEIGHT * 10));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 109, Tile.TILEHEIGHT * 8));
		
		
		//room6
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 9) + 32, Tile.TILEHEIGHT * 24, 8, 1));
		
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 26));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 34));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 36));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 36));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 28));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 30));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 28));
		
		
		//room7
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 35) + 32, Tile.TILEHEIGHT * 24, 12, 1));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 27, (Tile.TILEHEIGHT * 30) + 32, 4, 3));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 44, (Tile.TILEHEIGHT * 30) + 32, 14, 4));
		

		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 36));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 27));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 27));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 32));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 28));
		
		//room8
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 61) + 32, Tile.TILEHEIGHT * 37, 10, 2));
		

		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 27));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 26));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 28));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 30));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 30));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 34));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 35));

		//room9
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 79, (Tile.TILEHEIGHT * 30) + 32, 11, 3));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 96, (Tile.TILEHEIGHT * 30) + 32, 17, 4));
		entityManager.addEntity(new DungeonDoorL(handler, (Tile.TILEWIDTH * 87) + 32, Tile.TILEHEIGHT * 37, 4, 2));
		
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 36));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 88, Tile.TILEHEIGHT * 31));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 87, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 94, Tile.TILEHEIGHT * 25));

		
		//room10
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 113) + 32, Tile.TILEHEIGHT * 24, 13, 1));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 117, Tile.TILEHEIGHT * 26));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 113, Tile.TILEHEIGHT * 30));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 109, Tile.TILEHEIGHT * 32));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 114, Tile.TILEHEIGHT * 33));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 119, Tile.TILEHEIGHT * 33));
		
		//room11
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 9) + 32, Tile.TILEHEIGHT * 47, 19, 1));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH, (Tile.TILEHEIGHT * 53) + 32, 15, 3));
		
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 50));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 54));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 49));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 58));
		
		//room12
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 35) + 32, Tile.TILEHEIGHT * 60, 16, 2));
		entityManager.addEntity(new DungeonDoorL(handler, (Tile.TILEWIDTH * 35) + 32, Tile.TILEHEIGHT * 47, 5, 1));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 58));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 52));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 54));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 50));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 43, Tile.TILEHEIGHT * 58));
		
		
		//room13
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 61) + 32, Tile.TILEHEIGHT * 60, 18, 2));
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 61) + 32, Tile.TILEHEIGHT * 47, 22, 1));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 51));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 56));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 51));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 56));
		
		
		//room14
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 79, (Tile.TILEHEIGHT * 53) + 32, 24, 3));
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 87) + 32, Tile.TILEHEIGHT * 60, 20, 2));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 54));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 51));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 89, Tile.TILEHEIGHT * 50));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 88, Tile.TILEHEIGHT * 53));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 88, Tile.TILEHEIGHT * 57));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 92, Tile.TILEHEIGHT * 55));
		
		//room15
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 105, (Tile.TILEHEIGHT * 53) + 32, 26, 3));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 122, (Tile.TILEHEIGHT * 53) + 32, 21, 4));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 109, Tile.TILEHEIGHT * 50));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 113, Tile.TILEHEIGHT * 51));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 116, Tile.TILEHEIGHT * 51));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 110, Tile.TILEHEIGHT * 53));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 116, Tile.TILEHEIGHT * 54));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 109, Tile.TILEHEIGHT * 57));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 116, Tile.TILEHEIGHT * 57));
		
		//room16
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH, (Tile.TILEHEIGHT * 76) + 32, 28, 3));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 18, (Tile.TILEHEIGHT * 76) + 32, 23, 4));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 73));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 73));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 75));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 77));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 78));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 81));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 80));
		
		//room 17
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 44, (Tile.TILEHEIGHT * 76) + 32, 25, 4));
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 35) + 32, Tile.TILEHEIGHT * 70, 38, 1));
		entityManager.addEntity(new BossDoor(handler, (Tile.TILEWIDTH * 35) + 32, Tile.TILEHEIGHT * 83));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 77));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 76));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 74));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 73));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 80));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 79));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 77));
		
		
		
		//try
		//room18
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 61) + 32, Tile.TILEHEIGHT * 70, 34, 1));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 70, (Tile.TILEHEIGHT * 76) + 32, 27, 4));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 76));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 76));
		entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 80));
		entityManager.addEntity(new DeathJR(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 78));
		
		//room19
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 96, (Tile.TILEHEIGHT * 76) + 32, 31, 4));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 82));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 78));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 91, Tile.TILEHEIGHT * 81));
		
		//room21
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 9) + 32, Tile.TILEHEIGHT * 106, 32, 2));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 18, (Tile.TILEHEIGHT * 99) + 32, 36, 4));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 100));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 99));
		entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 96));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 100));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 100));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 103));
		
		
		//room22
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 27, (Tile.TILEHEIGHT * 99) + 32, 35, 3));
		entityManager.addEntity(new DungeonDoorU(handler, (Tile.TILEWIDTH * 35) + 32,Tile.TILEHEIGHT * 106, 29, 2));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 101));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 99));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 98));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 100));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 104));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 103));
		entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 104));
		
		//room23
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 53, (Tile.TILEHEIGHT * 99) + 32, 37, 3));
		
		
		entityManager.addEntity(death);
		
		if(death.getDead())
			entityManager.addEntity(new TokenDeath(handler, Tile.TILEWIDTH * 113, Tile.TILEHEIGHT * 77));
		
	
		entityManager.addEntity(new Headstone(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Headstone(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Headstone(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Headstone(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Headstone(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new Headstone(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new Headstone(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new Headstone(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 6));
		
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new Key(handler, (Tile.TILEWIDTH * 87) + 32, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 120, Tile.TILEHEIGHT * 3));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 92, Tile.TILEHEIGHT * 28));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 108, Tile.TILEHEIGHT * 34));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 58));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 95));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 103));
		
		entityManager.addEntity(new BossKey(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 71));
		
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 13));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 88, Tile.TILEHEIGHT * 8));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 107, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 33));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 26));
	
		
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 29));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 120, Tile.TILEHEIGHT * 35));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 53));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 59));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 56));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 77));
		entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 103));
		
		entityManager.addEntity(new StairDungeon(handler, Tile.TILEWIDTH * 107, Tile.TILEHEIGHT * 3, 3));
		entityManager.addEntity(new StairDungeon(handler, (Tile.TILEWIDTH * 113) + 32, Tile.TILEHEIGHT * 34, 4));
		entityManager.addEntity(new StairDungeon(handler, Tile.TILEWIDTH * 91, Tile.TILEHEIGHT * 50, 1));
		entityManager.addEntity(new StairDungeon(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 96, 2));
		
		
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 103, 1));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 74, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 56, 3));
		
		
		
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
		
		g.drawImage(Assets.key,-10, 10,	width / 2, height / 2, null);
		g.setFont(new Font("Serif", Font.BOLD, 30));
		g.drawString("X " + Key.getKeys() , 60, 50);
		
		if(BossKey.getRecieved())
			g.drawImage(Assets.bossKey, 10, 74,	width / 3, height / 2, null);
			
		
		
		entityManager.render(g);
	}

}
