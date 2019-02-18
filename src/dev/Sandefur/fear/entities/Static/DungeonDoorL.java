package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;

public class DungeonDoorL extends StaticEntity {
	private Boolean open;
	private int moveX, moveY, direction;
	private BufferedImage image;

	public DungeonDoorL(Handler handler, float x, float y, int door, int direction) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		setLocation(door);
		this.direction = direction;
		
		open = false;
	}
	
	private void setLocation(int location){
		switch(location){
		case 1:
			moveX = Tile.TILEWIDTH * 69;
			moveY = (Tile.TILEHEIGHT * 7) + 32;
			break;
		case 2:
			moveX = (Tile.TILEWIDTH * 87) + 32;
			moveY = (Tile.TILEHEIGHT * 13) - 2;
			break;
		case 3:
			moveX = Tile.TILEWIDTH * 28;
			moveY = (Tile.TILEHEIGHT * 30) + 32;
			break;
		case 4:
			moveX = (Tile.TILEWIDTH * 113) + 32;
			moveY = (Tile.TILEHEIGHT * 25) - 5;
			break;
		case 5:
			moveX = (Tile.TILEWIDTH * 61) + 32;
			moveY = (Tile.TILEHEIGHT * 59 - 5);
			break;
		case 6:
			moveX = Tile.TILEWIDTH * 69;
			moveY = (Tile.TILEHEIGHT * 76) + 32;
			break;
		case 7:
			moveX = Tile.TILEWIDTH * 95;
			moveY = (Tile.TILEHEIGHT * 76) + 32;
			break;
		case 8:
			moveX = Tile.TILEWIDTH * 54;
			moveY = (Tile.TILEHEIGHT * 99) + 32;
			break;
		
		}
	}
	
	private void direction(){
		if (open && direction == 1){
			image = Assets.dungeonDoorUUp;
		}
		
		if (open && direction == 2){
			image = Assets.dungeonDoorUDown;
		}
		
		if (open && direction == 3){
			image = Assets.dungeonDoorULeft;
		}
		
		if (open && direction == 4){
			image = Assets.dungeonDoorURight;
		}
		
		if (!open && direction == 1){
			image = Assets.dungeonDoorLUp;
		}
		
		if (!open && direction == 2){
			image = Assets.dungeonDoorLDown;
		}
		
		if (!open && direction == 3){
			image = Assets.dungeonDoorLLeft;
		}
		
		if (!open && direction == 4){
			image = Assets.dungeonDoorLRight;
		}
		
	}
	
	private void open(){
		if (checkPlayerCollision(0, 5) && direction == 1 && Key.getKeys() > 0) {
				open = true;
				Key.useKey();
			}
			
			if (checkPlayerCollision(0, -5) && direction == 2 && Key.getKeys() > 0) {
				open = true;
				Key.useKey();
			}
			
			if (checkPlayerCollision(5, 0) && direction == 3 && Key.getKeys() > 0) {
				open = true;
				Key.useKey();
			}
			
			if (checkPlayerCollision(-5, 0) && direction == 4 && Key.getKeys() > 0) {
				open = true;
				Key.useKey();
			}
			
		
		if (open){
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
	}

	@Override
	public void tick() {
		open();
		direction();		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
