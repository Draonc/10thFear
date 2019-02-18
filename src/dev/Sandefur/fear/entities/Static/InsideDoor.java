
package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.states.GameState;
import dev.Sandefur.fear.states.State;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;
import dev.Sandefur.fear.worlds.OverWorld;

public class InsideDoor extends StaticEntity {
	int house;

	public InsideDoor(Handler handler, float x, float y, int house) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.x = 0;
		bounds.y = 0;
		bounds.height = 64;
		bounds.width = 64;

		this.house = house;

	}

	public void update() {
		if (checkPlayerCollision(0,-3)) {
			JukeBox.play("Door");
			OverWorld.setLocation(house);
			State.setState(new GameState(handler));
		}
	}

	@Override
	public void tick() {
		update();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.insideDoor, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		// g.setColor(Color.red);
		// g.fillRect((int) (x + bounds.x -
		// handler.getGameCamera().getxOffset()), (int) (y + bounds.y -
		// handler.getGameCamera().getyOffset()), 15, 15);
	}
}
