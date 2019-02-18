package dev.Sandefur.fear.entities.creatures;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.entities.creatures.NPC.NPC;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.Timer;

public class MainPlayer extends Player {

	// Animations
	private Animation animDown, animUp, animLeft, animRight, attackDown, attackUp, attackLeft, attackRight, falling;

	public static boolean interact, up, down, left, right, attack, set, start, start2, fall, hit;
	private static int i, w, h;
	private Timer timer2 = new Timer();


	public MainPlayer(Handler handler, float x, float y) {
		super(handler, x, y);

		bounds.x = 20;
		bounds.y = 35;
		bounds.width = 26;
		bounds.height = 28;
		fall = false;
		hit = false;

		i = 1;
		w = 0;
		h = 0;

		interact = false;
		up = false;
		down = true;
		left = false;
		right = false;
		attack = false;
		set = true;
		start = true;
		start2 = false;

		// Animatons
		animDown = new Animation(200, Assets.player_down);
		animUp = new Animation(300, Assets.player_up);
		animLeft = new Animation(300, Assets.player_left);
		animRight = new Animation(300, Assets.player_right);
		attackDown = new Animation(100, Assets.attack_down);
		attackUp = new Animation(100, Assets.attack_up);
		attackLeft = new Animation(100, Assets.attack_left);
		attackRight = new Animation(100, Assets.attack_right);
		falling = new Animation(100, Assets.fall);

	}

	@Override
	public void tick() {
		// Animations
		animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();
		attackDown.tick();
		attackUp.tick();
		attackLeft.tick();
		attackRight.tick();
		falling.tick();
		handler.getGame().getCourageBar().tick();

		// Movement
		getInput();
		move();
		fall();
		pause();
		handler.getGameCamera().centerOnEntity(this);
	}

	private void getInput() {
		xMove = 0;
		yMove = 0;

		if (warping || CourageBar.getPrint() || fall || NPC.getSpeaking()) {
			xMove = 0;
			yMove = 0;
		} else {

			if (handler.getKeyManager().up) {
				yMove = -speed;
				up = true;
				down = false;
				left = false;
				right = false;
			}
			if (handler.getKeyManager().down) {
				yMove = speed;
				down = true;
				up = false;
				left = false;
				right = false;
			}
			if (handler.getKeyManager().left) {
				xMove = -speed;
				left = true;
				up = false;
				down = false;
				right = false;

			}
			if (handler.getKeyManager().right) {
				xMove = speed;
				right = true;
				up = false;
				down = false;
				left = false;
			}
		}

		if (handler.getKeyManager().attack && start) {
			attack = true;
			i = 2;
			if (set) {
				attackDown.setIndex(0);
				attackUp.setIndex(0);
				attackLeft.setIndex(0);
				attackRight.setIndex(0);
				set = false;
			}

			if (attackDown.getIndex() == 2) {
				start = false;
				timer.Start();
			}

		} else {
			attack = false;
			i = 1;
			w = 0;
			h = 0;
			rect.width = 0;
			rect.height = 0;
			set = true;
			if (!timer.run(5)) {
				start = true;
			}

		}

	}


	public void fall() {
		if (xMove > 0 || right) {// Moving right
			int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;

			if (collisionWithDeepTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					&& collisionWithDeepTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
				if (!start2) {
					fall = true;
					timer2.Start();
					start2 = true;
					hit = true;
					CourageBar.decCourage();
				}
			}
			if (timer2.run(.35f) && hit) {
				fall = false;
				x = tx * Tile.TILEWIDTH - 1;
				start2 = false;
				hit = false;
			}
		} else if (xMove < 0 || left) {// Moving left
			int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;

			if (collisionWithDeepTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					&& collisionWithDeepTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
				if (!start2) {
					fall = true;
					timer2.Start();
					start2 = true;
					hit = true;
					CourageBar.decCourage();
				}
			}
			if (timer2.run(.35f) && hit) {
				fall = false;
				x = tx * Tile.TILEWIDTH - 1;
				start2 = false;
				hit = false;
			}
		}

		if (yMove < 0 || up) {// Up
			int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;

			if (collisionWithDeepTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
					&& collisionWithDeepTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {

				if (!start2) {
					fall = true;
					timer2.Start();
					start2 = true;
					hit = true;
					CourageBar.decCourage();
				}
			}
			if (timer2.run(.35f) && hit) {
				fall = false;
				y = ty * Tile.TILEHEIGHT - 1;
				start2 = false;
				hit = false;
			}

		} else if (yMove > 0 || down) {// Down
			
			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

			if (collisionWithDeepTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
					&& collisionWithDeepTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
				if (!start2) {
					fall = true;
					timer2.Start();
					start2 = true;
					hit = true;
					CourageBar.decCourage();
				}
			}
			if (timer2.run(.35f) && hit) {
				fall = false;
				y = ty * Tile.TILEHEIGHT - 1;
				start2 = false;
				hit = false;
			}
		}

	}


	@Override
	public void setWarping(boolean b) {
		warping = b;
	}

	@Override
	public void render(Graphics2D g) {
		handler.getGame().getCourageBar().render(g);
		if (!warping) {
			g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()) - w,
					(int) (y - handler.getGameCamera().getyOffset() - h), width * i, height * i, null);
		}
		// g.setColor(Color.red);
		// g.fillRect((int) (x + rect.x - handler.getGameCamera().getxOffset()),
		// (int) (y + rect.y - handler.getGameCamera().getyOffset()),
		// rect.width, rect.height);
	}

	private BufferedImage getCurrentAnimationFrame() {
		BufferedImage image = null;
		if (fall) {
			image = falling.getCurrentFrame();
		} else if (xMove < 0 && left && !attack) {
			image = animLeft.getCurrentFrame();
		} else if (xMove > 0 && right && !attack) {
			image = animRight.getCurrentFrame();
		} else if (yMove < 0 && up && !attack) {
			image = animUp.getCurrentFrame();
		} else if (yMove > 0 && down && !attack) {
			image = animDown.getCurrentFrame();
		} else if (left && attack) {
			rect.x = -17;
			rect.y = 44;
			rect.width = 37;
			rect.height = 8;
			h = height;
			w = width;
			image = attackLeft.getCurrentFrame();
		} else if (right && attack) {
			rect.x = 46;
			rect.y = 44;
			rect.width = 37;
			rect.height = 8;
			h = height;
			image = attackRight.getCurrentFrame();
		} else if (up && attack) {
			rect.x = 18;
			rect.y = -24;
			rect.width = 8;
			rect.height = 37;
			w = width;
			h = height;
			image = attackUp.getCurrentFrame();
		} else if (down && attack) {
			rect.x = 42;
			rect.y = 64;
			rect.width = 8;
			rect.height = 37;
			image = attackDown.getCurrentFrame();
		} else if (left) {
			image = Assets.player_left[1];
		} else if (right) {
			image = Assets.player_right[1];
		} else if (up) {
			image = Assets.player_up[1];
		} else if (down) {
			image = Assets.player_down[1];
		}

		return image;
	}

	public float getY() {
		return y;
	}

	public float getX() {
		return x;
	}
}