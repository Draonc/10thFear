package dev.Sandefur.fear.tiles;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.tiles.DPtile.fpE;
import dev.Sandefur.fear.tiles.DPtile.fpN;
import dev.Sandefur.fear.tiles.DPtile.fpNE;
import dev.Sandefur.fear.tiles.DPtile.fpNW;
import dev.Sandefur.fear.tiles.DPtile.fpS;
import dev.Sandefur.fear.tiles.DPtile.fpSE;
import dev.Sandefur.fear.tiles.DPtile.fpSW;
import dev.Sandefur.fear.tiles.DPtile.fpTNE;
import dev.Sandefur.fear.tiles.DPtile.fpTNW;
import dev.Sandefur.fear.tiles.DPtile.fpTSE;
import dev.Sandefur.fear.tiles.DPtile.fpTSW;
import dev.Sandefur.fear.tiles.DPtile.fpW;
import dev.Sandefur.fear.tiles.GDtile.sgdE;
import dev.Sandefur.fear.tiles.GDtile.sgdN;
import dev.Sandefur.fear.tiles.GDtile.sgdNE;
import dev.Sandefur.fear.tiles.GDtile.sgdNW;
import dev.Sandefur.fear.tiles.GDtile.sgdS;
import dev.Sandefur.fear.tiles.GDtile.sgdSE;
import dev.Sandefur.fear.tiles.GDtile.sgdSW;
import dev.Sandefur.fear.tiles.GDtile.sgdW;
import dev.Sandefur.fear.tiles.GPtile.gpE;
import dev.Sandefur.fear.tiles.GPtile.gpN;
import dev.Sandefur.fear.tiles.GPtile.gpNE;
import dev.Sandefur.fear.tiles.GPtile.gpNW;
import dev.Sandefur.fear.tiles.GPtile.gpS;
import dev.Sandefur.fear.tiles.GPtile.gpSE;
import dev.Sandefur.fear.tiles.GPtile.gpSW;
import dev.Sandefur.fear.tiles.GPtile.gpTNE;
import dev.Sandefur.fear.tiles.GPtile.gpTNW;
import dev.Sandefur.fear.tiles.GPtile.gpTSE;
import dev.Sandefur.fear.tiles.GPtile.gpTSW;
import dev.Sandefur.fear.tiles.GPtile.gpW;
import dev.Sandefur.fear.tiles.House.BB;
import dev.Sandefur.fear.tiles.House.BBL;
import dev.Sandefur.fear.tiles.House.BBR;
import dev.Sandefur.fear.tiles.House.BL;
import dev.Sandefur.fear.tiles.House.BR;
import dev.Sandefur.fear.tiles.House.BT;
import dev.Sandefur.fear.tiles.House.BTL;
import dev.Sandefur.fear.tiles.House.BTR;
import dev.Sandefur.fear.tiles.House.Blank;
import dev.Sandefur.fear.tiles.House.HorWood;
import dev.Sandefur.fear.tiles.House.PlateWood;
import dev.Sandefur.fear.tiles.House.RedCarpet;
import dev.Sandefur.fear.tiles.House.VerWood;
import dev.Sandefur.fear.tiles.House.W1BL;
import dev.Sandefur.fear.tiles.House.W1BM;
import dev.Sandefur.fear.tiles.House.W1BR;
import dev.Sandefur.fear.tiles.House.W1TL;
import dev.Sandefur.fear.tiles.House.W1TM;
import dev.Sandefur.fear.tiles.House.W1TR;
import dev.Sandefur.fear.tiles.House.W2BL;
import dev.Sandefur.fear.tiles.House.W2BM;
import dev.Sandefur.fear.tiles.House.W2BR;
import dev.Sandefur.fear.tiles.House.W2TL;
import dev.Sandefur.fear.tiles.House.W2TM;
import dev.Sandefur.fear.tiles.House.W2TR;
import dev.Sandefur.fear.tiles.House.W3BL;
import dev.Sandefur.fear.tiles.House.W3BM;
import dev.Sandefur.fear.tiles.House.W3BR;
import dev.Sandefur.fear.tiles.House.W3TL;
import dev.Sandefur.fear.tiles.House.W3TM;
import dev.Sandefur.fear.tiles.House.W3TR;
import dev.Sandefur.fear.tiles.House.W4BL;
import dev.Sandefur.fear.tiles.House.W4BM;
import dev.Sandefur.fear.tiles.House.W4BR;
import dev.Sandefur.fear.tiles.House.W4TL;
import dev.Sandefur.fear.tiles.House.W4TM;
import dev.Sandefur.fear.tiles.House.W4TR;
import dev.Sandefur.fear.tiles.SGLGtile.fgE;
import dev.Sandefur.fear.tiles.SGLGtile.fgN;
import dev.Sandefur.fear.tiles.SGLGtile.fgNE;
import dev.Sandefur.fear.tiles.SGLGtile.fgNW;
import dev.Sandefur.fear.tiles.SGLGtile.fgS;
import dev.Sandefur.fear.tiles.SGLGtile.fgSE;
import dev.Sandefur.fear.tiles.SGLGtile.fgSW;
import dev.Sandefur.fear.tiles.SGLGtile.fgW;
import dev.Sandefur.fear.tiles.Solid.SolidD;
import dev.Sandefur.fear.tiles.Solid.SolidGD;
import dev.Sandefur.fear.tiles.Solid.SolidGDL;
import dev.Sandefur.fear.tiles.Solid.SolidGDR;
import dev.Sandefur.fear.tiles.Solid.SolidPD;
import dev.Sandefur.fear.tiles.Solid.SolidPDL;
import dev.Sandefur.fear.tiles.Solid.SolidPDR;
import dev.Sandefur.fear.tiles.Solid.tcNE;
import dev.Sandefur.fear.tiles.Solid.tcNW;
import dev.Sandefur.fear.tiles.Solid.tcSE;
import dev.Sandefur.fear.tiles.Solid.tcSW;
import dev.Sandefur.fear.tiles.Solid.tfNE;
import dev.Sandefur.fear.tiles.Solid.tfNW;
import dev.Sandefur.fear.tiles.Solid.tfSE;
import dev.Sandefur.fear.tiles.Solid.tfSW;



public class Tile {
	
	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	public static Tile shortGrassTile = new ShortGrassTile(0);
	public static Tile longGrassTile = new LongGrassTile(1);
	public static Tile paveTile = new PaveTile(2);
	public static Tile dirtTile = new DirtTile(3);
	public static Tile waterBGTile = new BGWaterTile(4);
	public static Tile waterRockTile = new WaterRockTile(5);
	public static Tile RockTile = new RockTile(6);
	public static Tile sgdN = new sgdN(7);
	public static Tile sgdNW = new sgdNW(8);
	public static Tile sgdNE = new sgdNE(9);
	public static Tile sgdW = new sgdW(10);
	public static Tile sgdE = new sgdE(11);
	public static Tile sgdS = new sgdS(12);
	public static Tile sgdSW = new sgdSW(13);
	public static Tile sgdSE = new sgdSE(14);
	public static Tile fpN = new fpN(15);
	public static Tile fpNW = new fpNW(16);
	public static Tile fpNE = new fpNE(17);
	public static Tile fpW = new fpW(18);
	public static Tile fpE = new fpE(19);
	public static Tile fpS = new fpS(20);
	public static Tile fpSW = new fpSW(21);
	public static Tile fpSE = new fpSE(22);
	public static Tile fgN = new fgN(23);
	public static Tile fgNW = new fgNW(24);
	public static Tile fgNE = new fgNE(25);
	public static Tile fgW = new fgW(26);
	public static Tile fgE = new fgE(27);
	public static Tile fgS = new fgS(28);
	public static Tile fgSW = new fgSW(29);
	public static Tile fgSE = new fgSE(30);
	public static Tile gpN = new gpN(31);
	public static Tile gpNW = new gpNW(32);
	public static Tile gpNE = new gpNE(33);
	public static Tile gpW = new gpW(34);
	public static Tile gpE = new gpE(35);
	public static Tile gpS = new gpS(36);
	public static Tile gpSW = new gpSW(37);
	public static Tile gpSE = new gpSE(38);
	public static Tile redCarpet = new RedCarpet(39);
	public static Tile horWood = new HorWood(40);
	public static Tile verWood = new VerWood(41);
	public static Tile plateWood = new PlateWood(42);
	public static Tile blank = new Blank(43);
	public static Tile w1TL = new W1TL(44);
	public static Tile w1TM = new W1TM(45);
	public static Tile w1TR = new W1TR(46);
	public static Tile w1BL = new W1BL(47);
	public static Tile w1BM = new W1BM(48);
	public static Tile w1BR = new W1BR(49);
	public static Tile w2TL = new W2TL(50);
	public static Tile w2TM = new W2TM(51);
	public static Tile w2TR = new W2TR(52);
	public static Tile w2BL = new W2BL(53);
	public static Tile w2BM = new W2BM(54);
	public static Tile w2BR = new W2BR(55);
	public static Tile w3TL = new W3TL(56);
	public static Tile w3TM = new W3TM(57);
	public static Tile w3TR = new W3TR(58);
	public static Tile w3BL = new W3BL(59);
	public static Tile w3BM = new W3BM(60);
	public static Tile w3BR = new W3BR(61);
	public static Tile w4TL = new W4TL(62);
	public static Tile w4TM = new W4TM(63);
	public static Tile w4TR = new W4TR(64);
	public static Tile w4BL = new W4BL(65);
	public static Tile w4BM = new W4BM(66);
	public static Tile w4BR = new W4BR(67);
	public static Tile BT = new BT(68);
	public static Tile BB = new BB(69);
	public static Tile BL = new BL(70);
	public static Tile BR = new BR(71);
	public static Tile BTL = new BTL(72);
	public static Tile BTR = new BTR(73);
	public static Tile BBL = new BBL(74);
	public static Tile BBR = new BBR(75);
	public static Tile SolidPD = new SolidPD(76);
	public static Tile SolidPDR  = new SolidPDR(77);
	public static Tile SolidPDL = new SolidPDL(78);
	public static Tile SolidGD = new SolidGD(79);
	public static Tile SolidGDR = new SolidGDR(80);
	public static Tile SolidGDL = new SolidGDL(81);
	public static Tile SolidD = new SolidD(82);
	public static Tile gpTNW = new gpTNW(83);
	public static Tile gpTNE = new gpTNE(84);
	public static Tile gpTSW = new gpTSW(85);
	public static Tile gpTSE = new gpTSE(86);
	public static Tile fpTNW = new fpTNW(87);
	public static Tile fpTNE = new fpTNE(88);
	public static Tile fpTSW = new fpTSW(89);
	public static Tile fpTSE = new fpTSE(90);
	
	public static Tile tcNW = new tcNW(91);
	public static Tile tcNE = new tcNE(92);
	public static Tile tcSW = new tcSW(93);
	public static Tile tcSE = new tcSE(94);
	public static Tile tfNW = new tfNW(95);
	public static Tile tfNE = new tfNE(96);
	public static Tile tfSW = new tfSW(97);
	public static Tile tfSE = new tfSE(98);
	
	public static Tile TreeBG = new TreeBG(99);
	public static Tile TreeTop = new TreeTop(100);
	public static Tile Branch = new Branch(101);
	public static Tile DungeonFloor = new DungeonFloor(102);
	public static Tile DungeonNW = new DungeonNW(103);
	public static Tile DungeonNE = new DungeonNE(104);
	public static Tile DungeonN = new DungeonN(105);
	public static Tile DungeonW = new DungeonW(106);
	public static Tile DungeonE = new DungeonE(107);
	public static Tile DungeonS = new DungeonS(108);
	public static Tile DungeonSE = new DungeonSE(109);
	public static Tile DungeonSW = new DungeonSW(110);
	public static Tile GlassFloor = new GlassFloor(111);
	public static Tile Black = new Black(112);
	public static Tile WallNW = new WallNW(113);
	public static Tile WallNE = new WallNE(114);
	public static Tile WallSW = new WallSW(115);
	public static Tile WallSE = new WallSE(116);
	public static Tile Floor = new Floor(117);
	public static Tile Block = new Block (118);
	
	
	
	
	
	
	
	
	//CLASS
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics2D g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public boolean isDeep(){
		return false;
	}
	
	public int getId(){
		return id;
	}
	
}
