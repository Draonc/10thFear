package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;

public class DungeonDoorU extends StaticEntity {
	private int moveX, moveY, direction;
	private BufferedImage image;

	public DungeonDoorU(Handler handler, float x, float y, int door, int direction) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);

		setLocation(door);
		this.direction = direction;
	}

	private void setLocation(int location) {
		switch (location){
		case 1:
			moveX = (Tile.TILEWIDTH * 9) + 32;
			moveY = Tile.TILEHEIGHT * 2;
			break;
		case 2:
			moveX = (Tile.TILEWIDTH * 35) + 32;
			moveY = (Tile.TILEHEIGHT * 13) - 5;
			break;
		case 3:
			moveX = Tile.TILEWIDTH * 28;
			moveY = (Tile.TILEHEIGHT * 7) + 32;
			break;
		case 4:
			moveX = Tile.TILEWIDTH * 43;
			moveY = (Tile.TILEHEIGHT * 7) + 32;
			break;
		case 5:
			moveX = Tile.TILEWIDTH * 54;
			moveY = (Tile.TILEHEIGHT * 7) + 32;
			break;
		case 6:
			moveX = (Tile.TILEWIDTH * 61) + 32;
			moveY = Tile.TILEHEIGHT * 2;
			break;
		case 7:
			moveX = Tile.TILEWIDTH * 121;
			moveY = (Tile.TILEHEIGHT * 7) + 32;
			break;
		case 8:
			moveX = (Tile.TILEWIDTH * 113) + 32;
			moveY = Tile.TILEHEIGHT * 13;
			break;
		case 9:
			moveX = (Tile.TILEWIDTH * 9) + 32;
			moveY = (Tile.TILEHEIGHT * 25) + 5;
			break;
		case 10:
			moveX = (Tile.TILEWIDTH * 35) + 32;
			moveY = Tile.TILEHEIGHT * 25;
			break;
		case 11:
			moveX = Tile.TILEWIDTH * 43;
			moveY = (Tile.TILEHEIGHT * 30) + 32;
			break;
		case 12:
			moveX = (Tile.TILEWIDTH * 61) + 32;
			moveY = (Tile.TILEHEIGHT * 36) - 5;
			break;
		case 13:
			moveX = (Tile.TILEWIDTH * 87) + 32;
			moveY = (Tile.TILEHEIGHT * 36) - 5;
			break;
		case 14:
			moveX = Tile.TILEWIDTH * 80;
			moveY = (Tile.TILEHEIGHT * 30) + 32;
			break;
		case 15:
			moveX = Tile.TILEWIDTH * 95;
			moveY = (Tile.TILEHEIGHT * 30) + 32;
			break;
		case 16:
			moveX = (Tile.TILEWIDTH * 9) + 32;
			moveY = Tile.TILEHEIGHT * 48;
			break;
		case 17:
			moveX = Tile.TILEWIDTH * 2;
			moveY = (Tile.TILEHEIGHT * 53) + 32;
			break;
		case 18:
			moveX = (Tile.TILEWIDTH * 35) + 32;
			moveY = Tile.TILEHEIGHT * 48;
			break;
		case 19:
			moveX = (Tile.TILEWIDTH * 35) + 32;
			moveY = (Tile.TILEHEIGHT * 59) - 5;
			break;
		case 20:
			moveX = (Tile.TILEWIDTH * 61) + 32;
			moveY = Tile.TILEHEIGHT * 48;
			break;
		case 21:
			moveX = Tile.TILEWIDTH * 80;
			moveY = (Tile.TILEHEIGHT * 53) + 32;
			break;
		case 22:
			moveX = (Tile.TILEWIDTH * 87) + 32;
			moveY = (Tile.TILEHEIGHT * 59) - 5;
			break;
		case 23:
			moveX = Tile.TILEWIDTH * 106;
			moveY = (Tile.TILEHEIGHT * 53) + 32;
			break;
		case 24:
			moveX = Tile.TILEWIDTH * 121;
			moveY = (Tile.TILEHEIGHT * 53) + 32;
			break;
		case 25:
			moveX = Tile.TILEWIDTH * 2;
			moveY = (Tile.TILEHEIGHT * 76) + 32;
			break;
		case 26:
			moveX = Tile.TILEWIDTH * 17;
			moveY = (Tile.TILEHEIGHT * 76) + 32;
			break;
		case 27:
			moveX = Tile.TILEWIDTH * 28;
			moveY = (Tile.TILEHEIGHT * 76) + 32;
			break;
		case 28:
			moveX = (Tile.TILEWIDTH * 43) - 5;
			moveY = (Tile.TILEHEIGHT * 76) + 32;
			break;
		case 29:
			moveX = (Tile.TILEWIDTH * 35) + 35;
			moveY = Tile.TILEHEIGHT * 71;
			break;
		case 30:
			moveX = (Tile.TILEWIDTH * 35) + 32;
			moveY = Tile.TILEHEIGHT * 71;
			break;
		case 31:
			moveX = Tile.TILEWIDTH * 54;
			moveY = (Tile.TILEHEIGHT * 76) + 32;
			break;
		case 32:
			moveX = (Tile.TILEWIDTH * 61) + 32;
			moveY = Tile.TILEHEIGHT * 71;
			break;
		case 33:
			moveX = (Tile.TILEWIDTH * 113) + 32;
			moveY = Tile.TILEHEIGHT * 71;
			break;
		case 34:
			moveX = (Tile.TILEWIDTH * 9) + 32;
			moveY = (Tile.TILEHEIGHT * 105) - 5;
			break;
		case 35:
			moveX = Tile.TILEWIDTH * 17;
			moveY = (Tile.TILEHEIGHT * 99) + 32;
			break;
		case 36:
			moveX = Tile.TILEWIDTH * 28;
			moveY = (Tile.TILEHEIGHT * 99) + 32;
			break;
		case 37:
			moveX = Tile.TILEWIDTH * 43;
			moveY = (Tile.TILEHEIGHT * 99) + 32;
			break;
		case 38:
			moveX = (Tile.TILEWIDTH * 35) + 32;
			moveY = (Tile.TILEHEIGHT * 105) - 5;
			break;

		}
	}

	private void direction() {
		if (direction == 1) {
			image = Assets.dungeonDoorUUp;
		}

		if (direction == 2) {
			image = Assets.dungeonDoorUDown;
		}

		if (direction == 3) {
			image = Assets.dungeonDoorULeft;
		}

		if (direction == 4) {
			image = Assets.dungeonDoorURight;
		}

	}

	private void move() {

		if (checkPlayerCollision(0, 5) && direction == 1) {
			handler.getWorld().getEntityManager().getPlayer().setX(moveX);
			handler.getWorld().getEntityManager().getPlayer().setY(moveY);
		}
		
		if (checkPlayerCollision(0, -5) && direction == 2) {
			handler.getWorld().getEntityManager().getPlayer().setX(moveX);
			handler.getWorld().getEntityManager().getPlayer().setY(moveY);
		}
		
		if (checkPlayerCollision(5, 0) && direction == 3) {
			handler.getWorld().getEntityManager().getPlayer().setX(moveX);
			handler.getWorld().getEntityManager().getPlayer().setY(moveY);
		}
		
		if (checkPlayerCollision(-5, 0) && direction == 4) {
			handler.getWorld().getEntityManager().getPlayer().setX(moveX);
			handler.getWorld().getEntityManager().getPlayer().setY(moveY);
		}
		
	}

	@Override
	public void tick() {
		move();
		direction();

	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
