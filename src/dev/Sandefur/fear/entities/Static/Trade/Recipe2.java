package dev.Sandefur.fear.entities.Static.Trade;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.Static.StaticEntity;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;

public class Recipe2 extends StaticEntity {
	private static Boolean have = false;

	public Recipe2(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
	}

	public static Boolean getHave() {
		return have;
	}

	public static void setHave(Boolean b) {
		have = b;
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
	}

}