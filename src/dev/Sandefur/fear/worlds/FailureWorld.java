package dev.Sandefur.fear.worlds;

import java.awt.Graphics2D;
import java.util.Random;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.Chest;
import dev.Sandefur.fear.entities.Static.Potion;
import dev.Sandefur.fear.entities.Static.Tokens.TokenFailure;
import dev.Sandefur.fear.entities.creatures.MainPlayer;
import dev.Sandefur.fear.entities.creatures.Enemies.Bat;
import dev.Sandefur.fear.entities.creatures.Enemies.Dragon;
import dev.Sandefur.fear.entities.creatures.Enemies.Fox;
import dev.Sandefur.fear.entities.creatures.Enemies.Rat;
import dev.Sandefur.fear.entities.creatures.Enemies.RedBlob;
import dev.Sandefur.fear.entities.creatures.Enemies.Skeleton;
import dev.Sandefur.fear.entities.creatures.Enemies.SludgeMan;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.Timer;

public class FailureWorld extends World {
	private Timer timer;
	private static int kills;
	private Random rand = new Random();
	private Boolean r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, s1, s2, s3, s4, s5, s6, s7, s8, s9;

	public FailureWorld(Handler handler, String path) {
		super(handler, path);

		entityManager = new EntityManager(handler, new MainPlayer(handler, spawnX, spawnY));
		timer = new Timer();
		timer.Start();
		r1 = true;
		r2 = true;
		r3 = true;
		r4 = true;
		r5 = true;
		r6 = true;
		r7 = true;
		r8 = true;
		r9 = true;
		r10 = true;
		s1 = true;
		s2 = true;
		s3 = true;
		s4 = true;
		s5 = true;
		s6 = true;
		s7 = true;
		s8 = true;
		s9 = true;

		populateEntities();
		
		JukeBox.load("/Music/FailureBG.mp3", "FailBG");
		
		JukeBox.setVolume("FailBG", -10);
		JukeBox.loop("FailBG");

		kills = 0;

	}

	public void populateEntities() {

		// Enemies
		if (r1) {
			entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r1 = false;
		}

		if (timer.run(10) && r2) {
			entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r2 = false;
		}

		if (timer.run(20) && r3) {
			entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r3 = false;
		}

		if (timer.run(30) && r4) {
			entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r4 = false;
		}

		if (timer.run(40) && r5) {
			entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r5 = false;
		}

		if (timer.run(50) && r6) {
			entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r6 = false;
		}

		if (timer.run(60) && r7) {
			entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r7 = false;
		}

		if (timer.run(70) && r8) {
			entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r8 = false;
		}

		if (timer.run(80) && r9) {
			entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new RedBlob(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Bat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r9 = false;
		}

		if (timer.run(90) && r10) {
			entityManager.addEntity(new Dragon(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Fox(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Skeleton(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new SludgeMan(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Rat(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			r10 = false;
		}

		if (kills == 5 && s1) {
			entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			s1 = false;
		}
		if (kills == 10 && s2) {
			entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			s2 = false;
		}
		if (kills == 15 && s3) {
			entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1), 16));
			s3 = false;
		}
		if (kills == 20 && s4) {
			entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			s4 = false;
		}
		if (kills == 25 && s5) {
			entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			s5 = false;
		}
		if (kills == 30 && s6) {
			entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1), 17));
			s6 = false;
		}
		if (kills == 35 && s7) {
			entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			s7 = false;
		}
		if (kills == 40 && s8) {
			entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			s8 = false;
		}
		if (kills == 45 && s9) {
			entityManager.addEntity(new Potion(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1)));
			entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * (rand.nextInt(13) + 1),
					Tile.TILEHEIGHT * (rand.nextInt(10) + 1), 18));
			s9 = false;
		}

		if (kills >= 50)
			entityManager.addEntity(new TokenFailure(handler, (Tile.TILEWIDTH * 8) + 32, Tile.TILEHEIGHT * 6));

	}

	public static void kill() {
		kills++;
	}

	@Override
	public void tick() {
		entityManager.tick();
		populateEntities();
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
		entityManager.render(g);
	}

}
