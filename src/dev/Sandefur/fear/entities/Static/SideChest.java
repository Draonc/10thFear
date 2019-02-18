
package dev.Sandefur.fear.entities.Static;

import java.awt.Color;
import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class SideChest extends StaticEntity {

	private Boolean playerTouch = false;
	private Boolean chestOpen;

	private static Boolean c1 = false, c2 = false, c3 = false, c4 = false, c5 = false, c6 = false, c7 = false,
			c8 = false, c9 = false;;

	private int chest;

	public SideChest(Handler handler, float x, float y, int chest) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);

		this.chest = chest;
		bounds.x = -5;
		bounds.y = 16;
		bounds.width = 48;
		bounds.height = 48;
		isOpen();
	}

	public void update() {
		if (checkPlayerCollision(-9, 0))
			playerTouch = true;

		if (playerTouch && handler.getKeyManager().attack && !chestOpen) {
			CourageBar.incCourage();
			playerTouch = false;
			chestOpen = true;
			setopen(true);
			JukeBox.play("Chest");
			CourageBar.getTimer().Start();
			CourageBar.setPrint(true);
		}
	}

	public void setopen(boolean b) {
		if (chest == 1)
			c1 = b;
		if (chest == 2)
			c2 = b;
		if (chest == 3)
			c3 = b;
		if (chest == 4)
			c4 = b;
		if (chest == 5)
			c5 = b;
		if (chest == 6)
			c6 = b;
		if (chest == 7)
			c7 = b;
		if (chest == 8)
			c8 = b;
		if (chest == 9)
			c9 = b;
	}

	public void isOpen() {
		if (chest == 1)
			chestOpen = c1;
		if (chest == 2)
			chestOpen = c2;
		if (chest == 3)
			chestOpen = c3;
		if (chest == 4)
			chestOpen = c4;
		if (chest == 5)
			chestOpen = c5;
		if (chest == 6)
			chestOpen = c6;
		if (chest == 7)
			chestOpen = c7;
		if (chest == 8)
			chestOpen = c8;
		if (chest == 9)
			chestOpen = c9;

	}

	@Override
	public void tick() {
		update();
	}

	@Override
	public void render(Graphics2D g) {
		if(!chestOpen){
		g.drawImage(Assets.schestClosed, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		}

		if (chestOpen) {
			g.drawImage(Assets.schestOpen, (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		}
	}
}
