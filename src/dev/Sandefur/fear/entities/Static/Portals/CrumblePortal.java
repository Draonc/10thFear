package dev.Sandefur.fear.entities.Static.Portals;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDark;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDeath;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDrowning;
import dev.Sandefur.fear.entities.Static.Tokens.TokenFailure;
import dev.Sandefur.fear.entities.Static.Tokens.TokenForgotten;
import dev.Sandefur.fear.entities.Static.Tokens.TokenHeights;
import dev.Sandefur.fear.entities.Static.Tokens.TokenInjury;
import dev.Sandefur.fear.entities.Static.Tokens.TokenLost;
import dev.Sandefur.fear.entities.Static.Tokens.TokenStupid;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.states.CrumbleState;
import dev.Sandefur.fear.states.State;

public class CrumblePortal extends Portal {
	private Animation portal;

	public CrumblePortal(Handler handler, float x, float y) {
		super(handler, x, y);
		portal = new Animation(100, Assets.crumblePort);
	}

	@Override
	public void port() {
		if (touched && timer.run(time))
		State.setState(new CrumbleState(handler));
	}

	@Override
	public void tick() {
		port();
		touched();
		portal.tick();
		teleport.tick();
		active(!TokenHeights.getToken() || !TokenDeath.getToken() || !TokenInjury.getToken() || !TokenDrowning.getToken() || !TokenFailure.getToken()
			|| !TokenStupid.getToken() || !TokenLost.getToken() || !TokenForgotten.getToken() || !TokenDark.getToken());
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
