package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;

public class StairDungeon extends StaticEntity {
	private int moveX, moveY;

	public StairDungeon(Handler handler, float x, float y, int door) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.y= 20;

		setLocation(door);
	}

	private void setLocation(int location) {
		switch (location){
		case 1:
			moveX = Tile.TILEWIDTH * 107;
			moveY = (Tile.TILEHEIGHT * 2) - 5;
			break;
		case 2:
			moveX = (Tile.TILEWIDTH * 113) + 32;
			moveY = (Tile.TILEHEIGHT * 33) - 5;
			break;
		case 3:
			moveX = Tile.TILEWIDTH * 91;
			moveY = (Tile.TILEHEIGHT * 49) - 5;
			break;
		case 4:
			moveX = Tile.TILEWIDTH * 4;
			moveY = (Tile.TILEHEIGHT * 95) - 5;
			break;
		}
	}

	

	private void move() {

		if (checkPlayerCollision(0, -5)) {
			JukeBox.play("Stairs");
			handler.getWorld().getEntityManager().getPlayer().setX(moveX);
			handler.getWorld().getEntityManager().getPlayer().setY(moveY);
		}
		
	}

	@Override
	public void tick() {
		move();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.stairsDown, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
