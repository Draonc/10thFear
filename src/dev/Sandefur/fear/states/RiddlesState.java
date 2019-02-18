package dev.Sandefur.fear.states;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.Timer;
import dev.Sandefur.fear.worlds.RiddleWorld;

public class RiddlesState extends State {

	private int curOption, totOption, pAnswer, answer, riddle;
	private Boolean select;
	private BufferedImage image;

	public RiddlesState(Handler handler, int riddle, int answer) {
		super(handler);
		timer = new Timer();
		timer.Start();
		totOption = 3;
		select = false;
		

		this.riddle = riddle;
		this.answer = answer;
		image();
		pAnswer = -1;
		
	}

	@Override
	public void tick() {
		handler.getGame().getCourageBar().tick();
		input();
		checkAnswer();
	}
	
	public void image(){
		if(riddle == 1)
			image = Assets.riddle1;
		if(riddle == 2)
			image = Assets.riddle2;
		if(riddle == 3)
			image = Assets.riddle3;
		if(riddle == 4)
			image = Assets.riddle4;
		if(riddle == 5)
			image = Assets.riddle5;
		if(riddle == 6)
			image = Assets.riddle6;
		if(riddle == 7)
			image = Assets.riddle7;
		if(riddle == 8)
			image = Assets.riddle8;
		if(riddle == 9)
			image = Assets.riddle9;
		if(riddle == 10)
			image = Assets.riddle10;
		if(riddle == 11)
			image = Assets.riddle11;;
		if(riddle == 12)
			image = Assets.riddle12;
		if(riddle == 13)
			image = Assets.riddle13;
		if(riddle == 14)
			image = Assets.riddle14;
		if(riddle == 15)
			image = Assets.riddle15;
	}


	private void correct() {
		RiddleWorld.correct();
		if (riddle == 1)
			RiddleWorld.setR1(false);
		if (riddle == 2)
			RiddleWorld.setR2(false);
		if (riddle == 3)
			RiddleWorld.setR3(false);
		if (riddle == 4)
			RiddleWorld.setR4(false);
		if (riddle == 5)
			RiddleWorld.setR5(false);
		if (riddle == 6)
			RiddleWorld.setR6(false);
		if (riddle == 7)
			RiddleWorld.setR7(false);
		if (riddle == 8)
			RiddleWorld.setR8(false);
		if (riddle == 9)
			RiddleWorld.setR9(false);
		if (riddle == 10)
			RiddleWorld.setR10(false);
		if (riddle == 11)
			RiddleWorld.setR11(false);
		if (riddle == 12)
			RiddleWorld.setR12(false);
		if (riddle == 13)
			RiddleWorld.setR13(false);
		if (riddle == 14)
			RiddleWorld.setR14(false);
		if (riddle == 15)
			RiddleWorld.setR15(false);
	}

	@Override
	public void render(Graphics2D g) {

		g.drawImage(image, 0, 0, 1024, 768, null);
		handler.getGame().getCourageBar().render(g);
		if (curOption == 0)
			g.drawImage(Assets.selectionBox, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 7, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT, null);
		else if (curOption == 1)
			g.drawImage(Assets.selectionBox, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 7, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT, null);
		else if (curOption == 2)
			g.drawImage(Assets.selectionBox, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 8, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT, null);
		else if (curOption == 3)
			g.drawImage(Assets.selectionBox, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 8, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT, null);
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

		if (handler.getKeyManager().enter && timer.run(.5f)) {
			selectOption();
			timer.Start();
			curOption = 0;
			select = true;
		} else
			select = false;

	}

	private void selectOption() {
		if (curOption == 0)
			pAnswer = 0;

		if (curOption == 1)
			pAnswer = 1;

		if (curOption == 2)
			pAnswer = 2;

		if (curOption == 3)
			pAnswer = 3;

	}

	private void checkAnswer() {
		if (pAnswer == answer) {
			if (timer.run(.2f)) {
				correct();
				JukeBox.play("Right");
				State.setState(new RiddleState(handler));
			}
		} else if (pAnswer != answer && select){
			JukeBox.play("Wrong");
			CourageBar.decCourage();
		}

	}
}
