package dev.Sandefur.fear.worlds;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.InsideDoor;
import dev.Sandefur.fear.entities.Static.Objects.BluePuffBed;
import dev.Sandefur.fear.entities.Static.Objects.BunkBed;
import dev.Sandefur.fear.entities.Static.Objects.ChairLeft;
import dev.Sandefur.fear.entities.Static.Objects.ChairRight;
import dev.Sandefur.fear.entities.Static.Objects.Clock1;
import dev.Sandefur.fear.entities.Static.Objects.Clock2;
import dev.Sandefur.fear.entities.Static.Objects.Couch2Left;
import dev.Sandefur.fear.entities.Static.Objects.Couch2Right;
import dev.Sandefur.fear.entities.Static.Objects.CouchDown;
import dev.Sandefur.fear.entities.Static.Objects.Counte1;
import dev.Sandefur.fear.entities.Static.Objects.Counter3;
import dev.Sandefur.fear.entities.Static.Objects.DeskBooks;
import dev.Sandefur.fear.entities.Static.Objects.DeskPaper;
import dev.Sandefur.fear.entities.Static.Objects.DinnerTable1;
import dev.Sandefur.fear.entities.Static.Objects.DinnerTable4;
import dev.Sandefur.fear.entities.Static.Objects.DoubleBedBlue;
import dev.Sandefur.fear.entities.Static.Objects.DoubleBedPurple;
import dev.Sandefur.fear.entities.Static.Objects.Flower1Pic;
import dev.Sandefur.fear.entities.Static.Objects.MirrorTable1;
import dev.Sandefur.fear.entities.Static.Objects.MoonPic;
import dev.Sandefur.fear.entities.Static.Objects.Oven;
import dev.Sandefur.fear.entities.Static.Objects.PadChairDown;
import dev.Sandefur.fear.entities.Static.Objects.PadChairLeft;
import dev.Sandefur.fear.entities.Static.Objects.PadChairRight;
import dev.Sandefur.fear.entities.Static.Objects.PadChairUp;
import dev.Sandefur.fear.entities.Static.Objects.Plant1;
import dev.Sandefur.fear.entities.Static.Objects.RedBed;
import dev.Sandefur.fear.entities.Static.Objects.RedPuffBed;
import dev.Sandefur.fear.entities.Static.Objects.RoundPadStool;
import dev.Sandefur.fear.entities.Static.Objects.RoundWoodStool;
import dev.Sandefur.fear.entities.Static.Objects.Shelf12;
import dev.Sandefur.fear.entities.Static.Objects.Shelf13;
import dev.Sandefur.fear.entities.Static.Objects.Shelf14;
import dev.Sandefur.fear.entities.Static.Objects.Shelf15;
import dev.Sandefur.fear.entities.Static.Objects.Shelf5;
import dev.Sandefur.fear.entities.Static.Objects.Shelf6;
import dev.Sandefur.fear.entities.Static.Objects.Shelf7;
import dev.Sandefur.fear.entities.Static.Objects.SideShelf;
import dev.Sandefur.fear.entities.Static.Objects.SquareStool;

import dev.Sandefur.fear.entities.Static.Objects.TableFlowers;
import dev.Sandefur.fear.entities.Static.Objects.TableMap;
import dev.Sandefur.fear.entities.Static.Objects.TableToys;
import dev.Sandefur.fear.entities.Static.Objects.TableWashBowl2;
import dev.Sandefur.fear.entities.Static.Objects.WallDown;
import dev.Sandefur.fear.entities.Static.Objects.WallShelf6;
import dev.Sandefur.fear.entities.Static.Objects.WallShelf7;

import dev.Sandefur.fear.entities.Static.Objects.WallUP;
import dev.Sandefur.fear.entities.Static.Objects.Wardrobe2;
import dev.Sandefur.fear.entities.Static.Objects.WindowCurtianOpen;

import dev.Sandefur.fear.entities.Static.Objects.sideTable;
import dev.Sandefur.fear.entities.creatures.MainPlayer;
import dev.Sandefur.fear.tiles.Tile;

public class InsideHouse extends World{

	int sX, sY;
	static int door;
	
	public InsideHouse(Handler handler, String path){
		super(handler, path);
		
		setSpawn();
		entityManager = new EntityManager(handler, new MainPlayer(handler, sX, sY));				
		populateEntities();
	}
	
	public void populateEntities(){
		//PCHouse
		entityManager.addEntity(new BunkBed(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new RedBed(handler, Tile.TILEWIDTH * 10, (Tile.TILEHEIGHT * 73) - 16));
		entityManager.addEntity(new RoundWoodStool(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 78));
		entityManager.addEntity(new RoundWoodStool(handler, Tile.TILEWIDTH * 5,  Tile.TILEHEIGHT * 80));
		entityManager.addEntity(new RoundWoodStool(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 79));
		entityManager.addEntity(new RoundWoodStool(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 79));
		entityManager.addEntity(new TableToys(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 79));
		entityManager.addEntity(new Shelf12(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new SideShelf(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 79));
		entityManager.addEntity(new WallShelf7(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 71));
		entityManager.addEntity(new MoonPic(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 77));
		entityManager.addEntity(new Shelf12(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 78));
		entityManager.addEntity(new Shelf12(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 78));
		entityManager.addEntity(new Couch2Left(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 82));
		entityManager.addEntity(new Couch2Right(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 82));
		entityManager.addEntity(new TableWashBowl2(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 75));
		entityManager.addEntity(new DinnerTable1(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 70));
		entityManager.addEntity(new DinnerTable1(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 70));
		entityManager.addEntity(new PadChairDown(handler, (Tile.TILEWIDTH * 20) - 32, Tile.TILEHEIGHT * 69));
		entityManager.addEntity(new PadChairDown(handler, (Tile.TILEWIDTH * 22) - 32, Tile.TILEHEIGHT * 69));
		entityManager.addEntity(new PadChairRight(handler, Tile.TILEWIDTH * 17, (Tile.TILEHEIGHT * 70) + 32));
		entityManager.addEntity(new PadChairLeft(handler, Tile.TILEWIDTH * 22, (Tile.TILEHEIGHT * 70) + 32));
		entityManager.addEntity(new PadChairUp(handler, (Tile.TILEWIDTH * 20) - 32, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new PadChairUp(handler, (Tile.TILEWIDTH * 22) - 32, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new Shelf14(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 65));
		entityManager.addEntity(new Shelf15(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 65));
		entityManager.addEntity(new WindowCurtianOpen(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 64));
		entityManager.addEntity(new WindowCurtianOpen(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 64));
		entityManager.addEntity(new Clock1(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 64));
		entityManager.addEntity(new Shelf13(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 75));
		entityManager.addEntity(new DoubleBedPurple(handler, Tile.TILEWIDTH * 35, (Tile.TILEHEIGHT * 70) -16));
		entityManager.addEntity(new sideTable(handler, Tile.TILEWIDTH * 34, (Tile.TILEHEIGHT * 70) - 16));
		entityManager.addEntity(new sideTable(handler, Tile.TILEWIDTH * 37, (Tile.TILEHEIGHT * 70) - 16));
		entityManager.addEntity(new Flower1Pic(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 68));
		entityManager.addEntity(new MirrorTable1(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 75));
		entityManager.addEntity(new RoundPadStool(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 77));
		entityManager.addEntity(new DeskPaper(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 79));
		entityManager.addEntity(new Counte1(handler, Tile.TILEWIDTH * 20, (Tile.TILEHEIGHT * 66) - 16));
		//entityManager.addEntity(new Rug1(handler, (Tile.TILEWIDTH * 20) + 32, (Tile.TILEHEIGHT * 82) + 48));
		
		entityManager.addEntity(new WallUP (handler,Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 71));
		entityManager.addEntity(new WallDown (handler,Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 69));
		
		//Carp

		//reye
		entityManager.addEntity(new DoubleBedBlue(handler, Tile.TILEWIDTH * 93, Tile.TILEHEIGHT * 70));
		entityManager.addEntity(new RedPuffBed(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 73));
		entityManager.addEntity(new BluePuffBed(handler, Tile.TILEWIDTH * 67, Tile.TILEHEIGHT * 73));
		entityManager.addEntity(new SideShelf(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 78));
		entityManager.addEntity(new DeskBooks(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 73));
		entityManager.addEntity(new WallShelf6(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 71));
		entityManager.addEntity(new Shelf5(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new TableFlowers(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 77));
		entityManager.addEntity(new SquareStool(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 78));
		entityManager.addEntity(new Shelf6(handler, Tile.TILEWIDTH * 71, Tile.TILEHEIGHT * 65));
		entityManager.addEntity(new Shelf7(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 65));
		entityManager.addEntity(new WindowCurtianOpen(handler, Tile.TILEWIDTH * 75, Tile.TILEHEIGHT * 64));
		entityManager.addEntity(new WindowCurtianOpen(handler, Tile.TILEWIDTH * 83, Tile.TILEHEIGHT * 64));
		entityManager.addEntity(new DinnerTable4(handler, Tile.TILEWIDTH * 77, Tile.TILEHEIGHT * 70));
		entityManager.addEntity(new DinnerTable4(handler, Tile.TILEWIDTH * 79, Tile.TILEHEIGHT * 70));
		entityManager.addEntity(new Counter3(handler, Tile.TILEWIDTH * 79, Tile.TILEHEIGHT * 66));
		entityManager.addEntity(new Oven(handler, Tile.TILEWIDTH * 78, Tile.TILEHEIGHT * 66));
		entityManager.addEntity(new Clock2(handler, Tile.TILEWIDTH * 79, Tile.TILEHEIGHT * 64));
		entityManager.addEntity(new PadChairDown(handler, (Tile.TILEWIDTH * 77) + 32, Tile.TILEHEIGHT * 69));
		entityManager.addEntity(new PadChairDown(handler, (Tile.TILEWIDTH * 79) + 32, Tile.TILEHEIGHT * 69));
		entityManager.addEntity(new PadChairUp(handler, (Tile.TILEWIDTH * 77) + 32, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new PadChairUp(handler, (Tile.TILEWIDTH * 79) + 32, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new Shelf5(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 77));
		entityManager.addEntity(new Shelf5(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 77));
		entityManager.addEntity(new TableWashBowl2(handler, Tile.TILEWIDTH * 83, Tile.TILEHEIGHT * 74));
		entityManager.addEntity(new CouchDown(handler, Tile.TILEWIDTH * 78, Tile.TILEHEIGHT * 80));
		entityManager.addEntity(new ChairRight(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 83));
		entityManager.addEntity(new ChairLeft(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 83));
		//entityManager.addEntity(new Rug3(handler, Tile.TILEWIDTH * 78, Tile.TILEHEIGHT * 83));
		entityManager.addEntity(new sideTable(handler, Tile.TILEWIDTH * 92, Tile.TILEHEIGHT * 70));
		entityManager.addEntity(new sideTable(handler, Tile.TILEWIDTH * 95, Tile.TILEHEIGHT * 70));
		entityManager.addEntity(new Wardrobe2(handler, Tile.TILEWIDTH * 97, Tile.TILEHEIGHT * 69));
		entityManager.addEntity(new MirrorTable1(handler, Tile.TILEWIDTH * 89, Tile.TILEHEIGHT * 74));
		entityManager.addEntity(new RoundPadStool(handler, Tile.TILEWIDTH * 89, Tile.TILEHEIGHT * 76));
		entityManager.addEntity(new Plant1(handler, Tile.TILEWIDTH * 93, Tile.TILEHEIGHT * 78));
		entityManager.addEntity(new TableMap(handler, Tile.TILEWIDTH * 97, Tile.TILEHEIGHT * 75));
		entityManager.addEntity(new RoundWoodStool(handler, Tile.TILEWIDTH * 97, Tile.TILEHEIGHT * 76));
		
		entityManager.addEntity(new WallUP (handler,Tile.TILEWIDTH * 69, Tile.TILEHEIGHT * 71));
		entityManager.addEntity(new WallDown (handler,Tile.TILEWIDTH * 88, Tile.TILEHEIGHT * 69));
		
		

		
		
		//Doors
		entityManager.addEntity(new InsideDoor(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 25, 1));
		entityManager.addEntity(new InsideDoor(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 25, 12));
		entityManager.addEntity(new InsideDoor(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 25, 10));
		entityManager.addEntity(new InsideDoor(handler, Tile.TILEWIDTH * 83, Tile.TILEHEIGHT * 25, 7));
		entityManager.addEntity(new InsideDoor(handler, (Tile.TILEWIDTH * 20) + 32, Tile.TILEHEIGHT * 87, 4));
		entityManager.addEntity(new InsideDoor(handler, (Tile.TILEWIDTH * 79) + 32, Tile.TILEHEIGHT * 87, 3));
		entityManager.addEntity(new InsideDoor(handler, (Tile.TILEWIDTH * 20) + 32, Tile.TILEHEIGHT * 118, 11));
		entityManager.addEntity(new InsideDoor(handler, (Tile.TILEWIDTH * 79) + 32, Tile.TILEHEIGHT * 118, 5));
		entityManager.addEntity(new InsideDoor(handler, (Tile.TILEWIDTH * 27) + 32, Tile.TILEHEIGHT * 142, 8));
		entityManager.addEntity(new InsideDoor(handler, (Tile.TILEWIDTH * 91) + 32, Tile.TILEHEIGHT * 142, 6));
		entityManager.addEntity(new InsideDoor(handler, (Tile.TILEWIDTH * 27) + 32, Tile.TILEHEIGHT * 173, 2));
		entityManager.addEntity(new InsideDoor(handler, (Tile.TILEWIDTH * 91) + 32, Tile.TILEHEIGHT * 173, 9));
		
		
		
	}
	
	private void setSpawn(){
		switch(door){
		case 1: 
			sX = Tile.TILEWIDTH * 4;
			sY = (Tile.TILEHEIGHT * 24) - 2;
			break;
		case 2:
			sX = (Tile.TILEWIDTH * 6) + 4;
			sY = (Tile.TILEHEIGHT * 45) - 2;
			break;
		case 3:
			sX = Tile.TILEWIDTH * 30;
			sY = (Tile.TILEHEIGHT * 24) - 2;
			break;
		case 4:
			sX = (Tile.TILEWIDTH * 33) + 4;
			sY = (Tile.TILEHEIGHT * 45) - 2;
			break;
		case 5:
			sX = Tile.TILEWIDTH * 57;
			sY = (Tile.TILEHEIGHT * 24) - 2;
			break;
		case 6:
			sX = (Tile.TILEWIDTH * 59) + 4;
			sY = (Tile.TILEHEIGHT * 45) - 2;
			break;
		case 7:
			sX = Tile.TILEWIDTH * 83;
			sY = (Tile.TILEHEIGHT * 24) - 2;
			break;
		case 8:
			sX = (Tile.TILEWIDTH * 85) + 4;
			sY = (Tile.TILEHEIGHT * 45) - 2;
			break;
		case 9:
			sX = (Tile.TILEWIDTH * 20) + 32;
			sY = (Tile.TILEHEIGHT * 86) - 2;
			break;
		case 10:
			sX = (Tile.TILEWIDTH * 79) + 32;
			sY = (Tile.TILEHEIGHT * 86) - 2;
			break;
		case 11:
			sX = (Tile.TILEWIDTH * 20) + 32;
			sY = (Tile.TILEHEIGHT * 117) - 2;
			break;
		case 12:
			sX = (Tile.TILEWIDTH * 79) + 32;
			sY = (Tile.TILEHEIGHT * 117) - 2;
			break;
		case 13:
			sX = (Tile.TILEWIDTH * 27) + 32;
			sY = Tile.TILEHEIGHT * 141;
			break;
		case 14:
			sX = (Tile.TILEWIDTH * 91) + 32;
			sY = Tile.TILEHEIGHT * 141;
			break;
		case 15:
			sX = (Tile.TILEWIDTH * 27)  + 32;
			sY = Tile.TILEHEIGHT * 172;
			break;
		case 16:
			sX = (Tile.TILEWIDTH * 91) + 32;
			sY = Tile.TILEHEIGHT * 172;
			break;
		default :
			sX = spawnX;
			sY = spawnY;
		}
	}
	
	public static void setDoor(int house){
		door = house;
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
		entityManager.render(g);
		
	}	
}