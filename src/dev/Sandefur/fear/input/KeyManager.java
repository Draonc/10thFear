package dev.Sandefur.fear.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

	private boolean[] keys;
	public boolean up, down, left, right, item1, item2, attack, interact, test1, test2, enter, pause, esc, save, load, quit;
	private static Character lastKey = null;

	public KeyManager() {
		keys = new boolean[256];
	}

	public void tick() {
		up = keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN];
		left = keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_D]|| keys[KeyEvent.VK_RIGHT];
		attack = keys[KeyEvent.VK_F];
		item1 = keys[KeyEvent.VK_K];
		item2 = keys[KeyEvent.VK_L];
		interact = keys[KeyEvent.VK_SPACE];
		enter = keys[KeyEvent.VK_ENTER];
		pause = keys[KeyEvent.VK_P];
		esc = keys[KeyEvent.VK_ESCAPE];
		save = keys[KeyEvent.VK_1];
		load = keys[KeyEvent.VK_2];
		quit = keys[KeyEvent.VK_Q];

	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	public void isPressed(){
		
	}
	
	public void isHeld(){
		
	}
	
	public void isReleased(){
		
	}
	
	public void set(int k , boolean b){
		//for(int i = 0; i < numKeys; i ++)
			
	}

}
