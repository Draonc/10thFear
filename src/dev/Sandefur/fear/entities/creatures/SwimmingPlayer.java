package dev.Sandefur.fear.entities.creatures;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;

public class SwimmingPlayer extends Player {
	private static final float DAMPING = 0.5f;
	private float fallSpeed = speed * DAMPING;

	// Animations
	private Animation swimLeft, swimRight;
	public static boolean interact = false;

	public SwimmingPlayer(Handler handler, float x, float y) {
		super(handler, x, y);

		bounds.x = 20;
		bounds.y = 35;
		bounds.width = 26;
		bounds.height = 28;
		pressed = true;

		// Animatons
		swimLeft = new Animation(500, Assets.swimming_left);
		swimRight = new Animation(500, Assets.swimming_right);
	}

	@Override
	public void tick() {
		// Animations
		swimRight.tick();
		swimLeft.tick();
		handler.getGame().getCourageBar().tick();
		// Movement
		getInput();
		swim();
		move();
		pause();
		handler.getGameCamera().centerOnEntity(this);
	}

	private void swim() {
		if (!handler.getKeyManager().up)
			yMove = fallSpeed;
	}

	private void getInput() {
		xMove = 0;
		yMove = 0;
		if (CourageBar.getPrint()) {
			xMove = 0;
			yMove = 0;

			if (handler.getKeyManager().up && pressed) {
				yMove = -speed;
				timer.Start();
				if (timer.run(.5f))
					pressed = false;
			}
			if (handler.getKeyManager().left)
				xMove = -speed;
			if (handler.getKeyManager().right)
				xMove = speed;

			if (!handler.getKeyManager().up)
				pressed = true;
		}

	}

	@Override
	public void render(Graphics2D g) {
		handler.getGame().getCourageBar().render(g);
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	private BufferedImage getCurrentAnimationFrame() {
		if (xMove < 0) {
			return swimLeft.getCurrentFrame();
		} else {
			return swimRight.getCurrentFrame();
		}
	}

	public float getY() {
		return y;
	}

	public float getX() {
		return x;
	}
}