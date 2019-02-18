package dev.Sandefur.fear.data;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

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

public class LoadData {

	private Boolean[] tokens = new Boolean[10];
	private int curCur;
	private int totCur;
	private int file;
	private String path = null;

	public void Load() {
		setPath();
		// Wrap all in a try/catch block to trap I/O errors.
		try {
			// Open file to read from, named SavedObjects.sav.
			FileInputStream saveFile = new FileInputStream(path);

			// Create an ObjectInputStream to get the objects from the save
			// file.
			ObjectInputStream save = new ObjectInputStream(saveFile);

			// Now we do the restore.
			// readObject() returns a generic Object, we cast those back
			// into their original class type.
			// For primitive types, we use the corresponding reference class.
			tokens = (Boolean[]) save.readObject();
			curCur = (Integer) save.readObject();
			totCur = (Integer) save.readObject();
			

			// Close the file.
			save.close(); // This also closes saveFile.
		} catch (Exception exc) {
			exc.printStackTrace(); // If there was an error, print the info.
		}
		
		set();
	}
	
	public void set(){
		TokenCrumble.setToken(tokens[0]);
		TokenDark.setToken(tokens[1]);
		TokenDeath.setToken(tokens[2]);
		TokenDrowning.setToken(tokens[3]);
		TokenFailure.setToken(tokens[4]);
		TokenForgotten.setToken(tokens[5]);
		TokenHeights.setToken(tokens[6]);
		TokenInjury.setToken(tokens[7]);
		TokenLost.setToken(tokens[8]);
		TokenStupid.setToken(tokens[9]);
		
		CourageBar.setCurCur(curCur);
		CourageBar.setTotCur(totCur);
	}
	
	public void setFile(int f){
		file = f;
	}
	
	private void setPath(){
		switch (file) {
		case 1:
			path = "File1.sav";
			break;
		case 2:
			path = "File2.sav";
			break;
		case 3:
			path = "File3.sav";
			break;
		}
	}
}
