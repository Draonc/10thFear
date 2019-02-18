package dev.Sandefur.fear;

import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.gfx.GameCamera;
import dev.Sandefur.fear.input.KeyManager;
import dev.Sandefur.fear.utils.Timer;
import dev.Sandefur.fear.worlds.World;

public class Handler {
	
	private Game game;
	private World world;

	public Handler(Game game){
		this.game = game;
	}
	
	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
}
