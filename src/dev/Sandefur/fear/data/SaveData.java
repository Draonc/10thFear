package dev.Sandefur.fear.data;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

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

public class SaveData {

	private Boolean[] tokens = new Boolean[10];
	private int curHealth, totHealth;
	private int file = 0;
	private String path = null;

	public void get() {
		tokens[0] = TokenCrumble.getToken();
		tokens[1] = TokenDark.getToken();
		tokens[2] = TokenDeath.getToken();
		tokens[3] = TokenDrowning.getToken();
		tokens[4] = TokenFailure.getToken();
		tokens[5] = TokenForgotten.getToken();
		tokens[6] = TokenHeights.getToken();
		tokens[7] = TokenInjury.getToken();
		tokens[8] = TokenLost.getToken();
		tokens[9] = TokenStupid.getToken();
		curHealth = CourageBar.getCurCur();
		totHealth = CourageBar.getTotCur();
	}

	public void Save() {
		setPath();
		get();
		try {
			FileOutputStream saveFile = new FileOutputStream(path);

			// Create an ObjectOutputStream to put the objects into the save
			// file.
			ObjectOutputStream save = new ObjectOutputStream(saveFile);

			// Now we do the save.
			save.writeObject(tokens);
			save.writeObject(curHealth);
			save.writeObject(totHealth);

			// Close the file.
			save.close(); // This also closes saveFile.
		} catch (Exception exc) {
			exc.printStackTrace(); // If there was an error, print the info.
		}
	}

	public void setFile(int f) {
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
