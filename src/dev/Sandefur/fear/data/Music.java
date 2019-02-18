package dev.Sandefur.fear.data;

public class Music {

	public Music() {

		JukeBox.load("/Music/Select.wav", "Select");
		JukeBox.load("/Music/MenuMove.wav", "Move");
		JukeBox.load("/Music/PauseOpen.wav", "PauseOpen");
		JukeBox.load("/Music/EnemyHit.wav", "EHit");
		JukeBox.load("/Music/EnemyDie.wav", "EDie");
		JukeBox.load("/Music/PCHurt.wav", "Hurt");
		JukeBox.load("/Music/AirBubble.wav", "Bubble");
		JukeBox.load("/Music/Chest.wav", "Chest");

		JukeBox.load("/Music/Negative.wav ", "Wrong");
		JukeBox.load("/Music/positive.wav ", "Right");
		JukeBox.load("/Music/StairsUp.wav", "Stairs");
		JukeBox.load("/Music/Swim.wav", "Swim");

		JukeBox.load("/Music/door.wav", "Door");
		JukeBox.load("/Music/Potion.wav", "Potion");
		JukeBox.load("/Music/Teleporting.wav", "Port");
		JukeBox.load("/Music/TokenRecieved.wav", "Recieved");

		//JukeBox.load("/Music/DrowningBG.mp3", "DrBG");
		//JukeBox.load("/Music/HeightsBG.mp3", "HBG");
		//JukeBox.load("/Music/BGMusic.mp3", "BG");
		//JukeBox.load("/Music/HeightsBG.mp3", "DBG");
		// JukeBox.load("/Music/DeathBG.mp3", "DeBG");
		// JukeBox.load("/Music/FailureBG.mp3", "FailBG");
		// JukeBox.load("/Music/ForgottenBG.mp3", "ForBG");
		// JukeBox.load("/Music/InjuryBG.mp3", "IBG");
		// JukeBox.load("/Music/LostBG.mp3", "LBG");
		// JukeBox.load("/Music/RiddleBG.mp3", "RBG");
		// JukeBox.load("/Music/CrumbleBG.mp3", "CBG");
		// JukeBox.load("/Music/GameOverBG.mp3", "GOBG");
	}

}
