package dev.Sandefur.fear;

import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.data.Music;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.display.Display;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.gfx.GameCamera;
import dev.Sandefur.fear.input.KeyManager;
import dev.Sandefur.fear.states.GameOverState;
import dev.Sandefur.fear.states.GameState;
import dev.Sandefur.fear.states.IntroState;
import dev.Sandefur.fear.states.MenuState;
import dev.Sandefur.fear.states.PauseState;
import dev.Sandefur.fear.states.State;

public class Game implements Runnable {

	private Display display;
	private int width, height;
	private String title;

	private boolean running = false, home;
	private static boolean paused;

	private Thread thread;

	private BufferStrategy bs;
	private Graphics2D g;
	private CourageBar courageBar;
	private Music music;


	public boolean isHome() {
		return home;
	}

	public void setHome(boolean b) {
		home = b;
	}

	// States
	public static State menuState;
	public static State pauseState;
	public static State introState;
	public static State gameOver;

	// Input
	private KeyManager keyManager;

	// Camera
	private GameCamera gameCamera;

	// Handler
	private Handler handler;

	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		paused = false;
		home = false;
		
	
	}

	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		JukeBox.init();
		handler = new Handler(this);
		courageBar = new CourageBar(handler, 100, 10);
		music = new Music();

		gameCamera = new GameCamera(handler, 0, 0);

		menuState = new MenuState(handler);
		pauseState = new PauseState(handler);
		introState = new IntroState(handler);
		gameOver = new GameOverState(handler);
		

		State.setState(introState);
	}

	public CourageBar getCourageBar() {
		return courageBar;
	}

	public void setCourageBar(CourageBar courageBar) {
		this.courageBar = courageBar;
	}

	private void tick() {
		keyManager.tick();
		states();
		//couragebar.tick();
	}
	
	private void states(){
		if (paused) {
			pauseState.tick();
		} else if (State.getState() != null)
			State.getState().tick();
		
		if(home){
			State.setState(new GameState(handler));
			home = false;
		}
		
	}

	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = (Graphics2D) bs.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, width, height);
		// Draw Here!

		if (paused) {
			pauseState.render(g);
		} else if (State.getState() != null)
			State.getState().render(g);

		// End Drawing!
		bs.show();
		g.dispose();

	}

	public void run() {

		init();

		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;

		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;

			if (delta >= 1) {
				tick();
				render();
				ticks++;
				delta--;
			}

			if (timer >= 1000000000) {
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}

		stop();

	}

	public KeyManager getKeyManager() {
		return keyManager;
	}

	public GameCamera getGameCamera() {
		return gameCamera;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		if (!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isPaused() {
		return paused;
	}

	public static void setPaused(boolean b) {
		paused = b;
	}

}