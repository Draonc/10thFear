package dev.Sandefur.fear.entities.creatures;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class RunningPlayer extends Player {
	private static final float DAMPING = 1.5f;
	private float runSpeed = speed * DAMPING;
	private Boolean up;

	// Animations
	private Animation animeUp;
	public static boolean interact = false;

	public RunningPlayer(Handler handler, float x, float y) {
		super(handler, x, y);
		timer.Start();

		bounds.x = 20;
		bounds.y = 35;
		bounds.width = 26;
		bounds.height = 28;
		pressed = true;
		up = false;

		// Animatons
		animeUp = new Animation(100, Assets.player_up);

	}

	@Override
	public void tick() {
		// Animations
		animeUp.tick();
		handler.getGame().getCourageBar().tick();
		// Movement
		getInput();
		move();
		pause();
		damage();
		handler.getGameCamera().centerOnEntity(this);
	}

	private void damage() {
		if (timer.run(2)) {
			if (xMove > 0) {// Moving right
				int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;

				if (collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
						&& collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
					handler.getGame().getCourageBar().decCourage();
					timer.Start();
				}

			} else if (xMove < 0) {// Moving left
				int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;

				if (collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
						&& collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
					handler.getGame().getCourageBar().decCourage();
					timer.Start();
				}
			}

			if (yMove < 0) {// Up
				int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;

				if (collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
						&& collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
					handler.getGame().getCourageBar().decCourage();
					timer.Start();
				}

			} else if (yMove > 0) {// Down
				int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

				if (collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
						&& collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
					handler.getGame().getCourageBar().decCourage();
					timer.Start();
				}
			}
		}
	}

	private void getInput() {
		xMove = 0;
		yMove = -speed * 2;

		if (handler.getKeyManager().right && pressed) {
			pressed = false;
			xMove = 128;
		} else if (handler.getKeyManager().left && pressed) {
			pressed = false;
			xMove = -128;
		}

		if (!handler.getKeyManager().right && !handler.getKeyManager().left)
			pressed = true;
	}

	@Override
	public void render(Graphics2D g) {
		handler.getGame().getCourageBar().render(g);
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width * 2, height * 2, null);
	}

	private BufferedImage getCurrentAnimationFrame() {
		return animeUp.getCurrentFrame();
	}

	public float getY() {
		return y;
	}

	public float getX() {
		return x;
	}
}