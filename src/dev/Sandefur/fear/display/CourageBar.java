package dev.Sandefur.fear.display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.states.State;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.Timer;

public class CourageBar {

	private Handler handler;
	private static int curCur;
	private static int totCur;
	private static int width;
	private static int height;
	private static boolean print = false;
	private static Timer timer = new Timer();
	private static Boolean hurt;

	Font myFont = new Font("Serif", Font.BOLD, 30);

	public CourageBar(Handler handler, float x, float y) {
		this.handler = handler;
		totCur = 3;
		curCur = totCur;
		width = 48;
		height = 48;
		hurt = false;

	}

	public static void incCourage() {
		++curCur;
		++totCur;
		if (curCur > totCur)
			curCur = totCur;
		print = true;
	}

	private void death() {
		if (curCur == 0) {
			JukeBox.close("/Music/DrowningBG.mp3");
			JukeBox.close("/Music/HeightsBG.mp3");
			JukeBox.close("/Music/HeightsBG.mp3");
			JukeBox.close("/Music/DeathBG.mp3");
			JukeBox.close("/Music/FailureBG.mp3");
			JukeBox.close("/Music/ForgottenBG.mp3");
			JukeBox.close("/Music/CrumbleBG.mp3");
			JukeBox.close("/Music/InjuryBG.mp3");
			JukeBox.close("/Music/LostBG.mp3");
			JukeBox.close("/Music/RiddleBG.mp3");
			JukeBox.close("/Music/BGMusic.mp3");
			JukeBox.load("/Music/GameOverBG.mp3", "GOBG");
			JukeBox.setVolume("GOBG", -10);
			JukeBox.loop("GOBG");
		}
	}

	public static void replenishC(int value) {
		curCur = curCur + value;
		if (curCur > totCur)
			curCur = totCur;
	}

	public static void decCourage() {
		JukeBox.play("Hurt");
		--curCur;
		if (curCur < 0)
			curCur = 0;

		hurt = true;
	}

	public static Boolean getHurt() {
		return hurt;
	}

	public static void setHurt(Boolean b) {
		hurt = b;
	}

	public static int getCurCur() {
		return curCur;
	}

	public static int getTotCur() {
		return totCur;
	}

	public static void setCurCur(int cur) {
		curCur = cur;
	}

	public static void setTotCur(int cur) {
		totCur = cur;
	}

	public static void setPrint(Boolean b) {
		print = b;
	}

	public static boolean getPrint() {
		return print;
	}

	public void tick() {
		death();
	}

	public void render(Graphics2D g) {

		if (curCur <= 11) {
			for (int i = 0; i < curCur; i++) {
				g.drawImage(Assets.heartFull, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}
		}

		if (curCur > 8) {
			for (int i = 0; i < 11; i++) {
				g.drawImage(Assets.heartFull, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}

			for (int i = 0; i < curCur - 11; i++) {
				g.drawImage(Assets.heartFull, 100 + ((width / 2) * i), 32, width / 2, height / 2, null);
			}

		}

		if (totCur <= 11) {
			for (int i = 0; i < totCur; i++) {
				g.drawImage(Assets.heartEmpty, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}
		}

		if (totCur > 11) {
			for (int i = 0; i < 11; i++) {
				g.drawImage(Assets.heartEmpty, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}

			for (int i = 0; i < totCur - 11; i++) {
				g.drawImage(Assets.heartEmpty, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}

		}
		if (print) {
			g.drawImage(Assets.textBox, 0, 640, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 2, null);
			g.setColor(Color.BLACK);
			g.setFont(new Font("Serif", Font.BOLD, 30));
			g.drawString("You have found courage", 350, 710);
			if (timer.run(2))
				print = false;
		}
	}

	public static Timer getTimer() {
		return timer;
	}
}
