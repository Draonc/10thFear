
package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class Chest extends StaticEntity {

	private Boolean playerTouch = false;
	private Boolean chestOpen;

	private static Boolean c1 = false, c2 = false, c3 = false, c4 = false, c5 = false, c6 = false, c7 = false,
			c8 = false, c9 = false, c10 = false, c11 = false, c12 = false, c13 = false, c14 = false, c15 = false,
			c16 = false, c17 = false, c18 = false;

	private int chest;

	public Chest(Handler handler, float x, float y, int chest) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);

		this.chest = chest;
		bounds.x = 8;
		bounds.y = 16;
		bounds.width = 48;
		bounds.height = 48;
		isOpen();
	}

	public void update() {
		if (checkPlayerCollision(0, 5))
			playerTouch = true;

		if (playerTouch && handler.getKeyManager().interact && !chestOpen) {
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
		if (chest == 10)
			c10 = b;
		if (chest == 11)
			c11 = b;
		if (chest == 12)
			c12 = b;
		if (chest == 13)
			c13 = b;
		if (chest == 14)
			c14 = b;
		if (chest == 15)
			c15 = b;
		if (chest == 16)
			c16 = b;
		if (chest == 17)
			c17 = b;
		if (chest == 18)
			c18 = b;
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
		if (chest == 10)
			chestOpen = c10;
		if (chest == 11)
			chestOpen = c11;
		if (chest == 12)
			chestOpen = c12;
		if (chest == 13)
			chestOpen = c13;
		if (chest == 14)
			chestOpen = c14;
		if (chest == 15)
			chestOpen = c15;
		if (chest == 16)
			chestOpen = c16;
		if (chest == 17)
			chestOpen = c17;
		if (chest == 18)
			chestOpen = c18;

	}

	@Override
	public void tick() {
		update();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.chestClosed, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

		if (chestOpen) {
			g.drawImage(Assets.chestOpen, (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		}
	}
}
