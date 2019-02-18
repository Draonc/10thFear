package dev.Sandefur.fear.entities.Static.Portals;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.StaticEntity;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.states.State;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;
import dev.Sandefur.fear.utils.Timer;

public abstract class Portal extends StaticEntity {
	protected Boolean touched, start, active;
	protected Animation teleport;
	protected Timer timer = new Timer();
	protected float time;

	;

	public Portal(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		touched = false;
		bounds.width = 0;
		bounds.height = 0;
		start = false;
		active = true;
		teleport = new Animation(50, Assets.teleport);
		time = .8f;


	}

	public void active(boolean b) {
		if (b) {
			active = false;
		}
	}

	@Override
	public abstract void tick();

	protected void touched() {
		if (active) {
			if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 16,
					EntityManager.getPlayer().getY() + 16, x + 16, y + 16) < 30) {
				JukeBox.play("Port");
				touched = true;
				handler.getWorld().getEntityManager().getPlayer()
						.setWarping(true);
				JukeBox.stop("BG");
				if (!start) {
					timer.Start();
					start = true;
				}
			} else {
				touched = false;
			}
		}
	}

	public void setActive(boolean b) {
		active = b;
	}

	public abstract void port();

	@Override
	public abstract void render(Graphics2D g);

}
