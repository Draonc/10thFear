package dev.Sandefur.fear.entities.creatures;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.Timer;

public class PlatformerPlayer extends Player {
	private static final float DAMPING = 2.2f;
	private float fallSpeed = speed * (DAMPING + .5f), jumpSpeed = -speed * (DAMPING);
	private Boolean falling, jumping, pressed, right, left, wrap, dark;
	public static Timer time = new Timer();
	private int xStart, xEnd, yStart, yEnd, yEnd2;
	private float startY, startX;

	private Animation animLeft, animRight;

	public PlatformerPlayer(Handler handler, float x, float y, boolean wrap, boolean dark) {
		super(handler, x, y);
		jumping = false;
		pressed = true;
		falling = false;
		interact = false;
		this.wrap = wrap;
		this.dark = dark;
		startY = y;
		startX = x;

		yEnd2 = Tile.TILEHEIGHT * 151;

		xStart = -2;
		xEnd = Tile.TILEWIDTH * 16;

		yStart = 0;
		yEnd = Tile.TILEHEIGHT * 13;

		right = true;
		left = false;

		bounds.x = 20;
		bounds.y = 35;
		bounds.width = 26;
		bounds.height = 28 + 16;

		// Animatons
		animLeft = new Animation(100, Assets.player_left);
		animRight = new Animation(100, Assets.player_right);
	}

	@Override
	public void tick() {
		// Animations
		animLeft.tick();
		animRight.tick();
		handler.getGame().getCourageBar().tick();
		// Movement
		isFalling();
		isJumping();
		getInput();
		Jump();
		move();
		pause();
		wrap();
		fall();
		handler.getGameCamera().centerOnEntity(this);
	}

	private void Jump() {
		if (!jumping && falling)
			yMove = fallSpeed;

		if (jumping) {
			yMove = jumpSpeed;
		}
	}

	private void getInput() {
		xMove = 0;
		yMove = 0;

		if (CourageBar.getPrint()) {
			xMove = 0;
			yMove = 0;
		} else {

			if (handler.getKeyManager().left) {
				xMove = -speed;
				left = true;
				right = false;
				if (jumping || falling)
					xMove = -speed * 1.5f;
			}
			if (handler.getKeyManager().right) {
				xMove = speed;
				right = true;
				left = false;
				if (jumping || falling)
					xMove = speed * 1.5f;
			}

			if (handler.getKeyManager().interact && pressed && !falling) {
				jumping = true;
				pressed = false;
				timer.Start();
			} else {
				if (timer.run(.35f)) {
					jumping = false;
				}
			}

			if (!handler.getKeyManager().interact) {
				pressed = true;
				if (timer.run(.5f))
					jumping = false;
			}
		}
	}

	private void fall() {
		if (dark) {
			if (y > yEnd) {
				y = yStart + 10;
				CourageBar.decCourage();
			}
		}
	}

	private void wrap() {
		if (wrap) {
			if (x > xEnd)
				x = xStart;

			if (x < xStart)
				x = xEnd - 10;

			if (y > yEnd2) {
				y = startY;
				x = startX;
				CourageBar.decCourage();
			}
		}
	}

	@Override
	public void render(Graphics2D g) {
		handler.getGame().getCourageBar().render(g);
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), (int) (width * 1.25), (int) (height * 1.25), null);
	}

	private BufferedImage getCurrentAnimationFrame() {
		if (left && jumping)
			return Assets.jump_left;
		else if (right && jumping)
			return Assets.jump_right;
		else if (left && falling)
			return Assets.fall_left;
		else if (right && falling)
			return Assets.fall_right;
		else if (xMove < 0) {
			return animLeft.getCurrentFrame();
		} else if (xMove > 0) {
			return animRight.getCurrentFrame();
		} else if (xMove == 0 && left) {
			return Assets.player_left[1];
		} else {
			return Assets.player_right[1];
		}
	}

	public boolean isFalling() {
		int ty = (int) (y + yMove + bounds.y + bounds.height + 1) / Tile.TILEHEIGHT;
		if (collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
				|| collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
			falling = false;
		} else
			falling = true;

		return falling;
	}

	public boolean isJumping() {
		int ty = (int) (y + bounds.y - 1) / Tile.TILEHEIGHT;
		if (collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
				|| collisionWithTile((int) (x + +bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
			jumping = false;
		}

		return falling;

	}

	public float getY() {
		return y;
	}

	public float getX() {
		return x;
	}
}
