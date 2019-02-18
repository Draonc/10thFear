	package dev.Sandefur.fear.entities.creatures;

	import java.awt.Graphics2D;
import java.awt.Rectangle;

import dev.Sandefur.fear.Game;
import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.states.PauseState;
import dev.Sandefur.fear.utils.Timer;

	public abstract class Player extends Creature {
		protected Timer timer = new Timer();
		public Boolean interact, pressed, warping;
		protected static Rectangle rect;
		
		public Player(Handler handler, float x, float y) {
			super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
			rect = new Rectangle (0,0,0,0);
			warping = false;
			
			
		}

		@Override
		public abstract void tick();
		
		public void printing(){
			if(CourageBar.getPrint()){
				xMove = 0;
				yMove = 0;
			}
				
		}
			
		public void pause(){
			if(handler.getKeyManager().pause && timer.run(.5f)){
				PauseState.timer.Start();
				JukeBox.play("PauseOpen");
				Game.setPaused(true);
			}
		}

		@Override
		public abstract void render(Graphics2D g);
		
		public Rectangle getRect(){
			return new Rectangle((int)(x + rect.x),(int) (y + rect.y), rect.width, rect.height);
		}
		
		public void setWarping(boolean b){
			warping = b;
		}
		
		public float getY(){
			return y;
		}
		
		public float getX(){
			return x;
		}
		
		public Timer getTimer(){
			return timer;
		}
		
		public void setInteract(Boolean b){
			interact = b;
		}
		
		public void setPressed(Boolean b){
			pressed = b;
		}
	}
