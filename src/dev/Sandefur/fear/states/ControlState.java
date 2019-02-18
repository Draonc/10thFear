package dev.Sandefur.fear.states;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.gfx.Animation;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.utils.Timer;

public class ControlState extends State {

	private int curOption;
	private Timer timer;

	public ControlState(Handler handler) {
		super(handler);
		
		timer = new Timer();
		timer.Start();
	}

	@Override
	public void tick() {
		input();
	}

	@Override
	public void render(Graphics2D g) {
			if (curOption == 0)
				g.drawImage(Assets.mainControl, 0, 0, 1024, 768, null);
			if (curOption == 1)
				g.drawImage(Assets.IgnoranceConrtol, 0, 0, 1024, 768, null);
			if (curOption == 2)
				g.drawImage(Assets.lostControl, 0, 0, 1024, 768, null);
			if (curOption == 3)
				g.drawImage(Assets.forgottenControl, 0, 0, 1024, 768, null);
			if (curOption == 4)
				g.drawImage(Assets.darkControl, 0, 0, 1024, 768, null);
			if (curOption == 5)
				g.drawImage(Assets.heightControl, 0, 0, 1024, 768, null);
			if (curOption == 6)
				g.drawImage(Assets.injuryControl, 0, 0, 1024, 768, null);
			if (curOption == 7)
				g.drawImage(Assets.drowningControl, 0, 0, 1024, 768, null);
			if (curOption == 8)
				g.drawImage(Assets.deathControl, 0, 0, 1024, 768, null);
			if (curOption == 9)
				g.drawImage(Assets.failControl, 0, 0, 1024, 768, null);
			if (curOption == 10)
				g.drawImage(Assets.crumbControl, 0, 0, 1024, 768, null);

	}


	private void input() {
		if (handler.getKeyManager().up && curOption > 0 && timer.run(.5f)) {
			curOption--;
			timer.Start();
			JukeBox.play("Move");
		}

		if (handler.getKeyManager().down && curOption < 10 && timer.run(.5f)) {
			curOption++;
			timer.Start();
			JukeBox.play("Move");
		}

		
		if(handler.getKeyManager().esc ){
			State.setState(handler.getGame().menuState);
		}
	}
}
