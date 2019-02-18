package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.utils.Timer;



public abstract class State {

	private static State currentState = null;
	protected Timer timer;
	protected String path;
	
	public static void setState(State state){
		unloadState();
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	private static void unloadState(){
		currentState = null;
	}
	
	//CLASS
	
	protected Handler handler;
	
	public State(Handler handler){
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics2D g);
	
}

