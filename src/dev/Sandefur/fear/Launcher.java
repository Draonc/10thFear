package dev.Sandefur.fear;

//Launches the game
public class Launcher {

	public static void main(String[] args){
		Game game = new Game("10th Fear", 1024, 768);
		game.start();
	}
	
}