package dev.Sandefur.fear.entities.creatures;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;

public class FlyingPlayer extends Player {
	private static final float DAMPING = 0.5f;
	private float fallSpeed = speed * DAMPING;
	private Boolean up;

	//Animations
		private Animation flyLeft, flyRight;
		public static boolean interact = false;
		
		public FlyingPlayer(Handler handler, float x, float y) {
			super(handler, x, y);
			
			bounds.x = 20;
			bounds.y = 35;
			bounds.width = 26;
			bounds.height = 28;
			pressed = true;
			up = false;
			
			//Animatons
			flyLeft = new Animation(300, Assets.fly_left);
			flyRight = new Animation(300, Assets.fly_right);
		}

		@Override
		public void tick() {
			//Animations
			flyRight.tick();
			flyLeft.tick();
			handler.getGame().getCourageBar().tick();
			//Movement
			getInput();
			fly();
			move();
			pause();
			handler.getGameCamera().centerOnEntity(this);
		}
		
		private void fly(){
			if (!up)
			yMove = speed * 1.2f;
			
			if(up){
				yMove = -speed * 1.7f;
			}
			
			xMove = speed;
		}
		
		private void getInput(){
			xMove = 0;
			yMove = 0;
			
			if(handler.getKeyManager().up && pressed){
				pressed = false;
				up = true;
				timer.Start();
			}else if (timer.run(.2f)){
				up = false;
			}
			
			if(!handler.getKeyManager().up)
				pressed = true;
		}

		@Override
		public void render(Graphics2D g) {
			handler.getGame().getCourageBar().render(g);
			g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		}
		
		private BufferedImage getCurrentAnimationFrame(){
			if(xMove < 0){
				return flyLeft.getCurrentFrame();
			}else{
				return flyRight.getCurrentFrame();
			}
		}
		
		public float getY(){
			return y;
		}
		
		public float getX(){
			return x;
		}
}