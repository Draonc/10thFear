package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.data.SaveData;
import dev.Sandefur.fear.display.CourageBar;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.utils.Timer;
import dev.Sandefur.fear.worlds.OverWorld;

public class GameOverState extends State {

	private int curOption;
	private Timer timer;
	private Boolean save = false, exit = false, done = false;
	private SaveData data;

	public GameOverState(Handler handler) {
		super(handler);
		timer = new Timer();
		timer.Start();
		curOption = 0;
		data = new SaveData();
		
	}

	@Override
	public void tick() {
		input();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.gameOverBG, 0, 0, 1024, 763, null);
		if(save)
			g.drawImage(Assets.gameOverFile, 0, 0, 1024, 763, null);
		if(!save){
		if (curOption == 0)
			g.drawImage(Assets.selectionBox, 325, 318, 370, 40, null);
		else if (curOption == 1)
			g.drawImage(Assets.selectionBox, 373, 436, 275, 40, null);
		else if (curOption == 2)
			g.drawImage(Assets.selectionBox, 457, 552, 113, 40, null);
		}else{
			if (curOption == 0)
				g.drawImage(Assets.selectionBox, 435, 315, 150, 40, null);
			else if (curOption == 1)
				g.drawImage(Assets.selectionBox, 435, 433, 150, 40, null);
			else if (curOption == 2)
				g.drawImage(Assets.selectionBox, 435, 550, 150, 40, null);
		}

	}

	private void input() {
		if (handler.getKeyManager().up && curOption > 0 && timer.run(.5f)) {
			curOption--;
			timer.Start();
		}

		if (handler.getKeyManager().down && curOption < 2 && timer.run(.5f)) {
			curOption++;
			timer.Start();
		}

		if (handler.getKeyManager().enter && timer.run(.5f)){
			selectOption();
			curOption = 0;
		}
			
	}

	private void selectOption() {
		if (!save) {
			if (curOption == 0){
				curOption = 0;
				save = true;
				CourageBar.setCurCur(3);
			}
			
			if (curOption == 1){
				curOption = 0;
				save = true;
				exit = true;
				CourageBar.setCurCur(3);
			}	
			
			if (curOption == 2)
				System.exit(0);
			
			
			timer.Start();
		}else if(save){
			if(curOption == 0){
				data.setFile(1);
			}
				
			if(curOption == 1){
				data.setFile(2);
			}
				
			if(curOption == 2){
				data.setFile(3);
			}
			
			data.Save();
			done = true;
			save = false;
			
		}
		
		
		if(exit && done)
			System.exit(0);
		else if (done){
			OverWorld.setLocation(0);
			State.setState(new GameState(handler));
			done = false;
		}
		
						
	}
}
