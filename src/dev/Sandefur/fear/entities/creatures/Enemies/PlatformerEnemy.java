package dev.Sandefur.fear.entities.creatures.Enemies;

import java.awt.Graphics2D;
import java.util.Random;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.entities.Entity;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.creatures.Creature;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;
import dev.Sandefur.fear.utils.Timer;

public class PlatformerEnemy extends Creature {

	protected Entity target = null;
	protected static final float DAMPING = 0.5f;
	protected Boolean touched, shouldSet, resting, left, right, moveRight, moveLeft, damage, moveDown, moveUp;
	protected int startX, startY;
	protected int health;
	protected boolean Ver, Hor;

	private Timer timer = new Timer();

	protected float speedx, speedy;
	protected float maxSpeed = speed * DAMPING;
	protected float minSpeed = -speed * DAMPING;

	public PlatformerEnemy(Handler handler, float x, float y, int width, int height, int health, int direction) {
		super(handler, x, y, width, height);
		timer.Start();
		direction(direction);

		this.health = health;

		touched = false;
		shouldSet = true;
		resting = false;

		damage = false;

		startX = (int) x;
		startY = (int) y;

	}

	// Looks to see if the player is close.
	public void look() {
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32,
				y + 32) < 128)
			setTarget(EntityManager.getPlayer());
		else
			setTarget(null);

		xMove = 0;
		yMove = 0;
	}

	public void damage() {
		if (this.getCollisionBounds(0f, 0f).intersects(handler.getWorld().getEntityManager().getPlayer().getRect())
				&& timer.run(.5f)) {
			JukeBox.play("EHit");
			health -= 1;
			timer.Start();
			damage = true;

		} else
			damage = false;
	}

	// If the player is close enough the entity will chase after.
	public void chase() {
		xMove = 0;
		yMove = 0;

		speedx = (getTarget().getX() - x);
		speedy = (getTarget().getY() - y);
	}

	public void death() {
		if (health <= 0) {
			JukeBox.play("EDie");
			handler.getWorld().getEntityManager().removeEntity(this);
		}
	}

	public void action() {
		if (target == null) {
			look();
			idle();
		} else
			chase();
	}

	public void idle() {
		chooseDirection();
		if (moveRight)
			xMove = speed * .75f;

		if (moveLeft)
			xMove = -speed * .75f;

		if (moveUp)
			yMove = -speed * .75f;

		if (moveDown)
			yMove = speed * .75f;
	}

	public void chooseDirection() {
		if (Hor) {
			int ty = (int) (y + yMove + bounds.y + bounds.height + 1) / Tile.TILEHEIGHT;
			if (!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)) {
				moveRight = true;
				moveLeft = false;
			}

			if (!collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
				moveRight = false;
				moveLeft = true;
			}

			int ty2 = (int) (y + yMove + bounds.y + 1) / Tile.TILEHEIGHT;
			if (collisionWithTile((int) (x + bounds.x - 1) / Tile.TILEWIDTH, ty2)) {
				moveRight = true;
				moveLeft = false;
			}

			if (collisionWithTile((int) (x + bounds.x + bounds.width + 1) / Tile.TILEWIDTH, ty2)) {
				moveRight = false;
				moveLeft = true;
			}
		}

		if (Ver) {
			if (moveUp) {
				int ty = (int) (y + yMove + bounds.y + 1) / Tile.TILEHEIGHT;

				if (collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
						|| collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
					moveUp = false;
					moveDown = true;
				}

			}

			if (moveDown) {
				int ty = (int) (y + yMove + bounds.y + bounds.height - 1) / Tile.TILEHEIGHT;

				if (collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
						|| collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
					moveUp = true;
					moveDown = false;
				}
			}
		}

	}

	public void direction(int direction) {
		if (direction == 1) {
			Hor = true;
			Ver = false;

			left = true;
			moveLeft = true;
			right = false;
			moveRight = false;

			moveUp = false;
			moveDown = false;
		}

		if (direction == 2) {
			Ver = true;
			Hor = false;
			left = true;
			moveLeft = false;
			right = false;
			moveRight = false;
			moveUp = true;
			moveDown = false;
		}

		if (direction == 3) {
			Ver = false;
			Hor = false;
		}
	}

	public void walk() {
		if (xMove < 0) {
			left = true;
			right = false;
		} else if (xMove > 0) {
			right = true;
			left = false;
		}
	}

	public void setTarget(Entity o) {
		target = o;
	}

	public Entity getTarget() {
		return target;
	}

	public void attack() {
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX(), EntityManager.getPlayer().getY(), x, y) < 45) {
			touched = true;
		} else
			touched = false;

		if (touched && timer.run(1)) {
			CourageBar.decCourage();
			timer.Start();

			if (left) {
				handler.getWorld().getEntityManager().getPlayer().setyMove(speed * 20);
				handler.getWorld().getEntityManager().getPlayer().setxMove(0);
			}

			if (right) {
				handler.getWorld().getEntityManager().getPlayer().setyMove(-speed * 20);
				handler.getWorld().getEntityManager().getPlayer().setxMove(0);
			}
		}
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
	}
}
