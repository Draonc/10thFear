package dev.Sandefur.fear.entities.creatures.Enemies;

import java.awt.Graphics2D;
import java.util.Random;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.entities.Entity;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.creatures.Creature;
import dev.Sandefur.fear.utils.CreaturesUtil;
import dev.Sandefur.fear.utils.Timer;
import dev.Sandefur.fear.worlds.FailureWorld;

public class Enemy extends Creature {

	protected Entity target = null;
	protected static final float DAMPING = 0.5f;
	protected Boolean touched, shouldSet, resting, up, down, left, right,
			damage;
	protected int startX, startY;
	protected int health;

	protected Timer timer = new Timer();

	protected float speedx, speedy;
	protected float maxSpeed = speed * DAMPING;
	protected float minSpeed = -speed * DAMPING;

	private Random rand = new Random();

	public Enemy(Handler handler, float x, float y, int width, int height,
			int health) {
		super(handler, x, y, width, height);
		timer.Start();

		this.health = health;

		touched = false;
		shouldSet = true;
		resting = false;

		up = false;
		down = true;
		left = false;
		right = false;
		damage = false;

		startX = (int) x;
		startY = (int) y;

	}

	// Looks to see if the player is close.
	public void look() {
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32,
				EntityManager.getPlayer().getY() + 32, x + 32, y + 32) < 128)
			setTarget(EntityManager.getPlayer());
		else
			setTarget(null);

		xMove = 0;
		yMove = 0;
	}

	public void damage() {
		if (this.getCollisionBounds(0f, 0f).intersects(
				handler.getWorld().getEntityManager().getPlayer().getRect())
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
			FailureWorld.kill();
		}
	}

	public void action() {
		if (target == null) {
			look();
			idle();
		} else
			chase();
	}

	// Creature chooses a random direction and walks when not chasing player
	public void idle() {
		if (CreaturesUtil.dist(startX, startY, x, y) < 500) {
			if (!resting) {
				if (shouldSet) {
					speedx = chooseDirection();
					speedy = chooseDirection();
					shouldSet = false;
				} else if (timer.run(2)) {
					resting = true;
					shouldSet = true;
					timer.Start();
				}
			} else if (timer.run(10)) {
				speedx = 0;
				speedy = 0;
				resting = false;
				timer.Start();
			}
		} else {
			speedx = startX - x;
			speedy = startY - y;
		}
	}

	public int chooseDirection() {

		int[] randDirection = new int[3];
		randDirection[0] = 0;
		randDirection[1] = 1;
		randDirection[2] = -1;
		int randChoice = rand.nextInt(3);
		return randDirection[randChoice];
	}

	public void walk() {
		if (speedx > maxSpeed)
			speedx = maxSpeed;
		if (speedx < minSpeed)
			speedx = minSpeed;

		if (speedy > maxSpeed)
			speedy = maxSpeed;
		if (speedy < minSpeed)
			speedy = minSpeed;

		xMove = xMove + speedx;
		yMove = yMove + speedy;

		if (xMove < 0) {
			left = true;
			right = false;
			up = false;
			down = false;
		} else if (xMove > 0) {
			right = true;
			left = false;
			up = false;
			down = false;
		} else if (yMove < 0) {
			up = true;
			left = false;
			right = false;
			down = false;
		} else if (yMove > 0) {
			down = true;
			left = false;
			right = false;
			up = false;
		}

	}

	public void setTarget(Entity o) {
		target = o;
	}

	public Entity getTarget() {
		return target;
	}

	public void attack() {
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX(), EntityManager
				.getPlayer().getY(), x, y) < 45) {
			touched = true;
		} else
			touched = false;

		if (touched && timer.run(.7f)) {
			CourageBar.decCourage();
			timer.Start();
			if (up) {
				handler.getWorld().getEntityManager().getPlayer().setxMove(-speed * 20);
				handler.getWorld().getEntityManager().getPlayer().setyMove(0);
			}

			if (down) {
				handler.getWorld().getEntityManager().getPlayer().setxMove(speed * 20);
				handler.getWorld().getEntityManager().getPlayer().setyMove(0);
			}

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
