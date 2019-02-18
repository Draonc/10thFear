package dev.Sandefur.fear.states;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.utils.Timer;

public class StoryState extends State {

	private int curOption, totOption;
	private Boolean story, written, play;
	private static Boolean win = false;
	private Animation start;

	public StoryState(Handler handler, boolean play) {
		super(handler);
		timer = new Timer();
		timer.Start();
		story = true;
		written = false;
		this.play = play;

		start = new Animation(1200, Assets.cutStart);

	}

	@Override
	public void tick() {
		input();
		start.tick();
		setPlay();
		if(story)
			totOption = 2;
		if(written)
			totOption = 3;
	}

	@Override
	public void render(Graphics2D g) {
		if (story) {
			g.drawImage(Assets.sChoice, 0, 0, 1024, 768, null);
			if (curOption == 0)
				g.drawImage(Assets.selectionBox, 375, 172, 290, 40, null);
			else if (curOption == 1)
				g.drawImage(Assets.selectionBox, 375, 359, 290, 45, null);
			else if (curOption == 2)
				g.drawImage(Assets.selectionBox, 375, 555, 290, 45, null);
		}

		if (written) {
			if (curOption == 0)
				g.drawImage(Assets.sStart11, 0, 0, 1024, 768, null);
			if (curOption == 1)
				g.drawImage(Assets.sStart12, 0, 0, 1024, 768, null);
			if (curOption == 2)
				g.drawImage(Assets.sEnd11, 0, 0, 1024, 768, null);
			if (curOption == 3)
				g.drawImage(Assets.sEnd12, 0, 0, 1024, 768, null);
		}

		if (play)
			g.drawImage(getCurrentAnimationFrame(), 0, 0, 1024, 768, null);
		
		if(win){
			g.drawImage(Assets.cutStart[26], 0, 0, 1024, 768, null);
		}

	}
	
	public static void setWin(boolean b){
		win = b;
	}

	private BufferedImage getCurrentAnimationFrame() {
			return start.getCurrentFrame();
	
	}

	private void setPlay() {
		if (start.getIndex() == 26){
			play = false;
			story = true;
		}
		
	}

	private void input() {
		if (handler.getKeyManager().up && curOption > 0 && timer.run(.5f)) {
			curOption--;
			timer.Start();
			JukeBox.play("Move");
		}

		if (handler.getKeyManager().down && curOption < totOption && timer.run(.5f)) {
			curOption++;
			timer.Start();
			JukeBox.play("Move");
		}

		if (handler.getKeyManager().enter && timer.run(.5f)){
			selectOption();
			timer.Start();
			curOption = 0;
			JukeBox.play("Select");
		}	
		
		if(handler.getKeyManager().esc && written){
			written = false	;	
			story = true;
		}
	}

	private void selectOption() {
		if(story){
			if(curOption == 0)
				written = true;
				
			if (curOption == 1){
				play = true;
				start.setIndex(0);
			}
			
			if (curOption == 2){
				MenuState.setStart(false);
				State.setState(handler.getGame().menuState);
			}
			
			story = false;
		}

	}
}
