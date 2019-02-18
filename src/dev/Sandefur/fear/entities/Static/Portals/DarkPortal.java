package dev.Sandefur.fear.entities.Static.Portals;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDark;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.states.DarkState;
import dev.Sandefur.fear.states.State;

public class DarkPortal extends Portal {
	private Animation portal;

	public DarkPortal(Handler handler, float x, float y) {
		super(handler, x, y);
		portal = new Animation(100, Assets.darkPort);
	}

	@Override
	public void port() {
		if (touched && timer.run(time))
		State.setState(new DarkState(handler));
	}

	@Override
	public void tick() {
		port();
		touched();
		portal.tick();
		teleport.tick();
		active(TokenDark.getToken());
	}

	@Override
	public void render(Graphics2D g) {
		if (active)
			g.drawImage(portal.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		else
			g.drawImage(Assets.blankPortal, (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		if(touched)
			g.drawImage(teleport.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

	}
}
