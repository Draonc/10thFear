package dev.Sandefur.fear.display;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.states.State;
import dev.Sandefur.fear.utils.Timer;

public class BreathBar {
	
	private static Handler handler;
	private static int maxBreath;
	private static int curBreath;
	private static int i, width = 64, height = 64;
	public float perBreath;
	private static Timer timer = new Timer();

	public BreathBar(Handler handler, float x, float y) {
		timer.Start();
		maxBreath = 6;
		curBreath = 6;
		this.handler = handler;
	}
	
	public static void update(){
		if(timer.run(2)){
			curBreath -= 1;
			timer.Start();
		}
	}
	
	private static void death(){
		if(curBreath == 0)
			State.setState(handler.getGame().gameOver);
	}
	
	public static void tick(){
		update();
		death();
	}
	
	public static void setBreath(int breath){
		curBreath = breath;
	}
	
	public static void render(Graphics2D g){
		for (i = 0  ; i < maxBreath; i++){
			g.drawImage(Assets.airBubbleEmpty, 800 + ((width/2)*i), 10,width/2, height/2, null);
		}
		for (i = 0 ; i < curBreath; i++){
		g.drawImage(Assets.airBubbleFull, 800 + ((width/2)*i), 10, (width/2), height/2, null);
		}
	}

}
