package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Game;
import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.data.SaveData;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.entities.Static.Tokens.TokenCrumble;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDark;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDeath;
import dev.Sandefur.fear.entities.Static.Tokens.TokenDrowning;
import dev.Sandefur.fear.entities.Static.Tokens.TokenFailure;
import dev.Sandefur.fear.entities.Static.Tokens.TokenForgotten;
import dev.Sandefur.fear.entities.Static.Tokens.TokenHeights;
import dev.Sandefur.fear.entities.Static.Tokens.TokenInjury;
import dev.Sandefur.fear.entities.Static.Tokens.TokenLost;
import dev.Sandefur.fear.entities.Static.Tokens.TokenStupid;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.utils.Timer;
import dev.Sandefur.fear.worlds.OverWorld;

public class PauseState extends State {

	private static boolean pause = false, save = false, exit = false, done = false;;
	public static Timer timer = new Timer();
	private SaveData data = new SaveData();
	private int curOption;

	public PauseState(Handler handler) {
		super(handler);

		JukeBox.load("/Music/PauseClose.wav", "PauseClose");
	}

	public static void setPause(boolean b) {
		pause = b;
	}

	public static boolean getPause() {
		return pause;
	}

	@Override
	public void tick() {
		Input();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.pauseBG, 0, 0, 1024, 768, null);

		if (TokenDrowning.getToken()) {
			g.drawImage(Assets.t1, 64, 256, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 64, 256, 64, 128, null);
		}

		if (TokenDark.getToken()) {
			g.drawImage(Assets.t2, 192, 256, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 192, 256, 64, 128, null);
		}

		if (TokenDeath.getToken()) {
			g.drawImage(Assets.t3, 320, 256, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 320, 256, 64, 128, null);
		}

		if (TokenForgotten.getToken()) {
			g.drawImage(Assets.t4, 64, 384, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 64, 384, 64, 128, null);
		}

		if (TokenHeights.getToken()) {
			g.drawImage(Assets.t5, 192, 384, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 192, 384, 64, 128, null);
		}

		if (TokenStupid.getToken()) {
			g.drawImage(Assets.t6, 320, 384, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 320, 384, 64, 128, null);
		}

		if (TokenLost.getToken()) {
			g.drawImage(Assets.t7, 64, 512, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 64, 512, 64, 128, null);
		}

		if (TokenInjury.getToken()) {
			g.drawImage(Assets.t8, 192, 512, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 192, 512, 64, 128, null);
		}

		if (TokenFailure.getToken()) {
			g.drawImage(Assets.t9, 320, 512, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 320, 512, 64, 128, null);
		}

		if (TokenCrumble.getToken()) {
			g.drawImage(Assets.t10, 192, 640, 64, 128, null);
		} else {
			g.drawImage(Assets.tBlank, 192, 640, 64, 128, null);
		}

		if (save)
			if (curOption == 0)
				g.drawImage(Assets.selectionBox, 750, 576, 100, 30, null);
			else if (curOption == 1)
				g.drawImage(Assets.selectionBox, 750, 607, 100, 30, null);
			else if (curOption == 2)
				g.drawImage(Assets.selectionBox, 750, 640, 100, 30, null);
	}

	private void selectOption() {
		if (save) {
			if (curOption == 0) {
				data.setFile(1);
			}

			if (curOption == 1) {
				data.setFile(2);
			}

			if (curOption == 2) {
				data.setFile(3);
			}

			data.Save();
			done = true;
		}

		if (exit && done){
			Game.setPaused(false);
			State.setState(handler.getGame().menuState);	
		}
		else if (done) {
			Game.setPaused(false);
		}

	}

	public void Input() {
		if (handler.getKeyManager().pause && timer.run(.5f)) {
			handler.getWorld().getEntityManager().getPlayer().getTimer().Start();
			Game.setPaused(false);
			JukeBox.play("PauseClose");
		}

		if (handler.getKeyManager().up && curOption > 0 && timer.run(.5f)) {
			curOption--;
			timer.Start();
		}

		if (handler.getKeyManager().down && curOption < 2 && timer.run(.5f)) {
			curOption++;
			timer.Start();
		}

		if (handler.getKeyManager().enter && timer.run(.5f)) {
			selectOption();
			curOption = 0;
		}

		if (handler.getKeyManager().save)
			save = true;

		if (handler.getKeyManager().load) {
			save = true;
			exit = true;
		}

		if (handler.getKeyManager().quit) {
			System.out.println("q");
			Game.setPaused(false);
			MenuState.setStart(false);

			JukeBox.stop("DrBG");
			JukeBox.stop("HBG");
			JukeBox.stop("DBG");
			JukeBox.stop("DeBG");
			JukeBox.stop("FailBG");
			JukeBox.stop("ForBG");
			JukeBox.stop("CBG");
			JukeBox.stop("IBG");
			JukeBox.stop("LBG");
			JukeBox.stop("RBG");
			JukeBox.stop("GOBG");
			JukeBox.stop("BG");
			State.setState(handler.getGame().menuState);
		}
		
		if(handler.getKeyManager().esc){
			State.setState(new GameState(handler));
			Game.setPaused(false);
		}
	}

}
