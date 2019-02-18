package dev.Sandefur.fear.worlds;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.Chest;
import dev.Sandefur.fear.entities.Static.RiddleBoard;
import dev.Sandefur.fear.entities.Static.Tokens.TokenStupid;
import dev.Sandefur.fear.entities.creatures.MainPlayer;
import dev.Sandefur.fear.tiles.Tile;

public class RiddleWorld extends World {
	private static Boolean r1 = true, r2 = true, r3 = true, r4 = true, r5 = true, r6 = true, r7 = true, r8 = true,
			r9 = true, r10 = true, r11 = true, r12 = true, r13 = true, r14 = true, r15 = true;

	private static int riddlesAnswered = 0;

	public RiddleWorld(Handler handler, String path) {
		super(handler, path);

		entityManager = new EntityManager(handler, new MainPlayer(handler, (Tile.TILEWIDTH * 31) + 32, Tile.TILEHEIGHT * 17));
		populateEntities();
		JukeBox.load("/Music/RiddleBG.mp3", "RBG");
		JukeBox.setVolume("RBG", -10);
		JukeBox.loop("RBG");

	}

	public void populateEntities(){
		entityManager.addEntity(new RiddleBoard(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 4, 1, 0));
		entityManager.addEntity(new RiddleBoard(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 4, 2, 3));
		entityManager.addEntity(new RiddleBoard(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 9, 3, 2));
		entityManager.addEntity(new RiddleBoard(handler, (Tile.TILEWIDTH * 7) + 32, Tile.TILEHEIGHT * 9, 4, 2));
		entityManager.addEntity(new RiddleBoard(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 9, 5, 0));
		
		entityManager.addEntity(new RiddleBoard(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 4, 6, 1));
		entityManager.addEntity(new RiddleBoard(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 4, 7, 2));
		entityManager.addEntity(new RiddleBoard(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 9, 8, 0));
		entityManager.addEntity(new RiddleBoard(handler, (Tile.TILEWIDTH * 55) + 32, Tile.TILEHEIGHT * 9, 9, 2));
		entityManager.addEntity(new RiddleBoard(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 9, 10, 3));
		
		if(riddlesAnswered >= 2){
			entityManager.addEntity(new Chest(handler, (Tile.TILEWIDTH * 31) + 32, Tile.TILEHEIGHT * 4, 10));
		}
			
		if(riddlesAnswered >= 4){
			entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 4, 11));
		}
		
		if(riddlesAnswered >= 6){
			entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 4, 12));
		}
		
		if(riddlesAnswered >= 8){
			entityManager.addEntity(new TokenStupid(handler, (Tile.TILEWIDTH * 31) + 32, Tile.TILEHEIGHT * 6));
		}
	}

	public static void correct() {
		riddlesAnswered++;
	}

	public static Boolean getR1() {
		return r1;
	}

	public static void setR1(Boolean b) {
		r1 = b;
	}

	public static Boolean getR2() {
		return r2;
	}

	public static void setR2(Boolean b) {
		r2 = b;
	}

	public static Boolean getR3() {
		return r3;
	}

	public static void setR3(Boolean b) {
		r3 = b;
	}

	public static Boolean getR4() {
		return r4;
	}

	public static void setR4(Boolean b) {
		r4 = b;
	}

	public static Boolean getR5() {
		return r5;
	}

	public static void setR5(Boolean b) {
		r5 = b;
	}

	public static Boolean getR6() {
		return r6;
	}

	public static void setR6(Boolean b) {
		r6 = b;
	}

	public static Boolean getR7() {
		return r7;
	}

	public static void setR7(Boolean b) {
		r7 = b;
	}

	public static Boolean getR8() {
		return r8;
	}

	public static void setR8(Boolean b) {
		r8 = b;
	}

	public static Boolean getR9() {
		return r9;
	}

	public static void setR9(Boolean b) {
		r9 = b;
	}

	public static Boolean getR10() {
		return r10;
	}

	public static void setR10(Boolean b) {
		r10 = b;
	}

	public static Boolean getR11() {
		return r11;
	}

	public static void setR11(Boolean b) {
		r11 = b;
	}

	public static Boolean getR12() {
		return r12;
	}

	public static void setR12(Boolean b) {
		r12 = b;
	}

	public static Boolean getR13() {
		return r13;
	}

	public static void setR13(Boolean b) {
		r13 = b;
	}

	public static Boolean getR14() {
		return r14;
	}

	public static void setR14(Boolean b) {
		r14 = b;
	}

	public static Boolean getR15() {
		return r15;
	}

	public static void setR15(Boolean b) {
		r15 = b;
	}

	@Override
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
		entityManager.render(g);
	}

}
