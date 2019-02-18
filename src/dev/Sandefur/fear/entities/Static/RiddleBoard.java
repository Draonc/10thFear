package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.states.RiddlesState;
import dev.Sandefur.fear.states.State;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;
import dev.Sandefur.fear.worlds.RiddleWorld;

public class RiddleBoard extends StaticEntity {
	private int riddle, answer;
	private Boolean interact;

	public RiddleBoard(Handler handler, float x, float y, int riddle, int answer) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEWIDTH);
		this.riddle = riddle;
		this.answer = answer;
		
	}
	
	
	public boolean answered(){
		if(riddle == 1)
			interact = RiddleWorld.getR1();
		if(riddle == 2)
			interact = RiddleWorld.getR2();
		if(riddle == 3)
			interact = RiddleWorld.getR3();
		if(riddle == 4)
			interact = RiddleWorld.getR4();
		if(riddle == 5)
			interact = RiddleWorld.getR5();
		if(riddle == 6)
			interact = RiddleWorld.getR6();
		if(riddle == 7)
			interact = RiddleWorld.getR7();
		if(riddle == 8)
			interact = RiddleWorld.getR8();
		if(riddle == 9)
			interact = RiddleWorld.getR9();
		if(riddle == 10)
			interact = RiddleWorld.getR10();
		if(riddle == 11)
			interact = RiddleWorld.getR11();
		if(riddle == 12)
			interact = RiddleWorld.getR12();
		if(riddle == 13)
			interact = RiddleWorld.getR13();
		if(riddle == 14)
			interact = RiddleWorld.getR14();
		if(riddle == 15)
			interact = RiddleWorld.getR15();
		
		return interact;
	}

	public void interact() {
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32,
				y + 32) < 64 && handler.getKeyManager().interact && answered())
			State.setState(new RiddlesState(handler, riddle, answer));
	}

	@Override
	public void tick() {
		interact();

	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.riddleBoard, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
