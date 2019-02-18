package dev.Sandefur.fear.states;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.data.LoadData;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.utils.Timer;

public class MenuState extends State {

	private int curOption, totOption;
	private static Boolean start;
	private Boolean load;
	private Boolean done;
	private LoadData data;
	

	public MenuState(Handler handler) {
		super(handler);
		timer = new Timer();
		timer.Start();
		start = false;
		load = false;
		done = false;
		data = new LoadData();
	}

	@Override
	public void tick() {
		input();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.menuBG, 0, 0, 1024, 768, null);
		
		if (!start) {
			if (curOption == 0)
				g.drawImage(Assets.selectionBox, 435, 275, 140, 40, null);
			else if (curOption == 1)
				g.drawImage(Assets.selectionBox, 435, 378, 140, 45, null);
			else if (curOption == 2)
				g.drawImage(Assets.selectionBox, 410, 480, 200, 40, null);
			else if (curOption == 3)
				g.drawImage(Assets.selectionBox, 435, 583, 140, 40, null);
		}else if (!load && start){
			g.drawImage(Assets.start, 400, 272, 208, 363, null);
			if(curOption == 0)
				g.drawImage(Assets.selectionBox, 410, 325, 200, 40, null);
			else if (curOption == 1)
				g.drawImage(Assets.selectionBox, 435, 390, 140, 45, null);
		}else{
			g.drawImage(Assets.start, 400, 272, 208, 363, null);
			if (curOption == 0)
				g.drawImage(Assets.selectionBox, 460, 454, 90, 25, null);
			else if (curOption == 1)
				g.drawImage(Assets.selectionBox, 460, 486, 90, 25, null);
			else if (curOption == 2)
				g.drawImage(Assets.selectionBox, 460, 518, 90, 25, null);
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
		
		if(!start && !load)
			totOption = 3;
		if(start && !load)
			totOption = 1;
		if(start && load)
			totOption = 2;
		
	}
	
	public static void setStart(Boolean b){
		start = b;
	}

	private void selectOption() {
		if(load && start){
			if(curOption == 0)
				data.setFile(1);
				
			if (curOption == 1)
				data.setFile(2);
		
			if (curOption == 2)
				data.setFile(3);
			
			done = true;
		
			}
		
		if(done){
			data.Load();
			State.setState(new GameState(handler));
			done = false;
		}
		
		if(!load && start){
			if (curOption == 0)
				State.setState(new GameState(handler));
			
			if(curOption == 1)
				load = true;
		}
		
		if (!start){
			if(curOption == 0)
				start = true;
			if (curOption == 1)
				State.setState(new StoryState(handler, false));
			if (curOption == 2)
				State.setState(new ControlState(handler));
			if (curOption == 3)
				System.exit(0);
		}				
	}
}
