package dev.Sandefur.fear.utils;

public class CreaturesUtil {
	//Tells if the target can see the player
	public static boolean lineOfSight(){
		return true;
	}
	
	//Tests the distance
	public static float dist(float X1, float Y1, float X2, float Y2){
		
		double x = X2-X1;
		double y = Y2-Y1;
		
		return (float)Math.sqrt((x * x) + (y * y));
	}
	
	
}
