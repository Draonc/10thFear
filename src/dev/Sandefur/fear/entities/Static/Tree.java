package dev.Sandefur.fear.entities.Static;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;


//Creates a tree entity
public class Tree extends StaticEntity {
	
	public static Tree[] trees = new Tree[316];

	public Tree(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 2);
		
		bounds.x = 30;
		bounds.y = (int) (height / 1.5f);
		bounds.width = width - 65;
		bounds.height = (int) (height - height / 1.5f);
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.airBubbleFull, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}