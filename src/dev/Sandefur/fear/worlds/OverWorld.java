package dev.Sandefur.fear.worlds;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.Chest;
import dev.Sandefur.fear.entities.Static.Door;
import dev.Sandefur.fear.entities.Static.Houses.FlatG;
import dev.Sandefur.fear.entities.Static.Houses.FlatO;
import dev.Sandefur.fear.entities.Static.Houses.FlatR;
import dev.Sandefur.fear.entities.Static.Houses.FlatS;
import dev.Sandefur.fear.entities.Static.Houses.Serp1G;
import dev.Sandefur.fear.entities.Static.Houses.Serp1O;
import dev.Sandefur.fear.entities.Static.Houses.Serp1R;
import dev.Sandefur.fear.entities.Static.Houses.Serp1S;
import dev.Sandefur.fear.entities.Static.Houses.Serp2G;
import dev.Sandefur.fear.entities.Static.Houses.Serp2O;
import dev.Sandefur.fear.entities.Static.Houses.Serp2R;
import dev.Sandefur.fear.entities.Static.Houses.Serp2S;
import dev.Sandefur.fear.entities.Static.Houses.Serp3G;
import dev.Sandefur.fear.entities.Static.Houses.Serp3O;
import dev.Sandefur.fear.entities.Static.Houses.Serp3R;
import dev.Sandefur.fear.entities.Static.Houses.Serp3S;
import dev.Sandefur.fear.entities.Static.Houses.Turn1G;
import dev.Sandefur.fear.entities.Static.Houses.Turn1O;
import dev.Sandefur.fear.entities.Static.Houses.Turn1R;
import dev.Sandefur.fear.entities.Static.Houses.Turn1S;
import dev.Sandefur.fear.entities.Static.Houses.Turn2G;
import dev.Sandefur.fear.entities.Static.Houses.Turn2O;
import dev.Sandefur.fear.entities.Static.Houses.Turn2R;
import dev.Sandefur.fear.entities.Static.Houses.Turn2S;
import dev.Sandefur.fear.entities.Static.Objects.Barrels;
import dev.Sandefur.fear.entities.Static.Objects.Boxes;
import dev.Sandefur.fear.entities.Static.Objects.BreadShelf1;
import dev.Sandefur.fear.entities.Static.Objects.Cart;
import dev.Sandefur.fear.entities.Static.Objects.ClothesLine;
import dev.Sandefur.fear.entities.Static.Objects.ClothesStall;
import dev.Sandefur.fear.entities.Static.Objects.EmptyStall;
import dev.Sandefur.fear.entities.Static.Objects.Field;
import dev.Sandefur.fear.entities.Static.Objects.FoodStall;
import dev.Sandefur.fear.entities.Static.Objects.Hay2;
import dev.Sandefur.fear.entities.Static.Objects.Logs1;
import dev.Sandefur.fear.entities.Static.Objects.Logs2;
import dev.Sandefur.fear.entities.Static.Objects.Memorial;
import dev.Sandefur.fear.entities.Static.Objects.MessageBoard2;
import dev.Sandefur.fear.entities.Static.Objects.OpenSack;
import dev.Sandefur.fear.entities.Static.Objects.Sacks;
import dev.Sandefur.fear.entities.Static.Objects.SawHorse1;
import dev.Sandefur.fear.entities.Static.Objects.SawHorse2;
import dev.Sandefur.fear.entities.Static.Objects.TorphHay;
import dev.Sandefur.fear.entities.Static.Objects.TrophWater;
import dev.Sandefur.fear.entities.Static.Objects.WashBucket;
import dev.Sandefur.fear.entities.Static.Portals.CrumblePortal;
import dev.Sandefur.fear.entities.Static.Portals.DarkPortal;
import dev.Sandefur.fear.entities.Static.Portals.DeathPortal;
import dev.Sandefur.fear.entities.Static.Portals.DrowningPortal;
import dev.Sandefur.fear.entities.Static.Portals.FailurePortal;
import dev.Sandefur.fear.entities.Static.Portals.ForgottenPortal;
import dev.Sandefur.fear.entities.Static.Portals.HeightsPortal;
import dev.Sandefur.fear.entities.Static.Portals.InjuryPortal;
import dev.Sandefur.fear.entities.Static.Portals.MazePortal;
import dev.Sandefur.fear.entities.Static.Portals.RiddlePortal;
import dev.Sandefur.fear.entities.Static.Tokens.TokenHeights;
import dev.Sandefur.fear.entities.creatures.MainPlayer;
import dev.Sandefur.fear.entities.creatures.NPC.Albert;
import dev.Sandefur.fear.entities.creatures.NPC.Alec;
import dev.Sandefur.fear.entities.creatures.NPC.Alvin;
import dev.Sandefur.fear.entities.creatures.NPC.Angela;
import dev.Sandefur.fear.entities.creatures.NPC.Annis;
import dev.Sandefur.fear.entities.creatures.NPC.Ardon;
import dev.Sandefur.fear.entities.creatures.NPC.Arturo;
import dev.Sandefur.fear.entities.creatures.NPC.Bao;
import dev.Sandefur.fear.entities.creatures.NPC.Blake;
import dev.Sandefur.fear.entities.creatures.NPC.Bradon;
import dev.Sandefur.fear.entities.creatures.NPC.Cecila;
import dev.Sandefur.fear.entities.creatures.NPC.Charles;
import dev.Sandefur.fear.entities.creatures.NPC.Chaz;
import dev.Sandefur.fear.entities.creatures.NPC.Cicely;
import dev.Sandefur.fear.entities.creatures.NPC.Crystal;
import dev.Sandefur.fear.entities.creatures.NPC.Cyril;
import dev.Sandefur.fear.entities.creatures.NPC.Devin;
import dev.Sandefur.fear.entities.creatures.NPC.Diane;
import dev.Sandefur.fear.entities.creatures.NPC.Dillon;
import dev.Sandefur.fear.entities.creatures.NPC.Dog;
import dev.Sandefur.fear.entities.creatures.NPC.Edith;
import dev.Sandefur.fear.entities.creatures.NPC.Elaine;
import dev.Sandefur.fear.entities.creatures.NPC.Erinn;
import dev.Sandefur.fear.entities.creatures.NPC.Fritz;
import dev.Sandefur.fear.entities.creatures.NPC.Gena;
import dev.Sandefur.fear.entities.creatures.NPC.Gus;
import dev.Sandefur.fear.entities.creatures.NPC.Horse;
import dev.Sandefur.fear.entities.creatures.NPC.Janet;
import dev.Sandefur.fear.entities.creatures.NPC.Jed;
import dev.Sandefur.fear.entities.creatures.NPC.Kym;
import dev.Sandefur.fear.entities.creatures.NPC.Maren;
import dev.Sandefur.fear.entities.creatures.NPC.Otis;
import dev.Sandefur.fear.entities.creatures.NPC.Raye;
import dev.Sandefur.fear.entities.creatures.NPC.Ronni;
import dev.Sandefur.fear.entities.creatures.NPC.Tag;
import dev.Sandefur.fear.entities.creatures.NPC.Toni;
import dev.Sandefur.fear.tiles.Tile;

public class OverWorld extends World {
	private static int location;
	private int sX, sY;
	
	public OverWorld(Handler handler, String path){
			super(handler, path);
			
		setSpawn();
		entityManager = new EntityManager(handler, new MainPlayer(handler, sX, sY));
		
		populateEntities();
	
		JukeBox.close("/Music/DrowningBG.mp3");
		JukeBox.close("/Music/HeightsBG.mp3");
		JukeBox.close("/Music/DeathBG.mp3");
		JukeBox.close("/Music/FailureBG.mp3");
		JukeBox.close("/Music/ForgottenBG.mp3");
		JukeBox.close("/Music/CrumbleBG.mp3");
		JukeBox.close("/Music/InjuryBG.mp3");
		JukeBox.close("/Music/LostBG.mp3");
		JukeBox.close("/Music/RiddleBG.mp3");
		JukeBox.stop("/Music/GameOverBG.mp3");
	
		JukeBox.load("/Music/BGMusic.mp3", "BG");
		JukeBox.setVolume("BG", -10);
		JukeBox.loop("BG");
		
	}
	
	public void populateEntities(){
		//Chests
		if(TokenHeights.getToken()){
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 55, 7));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 130, Tile.TILEHEIGHT * 110, 8));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 95, Tile.TILEHEIGHT * 121, 9));
		}
				
		//Potions;
		
		//NPCs
		entityManager.addEntity(new Toni(handler, Tile.TILEWIDTH * 154, Tile.TILEHEIGHT * 73, 0));
		entityManager.addEntity(new Alec(handler, Tile.TILEWIDTH * 154, Tile.TILEHEIGHT * 75, 3));
		entityManager.addEntity(new Tag(handler, Tile.TILEWIDTH * 83, Tile.TILEHEIGHT * 135, 9, -1));
		entityManager.addEntity(new Blake(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 135, 6, -1));
		
		entityManager.addEntity(new Raye(handler, Tile.TILEWIDTH * 104, Tile.TILEHEIGHT * 116, 12, -1));
		entityManager.addEntity(new Gena(handler, Tile.TILEWIDTH * 125, Tile.TILEHEIGHT * 74, 15));
		entityManager.addEntity(new Charles(handler, Tile.TILEWIDTH * 119, Tile.TILEHEIGHT * 74, 16));
		entityManager.addEntity(new Alvin(handler, Tile.TILEWIDTH * 113, Tile.TILEHEIGHT * 72, 87));
		
		entityManager.addEntity(new Cyril(handler, Tile.TILEWIDTH * 130, Tile.TILEHEIGHT * 112, 19, -1));
		entityManager.addEntity(new Elaine(handler, Tile.TILEWIDTH * 130, Tile.TILEHEIGHT * 113, 23, -1));
		
		entityManager.addEntity(new Kym(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 155, 27));
		entityManager.addEntity(new Gus(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 159, 29));
		entityManager.addEntity(new Devin(handler, Tile.TILEWIDTH * 77, Tile.TILEHEIGHT * 137, 30));
		
		entityManager.addEntity(new Ardon(handler, Tile.TILEWIDTH * 139, Tile.TILEHEIGHT * 157, 34));
		entityManager.addEntity(new Arturo(handler, Tile.TILEWIDTH * 145, Tile.TILEHEIGHT * 140, 31));
		entityManager.addEntity(new Dillon(handler, Tile.TILEWIDTH * 92, Tile.TILEHEIGHT * 139, 37, -1));
		
		entityManager.addEntity(new Otis(handler, Tile.TILEWIDTH * 119, Tile.TILEHEIGHT * 145, 40));
		entityManager.addEntity(new Cecila(handler, Tile.TILEWIDTH * 115, Tile.TILEHEIGHT * 144, 43));
		entityManager.addEntity(new Annis(handler, Tile.TILEWIDTH * 119, Tile.TILEHEIGHT * 147, 46, -1));
		
		entityManager.addEntity(new Erinn(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 72, 49));
		
		entityManager.addEntity(new Albert(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 125, 50, -1));
		entityManager.addEntity(new Edith(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 125, 53, -1));
		
		entityManager.addEntity(new Angela(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 128, 57, -1));
		entityManager.addEntity(new Crystal(handler, Tile.TILEWIDTH * 75, Tile.TILEHEIGHT * 133, 60));
		
		
		entityManager.addEntity(new Bradon(handler, Tile.TILEWIDTH * 149, Tile.TILEHEIGHT * 125, 63));
		entityManager.addEntity(new Diane(handler, Tile.TILEWIDTH * 144, Tile.TILEHEIGHT * 130, 66, -1));
		entityManager.addEntity(new Chaz(handler, Tile.TILEWIDTH * 143, Tile.TILEHEIGHT * 136, 69));
		
		
		entityManager.addEntity(new Fritz(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 72, 72));
		entityManager.addEntity(new Jed(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 140, 75, -1));
		entityManager.addEntity(new Maren(handler, Tile.TILEWIDTH * 119, Tile.TILEHEIGHT * 124, 77));
		
		entityManager.addEntity(new Ronni(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 100, 80));
		entityManager.addEntity(new Cicely(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 102, 83));
		entityManager.addEntity(new Janet(handler, Tile.TILEWIDTH * 117, Tile.TILEHEIGHT * 124, 84, -1));
		entityManager.addEntity(new Bao(handler, Tile.TILEWIDTH * 77, Tile.TILEHEIGHT * 105, 87));
		
		
		
		entityManager.addEntity(new Field(handler, Tile.TILEWIDTH * 146, Tile.TILEHEIGHT * 147));
		entityManager.addEntity(new Field(handler, Tile.TILEWIDTH * 146, Tile.TILEHEIGHT * 141));
		entityManager.addEntity(new Field(handler, Tile.TILEWIDTH * 152, Tile.TILEHEIGHT * 147));
		entityManager.addEntity(new Field(handler, Tile.TILEWIDTH * 152, Tile.TILEHEIGHT * 141));
		entityManager.addEntity(new Boxes(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 163));
		entityManager.addEntity(new Boxes(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Boxes(handler, Tile.TILEWIDTH * 89, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Cart(handler, Tile.TILEWIDTH * 93, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Memorial(handler, (Tile.TILEWIDTH * 104) + 32, Tile.TILEHEIGHT * 111));
		entityManager.addEntity(new Logs1(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 100));
		entityManager.addEntity(new Logs2(handler, Tile.TILEWIDTH * 69, Tile.TILEHEIGHT * 100));
		entityManager.addEntity(new Sacks(handler, Tile.TILEWIDTH * 125, Tile.TILEHEIGHT * 141));
		entityManager.addEntity(new Sacks(handler, Tile.TILEWIDTH * 92, Tile.TILEHEIGHT * 148));
		entityManager.addEntity(new Barrels(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 73));
		entityManager.addEntity(new OpenSack(handler, Tile.TILEWIDTH * 123, Tile.TILEHEIGHT * 144));
		entityManager.addEntity(new MessageBoard2(handler, Tile.TILEWIDTH * 95, Tile.TILEHEIGHT * 118));
		entityManager.addEntity(new TorphHay(handler, Tile.TILEWIDTH * 132, Tile.TILEHEIGHT * 141));
		entityManager.addEntity(new TrophWater(handler, Tile.TILEWIDTH * 136, Tile.TILEHEIGHT * 141));
		entityManager.addEntity(new Hay2(handler, Tile.TILEWIDTH * 131, Tile.TILEHEIGHT * 156));
		entityManager.addEntity(new Hay2(handler, Tile.TILEWIDTH * 137, Tile.TILEHEIGHT * 153));
		entityManager.addEntity(new SawHorse1(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 96));
		entityManager.addEntity(new SawHorse2(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 96));
		entityManager.addEntity(new WashBucket(handler, Tile.TILEWIDTH * 118, Tile.TILEHEIGHT * 121));
		entityManager.addEntity(new WashBucket(handler, Tile.TILEWIDTH * 119, Tile.TILEHEIGHT * 121));
		entityManager.addEntity(new ClothesLine(handler, Tile.TILEWIDTH * 116, Tile.TILEHEIGHT * 117));
		entityManager.addEntity(new ClothesLine(handler, Tile.TILEWIDTH * 120, Tile.TILEHEIGHT * 117));
		entityManager.addEntity(new ClothesLine(handler, Tile.TILEWIDTH * 116, Tile.TILEHEIGHT * 119));
		entityManager.addEntity(new ClothesLine(handler, Tile.TILEWIDTH * 120, Tile.TILEHEIGHT * 119));
		entityManager.addEntity(new BreadShelf1(handler, Tile.TILEWIDTH * 124, Tile.TILEHEIGHT * 144));
		entityManager.addEntity(new EmptyStall(handler, Tile.TILEWIDTH * 93, Tile.TILEHEIGHT * 148));
		entityManager.addEntity(new FoodStall(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 147));
		entityManager.addEntity(new EmptyStall(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 146));
		entityManager.addEntity(new ClothesStall(handler, Tile.TILEWIDTH * 88, Tile.TILEHEIGHT * 144));
		
		entityManager.addEntity(new Horse (handler,Tile.TILEWIDTH * 136, Tile.TILEHEIGHT * 139));
		entityManager.addEntity(new Dog (handler,Tile.TILEWIDTH * 133, Tile.TILEHEIGHT * 139));
		
	
		//Houses
		entityManager.addEntity(new FlatG(handler, Tile.TILEWIDTH * 149, Tile.TILEHEIGHT * 154));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 150, Tile.TILEHEIGHT * 162, 3));
		
		entityManager.addEntity(new FlatS(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 59));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 67, 1));
		
		
		entityManager.addEntity(new FlatR(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 115));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 123, 7));
		
		entityManager.addEntity(new FlatO(handler, Tile.TILEWIDTH * 115, Tile.TILEHEIGHT * 134));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 116, Tile.TILEHEIGHT * 142, 5));
		
		entityManager.addEntity(new Serp1G(handler, Tile.TILEWIDTH * 119, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Serp2G(handler, Tile.TILEWIDTH * 127, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Serp3G(handler, Tile.TILEWIDTH * 113, Tile.TILEHEIGHT * 63));
		entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 122, Tile.TILEHEIGHT * 71, 10));
		
		entityManager.addEntity(new Serp1S(handler, Tile.TILEWIDTH * 145, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Serp2S(handler, Tile.TILEWIDTH * 153, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Serp3S(handler, Tile.TILEWIDTH * 139, Tile.TILEHEIGHT * 63));
		entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 148, Tile.TILEHEIGHT * 71, 9));

		entityManager.addEntity(new Serp1R(handler, Tile.TILEWIDTH * 73, Tile.TILEHEIGHT * 83));
		entityManager.addEntity(new Serp2R(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 83));
		entityManager.addEntity(new Serp3R(handler, Tile.TILEWIDTH * 67, Tile.TILEHEIGHT * 91));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 99, 12));
		
		entityManager.addEntity(new Serp1O(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 146));
		entityManager.addEntity(new Serp2O(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 146));
		entityManager.addEntity(new Serp3O(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 154));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 162, 11));
		
		entityManager.addEntity(new Turn1G(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 109));
		entityManager.addEntity(new Turn2G(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 109));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 64, (Tile.TILEHEIGHT * 119) + 16, 14));
		
		entityManager.addEntity(new Turn1S(handler, Tile.TILEWIDTH * 121, Tile.TILEHEIGHT * 95));
		entityManager.addEntity(new Turn2S(handler, Tile.TILEWIDTH * 129, Tile.TILEHEIGHT * 95));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 134, (Tile.TILEHEIGHT * 105) + 16, 13));
		
		entityManager.addEntity(new Turn1R(handler, Tile.TILEWIDTH * 141, Tile.TILEHEIGHT * 109));
		entityManager.addEntity(new Turn2R(handler, Tile.TILEWIDTH * 149 , Tile.TILEHEIGHT * 109));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 154, (Tile.TILEHEIGHT * 119) + 16, 16));

		entityManager.addEntity(new Turn1O(handler, Tile.TILEWIDTH * 69, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new Turn2O(handler, Tile.TILEWIDTH * 77, Tile.TILEHEIGHT * 55));
		//entityManager.addEntity(new Door(handler, Tile.TILEWIDTH * 82, (Tile.TILEHEIGHT * 65) + 16, 15));
		
		//Portals
		entityManager.addEntity(new DrowningPortal(handler, Tile.TILEWIDTH * 120, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new MazePortal(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new HeightsPortal(handler, Tile.TILEWIDTH * 100, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new InjuryPortal(handler, Tile.TILEWIDTH * 110, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new RiddlePortal(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new ForgottenPortal(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new CrumblePortal(handler, Tile.TILEWIDTH * 150, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new DarkPortal(handler, Tile.TILEWIDTH * 90, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new FailurePortal(handler, Tile.TILEWIDTH * 140, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new DeathPortal(handler, Tile.TILEWIDTH * 130, Tile.TILEHEIGHT * 42));
		
		//entityManager.addEntity(new DrowningSign(handler, Tile.TILEWIDTH * 121, Tile.TILEHEIGHT * 42, 7));
		
		//entityManager.addEntity(new HeightsSign(handler, Tile.TILEWIDTH * 101, Tile.TILEHEIGHT * 42, 5));
		//entityManager.addEntity(new InjurySign(handler, Tile.TILEWIDTH * 111, Tile.TILEHEIGHT * 42, 6));
		
		
		//entityManager.addEntity(new CrumbleSign(handler, Tile.TILEWIDTH * 151, Tile.TILEHEIGHT * 42, 10));
		//entityManager.addEntity(new PortalSign(handler, Tile.TILEWIDTH * 91, Tile.TILEHEIGHT * 42, 4));
		//entityManager.addEntity(new FailureSign(handler, Tile.TILEWIDTH * 141, Tile.TILEHEIGHT * 42, 9));
		//entityManager.addEntity(new DeathSign(handler, Tile.TILEWIDTH * 131, Tile.TILEHEIGHT * 42, 8));
		
		//entityManager.addEntity(new PortalSign(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 42, 3));
		//entityManager.addEntity(new PortalSign(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 42, 2));
		//entityManager.addEntity(new PortalSign(handler, Tile.TILEWIDTH * 71, Tile.TILEHEIGHT * 42, 1));
	}
	
	private void setSpawn(){
		switch(location){
		
		case 1:
			sX = (Tile.TILEWIDTH * 52) + 32;
			sY = (Tile.TILEHEIGHT * 68) + 16;
			break;
		case 2:
			sX = (Tile.TILEWIDTH * 82) + 32;
			sY = (Tile.TILEHEIGHT * 66) + 32;
			break;
		case 3:
			sX = (Tile.TILEWIDTH * 122) + 32;
			sY = (Tile.TILEHEIGHT * 72) + 16;
			break;
		case 4:
			sX = (Tile.TILEWIDTH * 148) + 32;
			sY = (Tile.TILEHEIGHT * 72) + 16;
			break;
		case 5:
			sX = (Tile.TILEWIDTH * 76) + 32;
			sY = (Tile.TILEHEIGHT * 100) + 16;
			break;
		case 6:
			sX = (Tile.TILEWIDTH * 64) + 32;
			sY = (Tile.TILEHEIGHT * 120) + 32;
			break;
		case 7:
			sX = (Tile.TILEWIDTH * 81) + 32;
			sY = (Tile.TILEHEIGHT * 124) + 16;
			break;
		case 8:
			sX = (Tile.TILEWIDTH * 134) + 32;
			sY = (Tile.TILEHEIGHT * 106) + 32;
			break;
		case 9:
			sX = (Tile.TILEWIDTH * 154) + 32;
			sY = (Tile.TILEHEIGHT * 120) + 32;
			break;
		case 10:
			sX = (Tile.TILEWIDTH * 116) + 32;
			sY = (Tile.TILEHEIGHT * 143) + 16;
			break;
		case 11:
			sX = (Tile.TILEWIDTH * 60) + 32;
			sY = (Tile.TILEHEIGHT * 163) + 16;
			break;
		case 12:
			sX = (Tile.TILEWIDTH * 150) + 32;
			sY = (Tile.TILEHEIGHT * 163) + 16;
			break;
		default:
			sX = (Tile.TILEWIDTH * 104) + 32;
			sY = Tile.TILEHEIGHT * 113;
		}
	}
	
	public static void setLocation(int house){
		location = house;
	}
	
	public void tick(){
		entityManager.tick();
	}
	
	public void render(Graphics2D g){
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart;y < yEnd;y++){
			for(int x = xStart;x < xEnd;x++){
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		//Entities
		entityManager.render(g);;
		
		
	}
}