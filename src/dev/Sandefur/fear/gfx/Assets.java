package dev.Sandefur.fear.gfx;

import java.awt.Image;
import java.awt.image.BufferedImage;

import dev.Sandefur.fear.display.CourageBar;

public class Assets {

	private static final int width = 32, height = 32;

	public static BufferedImage chestOpen, chestClosed, potion, selectionBox, heartFull, heartEmpty, airBubbleFull, airBubbleEmpty, schestOpen, schestClosed;
	public static BufferedImage shortGrass, longGrass, bgWater, waterRock, pave, dirt, rock;
	public static BufferedImage sgdN, sgdNW, sgdNE, sgdW, sgdE, sgdS, sgdSW, sgdSE;
	public static BufferedImage fpN, fpNW, fpNE, fpW, fpE, fpS, fpSW, fpSE, fpTNW, fpTNE, fpTSW, fpTSE;
	public static BufferedImage fgN, fgNW, fgNE, fgW, fgE, fgS, fgSW, fgSE, PDN, PDNW, PDNE;
	public static BufferedImage gpN, gpNW, gpNE, gpW, gpE, gpS, gpSW, gpSE, gpTNW, gpTNE, gpTSW, gpTSE;
	public static BufferedImage menuBG, pauseBG, lightMask, intro, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, tBlank, start, gameOverBG, gameOverFile;
	public static BufferedImage flatG, flatS, flatR, flatO;
	public static BufferedImage turn1G, turn2G, turn1S, turn2S, turn1R, turn2R, turn1O, turn2O;
	public static BufferedImage serp1G, serp2G, serp3G, serp1S, serp2S, serp3S, serp1R, serp2R, serp3R, serp1O, serp2O, serp3O;
	public static BufferedImage door, redCarpet, verWood, horWood, plateWood, blank;
	public static BufferedImage w1TopLef, w1TopMid, w1TopRig, w1BotLef, w1BotMid, w1BotRig;
	public static BufferedImage w2TopLef, w2TopMid, w2TopRig, w2BotLef, w2BotMid, w2BotRig;
	public static BufferedImage w3TopLef, w3TopMid, w3TopRig, w3BotLef, w3BotMid, w3BotRig;
	public static BufferedImage w4TopLef, w4TopMid, w4TopRig, w4BotLef, w4BotMid, w4BotRig;
	public static BufferedImage b1Top, b1Bot, b1Left, b1Right, b1TR, b1TL, b1BR, b1BL;
	public static BufferedImage b2Top, b2Bot, b2Left, b2Right, b2TR, b2TL, b2BR, b2BL;
	public static BufferedImage b3Top, b3Bot, b3Left, b3Right, b3TR, b3TL, b3BR, b3BL;
	public static BufferedImage insideDoor, blankPortal, sun, mnt, ray, range, bossDoor, dungeonDoorLUp, dungeonDoorLDown, dungeonDoorLRight, dungeonDoorLLeft, dungeonDoorUUp, dungeonDoorUDown, dungeonDoorURight, dungeonDoorULeft;
	public static BufferedImage tcNW, tcNE, tcSW, tcSE, tfNW, tfNE, tfSW, tfSE, wallUp, wallDown;
	public static BufferedImage treeBG, branch, treeTop, dFloor, dwN, dwNW, dwNE, dwW, dwE, dwS, dwSW, dwSE, wNW, wNE,wSW, wSE, floor, block;
	public static BufferedImage riddle1, riddle2, riddle3, riddle4, riddle5, riddle6, riddle7, riddle8, riddle9, riddle10, riddle11, riddle12, riddle13, riddle14, riddle15;

	public static BufferedImage mainControl, IgnoranceConrtol,  lostControl, forgottenControl, darkControl, heightControl, injuryControl, drowningControl, deathControl, failControl, crumbControl;
	public static BufferedImage jump_left, jump_right, fall_left, fall_right, sChoice, sStart11, sStart12, sEnd11, sEnd12;

	// Characters
	public static BufferedImage[] player_down, player_up, player_left, player_right, swimming_left, swimming_right,
			fly_left, fly_right, attack_right, attack_up, attack_down, attack_left, fall, cutStart, cutEnd;
	public static BufferedImage[] Alec_up, Alec_down, Alec_left, Alec_right;
	public static BufferedImage[] Charles_up, Charles_down, Charles_left, Charles_right;
	public static BufferedImage[] Cyril_up, Cyril_down, Cyril_left, Cyril_right;
	public static BufferedImage[] Gus_up, Gus_down, Gus_left, Gus_right;
	public static BufferedImage[] Ardon_up, Ardon_down, Ardon_left, Ardon_right;
	public static BufferedImage[] Otis_up, Otis_down, Otis_left, Otis_right;
	public static BufferedImage[] Erinn_up, Erinn_down, Erinn_left, Erinn_right;
	public static BufferedImage[] Albert_up, Albert_down, Albert_left, Albert_right;
	public static BufferedImage[] Brandon_up, Brandon_down, Brandon_left, Brandon_right;
	public static BufferedImage[] Fritz_up, Fritz_down, Fritz_left, Fritz_right;
	public static BufferedImage[] Anc_up, Anc_down, Anc_left, Anc_right;
	public static BufferedImage[] Alvin_up, Alvin_down, Alvin_left, Alvin_right;
	public static BufferedImage[] Devin_up, Devin_down, Devin_left, Devin_right;
	public static BufferedImage[] Arturo_up, Arturo_down, Arturo_left, Arturo_right;
	public static BufferedImage[] Bao_up, Bao_down, Bao_left, Bao_right;
	public static BufferedImage[] Tag_up, Tag_down, Tag_left, Tag_right;
	public static BufferedImage[] Blake_up, Blake_down, Blake_left, Blake_right;
	public static BufferedImage[] Dillon_up, Dillon_down, Dillon_left, Dillon_right;
	public static BufferedImage[] Chaz_up, Chaz_down, Chaz_left, Chaz_right;
	public static BufferedImage[] Jed_up, Jed_down, Jed_left, Jed_right;
	public static BufferedImage[] Toni_up, Toni_down, Toni_left, Toni_right;
	public static BufferedImage[] Gena_up, Gena_down, Gena_left, Gena_right;
	public static BufferedImage[] Elaine_up, Elaine_down, Elaine_left, Elaine_right;
	public static BufferedImage[] Kym_up, Kym_down, Kym_left, Kym_right;
	public static BufferedImage[] Cecila_up, Cecila_down, Cecila_left, Cecila_right;
	public static BufferedImage[] Edith_up, Edith_down, Edith_left, Edith_right;
	public static BufferedImage[] Angela_up, Angela_down, Angela_left, Angela_right;
	public static BufferedImage[] Ronni_up, Ronni_down, Ronni_left, Ronni_right;
	public static BufferedImage[] Cicely_up, Cicely_down, Cicely_left, Cicely_right;
	public static BufferedImage[] Janet_up, Janet_down, Janet_left, Janet_right;
	public static BufferedImage[] OL_up, OL_down, OL_left, OL_right;
	public static BufferedImage[] Maren_up, Maren_down, Maren_left, Maren_right;
	public static BufferedImage[] Raye_up, Raye_down, Raye_left, Raye_right;
	public static BufferedImage[] Diane_up, Diane_down, Diane_left, Diane_right;
	public static BufferedImage[] Annis_up, Annis_down, Annis_left, Annis_right;
	public static BufferedImage[] Crystal_up, Crystal_down, Crystal_left, Crystal_right;
	
	//Animals
	public static BufferedImage[] chick_down, chick_up, chick_left, chick_right;
	public static BufferedImage[] cat_down, cat_up, cat_left, cat_right;
	public static BufferedImage[] dog_down, dog_up, dog_left, dog_right;
	public static BufferedImage[] rooster_down, rooster_up, rooster_left, rooster_right;
	public static BufferedImage[] brownHorse_down, brownHorse_up, brownHorse_left, brownHorse_right;
	public static BufferedImage[] greyHorse_down, greyHorse_up, greyHorse_left, greyHorse_right;
	public static BufferedImage[] chicken_down, chicken_up, chicken_left, chicken_right;
	public static BufferedImage[] cow_down, cow_up, cow_left, cow_right;
	public static BufferedImage[] goat_down, goat_up, goat_left, goat_right;
	public static BufferedImage[] sheep_down, sheep_up, sheep_left, sheep_right;
	
	//Mosters
	public static BufferedImage[] dragon_down, dragon_up, dragon_left, dragon_right;
	public static BufferedImage[] death_down, death_up, death_left, death_right;
	public static BufferedImage[] waterman_down, waterman_up, waterman_left, waterman_right;
	public static BufferedImage[] shark_down, shark_up, shark_left, shark_right;
	public static BufferedImage[] bat_down, bat_up, bat_left, bat_right;
	public static BufferedImage[] greygoop_down, greygoop_up, greygoop_left, greygoop_right;
	public static BufferedImage[] orangegoop_down, orangegoop_up, orangegoop_left, orangegoop_right;
	public static BufferedImage[] skel_down, skel_up, skel_left, skel_right;
	public static BufferedImage[] bee_down, bee_up, bee_left, bee_right;
	public static BufferedImage[] slug_down, slug_up, slug_left, slug_right;
	public static BufferedImage[] possium_down, possium_up, possium_left, possium_right;
	public static BufferedImage[] bluegoop_down, bluegoop_up, bluegoop_left, bluegoop_right;
	public static BufferedImage[] spider_down, spider_up, spider_left, spider_right;
	public static BufferedImage[] kingSkel_down, kingSkel_up, kingSkel_left, kingSkel_right;
	public static BufferedImage[] sludgeMan_down, sludgeMan_up, sludgeMan_left, sludgeMan_right;
	public static BufferedImage[] rat_down, rat_up, rat_left, rat_right;
	public static BufferedImage[] plant_down, plant_up, plant_left, plant_right;
	public static BufferedImage[] fish_down, fish_up, fish_left, fish_right;
	public static BufferedImage[] fox_down, fox_up, fox_left, fox_right;
	public static BufferedImage[] cEyes_down, cEyes_up, cEyes_left, cEyes_right;
	public static BufferedImage[] crumble;
	
	//Items
	public static BufferedImage deadTree1, treeCluster, treeFull, glassFloor, deadTree2, pdN, pdNw, pdNE, tlCorner, trCorner, blCorner, brCorner, emptyStall, clothStall, foodStall, doubleBedPink, doubleBedBrown, 
								doubleBedBlue, doubleBedOrange, doubleBedlBlue, doubleBedPurple, canopyBed, bunkBed, redBed, tanBed, greenBed, pinkBed, redPuffBed, bluePuffBed, blueBed, greenLineBed, blueLineBed, purpleLineBed, 
								wardrobe1, wardrobe2, shelf1, shelf2, shelf3, shelf4, shelf5, shelf6, shelf7, shelf8, shelf9, shelf10, shelf11, shelf12, shelf13, shelf14, shelf15, wallShelf1, wallShelf2, wallShelf3, wallShelf4, wallShelf5, wallShelf6, wallShelf7,
								wallShelf8, dresserTall, dresserShort, shelfSide, woodChairUp, woodChairDown, woodChairLeft, woodChairRight, padChairUp, padChairDown, padChairLeft, padChairRight, chairUp, chairDown, chairLeft, chairRight, couch1Up, couch1Down,
								couch1Left, couch1Right, couch2Left, couch2Right, tableWithMirror1, tableWithMirror2, sideTable, roundWoodStool, padRoundStool, squareStool, tableFlowers1, tableWashBowl1, tableWashBowl2, tableMail, tableMap, tableBook, tableFood,
								tablePresents, tableToys, tableFlowers, tableCoffee, tableClothes, tableMedicines, carpTable, deskBooks, desksPaper, rope, bag, dTable1, dTable2, dTable3, dTable4, moonPic, wheatPic, flowerPic1, applePic, princePic, princessPic, 
								inscript1, inscript2, plate, mirror1, mirror2, mirror3, kingPic, candle, clock1, clock2, chandler, plant1, plant2, map, ladyPic, manPic, flowerPic2, messageBoard, windowCurtainClosed, windowCurtainOpen, windowLight, window, shirt1, 
								shirt2, shirt3, shirt4, shirt5, shirt6, boxCloths, hat1, hat2, hat3, dress1, dress2, dress3, dress5, coat, cloak, bakerOven, paddleBoards, sugarBag, flourBag, basket1, basket2, cake, bakerCounter, breadShelf1, breadShelf2, breadShelf3, 
								breadShelf4, breadShelf5, potCovered, pot, basketEmpty, basketFull, boxes, bags, bucket, bucketWater, bucketHat, sacks, openSack, messageBoard2, cart, well, caldren, messageBoard3, outhouse, washBucket, chestSide, clothesLine, clTowels, 
								clPants, clBlankets, carpSign, tailorSign, traderSign, bakerSign, shopSign, cobblerSign, riddleBoard, rug1, rug2, rug3, rug4, stairsUp, stairsDown, counter1, counter2, counter3, counter4, oven, stove, logs1, logs2, logs3, cross1, cross2, 
								memorial, headStone, sawHorse1, sawHorse2, hay1, hay2, scarecrow1, scarecrow2, trophWater, tropHay, shovel, rope2, cape, bear, bagT, tapestry, Dress, cookies, vegtables, bottle, book, recipe, portrait, textBox, field, barrels, dress4, key, bossKey, stairUp,
								stairDown, inventory;	
	
	public static BufferedImage[] lava, teleport, crumblePort, failurePort, injuryPort, lostPort, stupidPort, heightsPort, forgottenPort, deathPort, darkPort, drowningPort; 


	public static void init() {
		// Chracters
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Entities.png"));
		// Player
		player_down = new BufferedImage[4];
		player_up = new BufferedImage[4];
		player_left = new BufferedImage[4];
		player_right = new BufferedImage[4];
		swimming_left = new BufferedImage[3];
		swimming_right = new BufferedImage[3];
		fly_left = new BufferedImage[3];
		fly_right = new BufferedImage[3];
		attack_up = new BufferedImage[3];
		attack_down = new BufferedImage[3];
		attack_left = new BufferedImage[3];
		attack_right = new BufferedImage[3];
		fall = new BufferedImage[4];

		player_down[0] = sheet.crop(0, 0, width, height);
		player_down[1] = sheet.crop(width, 0, width, height);
		player_down[2] = sheet.crop(width * 2, 0, width, height);
		player_down[3] = sheet.crop(width * 3, 0, width, height);
		player_up[0] = sheet.crop(0, height * 3, width, height);
		player_up[1] = sheet.crop(width, height * 3, width, height);
		player_up[2] = sheet.crop(width * 2, height * 3, width, height);
		player_up[3] = sheet.crop(width * 3, height * 3, width, height);
		player_right[0] = sheet.crop(0, height * 2, width, height);
		player_right[1] = sheet.crop(width, height * 2, width, height);
		player_right[2] = sheet.crop(width * 2, height * 2, width, height);
		player_right[3] = sheet.crop(width, height * 2, width, height);
		player_left[0] = sheet.crop(0, height, width, height);
		player_left[1] = sheet.crop(width, height, width, height);
		player_left[2] = sheet.crop(width * 2, height, width, height);
		player_left[3] = sheet.crop(width, height, width, height);

		swimming_left[0] = sheet.crop(0, height * 5, width, height);
		swimming_left[1] = sheet.crop(width, height * 5, width, height);
		swimming_left[2] = sheet.crop(width * 2, height * 5, width, height);
		swimming_right[0] = sheet.crop(0, height * 4, width, height);
		swimming_right[1] = sheet.crop(width, height * 4, width, height);
		swimming_right[2] = sheet.crop(width * 2, height * 4, width, height);

		fly_left[0] = sheet.crop(width * 3, height * 5, width, height);
		fly_left[1] = sheet.crop(width * 4, height * 5, width, height);
		fly_left[2] = sheet.crop(width * 5, height * 5, width, height);
		fly_right[0] = sheet.crop(width * 3, height * 4, width, height);
		fly_right[1] = sheet.crop(width * 4, height * 4, width, height);
		fly_right[2] = sheet.crop(width * 5, height * 4, width, height);
		
		attack_down[0] = sheet.crop(width * 7, 0, width * 2, height * 2);
		attack_down[1] = sheet.crop(width * 9, 0, width * 2, height * 2);
		attack_down[2] = sheet.crop(width * 7, 0, width * 2, height * 2);
		attack_up[0] = sheet.crop(width * 8, height * 6, width * 2, height * 2);
		attack_up[1] = sheet.crop(width * 10, height * 6, width * 2, height * 2);
		attack_up[2] = sheet.crop(width * 8, height * 6, width * 2, height * 2);
		attack_left[0] = sheet.crop(width * 11, height * 4, width * 2, height * 2);
		attack_left[1] = sheet.crop(width * 9, height * 4, width * 2, height * 2);
		attack_left[2] = sheet.crop(width * 7, height * 4, width * 2, height * 2);
		attack_right[0] = sheet.crop(width * 7, height * 2, width * 2, height * 2);
		attack_right[1] = sheet.crop(width * 9, height * 2, width * 2, height * 2);
		attack_right[2] = sheet.crop(width * 11, height * 2, width * 2, height * 2);
		

		fall_left = sheet.crop(width * 3, height, width, height);
		jump_left = sheet.crop(width * 4, height, width, height);
		jump_right = sheet.crop(width * 3, height * 2, width, height);
		fall_right = sheet.crop(width * 4, height * 2, width, height);
		
		fall[0] = sheet.crop(width * 4, height * 6, width, height);
		fall[1] = sheet.crop(width * 5, height * 6, width, height);
		fall[2] = sheet.crop(width * 6, height * 6, width, height);
		fall[3] = sheet.crop(width * 7, height * 6, width, height);
		
		
		// Player Family
		// Mother
		Toni_up = new BufferedImage[4];
		Toni_down = new BufferedImage[4];
		Toni_left = new BufferedImage[4];
		Toni_right = new BufferedImage[4];

		Toni_down[0] = sheet.crop(width * 13, height * 8, width, height);
		Toni_down[1] = sheet.crop(width * 14, height * 8, width, height);
		Toni_down[2] = sheet.crop(width * 15, height * 8, width, height);
		Toni_down[3] = sheet.crop(width * 14, height * 8, width, height);
		Toni_up[0] = sheet.crop(width * 13, height * 11, width, height);
		Toni_up[1] = sheet.crop(width * 14, height * 11, width, height);
		Toni_up[2] = sheet.crop(width * 15, height * 11, width, height);
		Toni_up[3] = sheet.crop(width * 14, height * 11, width, height);
		Toni_right[0] = sheet.crop(width * 13, height * 10, width, height);
		Toni_right[1] = sheet.crop(width * 14, height * 10, width, height);
		Toni_right[2] = sheet.crop(width * 15, height * 10, width, height);
		Toni_right[3] = sheet.crop(width * 14, height * 10, width, height);
		Toni_left[0] = sheet.crop(width * 13, height * 9, width, height);
		Toni_left[1] = sheet.crop(width * 14, height * 9, width, height);
		Toni_left[2] = sheet.crop(width * 15, height * 9, width, height);
		Toni_left[3] = sheet.crop(width * 14, height * 9, width, height);

		Alec_up = new BufferedImage[4];
		Alec_down = new BufferedImage[4];
		Alec_left = new BufferedImage[4];
		Alec_right = new BufferedImage[4];

		Alec_down[0] = sheet.crop(width * 25, 0, width, height);
		Alec_down[1] = sheet.crop(width * 26, 0, width, height);
		Alec_down[2] = sheet.crop(width * 27, 0, width, height);
		Alec_down[3] = sheet.crop(width * 26, 0, width, height);
		Alec_up[0] = sheet.crop(width * 25, height * 3, width, height);
		Alec_up[1] = sheet.crop(width * 26, height * 3, width, height);
		Alec_up[2] = sheet.crop(width * 27, height * 3, width, height);
		Alec_up[3] = sheet.crop(width * 26, height * 3, width, height);
		Alec_right[0] = sheet.crop(width * 25, height * 2, width, height);
		Alec_right[1] = sheet.crop(width * 26, height * 2, width, height);
		Alec_right[2] = sheet.crop(width * 27, height * 2, width, height);
		Alec_right[3] = sheet.crop(width * 26, height * 2, width, height);
		Alec_left[0] = sheet.crop(width * 25, height, width, height);
		Alec_left[1] = sheet.crop(width * 26, height, width, height);
		Alec_left[2] = sheet.crop(width * 27, height, width, height);
		Alec_left[3] = sheet.crop(width * 26, height, width, height);

		Tag_up = new BufferedImage[4];
		Tag_down = new BufferedImage[4];
		Tag_left = new BufferedImage[4];
		Tag_right = new BufferedImage[4];

		Tag_down[0] = sheet.crop(width * 31, 0, width, height);
		Tag_down[1] = sheet.crop(width * 32, 0, width, height);
		Tag_down[2] = sheet.crop(width * 33, 0, width, height);
		Tag_down[3] = sheet.crop(width * 32, 0, width, height);
		Tag_up[0] = sheet.crop(width * 31, height * 3, width, height);
		Tag_up[1] = sheet.crop(width * 32, height * 3, width, height);
		Tag_up[2] = sheet.crop(width * 33, height * 3, width, height);
		Tag_up[3] = sheet.crop(width * 32, height * 3, width, height);
		Tag_right[0] = sheet.crop(width * 31, height * 2, width, height);
		Tag_right[1] = sheet.crop(width * 32, height * 2, width, height);
		Tag_right[2] = sheet.crop(width * 33, height * 2, width, height);
		Tag_right[3] = sheet.crop(width * 32, height * 2, width, height);
		Tag_left[0] = sheet.crop(width * 31, height, width, height);
		Tag_left[1] = sheet.crop(width * 32, height, width, height);
		Tag_left[2] = sheet.crop(width * 33, height, width, height);
		Tag_left[3] = sheet.crop(width * 32, height, width, height);

		Blake_up = new BufferedImage[4];
		Blake_down = new BufferedImage[4];
		Blake_left = new BufferedImage[4];
		Blake_right = new BufferedImage[4];

		Blake_down[0] = sheet.crop(width * 34, 0, width, height);
		Blake_down[1] = sheet.crop(width * 35, 0, width, height);
		Blake_down[2] = sheet.crop(width * 36, 0, width, height);
		Blake_down[3] = sheet.crop(width * 35, 0, width, height);
		Blake_up[0] = sheet.crop(width * 34, height * 3, width, height);
		Blake_up[1] = sheet.crop(width * 35, height * 3, width, height);
		Blake_up[2] = sheet.crop(width * 36, height * 3, width, height);
		Blake_up[3] = sheet.crop(width * 35, height * 3, width, height);
		Blake_right[0] = sheet.crop(width * 34, height * 2, width, height);
		Blake_right[1] = sheet.crop(width * 35, height * 2, width, height);
		Blake_right[2] = sheet.crop(width * 36, height * 2, width, height);
		Blake_right[3] = sheet.crop(width * 35, height * 2, width, height);
		Blake_left[0] = sheet.crop(width * 34, height, width, height);
		Blake_left[1] = sheet.crop(width * 35, height, width, height);
		Blake_left[2] = sheet.crop(width * 36, height, width, height);
		Blake_left[3] = sheet.crop(width * 35, height, width, height);

		// Raye Family
		// Raye
		Raye_up = new BufferedImage[4];
		Raye_down = new BufferedImage[4];
		Raye_left = new BufferedImage[4];
		Raye_right = new BufferedImage[4];

		Raye_down[0] = sheet.crop(width * 19, 0, width, height);
		Raye_down[1] = sheet.crop(width * 20, 0, width, height);
		Raye_down[2] = sheet.crop(width * 21, 0, width, height);
		Raye_down[3] = sheet.crop(width * 20, 0, width, height);
		Raye_up[0] = sheet.crop(width * 19, height * 3, width, height);
		Raye_up[1] = sheet.crop(width * 20, height * 3, width, height);
		Raye_up[2] = sheet.crop(width * 21, height * 3, width, height);
		Raye_up[3] = sheet.crop(width * 20, height * 3, width, height);
		Raye_right[0] = sheet.crop(width * 19, height * 2, width, height);
		Raye_right[1] = sheet.crop(width * 20, height * 2, width, height);
		Raye_right[2] = sheet.crop(width * 21, height * 2, width, height);
		Raye_right[3] = sheet.crop(width * 20, height * 2, width, height);
		Raye_left[0] = sheet.crop(width * 19, height, width, height);
		Raye_left[1] = sheet.crop(width * 20, height, width, height);
		Raye_left[2] = sheet.crop(width * 21, height, width, height);
		Raye_left[3] = sheet.crop(width * 20, height, width, height);

		// Mother
		Gena_up = new BufferedImage[4];
		Gena_down = new BufferedImage[4];
		Gena_left = new BufferedImage[4];
		Gena_right = new BufferedImage[4];

		Gena_down[0] = sheet.crop(width * 13, height * 12, width, height);
		Gena_down[1] = sheet.crop(width * 14, height * 12, width, height);
		Gena_down[2] = sheet.crop(width * 15, height * 12, width, height);
		Gena_down[3] = sheet.crop(width * 14, height * 12, width, height);
		Gena_up[0] = sheet.crop(width * 13, height * 15, width, height);
		Gena_up[1] = sheet.crop(width * 14, height * 15, width, height);
		Gena_up[2] = sheet.crop(width * 15, height * 15, width, height);
		Gena_up[3] = sheet.crop(width * 14, height * 15, width, height);
		Gena_right[0] = sheet.crop(width * 13, height * 14, width, height);
		Gena_right[1] = sheet.crop(width * 14, height * 14, width, height);
		Gena_right[2] = sheet.crop(width * 15, height * 14, width, height);
		Gena_right[3] = sheet.crop(width * 14, height * 14, width, height);
		Gena_left[0] = sheet.crop(width * 13, height * 13, width, height);
		Gena_left[1] = sheet.crop(width * 14, height * 13, width, height);
		Gena_left[2] = sheet.crop(width * 15, height * 13, width, height);
		Gena_left[3] = sheet.crop(width * 13, height * 13, width, height);

		// Father
		Charles_up = new BufferedImage[4];
		Charles_down = new BufferedImage[4];
		Charles_left = new BufferedImage[4];
		Charles_right = new BufferedImage[4];

		Charles_down[0] = sheet.crop(width * 22, 0, width, height);
		Charles_down[1] = sheet.crop(width * 23, 0, width, height);
		Charles_down[2] = sheet.crop(width * 24, 0, width, height);
		Charles_down[3] = sheet.crop(width * 23, 0, width, height);
		Charles_up[0] = sheet.crop(width * 22, height * 3, width, height);
		Charles_up[1] = sheet.crop(width * 23, height * 3, width, height);
		Charles_up[2] = sheet.crop(width * 24, height * 3, width, height);
		Charles_up[3] = sheet.crop(width * 23, height * 3, width, height);
		Charles_right[0] = sheet.crop(width * 22, height * 2, width, height);
		Charles_right[1] = sheet.crop(width * 23, height * 2, width, height);
		Charles_right[2] = sheet.crop(width * 24, height * 2, width, height);
		Charles_right[3] = sheet.crop(width * 23, height * 2, width, height);
		Charles_left[0] = sheet.crop(width * 22, height, width, height);
		Charles_left[1] = sheet.crop(width * 23, height, width, height);
		Charles_left[2] = sheet.crop(width * 24, height, width, height);
		Charles_left[3] = sheet.crop(width * 23, height, width, height);

		// Brother
		Alvin_up = new BufferedImage[4];
		Alvin_down = new BufferedImage[4];
		Alvin_left = new BufferedImage[4];
		Alvin_right = new BufferedImage[4];

		Alvin_down[0] = sheet.crop(width * 28, height * 8, width, height);
		Alvin_down[1] = sheet.crop(width * 29, height * 8, width, height);
		Alvin_down[2] = sheet.crop(width * 30, height * 8, width, height);
		Alvin_down[3] = sheet.crop(width * 29, height * 8, width, height);
		Alvin_up[0] = sheet.crop(width * 28, height * 11, width, height);
		Alvin_up[1] = sheet.crop(width * 29, height * 11, width, height);
		Alvin_up[2] = sheet.crop(width * 30, height * 11, width, height);
		Alvin_up[3] = sheet.crop(width * 29, height * 11, width, height);
		Alvin_right[0] = sheet.crop(width * 28, height * 10, width, height);
		Alvin_right[1] = sheet.crop(width * 29, height * 10, width, height);
		Alvin_right[2] = sheet.crop(width * 30, height * 10, width, height);
		Alvin_right[3] = sheet.crop(width * 29, height * 10, width, height);
		Alvin_left[0] = sheet.crop(width * 28, height * 9, width, height);
		Alvin_left[1] = sheet.crop(width * 29, height * 9, width, height);
		Alvin_left[2] = sheet.crop(width * 30, height * 9, width, height);
		Alvin_left[3] = sheet.crop(width * 29, height * 9, width, height);

		// Mayor
		Cyril_up = new BufferedImage[4];
		Cyril_down = new BufferedImage[4];
		Cyril_left = new BufferedImage[4];
		Cyril_right = new BufferedImage[4];

		Cyril_down[0] = sheet.crop(width * 22, height * 4, width, height);
		Cyril_down[1] = sheet.crop(width * 23, height * 4, width, height);
		Cyril_down[2] = sheet.crop(width * 24, height * 4, width, height);
		Cyril_down[3] = sheet.crop(width * 23, height * 4, width, height);
		Cyril_up[0] = sheet.crop(width * 22, height * 7, width, height);
		Cyril_up[1] = sheet.crop(width * 23, height * 7, width, height);
		Cyril_up[2] = sheet.crop(width * 24, height * 7, width, height);
		Cyril_up[3] = sheet.crop(width * 23, height * 7, width, height);
		Cyril_right[0] = sheet.crop(width * 22, height * 6, width, height);
		Cyril_right[1] = sheet.crop(width * 23, height * 6, width, height);
		Cyril_right[2] = sheet.crop(width * 24, height * 6, width, height);
		Cyril_right[3] = sheet.crop(width * 23, height * 6, width, height);
		Cyril_left[0] = sheet.crop(width * 22, height * 5, width, height);
		Cyril_left[1] = sheet.crop(width * 23, height * 5, width, height);
		Cyril_left[2] = sheet.crop(width * 24, height * 5, width, height);
		Cyril_left[3] = sheet.crop(width * 23, height * 5, width, height);

		// Mayor wife
		Elaine_up = new BufferedImage[4];
		Elaine_down = new BufferedImage[4];
		Elaine_left = new BufferedImage[4];
		Elaine_right = new BufferedImage[4];

		Elaine_down[0] = sheet.crop(width * 28, height * 12, width, height);
		Elaine_down[1] = sheet.crop(width * 29, height * 12, width, height);
		Elaine_down[2] = sheet.crop(width * 30, height * 12, width, height);
		Elaine_down[3] = sheet.crop(width * 29, height * 12, width, height);
		Elaine_up[0] = sheet.crop(width * 28, height * 15, width, height);
		Elaine_up[1] = sheet.crop(width * 29, height * 15, width, height);
		Elaine_up[2] = sheet.crop(width * 30, height * 15, width, height);
		Elaine_up[3] = sheet.crop(width * 29, height * 15, width, height);
		Elaine_right[0] = sheet.crop(width * 28, height * 14, width, height);
		Elaine_right[1] = sheet.crop(width * 29, height * 14, width, height);
		Elaine_right[2] = sheet.crop(width * 30, height * 14, width, height);
		Elaine_right[3] = sheet.crop(width * 29, height * 14, width, height);
		Elaine_left[0] = sheet.crop(width * 28, height * 13, width, height);
		Elaine_left[1] = sheet.crop(width * 29, height * 13, width, height);
		Elaine_left[2] = sheet.crop(width * 30, height * 13, width, height);
		Elaine_left[3] = sheet.crop(width * 29, height * 13, width, height);

		// Shop Keep
		Kym_up = new BufferedImage[4];
		Kym_down = new BufferedImage[4];
		Kym_left = new BufferedImage[4];
		Kym_right = new BufferedImage[4];

		Kym_down[0] = sheet.crop(width * 16, height * 4, width, height);
		Kym_down[1] = sheet.crop(width * 17, height * 4, width, height);
		Kym_down[2] = sheet.crop(width * 18, height * 4, width, height);
		Kym_down[3] = sheet.crop(width * 17, height * 4, width, height);
		Kym_up[0] = sheet.crop(width * 16, height * 7, width, height);
		Kym_up[1] = sheet.crop(width * 17, height * 7, width, height);
		Kym_up[2] = sheet.crop(width * 18, height * 7, width, height);
		Kym_up[3] = sheet.crop(width * 17, height * 7, width, height);
		Kym_right[0] = sheet.crop(width * 16, height * 6, width, height);
		Kym_right[1] = sheet.crop(width * 17, height * 6, width, height);
		Kym_right[2] = sheet.crop(width * 18, height * 6, width, height);
		Kym_right[3] = sheet.crop(width * 17, height * 6, width, height);
		Kym_left[0] = sheet.crop(width * 16, height * 5, width, height);
		Kym_left[1] = sheet.crop(width * 17, height * 5, width, height);
		Kym_left[2] = sheet.crop(width * 18, height * 5, width, height);
		Kym_left[3] = sheet.crop(width * 17, height * 5, width, height);

		Gus_up = new BufferedImage[4];
		Gus_down = new BufferedImage[4];
		Gus_left = new BufferedImage[4];
		Gus_right = new BufferedImage[4];

		Gus_down[0] = sheet.crop(width * 25, height * 4, width, height);
		Gus_down[1] = sheet.crop(width * 26, height * 4, width, height);
		Gus_down[2] = sheet.crop(width * 27, height * 4, width, height);
		Gus_down[3] = sheet.crop(width * 26, height * 4, width, height);
		Gus_up[0] = sheet.crop(width * 25, height * 7, width, height);
		Gus_up[1] = sheet.crop(width * 26, height * 7, width, height);
		Gus_up[2] = sheet.crop(width * 27, height * 7, width, height);
		Gus_up[3] = sheet.crop(width * 26, height * 7, width, height);
		Gus_right[0] = sheet.crop(width * 25, height * 6, width, height);
		Gus_right[1] = sheet.crop(width * 26, height * 6, width, height);
		Gus_right[2] = sheet.crop(width * 27, height * 6, width, height);
		Gus_right[3] = sheet.crop(width * 26, height * 6, width, height);
		Gus_left[0] = sheet.crop(width * 25, height * 5, width, height);
		Gus_left[1] = sheet.crop(width * 26, height * 5, width, height);
		Gus_left[2] = sheet.crop(width * 27, height * 5, width, height);
		Gus_left[3] = sheet.crop(width * 26, height * 5, width, height);

		Devin_up = new BufferedImage[4];
		Devin_down = new BufferedImage[4];
		Devin_left = new BufferedImage[4];
		Devin_right = new BufferedImage[4];

		Devin_down[0] = sheet.crop(width * 34, height * 12, width, height);
		Devin_down[1] = sheet.crop(width * 35, height * 12, width, height);
		Devin_down[2] = sheet.crop(width * 36, height * 12, width, height);
		Devin_down[3] = sheet.crop(width * 35, height * 12, width, height);
		Devin_up[0] = sheet.crop(width * 34, height * 15, width, height);
		Devin_up[1] = sheet.crop(width * 35, height * 15, width, height);
		Devin_up[2] = sheet.crop(width * 36, height * 15, width, height);
		Devin_up[3] = sheet.crop(width * 35, height * 15, width, height);
		Devin_right[0] = sheet.crop(width * 34, height * 14, width, height);
		Devin_right[1] = sheet.crop(width * 35, height * 14, width, height);
		Devin_right[2] = sheet.crop(width * 36, height * 14, width, height);
		Devin_right[3] = sheet.crop(width * 35, height * 14, width, height);
		Devin_left[0] = sheet.crop(width * 34, height * 13, width, height);
		Devin_left[1] = sheet.crop(width * 35, height * 13, width, height);
		Devin_left[2] = sheet.crop(width * 36, height * 13, width, height);
		Devin_left[3] = sheet.crop(width * 35, height * 13, width, height);

		// Farmer
		Ardon_up = new BufferedImage[4];
		Ardon_down = new BufferedImage[4];
		Ardon_left = new BufferedImage[4];
		Ardon_right = new BufferedImage[4];

		Ardon_down[0] = sheet.crop(width * 19, height * 8, width, height);
		Ardon_down[1] = sheet.crop(width * 20, height * 8, width, height);
		Ardon_down[2] = sheet.crop(width * 21, height * 8, width, height);
		Ardon_down[3] = sheet.crop(width * 20, height * 8, width, height);
		Ardon_up[0] = sheet.crop(width * 19, height * 11, width, height);
		Ardon_up[1] = sheet.crop(width * 20, height * 11, width, height);
		Ardon_up[2] = sheet.crop(width * 21, height * 11, width, height);
		Ardon_up[3] = sheet.crop(width * 20, height * 11, width, height);
		Ardon_right[0] = sheet.crop(width * 19, height * 10, width, height);
		Ardon_right[1] = sheet.crop(width * 20, height * 10, width, height);
		Ardon_right[2] = sheet.crop(width * 21, height * 10, width, height);
		Ardon_right[3] = sheet.crop(width * 20, height * 10, width, height);
		Ardon_left[0] = sheet.crop(width * 19, height * 9, width, height);
		Ardon_left[1] = sheet.crop(width * 20, height * 9, width, height);
		Ardon_left[2] = sheet.crop(width * 21, height * 9, width, height);
		Ardon_left[3] = sheet.crop(width * 20, height * 9, width, height);

		Arturo_up = new BufferedImage[4];
		Arturo_down = new BufferedImage[4];
		Arturo_left = new BufferedImage[4];
		Arturo_right = new BufferedImage[4];

		Arturo_down[0] = sheet.crop(width * 19, height * 4, width, height);
		Arturo_down[1] = sheet.crop(width * 20, height * 4, width, height);
		Arturo_down[2] = sheet.crop(width * 21, height * 4, width, height);
		Arturo_down[3] = sheet.crop(width * 20, height * 4, width, height);
		Arturo_up[0] = sheet.crop(width * 19, height * 7, width, height);
		Arturo_up[1] = sheet.crop(width * 20, height * 7, width, height);
		Arturo_up[2] = sheet.crop(width * 21, height * 7, width, height);
		Arturo_up[3] = sheet.crop(width * 20, height * 7, width, height);
		Arturo_right[0] = sheet.crop(width * 19, height * 6, width, height);
		Arturo_right[1] = sheet.crop(width * 20, height * 6, width, height);
		Arturo_right[2] = sheet.crop(width * 21, height * 6, width, height);
		Arturo_right[3] = sheet.crop(width * 20, height * 6, width, height);
		Arturo_left[0] = sheet.crop(width * 19, height * 5, width, height);
		Arturo_left[1] = sheet.crop(width * 20, height * 5, width, height);
		Arturo_left[2] = sheet.crop(width * 21, height * 5, width, height);
		Arturo_left[3] = sheet.crop(width * 20, height * 5, width, height);

		Dillon_up = new BufferedImage[4];
		Dillon_down = new BufferedImage[4];
		Dillon_left = new BufferedImage[4];
		Dillon_right = new BufferedImage[4];

		Dillon_down[0] = sheet.crop(width * 37, height * 4, width, height);
		Dillon_down[1] = sheet.crop(width * 38, height * 4, width, height);
		Dillon_down[2] = sheet.crop(width * 39, height * 4, width, height);
		Dillon_down[3] = sheet.crop(width * 38, height * 4, width, height);
		Dillon_up[0] = sheet.crop(width * 37, height * 7, width, height);
		Dillon_up[1] = sheet.crop(width * 38, height * 7, width, height);
		Dillon_up[2] = sheet.crop(width * 39, height * 7, width, height);
		Dillon_up[3] = sheet.crop(width * 38, height * 7, width, height);
		Dillon_right[0] = sheet.crop(width * 37, height * 6, width, height);
		Dillon_right[1] = sheet.crop(width * 38, height * 6, width, height);
		Dillon_right[2] = sheet.crop(width * 39, height * 6, width, height);
		Dillon_right[3] = sheet.crop(width * 38, height * 6, width, height);
		Dillon_left[0] = sheet.crop(width * 37, height * 5, width, height);
		Dillon_left[1] = sheet.crop(width * 38, height * 5, width, height);
		Dillon_left[2] = sheet.crop(width * 39, height * 5, width, height);
		Dillon_left[3] = sheet.crop(width * 38, height * 5, width, height);

		// Baker
		Otis_up = new BufferedImage[4];
		Otis_down = new BufferedImage[4];
		Otis_left = new BufferedImage[4];
		Otis_right = new BufferedImage[4];

		Otis_down[0] = sheet.crop(width * 28, height * 4, width, height);
		Otis_down[1] = sheet.crop(width * 29, height * 4, width, height);
		Otis_down[2] = sheet.crop(width * 30, height * 4, width, height);
		Otis_down[3] = sheet.crop(width * 29, height * 4, width, height);
		Otis_up[0] = sheet.crop(width * 28, height * 7, width, height);
		Otis_up[1] = sheet.crop(width * 29, height * 7, width, height);
		Otis_up[2] = sheet.crop(width * 30, height * 7, width, height);
		Otis_up[3] = sheet.crop(width * 29, height * 7, width, height);
		Otis_right[0] = sheet.crop(width * 28, height * 6, width, height);
		Otis_right[1] = sheet.crop(width * 29, height * 6, width, height);
		Otis_right[2] = sheet.crop(width * 30, height * 6, width, height);
		Otis_right[3] = sheet.crop(width * 29, height * 6, width, height);
		Otis_left[0] = sheet.crop(width * 28, height * 5, width, height);
		Otis_left[1] = sheet.crop(width * 29, height * 5, width, height);
		Otis_left[2] = sheet.crop(width * 30, height * 5, width, height);
		Otis_left[3] = sheet.crop(width * 29, height * 5, width, height);

		Cecila_up = new BufferedImage[4];
		Cecila_down = new BufferedImage[4];
		Cecila_left = new BufferedImage[4];
		Cecila_right = new BufferedImage[4];

		Cecila_down[0] = sheet.crop(width * 13, height * 4, width, height);
		Cecila_down[1] = sheet.crop(width * 14, height * 4, width, height);
		Cecila_down[2] = sheet.crop(width * 15, height * 4, width, height);
		Cecila_down[3] = sheet.crop(width * 14, height * 4, width, height);
		Cecila_up[0] = sheet.crop(width * 13, height * 7, width, height);
		Cecila_up[1] = sheet.crop(width * 14, height * 7, width, height);
		Cecila_up[2] = sheet.crop(width * 15, height * 7, width, height);
		Cecila_up[3] = sheet.crop(width * 14, height * 7, width, height);
		Cecila_right[0] = sheet.crop(width * 13, height * 6, width, height);
		Cecila_right[1] = sheet.crop(width * 14, height * 6, width, height);
		Cecila_right[2] = sheet.crop(width * 15, height * 6, width, height);
		Cecila_right[3] = sheet.crop(width * 14, height * 6, width, height);
		Cecila_left[0] = sheet.crop(width * 13, height * 5, width, height);
		Cecila_left[1] = sheet.crop(width * 14, height * 5, width, height);
		Cecila_left[2] = sheet.crop(width * 15, height * 5, width, height);
		Cecila_left[3] = sheet.crop(width * 14, height * 5, width, height);

		Annis_up = new BufferedImage[4];
		Annis_down = new BufferedImage[4];
		Annis_left = new BufferedImage[4];
		Annis_right = new BufferedImage[4];

		Annis_down[0] = sheet.crop(width * 31, height * 4, width, height);
		Annis_down[1] = sheet.crop(width * 32, height * 4, width, height);
		Annis_down[2] = sheet.crop(width * 33, height * 4, width, height);
		Annis_down[3] = sheet.crop(width * 32, height * 4, width, height);
		Annis_up[0] = sheet.crop(width * 31, height * 7, width, height);
		Annis_up[1] = sheet.crop(width * 32, height * 7, width, height);
		Annis_up[2] = sheet.crop(width * 33, height * 7, width, height);
		Annis_up[3] = sheet.crop(width * 32, height * 7, width, height);
		Annis_right[0] = sheet.crop(width * 31, height * 6, width, height);
		Annis_right[1] = sheet.crop(width * 32, height * 6, width, height);
		Annis_right[2] = sheet.crop(width * 33, height * 6, width, height);
		Annis_right[3] = sheet.crop(width * 32, height * 6, width, height);
		Annis_left[0] = sheet.crop(width * 31, height * 5, width, height);
		Annis_left[1] = sheet.crop(width * 32, height * 5, width, height);
		Annis_left[2] = sheet.crop(width * 33, height * 5, width, height);
		Annis_left[3] = sheet.crop(width * 32, height * 5, width, height);

		// Cobbler
		Erinn_up = new BufferedImage[4];
		Erinn_down = new BufferedImage[4];
		Erinn_left = new BufferedImage[4];
		Erinn_right = new BufferedImage[4];

		Erinn_down[0] = sheet.crop(width * 37, height * 8, width, height);
		Erinn_down[1] = sheet.crop(width * 38, height * 8, width, height);
		Erinn_down[2] = sheet.crop(width * 39, height * 8, width, height);
		Erinn_down[3] = sheet.crop(width * 38, height * 8, width, height);
		Erinn_up[0] = sheet.crop(width * 37, height * 11, width, height);
		Erinn_up[1] = sheet.crop(width * 38, height * 11, width, height);
		Erinn_up[2] = sheet.crop(width * 39, height * 11, width, height);
		Erinn_up[3] = sheet.crop(width * 38, height * 11, width, height);
		Erinn_right[0] = sheet.crop(width * 37, height * 10, width, height);
		Erinn_right[1] = sheet.crop(width * 38, height * 10, width, height);
		Erinn_right[2] = sheet.crop(width * 39, height * 10, width, height);
		Erinn_right[3] = sheet.crop(width * 38, height * 10, width, height);
		Erinn_left[0] = sheet.crop(width * 37, height * 9, width, height);
		Erinn_left[1] = sheet.crop(width * 38, height * 9, width, height);
		Erinn_left[2] = sheet.crop(width * 39, height * 9, width, height);
		Erinn_left[3] = sheet.crop(width * 38, height * 9, width, height);

		// Old Couple
		Albert_up = new BufferedImage[4];
		Albert_down = new BufferedImage[4];
		Albert_left = new BufferedImage[4];
		Albert_right = new BufferedImage[4];

		Albert_down[0] = sheet.crop(width * 28, 0, width, height);
		Albert_down[1] = sheet.crop(width * 29, 0, width, height);
		Albert_down[2] = sheet.crop(width * 30, 0, width, height);
		Albert_down[3] = sheet.crop(width * 29, 0, width, height);
		Albert_up[0] = sheet.crop(width * 28, height * 3, width, height);
		Albert_up[1] = sheet.crop(width * 29, height * 3, width, height);
		Albert_up[2] = sheet.crop(width * 30, height * 3, width, height);
		Albert_up[3] = sheet.crop(width * 29, height * 3, width, height);
		Albert_right[0] = sheet.crop(width * 28, height * 2, width, height);
		Albert_right[1] = sheet.crop(width * 29, height * 2, width, height);
		Albert_right[2] = sheet.crop(width * 30, height * 2, width, height);
		Albert_right[3] = sheet.crop(width * 29, height * 2, width, height);
		Albert_left[0] = sheet.crop(width * 28, height, width, height);
		Albert_left[1] = sheet.crop(width * 29, height, width, height);
		Albert_left[2] = sheet.crop(width * 30, height, width, height);
		Albert_left[3] = sheet.crop(width * 29, height, width, height);

		Edith_up = new BufferedImage[4];
		Edith_down = new BufferedImage[4];
		Edith_left = new BufferedImage[4];
		Edith_right = new BufferedImage[4];

		Edith_down[0] = sheet.crop(width * 19, height * 12, width, height);
		Edith_down[1] = sheet.crop(width * 20, height * 12, width, height);
		Edith_down[2] = sheet.crop(width * 21, height * 12, width, height);
		Edith_down[3] = sheet.crop(width * 20, height * 12, width, height);
		Edith_up[0] = sheet.crop(width * 19, height * 15, width, height);
		Edith_up[1] = sheet.crop(width * 20, height * 15, width, height);
		Edith_up[2] = sheet.crop(width * 21, height * 15, width, height);
		Edith_up[3] = sheet.crop(width * 20, height * 15, width, height);
		Edith_right[0] = sheet.crop(width * 19, height * 14, width, height);
		Edith_right[1] = sheet.crop(width * 20, height * 14, width, height);
		Edith_right[2] = sheet.crop(width * 21, height * 14, width, height);
		Edith_right[3] = sheet.crop(width * 20, height * 14, width, height);
		Edith_left[0] = sheet.crop(width * 19, height * 13, width, height);
		Edith_left[1] = sheet.crop(width * 20, height * 13, width, height);
		Edith_left[2] = sheet.crop(width * 21, height * 13, width, height);
		Edith_left[3] = sheet.crop(width * 20, height * 13, width, height);

		// Doctor
		Angela_up = new BufferedImage[4];
		Angela_down = new BufferedImage[4];
		Angela_left = new BufferedImage[4];
		Angela_right = new BufferedImage[4];

		Angela_down[0] = sheet.crop(width * 16, 0, width, height);
		Angela_down[1] = sheet.crop(width * 17, 0, width, height);
		Angela_down[2] = sheet.crop(width * 18, 0, width, height);
		Angela_down[3] = sheet.crop(width * 17, 0, width, height);
		Angela_up[0] = sheet.crop(width * 16, height * 3, width, height);
		Angela_up[1] = sheet.crop(width * 17, height * 3, width, height);
		Angela_up[2] = sheet.crop(width * 18, height * 3, width, height);
		Angela_up[3] = sheet.crop(width * 17, height * 3, width, height);
		Angela_right[0] = sheet.crop(width * 16, height * 2, width, height);
		Angela_right[1] = sheet.crop(width * 17, height * 2, width, height);
		Angela_right[2] = sheet.crop(width * 18, height * 2, width, height);
		Angela_right[3] = sheet.crop(width * 17, height * 2, width, height);
		Angela_left[0] = sheet.crop(width * 16, height, width, height);
		Angela_left[1] = sheet.crop(width * 17, height, width, height);
		Angela_left[2] = sheet.crop(width * 18, height, width, height);
		Angela_left[3] = sheet.crop(width * 17, height, width, height);

		Crystal_up = new BufferedImage[4];
		Crystal_down = new BufferedImage[4];
		Crystal_left = new BufferedImage[4];
		Crystal_right = new BufferedImage[4];

		Crystal_down[0] = sheet.crop(width * 37, 0, width, height);
		Crystal_down[1] = sheet.crop(width * 38, 0, width, height);
		Crystal_down[2] = sheet.crop(width * 39, 0, width, height);
		Crystal_down[3] = sheet.crop(width * 38, 0, width, height);
		Crystal_up[0] = sheet.crop(width * 37, height * 3, width, height);
		Crystal_up[1] = sheet.crop(width * 38, height * 3, width, height);
		Crystal_up[2] = sheet.crop(width * 39, height * 3, width, height);
		Crystal_up[3] = sheet.crop(width * 38, height * 3, width, height);
		Crystal_right[0] = sheet.crop(width * 37, height * 2, width, height);
		Crystal_right[1] = sheet.crop(width * 38, height * 2, width, height);
		Crystal_right[2] = sheet.crop(width * 39, height * 2, width, height);
		Crystal_right[3] = sheet.crop(width * 38, height * 2, width, height);
		Crystal_left[0] = sheet.crop(width * 37, height, width, height);
		Crystal_left[1] = sheet.crop(width * 38, height, width, height);
		Crystal_left[2] = sheet.crop(width * 39, height, width, height);
		Crystal_left[3] = sheet.crop(width * 38, height, width, height);

		// Tailor
		Brandon_up = new BufferedImage[4];
		Brandon_down = new BufferedImage[4];
		Brandon_left = new BufferedImage[4];
		Brandon_right = new BufferedImage[4];

		Brandon_down[0] = sheet.crop(width * 31, height * 8, width, height);
		Brandon_down[1] = sheet.crop(width * 32, height * 8, width, height);
		Brandon_down[2] = sheet.crop(width * 33, height * 8, width, height);
		Brandon_down[3] = sheet.crop(width * 32, height * 8, width, height);
		Brandon_up[0] = sheet.crop(width * 31, height * 11, width, height);
		Brandon_up[1] = sheet.crop(width * 32, height * 11, width, height);
		Brandon_up[2] = sheet.crop(width * 33, height * 11, width, height);
		Brandon_up[3] = sheet.crop(width * 32, height * 11, width, height);
		Brandon_right[0] = sheet.crop(width * 31, height * 10, width, height);
		Brandon_right[1] = sheet.crop(width * 32, height * 10, width, height);
		Brandon_right[2] = sheet.crop(width * 33, height * 10, width, height);
		Brandon_right[3] = sheet.crop(width * 32, height * 10, width, height);
		Brandon_left[0] = sheet.crop(width * 31, height * 9, width, height);
		Brandon_left[1] = sheet.crop(width * 33, height * 9, width, height);
		Brandon_left[2] = sheet.crop(width * 39, height * 9, width, height);
		Brandon_left[3] = sheet.crop(width * 38, height * 9, width, height);

		Diane_up = new BufferedImage[4];
		Diane_down = new BufferedImage[4];
		Diane_left = new BufferedImage[4];
		Diane_right = new BufferedImage[4];

		Diane_down[0] = sheet.crop(width * 31, height * 12, width, height);
		Diane_down[1] = sheet.crop(width * 32, height * 12, width, height);
		Diane_down[2] = sheet.crop(width * 33, height * 12, width, height);
		Diane_down[3] = sheet.crop(width * 32, height * 12, width, height);
		Diane_up[0] = sheet.crop(width * 31, height * 15, width, height);
		Diane_up[1] = sheet.crop(width * 32, height * 15, width, height);
		Diane_up[2] = sheet.crop(width * 33, height * 15, width, height);
		Diane_up[3] = sheet.crop(width * 32, height * 15, width, height);
		Diane_right[0] = sheet.crop(width * 31, height * 14, width, height);
		Diane_right[1] = sheet.crop(width * 32, height * 14, width, height);
		Diane_right[2] = sheet.crop(width * 33, height * 14, width, height);
		Diane_right[3] = sheet.crop(width * 32, height * 14, width, height);
		Diane_left[0] = sheet.crop(width * 31, height * 13, width, height);
		Diane_left[1] = sheet.crop(width * 32, height * 13, width, height);
		Diane_left[2] = sheet.crop(width * 33, height * 13, width, height);
		Diane_left[3] = sheet.crop(width * 32, height * 13, width, height);

		Chaz_up = new BufferedImage[4];
		Chaz_down = new BufferedImage[4];
		Chaz_left = new BufferedImage[4];
		Chaz_right = new BufferedImage[4];

		Chaz_down[0] = sheet.crop(width * 34, height * 4, width, height);
		Chaz_down[1] = sheet.crop(width * 35, height * 4, width, height);
		Chaz_down[2] = sheet.crop(width * 36, height * 4, width, height);
		Chaz_down[3] = sheet.crop(width * 35, height * 4, width, height);
		Chaz_up[0] = sheet.crop(width * 34, height * 7, width, height);
		Chaz_up[1] = sheet.crop(width * 35, height * 7, width, height);
		Chaz_up[2] = sheet.crop(width * 36, height * 7, width, height);
		Chaz_up[3] = sheet.crop(width * 35, height * 7, width, height);
		Chaz_right[0] = sheet.crop(width * 34, height * 6, width, height);
		Chaz_right[1] = sheet.crop(width * 35, height * 6, width, height);
		Chaz_right[2] = sheet.crop(width * 36, height * 6, width, height);
		Chaz_right[3] = sheet.crop(width * 35, height * 6, width, height);
		Chaz_left[0] = sheet.crop(width * 34, height * 5, width, height);
		Chaz_left[1] = sheet.crop(width * 35, height * 5, width, height);
		Chaz_left[2] = sheet.crop(width * 36, height * 5, width, height);
		Chaz_left[3] = sheet.crop(width * 35, height * 5, width, height);

		// Trader
		Fritz_up = new BufferedImage[4];
		Fritz_down = new BufferedImage[4];
		Fritz_left = new BufferedImage[4];
		Fritz_right = new BufferedImage[4];

		Fritz_down[0] = sheet.crop(width * 22, height * 8, width, height);
		Fritz_down[1] = sheet.crop(width * 23, height * 8, width, height);
		Fritz_down[2] = sheet.crop(width * 24, height * 8, width, height);
		Fritz_down[3] = sheet.crop(width * 23, height * 8, width, height);
		Fritz_up[0] = sheet.crop(width * 22, height * 11, width, height);
		Fritz_up[1] = sheet.crop(width * 23, height * 11, width, height);
		Fritz_up[2] = sheet.crop(width * 24, height * 11, width, height);
		Fritz_up[3] = sheet.crop(width * 23, height * 11, width, height);
		Fritz_right[0] = sheet.crop(width * 22, height * 10, width, height);
		Fritz_right[1] = sheet.crop(width * 23, height * 10, width, height);
		Fritz_right[2] = sheet.crop(width * 24, height * 10, width, height);
		Fritz_right[3] = sheet.crop(width * 23, height * 10, width, height);
		Fritz_left[0] = sheet.crop(width * 22, height * 9, width, height);
		Fritz_left[1] = sheet.crop(width * 23, height * 9, width, height);
		Fritz_left[2] = sheet.crop(width * 24, height * 9, width, height);
		Fritz_left[3] = sheet.crop(width * 23, height * 9, width, height);

		Jed_up = new BufferedImage[4];
		Jed_down = new BufferedImage[4];
		Jed_left = new BufferedImage[4];
		Jed_right = new BufferedImage[4];

		Jed_down[0] = sheet.crop(width * 34, height * 8, width, height);
		Jed_down[1] = sheet.crop(width * 35, height * 8, width, height);
		Jed_down[2] = sheet.crop(width * 36, height * 8, width, height);
		Jed_down[3] = sheet.crop(width * 35, height * 8, width, height);
		Jed_up[0] = sheet.crop(width * 34, height * 11, width, height);
		Jed_up[1] = sheet.crop(width * 35, height * 11, width, height);
		Jed_up[2] = sheet.crop(width * 36, height * 11, width, height);
		Jed_up[3] = sheet.crop(width * 35, height * 11, width, height);
		Jed_right[0] = sheet.crop(width * 34, height * 10, width, height);
		Jed_right[1] = sheet.crop(width * 35, height * 10, width, height);
		Jed_right[2] = sheet.crop(width * 36, height * 10, width, height);
		Jed_right[3] = sheet.crop(width * 35, height * 10, width, height);
		Jed_left[0] = sheet.crop(width * 34, height * 9, width, height);
		Jed_left[1] = sheet.crop(width * 35, height * 9, width, height);
		Jed_left[2] = sheet.crop(width * 36, height * 9, width, height);
		Jed_left[3] = sheet.crop(width * 35, height * 9, width, height);

		Maren_up = new BufferedImage[4];
		Maren_down = new BufferedImage[4];
		Maren_left = new BufferedImage[4];
		Maren_right = new BufferedImage[4];

		Maren_down[0] = sheet.crop(width * 13, 0, width, height);
		Maren_down[1] = sheet.crop(width * 14, 0, width, height);
		Maren_down[2] = sheet.crop(width * 15, 0, width, height);
		Maren_down[3] = sheet.crop(width * 14, 0, width, height);
		Maren_up[0] = sheet.crop(width * 13, height * 3, width, height);
		Maren_up[1] = sheet.crop(width * 14, height * 3, width, height);
		Maren_up[2] = sheet.crop(width * 15, height * 3, width, height);
		Maren_up[3] = sheet.crop(width * 14, height * 3, width, height);
		Maren_right[0] = sheet.crop(width * 13, height * 2, width, height);
		Maren_right[1] = sheet.crop(width * 14, height * 2, width, height);
		Maren_right[2] = sheet.crop(width * 15, height * 2, width, height);
		Maren_right[3] = sheet.crop(width * 14, height * 2, width, height);
		Maren_left[0] = sheet.crop(width * 13, height, width, height);
		Maren_left[1] = sheet.crop(width * 14, height, width, height);
		Maren_left[2] = sheet.crop(width * 15, height, width, height);
		Maren_left[3] = sheet.crop(width * 14, height, width, height);

		Ronni_up = new BufferedImage[4];
		Ronni_down = new BufferedImage[4];
		Ronni_left = new BufferedImage[4];
		Ronni_right = new BufferedImage[4];

		Ronni_down[0] = sheet.crop(width * 16, height * 8, width, height);
		Ronni_down[1] = sheet.crop(width * 17, height * 8, width, height);
		Ronni_down[2] = sheet.crop(width * 18, height * 8, width, height);
		Ronni_down[3] = sheet.crop(width * 17, height * 8, width, height);
		Ronni_up[0] = sheet.crop(width * 16, height * 11, width, height);
		Ronni_up[1] = sheet.crop(width * 17, height * 11, width, height);
		Ronni_up[2] = sheet.crop(width * 18, height * 11, width, height);
		Ronni_up[3] = sheet.crop(width * 17, height * 11, width, height);
		Ronni_right[0] = sheet.crop(width * 16, height * 10, width, height);
		Ronni_right[1] = sheet.crop(width * 17, height * 10, width, height);
		Ronni_right[2] = sheet.crop(width * 18, height * 10, width, height);
		Ronni_right[3] = sheet.crop(width * 17, height * 10, width, height);
		Ronni_left[0] = sheet.crop(width * 16, height * 9, width, height);
		Ronni_left[1] = sheet.crop(width * 17, height * 9, width, height);
		Ronni_left[2] = sheet.crop(width * 18, height * 9, width, height);
		Ronni_left[3] = sheet.crop(width * 17, height * 9, width, height);

		Cicely_up = new BufferedImage[4];
		Cicely_down = new BufferedImage[4];
		Cicely_left = new BufferedImage[4];
		Cicely_right = new BufferedImage[4];

		Cicely_down[0] = sheet.crop(width * 25, height * 12, width, height);
		Cicely_down[1] = sheet.crop(width * 26, height * 12, width, height);
		Cicely_down[2] = sheet.crop(width * 27, height * 12, width, height);
		Cicely_down[3] = sheet.crop(width * 26, height * 12, width, height);
		Cicely_up[0] = sheet.crop(width * 25, height * 15, width, height);
		Cicely_up[1] = sheet.crop(width * 26, height * 15, width, height);
		Cicely_up[2] = sheet.crop(width * 27, height * 15, width, height);
		Cicely_up[3] = sheet.crop(width * 26, height * 15, width, height);
		Cicely_right[0] = sheet.crop(width * 25, height * 14, width, height);
		Cicely_right[1] = sheet.crop(width * 26, height * 14, width, height);
		Cicely_right[2] = sheet.crop(width * 27, height * 14, width, height);
		Cicely_right[3] = sheet.crop(width * 26, height * 14, width, height);
		Cicely_left[0] = sheet.crop(width * 25, height * 13, width, height);
		Cicely_left[1] = sheet.crop(width * 26, height * 13, width, height);
		Cicely_left[2] = sheet.crop(width * 27, height * 13, width, height);
		Cicely_left[3] = sheet.crop(width * 26, height * 13, width, height);

		Janet_up = new BufferedImage[4];
		Janet_down = new BufferedImage[4];
		Janet_left = new BufferedImage[4];
		Janet_right = new BufferedImage[4];

		Janet_down[0] = sheet.crop(width * 22, height * 12, width, height);
		Janet_down[1] = sheet.crop(width * 23, height * 12, width, height);
		Janet_down[2] = sheet.crop(width * 24, height * 12, width, height);
		Janet_down[3] = sheet.crop(width * 23, height * 12, width, height);
		Janet_up[0] = sheet.crop(width * 22, height * 15, width, height);
		Janet_up[1] = sheet.crop(width * 23, height * 15, width, height);
		Janet_up[2] = sheet.crop(width * 24, height * 15, width, height);
		Janet_up[3] = sheet.crop(width * 23, height * 15, width, height);
		Janet_right[0] = sheet.crop(width * 22, height * 14, width, height);
		Janet_right[1] = sheet.crop(width * 23, height * 14, width, height);
		Janet_right[2] = sheet.crop(width * 24, height * 14, width, height);
		Janet_right[3] = sheet.crop(width * 23, height * 14, width, height);
		Janet_left[0] = sheet.crop(width * 22, height * 13, width, height);
		Janet_left[1] = sheet.crop(width * 23, height * 13, width, height);
		Janet_left[2] = sheet.crop(width * 24, height * 13, width, height);
		Janet_left[3] = sheet.crop(width * 23, height * 13, width, height);

		Bao_up = new BufferedImage[4];
		Bao_down = new BufferedImage[4];
		Bao_left = new BufferedImage[4];
		Bao_right = new BufferedImage[4];

		Bao_down[0] = sheet.crop(width * 37, height * 12, width, height);
		Bao_down[1] = sheet.crop(width * 38, height * 12, width, height);
		Bao_down[2] = sheet.crop(width * 39, height * 12, width, height);
		Bao_down[3] = sheet.crop(width * 38, height * 12, width, height);
		Bao_up[0] = sheet.crop(width * 37, height * 15, width, height);
		Bao_up[1] = sheet.crop(width * 38, height * 15, width, height);
		Bao_up[2] = sheet.crop(width * 39, height * 15, width, height);
		Bao_up[3] = sheet.crop(width * 38, height * 15, width, height);
		Bao_right[0] = sheet.crop(width * 37, height * 14, width, height);
		Bao_right[1] = sheet.crop(width * 38, height * 14, width, height);
		Bao_right[2] = sheet.crop(width * 39, height * 14, width, height);
		Bao_right[3] = sheet.crop(width * 38, height * 14, width, height);
		Bao_left[0] = sheet.crop(width * 37, height * 13, width, height);
		Bao_left[1] = sheet.crop(width * 38, height * 13, width, height);
		Bao_left[2] = sheet.crop(width * 39, height * 13, width, height);
		Bao_left[3] = sheet.crop(width * 38, height * 13, width, height);

		// Old Woman
		OL_up = new BufferedImage[4];
		OL_down = new BufferedImage[4];
		OL_left = new BufferedImage[4];
		OL_right = new BufferedImage[4];

		OL_down[0] = sheet.crop(width * 25, height * 8, width, height);
		OL_down[1] = sheet.crop(width * 26, height * 8, width, height);
		OL_down[2] = sheet.crop(width * 27, height * 8, width, height);
		OL_down[3] = sheet.crop(width * 26, height * 8, width, height);
		OL_up[0] = sheet.crop(width * 25, height * 11, width, height);
		OL_up[1] = sheet.crop(width * 26, height * 11, width, height);
		OL_up[2] = sheet.crop(width * 27, height * 11, width, height);
		OL_up[3] = sheet.crop(width * 26, height * 11, width, height);
		OL_right[0] = sheet.crop(width * 25, height * 10, width, height);
		OL_right[1] = sheet.crop(width * 26, height * 10, width, height);
		OL_right[2] = sheet.crop(width * 27, height * 10, width, height);
		OL_right[3] = sheet.crop(width * 26, height * 10, width, height);
		OL_left[0] = sheet.crop(width * 25, height * 9, width, height);
		OL_left[1] = sheet.crop(width * 26, height * 9, width, height);
		OL_left[2] = sheet.crop(width * 27, height * 9, width, height);
		OL_left[3] = sheet.crop(width * 26, height * 9, width, height);

		// Ancestor
		Anc_up = new BufferedImage[4];
		Anc_down = new BufferedImage[4];
		Anc_left = new BufferedImage[4];
		Anc_right = new BufferedImage[4];

		Anc_down[0] = sheet.crop(width * 16, height * 12, width, height);
		Anc_down[1] = sheet.crop(width * 17, height * 12, width, height);
		Anc_down[2] = sheet.crop(width * 18, height * 12, width, height);
		Anc_down[3] = sheet.crop(width * 17, height * 12, width, height);
		Anc_up[0] = sheet.crop(width * 16, height * 15, width, height);
		Anc_up[1] = sheet.crop(width * 17, height * 15, width, height);
		Anc_up[2] = sheet.crop(width * 18, height * 15, width, height);
		Anc_up[3] = sheet.crop(width * 17, height * 15, width, height);
		Anc_right[0] = sheet.crop(width * 16, height * 14, width, height);
		Anc_right[1] = sheet.crop(width * 17, height * 14, width, height);
		Anc_right[2] = sheet.crop(width * 18, height * 14, width, height);
		Anc_right[3] = sheet.crop(width * 17, height * 14, width, height);
		Anc_left[0] = sheet.crop(width * 16, height * 13, width, height);
		Anc_left[1] = sheet.crop(width * 17, height * 13, width, height);
		Anc_left[2] = sheet.crop(width * 18, height * 13, width, height);
		Anc_left[3] = sheet.crop(width * 17, height * 13, width, height);
		
		//Animals
		chick_down = new BufferedImage[3];
		chick_up = new BufferedImage[3];
		chick_left = new BufferedImage[3];
		chick_right = new BufferedImage[3];
		
		chick_down[0] = sheet.crop(0, height * 36, width, height);
		chick_down[1] = sheet.crop(width , height * 36, width, height);
		chick_down[2] = sheet.crop(width * 2, height * 36, width, height);
		chick_up[0] = sheet.crop(0, height * 39, width, height);
		chick_up[1] = sheet.crop(width, height * 39, width, height);
		chick_up[2] = sheet.crop(width * 2, height * 39, width, height);
		chick_right[0] = sheet.crop(0, height * 38, width, height);
		chick_right[1] = sheet.crop(width, height * 38, width, height);
		chick_right[2] = sheet.crop(width * 2, height * 38, width, height);
		chick_left[0] = sheet.crop(0, height * 37, width, height);
		chick_left[1] = sheet.crop(width, height * 37, width, height);
		chick_left[2] = sheet.crop(width * 2, height * 37, width, height);
		
		cat_down  = new BufferedImage[3];
		cat_up = new BufferedImage[3];
		cat_left = new BufferedImage[3];
		cat_right = new BufferedImage[3];
		
		cat_down[0] = sheet.crop(0, height * 32, width, height);
		cat_down[1] = sheet.crop(width, height * 32, width, height);
		cat_down[2] = sheet.crop(width * 2, height * 32, width, height);
		cat_up[0] = sheet.crop(0, height * 35, width, height);
		cat_up[1] = sheet.crop(width, height * 35, width, height);
		cat_up[2] = sheet.crop(width * 2, height * 35, width, height);
		cat_right[0] = sheet.crop(0, height * 34, width, height);
		cat_right[1] = sheet.crop(width, height * 34, width, height);
		cat_right[2] = sheet.crop(width * 2, height * 34, width, height);
		cat_left[0] = sheet.crop(0, height * 33, width, height);
		cat_left[1] = sheet.crop(width, height * 33, width, height);
		cat_left[2] = sheet.crop(width * 2, height * 33, width, height);
		
		dog_down = new BufferedImage[3];
		dog_up = new BufferedImage[3];
		dog_left = new BufferedImage[3];
		dog_right = new BufferedImage[3];
		
		dog_down[0] = sheet.crop(0, height * 28, width, height);
		dog_down[1] = sheet.crop(width, height * 28, width, height);
		dog_down[2] = sheet.crop(width * 2, height * 28, width, height);
		dog_up[0] = sheet.crop(0, height * 31, width, height);
		dog_up[1] = sheet.crop(width, height * 31, width, height);
		dog_up[2] = sheet.crop(width * 2, height * 31, width, height);
		dog_right[0] = sheet.crop(0, height * 30, width, height);
		dog_right[1] = sheet.crop(width, height * 30, width, height);
		dog_right[2] = sheet.crop(width * 2, height * 30, width, height);
		dog_left[0] = sheet.crop(0, height * 29, width, height);
		dog_left[1] = sheet.crop(width, height * 29, width, height);
		dog_left[2] = sheet.crop(width * 2, height * 29, width, height);
		
		rooster_down = new BufferedImage[3];
		rooster_up = new BufferedImage[3];
		rooster_left = new BufferedImage[3];
		rooster_right = new BufferedImage[3];
		
		rooster_down[0] = sheet.crop(width * 3, height * 36, width, height);
		rooster_down[1] = sheet.crop(width * 4, height * 36, width, height);
		rooster_down[2] = sheet.crop(width * 5, height * 36, width, height);
		rooster_up[0] = sheet.crop(width * 3, height * 39, width, height);
		rooster_up[1] = sheet.crop(width * 4, height * 39, width, height);
		rooster_up[2] = sheet.crop(width * 5, height * 39, width, height);
		rooster_right[0] = sheet.crop(width * 3, height * 38, width, height);
		rooster_right[1] = sheet.crop(width * 4, height * 38, width, height);
		rooster_right[2] = sheet.crop(width * 5, height * 38, width, height);
		rooster_left[0] = sheet.crop(width * 3, height * 37, width, height);
		rooster_left[1] = sheet.crop(width * 4, height * 37, width, height);
		rooster_left[2] = sheet.crop(width * 5, height * 37, width, height);
		
		brownHorse_down = new BufferedImage[3];
		brownHorse_up = new BufferedImage[3];
		brownHorse_left = new BufferedImage[3];
		brownHorse_right = new BufferedImage[3];
		
		brownHorse_down[0] = sheet.crop(width * 6, height * 28, width, height);
		brownHorse_down[1] = sheet.crop(width * 7, height * 28, width, height);
		brownHorse_down[2] = sheet.crop(width * 8, height * 28, width, height);
		brownHorse_up[0] = sheet.crop(width * 6, height * 31, width, height);
		brownHorse_up[1] = sheet.crop(width * 7, height * 31, width, height);
		brownHorse_up[2] = sheet.crop(width * 8, height * 31, width, height);
		brownHorse_right[0] = sheet.crop(width * 6, height * 30, width, height);
		brownHorse_right[1] = sheet.crop(width * 7, height * 30, width, height);
		brownHorse_right[2] = sheet.crop(width * 8, height * 30, width, height);
		brownHorse_left[0] = sheet.crop(width * 6, height * 29, width, height);
		brownHorse_left[1] = sheet.crop(width * 7, height * 29, width, height);
		brownHorse_left[2] = sheet.crop(width * 8, height * 29, width, height);
		
		greyHorse_down = new BufferedImage[3];
		greyHorse_up = new BufferedImage[3];
		greyHorse_left = new BufferedImage[3];
		greyHorse_right = new BufferedImage[3];
		
		greyHorse_down[0] = sheet.crop(width * 9, height * 28, width, height);
		greyHorse_down[1] = sheet.crop(width * 10, height * 28, width, height);
		greyHorse_down[2] = sheet.crop(width * 11, height * 28, width, height);
		greyHorse_up[0] = sheet.crop(width * 9, height * 31, width, height);
		greyHorse_up[1] = sheet.crop(width * 10, height * 31, width, height);
		greyHorse_up[2] = sheet.crop(width * 11, height * 31, width, height);
		greyHorse_right[0] = sheet.crop(width * 9, height * 30, width, height);
		greyHorse_right[1] = sheet.crop(width * 10, height * 30, width, height);
		greyHorse_right[2] = sheet.crop(width * 11, height * 30, width, height);
		greyHorse_left[0] = sheet.crop(width * 9, height * 29, width, height);
		greyHorse_left[1] = sheet.crop(width * 10, height * 29, width, height);
		greyHorse_left[2] = sheet.crop(width * 11, height * 29, width, height);
		
		chicken_down  = new BufferedImage[3];
		chicken_up = new BufferedImage[3];
		chicken_left = new BufferedImage[3];
		chicken_right = new BufferedImage[3];
		
		chicken_down[0] = sheet.crop(width * 13, height * 36, width, height);
		chicken_down[1] = sheet.crop(width * 14, height * 36, width, height);
		chicken_down[2] = sheet.crop(width * 15, height * 36, width, height);
		chicken_up[0] = sheet.crop(width * 13, height * 39, width, height);
		chicken_up[1] = sheet.crop(width * 14, height * 39, width, height);
		chicken_up[2] = sheet.crop(width * 15, height * 39, width, height);
		chicken_right[0] = sheet.crop(width * 13, height * 38, width, height);
		chicken_right[1] = sheet.crop(width * 14, height * 38, width, height);
		chicken_right[2] = sheet.crop(width * 15, height * 38, width, height);
		chicken_left[0] = sheet.crop(width * 13, height * 37, width, height);
		chicken_left[1] = sheet.crop(width * 14, height * 37, width, height);
		chicken_left[2] = sheet.crop(width * 15, height * 37, width, height);
		
		cow_down = new BufferedImage[3];
		cow_up = new BufferedImage[3];
		cow_left = new BufferedImage[3];
		cow_right = new BufferedImage[3];
		
		cow_down[0] = sheet.crop(width * 13, height * 32, width, height);
		cow_down[1] = sheet.crop(width * 14, height * 32, width, height);
		cow_down[2] = sheet.crop(width * 15, height * 32, width, height);
		cow_up[0] = sheet.crop(width * 13, height * 35, width, height);
		cow_up[1] = sheet.crop(width * 14, height * 35, width, height);
		cow_up[2] = sheet.crop(width * 15, height * 35, width, height);
		cow_right[0] = sheet.crop(width * 13, height * 34, width, height);
		cow_right[1] = sheet.crop(width * 14, height * 34, width, height);
		cow_right[2] = sheet.crop(width * 15, height * 34, width, height);
		cow_left[0] = sheet.crop(width * 13, height * 33, width, height);
		cow_left[1] = sheet.crop(width * 14, height * 33, width, height);
		cow_left[2] = sheet.crop(width * 15, height * 33, width, height);
		
		goat_down  = new BufferedImage[3];
		goat_up = new BufferedImage[3];
		goat_left = new BufferedImage[3];
		goat_right = new BufferedImage[3];
		
		goat_down[0] = sheet.crop(width * 13, height * 28, width, height);
		goat_down[1] = sheet.crop(width * 14, height * 28, width, height);
		goat_down[2] = sheet.crop(width * 15, height * 28, width, height);
		goat_up[0] = sheet.crop(width * 13, height * 31, width, height);
		goat_up[1] = sheet.crop(width * 14, height * 31, width, height);
		goat_up[2] = sheet.crop(width * 15, height * 31, width, height);
		goat_right[0] = sheet.crop(width * 13, height * 30, width, height);
		goat_right[1] = sheet.crop(width * 14, height * 30, width, height);
		goat_right[2] = sheet.crop(width * 15, height * 30, width, height);
		goat_left[0] = sheet.crop(width * 13, height * 29, width, height);
		goat_left[1] = sheet.crop(width * 14, height * 29, width, height);
		goat_left[2] = sheet.crop(width * 15, height * 29, width, height);
		
		sheep_down = new BufferedImage[3];
		sheep_up = new BufferedImage[3];
		sheep_left = new BufferedImage[3];
		sheep_right = new BufferedImage[3];
		
		sheep_down[0] = sheet.crop(width * 16, height * 36, width, height);
		sheep_down[1] = sheet.crop(width * 17, height * 36, width, height);
		sheep_down[2] = sheet.crop(width * 18, height * 36, width, height);
		sheep_up[0] = sheet.crop(width * 16, height * 39, width, height);
		sheep_up[1] = sheet.crop(width * 17, height * 39, width, height);
		sheep_up[2] = sheet.crop(width * 18, height * 39, width, height);
		sheep_right[0] = sheet.crop(width * 16, height * 38, width, height);
		sheep_right[1] = sheet.crop(width * 17, height * 38, width, height);
		sheep_right[2] = sheet.crop(width * 18, height * 38, width, height);
		sheep_left[0] = sheet.crop(width * 16, height * 37, width, height);
		sheep_left[1] = sheet.crop(width * 17, height * 37, width, height);
		sheep_left[2] = sheet.crop(width * 18, height * 37, width, height);
		
		// Enemies
		dragon_down = new BufferedImage[3];
		dragon_up = new BufferedImage[3];
		dragon_left = new BufferedImage[3];
		dragon_right = new BufferedImage[3];
		
		dragon_down[0] = sheet.crop(width * 22, height * 22, width, height);
		dragon_down[1] = sheet.crop(width * 23, height * 22, width, height);
		dragon_down[2] = sheet.crop(width * 24, height * 22, width, height);
		dragon_up[0] = sheet.crop(width * 22, height * 25, width, height);
		dragon_up[1] = sheet.crop(width * 23, height * 25, width, height);
		dragon_up[2] = sheet.crop(width * 24, height * 25, width, height);
		dragon_right[0] = sheet.crop(width * 22, height * 24, width, height);
		dragon_right[1] = sheet.crop(width * 23, height * 24, width, height);
		dragon_right[2] = sheet.crop(width * 24, height * 24, width, height);
		dragon_left[0] = sheet.crop(width * 22, height * 23, width, height);
		dragon_left[1] = sheet.crop(width * 23, height * 23, width, height);
		dragon_left[2] = sheet.crop(width * 24, height * 23, width, height);
		
		
		death_down = new BufferedImage[3];
		death_up = new BufferedImage[3];
		death_left = new BufferedImage[3];
		death_right = new BufferedImage[3];
		
		death_down[0] = sheet.crop(0, height * 8, width * 3, (int)(height * 1.5));
		death_down[1] = sheet.crop(width * 3, height * 8, width * 3, (int)(height * 1.5));
		death_down[2] = sheet.crop(width * 6, height * 8, width * 3, (int)(height * 1.5));
		death_up[0] = sheet.crop(0, (height * 12) + 16, width * 3, (int)(height * 1.5));
		death_up[1] = sheet.crop(width * 3, (height * 12) + 16, width * 3, (int)(height * 1.5));
		death_up[2] = sheet.crop(width * 6, (height * 12) + 16, width * 3, (int)(height * 1.5));
		death_right[0] = sheet.crop(0, height * 11, width * 3, (int)(height * 1.5));
		death_right[1] = sheet.crop(width * 3, height * 11, width * 3, (int)(height * 1.5));
		death_right[2] = sheet.crop(width * 6, height * 11, width * 3, (int)(height * 1.5));
		death_left[0] = sheet.crop(0, (height * 9) + 16, width * 3, (int)(height * 1.5));
		death_left[1] = sheet.crop(width * 3, (height * 9) + 16, width * 3, (int)(height * 1.5));
		death_left[2] = sheet.crop(width * 6, (height * 9) + 16, width * 3, (int)(height * 1.5));
		
	
		waterman_down = new BufferedImage[3];
		waterman_up = new BufferedImage[3];
		waterman_left = new BufferedImage[3];
		waterman_right = new BufferedImage[3];
		
		waterman_down[0] = sheet.crop(width * 37, height * 18, width, height);
		waterman_down[1] = sheet.crop(width * 38, height * 18, width, height);
		waterman_down[2] = sheet.crop(width * 39, height * 18, width, height);
		waterman_up[0] = sheet.crop(width * 37, height * 21, width, height);
		waterman_up[1] = sheet.crop(width * 38, height * 21, width, height);
		waterman_up[2] = sheet.crop(width * 39, height * 21, width, height);
		waterman_right[0] = sheet.crop(width * 37, height * 20, width, height);
		waterman_right[1] = sheet.crop(width * 38, height * 20, width, height);
		waterman_right[2] = sheet.crop(width * 39, height * 20, width, height);
		waterman_left[0] = sheet.crop(width * 37, height * 19, width, height);
		waterman_left[1] = sheet.crop(width * 38, height * 19, width, height);
		waterman_left[2] = sheet.crop(width * 39, height * 19, width, height);
		
		shark_down = new BufferedImage[3];
		shark_up = new BufferedImage[3];
		shark_left = new BufferedImage[3];
		shark_right = new BufferedImage[3];
		
		shark_down[0] = sheet.crop(width * 37, height * 22, width, height);
		shark_down[1] = sheet.crop(width * 38, height * 22, width, height);
		shark_down[2] = sheet.crop(width * 39, height * 22, width, height);
		shark_up[0] = sheet.crop(width * 37, height * 25, width, height);
		shark_up[1] = sheet.crop(width * 38, height * 25, width, height);
		shark_up[2] = sheet.crop(width * 39, height * 25, width, height);
		shark_right[0] = sheet.crop(width * 37, height * 24, width, height);
		shark_right[1] = sheet.crop(width * 38, height * 24, width, height);
		shark_right[2] = sheet.crop(width * 39, height * 24, width, height);
		shark_left[0] = sheet.crop(width * 37, height * 23, width, height);
		shark_left[1] = sheet.crop(width * 38, height * 23, width, height);
		shark_left[2] = sheet.crop(width * 39, height * 23, width, height);
		
		bat_down = new BufferedImage[3];
		bat_up = new BufferedImage[3];
		bat_left = new BufferedImage[3];
		bat_right = new BufferedImage[3];
		
		bat_down[0] = sheet.crop(width * 37, height * 26, width, height);
		bat_down[1] = sheet.crop(width * 38, height * 26, width, height);
		bat_down[2] = sheet.crop(width * 39, height * 26, width, height);
		bat_up[0] = sheet.crop(width * 37, height * 29, width, height);
		bat_up[1] = sheet.crop(width * 38, height * 29, width, height);
		bat_up[2] = sheet.crop(width * 39, height * 29, width, height);
		bat_right[0] = sheet.crop(width * 37, height * 28, width, height);
		bat_right[1] = sheet.crop(width * 38, height * 28, width, height);
		bat_right[2] = sheet.crop(width * 39, height * 28, width, height);
		bat_left[0] = sheet.crop(width * 37, height * 27, width, height);
		bat_left[1] = sheet.crop(width * 38, height * 27, width, height);
		bat_left[2] = sheet.crop(width * 39, height * 27, width, height);
		
		greygoop_down = new BufferedImage[3];
		greygoop_up  = new BufferedImage[3];
		greygoop_left = new BufferedImage[3];
		greygoop_right = new BufferedImage[3];
		
		greygoop_down[0] = sheet.crop(width * 37, height * 30, width, height);
		greygoop_down[1] = sheet.crop(width * 38, height * 30, width, height);
		greygoop_down[2] = sheet.crop(width * 39, height * 30, width, height);
		greygoop_up[0] = sheet.crop(width * 37, height * 33, width, height);
		greygoop_up[1] = sheet.crop(width * 38, height * 33, width, height);
		greygoop_up[2] = sheet.crop(width * 39, height * 33, width, height);
		greygoop_right[0] = sheet.crop(width * 37, height * 32, width, height);
		greygoop_right[1] = sheet.crop(width * 38, height * 32, width, height);
		greygoop_right[2] = sheet.crop(width * 39, height * 32, width, height);
		greygoop_left[0] = sheet.crop(width * 37, height * 31, width, height);
		greygoop_left[1] = sheet.crop(width * 38, height * 31, width, height);
		greygoop_left[2] = sheet.crop(width * 39, height * 31, width, height);
		
		orangegoop_down = new BufferedImage[3];
		orangegoop_up = new BufferedImage[3];
		orangegoop_left = new BufferedImage[3];
		orangegoop_right = new BufferedImage[3];
		
		orangegoop_down[0] = sheet.crop(width * 37, height * 34, width, height);
		orangegoop_down[1] = sheet.crop(width * 38, height * 34, width, height);
		orangegoop_down[2] = sheet.crop(width * 39, height * 34, width, height);
		orangegoop_up[0] = sheet.crop(width * 37, height * 37, width, height);
		orangegoop_up[1] = sheet.crop(width * 38, height * 37, width, height);
		orangegoop_up[2] = sheet.crop(width * 39, height * 37, width, height);
		orangegoop_right[0] = sheet.crop(width * 37, height * 36, width, height);
		orangegoop_right[1] = sheet.crop(width * 38, height * 36, width, height);
		orangegoop_right[2] = sheet.crop(width * 39, height * 36, width, height);
		orangegoop_left[0] = sheet.crop(width * 37, height * 35, width, height);
		orangegoop_left[1] = sheet.crop(width * 38, height * 35, width, height);
		orangegoop_left[2] = sheet.crop(width * 39, height * 35, width, height);
		
		skel_down = new BufferedImage[3];
		skel_up = new BufferedImage[3];
		skel_left = new BufferedImage[3];
		skel_right = new BufferedImage[3];
		
		skel_down[0] = sheet.crop(width * 22, height * 26, width, height);
		skel_down[1] = sheet.crop(width * 23, height * 26, width, height);
		skel_down[2] = sheet.crop(width * 24, height * 26, width, height);
		skel_up[0] = sheet.crop(width * 22, height * 29, width, height);
		skel_up[1] = sheet.crop(width * 23, height * 29, width, height);
		skel_up[2] = sheet.crop(width * 24, height * 29, width, height);
		skel_right[0] = sheet.crop(width * 22, height * 28, width, height);
		skel_right[1] = sheet.crop(width * 23, height * 28, width, height);
		skel_right[2] = sheet.crop(width * 24, height * 28, width, height);
		skel_left[0] = sheet.crop(width * 22, height * 27, width, height);
		skel_left[1] = sheet.crop(width * 23, height * 27, width, height);
		skel_left[2] = sheet.crop(width * 24, height * 27, width, height);
		
		bee_down = new BufferedImage[3];
		bee_up = new BufferedImage[3];
		bee_left = new BufferedImage[3];
		bee_right = new BufferedImage[3];
		
		bee_down[0] = sheet.crop(width * 34, height * 22, width, height);
		bee_down[1] = sheet.crop(width * 35, height * 22, width, height);
		bee_down[2] = sheet.crop(width * 36, height * 22, width, height);
		bee_up[0] = sheet.crop(width * 34, height * 25, width, height);
		bee_up[1] = sheet.crop(width * 35, height * 25, width, height);
		bee_up[2] = sheet.crop(width * 36, height * 25, width, height);
		bee_right[0] = sheet.crop(width * 34, height * 24, width, height);
		bee_right[1] = sheet.crop(width * 35, height * 24, width, height);
		bee_right[2] = sheet.crop(width * 36, height * 24, width, height);
		bee_left[0] = sheet.crop(width * 34, height * 23, width, height);
		bee_left[1] = sheet.crop(width * 35, height * 23, width, height);
		bee_left[2] = sheet.crop(width * 36, height * 23, width, height);
		
		slug_down = new BufferedImage[3];
		slug_up = new BufferedImage[3];
		slug_left = new BufferedImage[3];
		slug_right = new BufferedImage[3];
		
		slug_down[0] = sheet.crop(width * 34, height * 26, width, height);
		slug_down[1] = sheet.crop(width * 35, height * 26, width, height);
		slug_down[2] = sheet.crop(width * 36, height * 26, width, height);
		slug_up[0] = sheet.crop(width * 34, height * 29, width, height);
		slug_up[1] = sheet.crop(width * 35, height * 29, width, height);
		slug_up[2] = sheet.crop(width * 36, height * 29, width, height);
		slug_right[0] = sheet.crop(width * 34, height * 28, width, height);
		slug_right[1] = sheet.crop(width * 35, height * 28, width, height);
		slug_right[2] = sheet.crop(width * 36, height * 28, width, height);
		slug_left[0] = sheet.crop(width * 34, height * 27, width, height);
		slug_left[1] = sheet.crop(width * 35, height * 27, width, height);
		slug_left[2] = sheet.crop(width * 36, height * 27, width, height);
		
		possium_down = new BufferedImage[3];
		possium_up = new BufferedImage[3];
		possium_left = new BufferedImage[3];
		possium_right = new BufferedImage[3];
		
		possium_down[0] = sheet.crop(width * 31, height * 22, width, height);
		possium_down[1] = sheet.crop(width * 32, height * 22, width, height);
		possium_down[2] = sheet.crop(width * 33, height * 22, width, height);
		possium_up[0] = sheet.crop(width * 31, height * 25, width, height);
		possium_up[1] = sheet.crop(width * 32, height * 25, width, height);
		possium_up[2] = sheet.crop(width * 33, height * 25, width, height);
		possium_right[0] = sheet.crop(width * 31, height * 24, width, height);
		possium_right[1] = sheet.crop(width * 32, height * 24, width, height);
		possium_right[2] = sheet.crop(width * 33, height * 24, width, height);
		possium_left[0] = sheet.crop(width * 31, height * 23, width, height);
		possium_left[1] = sheet.crop(width * 32, height * 23, width, height);
		possium_left[2] = sheet.crop(width * 33, height * 23, width, height);
		
		bluegoop_down = new BufferedImage[3];
		bluegoop_up = new BufferedImage[3];
		bluegoop_left = new BufferedImage[3];
		bluegoop_right = new BufferedImage[3];
		
		bluegoop_down[0] = sheet.crop(width * 31, height * 26, width, height);
		bluegoop_down[1] = sheet.crop(width * 32, height * 26, width, height);
		bluegoop_down[2] = sheet.crop(width * 33, height * 26, width, height);
		bluegoop_up[0] = sheet.crop(width * 31, height * 29, width, height);
		bluegoop_up[1] = sheet.crop(width * 32, height * 29, width, height);
		bluegoop_up[2] = sheet.crop(width * 33, height * 29, width, height);
		bluegoop_right[0] = sheet.crop(width * 31, height * 28, width, height);
		bluegoop_right[1] = sheet.crop(width * 32, height * 28, width, height);
		bluegoop_right[2] = sheet.crop(width * 33, height * 28, width, height);
		bluegoop_left[0] = sheet.crop(width * 31, height * 27, width, height);
		bluegoop_left[1] = sheet.crop(width * 32, height * 27, width, height);
		bluegoop_left[2] = sheet.crop(width * 33, height * 27, width, height);
		
		spider_down = new BufferedImage[3];
		spider_up = new BufferedImage[3];
		spider_left = new BufferedImage[3];
		spider_right = new BufferedImage[3];
		
		spider_down[0] = sheet.crop(width * 28, height * 18, width, height);
		spider_down[1] = sheet.crop(width * 29, height * 18, width, height);
		spider_down[2] = sheet.crop(width * 30, height * 18, width, height);
		spider_up[0] = sheet.crop(width * 28, height * 21, width, height);
		spider_up[1] = sheet.crop(width * 29, height * 21, width, height);
		spider_up[2] = sheet.crop(width * 30, height * 21, width, height);
		spider_right[0] = sheet.crop(width * 28, height * 20, width, height);
		spider_right[1] = sheet.crop(width * 29, height * 20, width, height);
		spider_right[2] = sheet.crop(width * 30, height * 20, width, height);
		spider_left[0] = sheet.crop(width * 28, height * 19, width, height);
		spider_left[1] = sheet.crop(width * 29, height * 19, width, height);
		spider_left[2] = sheet.crop(width * 30, height * 19, width, height);
		
		kingSkel_down = new BufferedImage[3];
		kingSkel_up = new BufferedImage[3];
		kingSkel_left = new BufferedImage[3];
		kingSkel_right = new BufferedImage[3];
		
		kingSkel_down[0] = sheet.crop(width * 28, height * 26, width, height);
		kingSkel_down[1] = sheet.crop(width * 29, height * 26, width, height);
		kingSkel_down[2] = sheet.crop(width * 30, height * 26, width, height);
		kingSkel_up[0] = sheet.crop(width * 28, height * 29, width, height);
		kingSkel_up[1] = sheet.crop(width * 29, height * 29, width, height);
		kingSkel_up[2] = sheet.crop(width * 30, height * 29, width, height);
		kingSkel_right[0] = sheet.crop(width * 28, height * 28, width, height);
		kingSkel_right[1] = sheet.crop(width * 29, height * 28, width, height);
		kingSkel_right[2] = sheet.crop(width * 30, height * 28, width, height);
		kingSkel_left[0] = sheet.crop(width * 28, height * 27, width, height);
		kingSkel_left[1] = sheet.crop(width * 29, height * 27, width, height);
		kingSkel_left[2] = sheet.crop(width * 30, height * 27, width, height);
		
		sludgeMan_down = new BufferedImage[3];
		sludgeMan_up = new BufferedImage[3];
		sludgeMan_left = new BufferedImage[3];
		sludgeMan_right = new BufferedImage[3];
		
		sludgeMan_down[0] = sheet.crop(width * 25, height * 18, width, height);
		sludgeMan_down[1] = sheet.crop(width * 26, height * 18, width, height);
		sludgeMan_down[2] = sheet.crop(width * 27, height * 18, width, height);
		sludgeMan_up[0] = sheet.crop(width * 25, height * 21, width, height);
		sludgeMan_up[1] = sheet.crop(width * 26, height * 21, width, height);
		sludgeMan_up[2] = sheet.crop(width * 27, height * 21, width, height);
		sludgeMan_right[0] = sheet.crop(width * 25, height * 20, width, height);
		sludgeMan_right[1] = sheet.crop(width * 26, height * 20, width, height);
		sludgeMan_right[2] = sheet.crop(width * 27, height * 20, width, height);
		sludgeMan_left[0] = sheet.crop(width * 25, height * 19, width, height);
		sludgeMan_left[1] = sheet.crop(width * 26, height * 19, width, height);
		sludgeMan_left[2] = sheet.crop(width * 27, height * 19, width, height);
		
		rat_down = new BufferedImage[3];
		rat_up = new BufferedImage[3];
		rat_left = new BufferedImage[3];
		rat_right = new BufferedImage[3];
		
		rat_down[0] = sheet.crop(width * 25, height * 22, width, height);
		rat_down[1] = sheet.crop(width * 26, height * 22, width, height);
		rat_down[2] = sheet.crop(width * 27, height * 22, width, height);
		rat_up[0] = sheet.crop(width * 25, height * 25, width, height);
		rat_up[1] = sheet.crop(width * 26, height * 25, width, height);
		rat_up[2] = sheet.crop(width * 27, height * 25, width, height);
		rat_right[0] = sheet.crop(width * 25, height * 24, width, height);
		rat_right[1] = sheet.crop(width * 26, height * 24, width, height);
		rat_right[2] = sheet.crop(width * 27, height * 24, width, height);
		rat_left[0] = sheet.crop(width * 25, height * 23, width, height);
		rat_left[1] = sheet.crop(width * 26, height * 23, width, height);
		rat_left[2] = sheet.crop(width * 27, height * 23, width, height);
		
		plant_down = new BufferedImage[3];
		plant_up = new BufferedImage[3];
		plant_left = new BufferedImage[3];
		plant_right = new BufferedImage[3];
		
		plant_down[0] = sheet.crop(width * 25, height * 26, width, height);
		plant_down[1] = sheet.crop(width * 26, height * 26, width, height);
		plant_down[2] = sheet.crop(width * 27, height * 26, width, height);
		plant_up[0] = sheet.crop(width * 25, height * 29, width, height);
		plant_up[1] = sheet.crop(width * 26, height * 29, width, height);
		plant_up[2] = sheet.crop(width * 27, height * 29, width, height);
		plant_right[0] = sheet.crop(width * 25, height * 28, width, height);
		plant_right[1] = sheet.crop(width * 26, height * 28, width, height);
		plant_right[2] = sheet.crop(width * 27, height * 28, width, height);
		plant_left[0] = sheet.crop(width * 25, height * 27, width, height);
		plant_left[1] = sheet.crop(width * 26, height * 27, width, height);
		plant_left[2] = sheet.crop(width * 27, height * 27, width, height);
		
		fish_down = new BufferedImage[3];
		fish_up = new BufferedImage[3];
		fish_left = new BufferedImage[3];
		fish_right = new BufferedImage[3];
		
		fish_down[0] = sheet.crop(width * 22, height * 34, width, height);
		fish_down[1] = sheet.crop(width * 23, height * 34, width, height);
		fish_down[2] = sheet.crop(width * 24, height * 34, width, height);
		fish_up[0] = sheet.crop(width * 22, height * 37, width, height);
		fish_up[1] = sheet.crop(width * 23, height * 37, width, height);
		fish_up[2] = sheet.crop(width * 24, height * 37, width, height);
		fish_right[0] = sheet.crop(width * 22, height * 36, width, height);
		fish_right[1] = sheet.crop(width * 23, height * 36, width, height);
		fish_right[2] = sheet.crop(width * 24, height * 36, width, height);
		fish_left[0] = sheet.crop(width * 22, height * 35, width, height);
		fish_left[1] = sheet.crop(width * 23, height * 35, width, height);
		fish_left[2] = sheet.crop(width * 24, height * 35, width, height);
		
		fox_down = new BufferedImage[3];
		fox_up = new BufferedImage[3];
		fox_left = new BufferedImage[3];
		fox_right = new BufferedImage[3];
		
		fox_down[0] = sheet.crop(width * 15, height * 32, width, height);
		fox_down[1] = sheet.crop(width * 16, height * 32, width, height);
		fox_down[2] = sheet.crop(width * 17, height * 32, width, height);
		fox_up[0] = sheet.crop(width * 15, height * 35, width, height);
		fox_up[1] = sheet.crop(width * 16, height * 35, width, height);
		fox_up[2] = sheet.crop(width * 17, height * 35, width, height);
		fox_right[0] = sheet.crop(width * 15, height * 34, width, height);
		fox_right[1] = sheet.crop(width * 16, height * 34, width, height);
		fox_right[2] = sheet.crop(width * 17, height * 34, width, height);
		fox_left[0] = sheet.crop(width * 15, height * 33, width, height);
		fox_left[1] = sheet.crop(width * 16, height * 33, width, height);
		fox_left[2] = sheet.crop(width * 17, height * 33, width, height);
		
		
		//teleport
		teleport = new BufferedImage[8];
		teleport[0] = sheet.crop(0, height * 6, width, height);
		teleport[1] = sheet.crop(width, height * 6, width, height);
		teleport[2] = sheet.crop(width * 2, height * 6, width, height);
		teleport[3] = sheet.crop(width * 3, height * 6, width, height);
		teleport[4] = sheet.crop(0, height * 7, width, height);
		teleport[5] = sheet.crop(width, height * 7, width, height);
		teleport[6] = sheet.crop(width * 2, height * 7, width, height);
		teleport[7] = sheet.crop(width * 3, height * 7, width, height);

		// Short Grass to dirt
		SpriteSheet tiles = new SpriteSheet(ImageLoader.loadImage("/textures/Tiles.png"));
		
		crumble = new BufferedImage [4];
		
		crumble [0] = tiles.crop(width * 14, height * 6, width, height);
		crumble [1] = tiles.crop(width * 15, height * 6, width, height);
		crumble [2] = tiles.crop(width * 16, height * 6, width, height);
		crumble [3] = tiles.crop(width * 17, height * 6, width, height);

		sgdN = tiles.crop(width * 8, 0, width, height);
		sgdNW = tiles.crop(width * 7, 0, width, height);
		sgdNE = tiles.crop(width * 9, 0, width, height);
		sgdW = tiles.crop(width * 7, height, width, height);
		sgdE = tiles.crop(width * 9, height, width, height);
		sgdS = tiles.crop(width * 8, height * 2, width, height);
		sgdSW = tiles.crop(width * 7, height * 2, width, height);
		sgdSE = tiles.crop(width * 9, height * 2, width, height);

		// Dirt to pavement
		fpN = tiles.crop(width * 8, height * 3, width, height);
		fpNW = tiles.crop(width * 7, height * 3, width, height);
		fpNE = tiles.crop(width * 9, height * 3, width, height);
		fpW = tiles.crop(width * 7, height * 4, width, height);
		fpE = tiles.crop(width * 9, height * 4, width, height);
		fpS = tiles.crop(width * 8, height * 5, width, height);
		fpSW = tiles.crop(width * 7, height * 5, width, height);
		fpSE = tiles.crop(width * 9, height * 5, width, height);
		fpTNW = tiles.crop(width * 13, height, width, height);
		fpTNE = tiles.crop(width * 14, height, width, height);
		fpTSW = tiles.crop(width * 13, height * 2, width, height);
		fpTSE = tiles.crop(width * 14, height * 2, width, height);

		// Short Grass to flowers
		fgN = tiles.crop(width * 11, 0, width, height);
		fgNW = tiles.crop(width * 10, 0, width, height);
		fgNE = tiles.crop(width * 12, 0, width, height);
		fgW = tiles.crop(width * 10, height, width, height);
		fgE = tiles.crop(width * 12, height, width, height);
		fgS = tiles.crop(width * 11, height * 2, width, height);
		fgSW = tiles.crop(width * 10, height * 2, width, height);
		fgSE = tiles.crop(width * 12, height * 2, width, height);

		// Grass to pavement
		gpN = tiles.crop(width * 11, height * 3, width, height);
		gpNW = tiles.crop(width * 10, height * 3, width, height);
		gpNE = tiles.crop(width * 12, height * 3, width, height);
		gpW = tiles.crop(width * 10, height * 4, width, height);
		gpE = tiles.crop(width * 12, height * 4, width, height);
		gpS = tiles.crop(width * 11, height * 5, width, height);
		gpSW = tiles.crop(width * 10, height * 5, width, height);
		gpSE = tiles.crop(width * 12, height * 5, width, height);
		gpTNW = tiles.crop(width * 13, height * 3, width, height);
		gpTNE = tiles.crop(width * 14, height * 3, width, height);
		gpTSW = tiles.crop(width * 13, height * 4, width, height);
		gpTSE = tiles.crop(width * 14, height * 4, width, height);
		
		//Pave to dirt
		PDN = tiles.crop(width * 14, 0, width, height);
		PDNW = tiles.crop(width * 13, 0, width, height);
		PDNE = tiles.crop(width * 15, 0, width, height);

		// Plain Tiles
		dirt = tiles.crop(width * 8, height, width, height);
		shortGrass = tiles.crop(width * 6, 0, width, height);
		longGrass = tiles.crop(width * 6, height, width, height);
		pave = tiles.crop(width * 8, height * 4, width, height);
		bgWater = tiles.crop(width * 6, height * 2, width, height);
		waterRock = tiles.crop(width * 6, height * 3, width, height);
		rock = tiles.crop(width * 6, height * 4, width, height);
		
		//Trees
		tcNW = tiles.crop(width * 2, 0, width, height);
		tcNE = tiles.crop(width * 3, 0, width, height);
		tcSW = tiles.crop(width * 2, height, width, height);
		tcSE = tiles.crop(width * 3, height, width, height);
		tfNW = tiles.crop(width * 4, 0, width, height);
		tfNE = tiles.crop(width * 5, 0, width, height);
		tfSW = tiles.crop(width * 4, height, width, height);
		tfSE = tiles.crop(width * 5, height, width, height);
		
		//other
		treeBG = tiles.crop(width * 8, height * 8, width, height);
		branch = tiles.crop(width * 6, height * 6, width, height);
		treeTop = tiles.crop(width * 7, height * 6, width, height);
		dFloor = tiles.crop(width * 5, height * 8, width, height);
		dwN = tiles.crop(width * 5, height * 7, width, height);
		dwNW = tiles.crop(width * 4, height * 7, width, height);
		dwNE = tiles.crop(width * 6, height * 7, width, height);
		dwW = tiles.crop(width * 4, height * 8, width, height);
		dwE = tiles.crop(width * 6, height * 8, width, height);
		dwS = tiles.crop(width * 5, height * 9, width, height);
		dwSW = tiles.crop(width * 4, height * 9, width, height);
		dwSE = tiles.crop(width * 6, height * 9, width, height);
		wNW = tiles.crop(width * 10, height * 6, width, height);
		wNE = tiles.crop(width * 11, height * 6, width, height);
		wSW = tiles.crop(width * 10, height * 7, width, height);
		wSE = tiles.crop(width * 11, height * 7, width, height);
		floor = tiles.crop(width * 13, height * 6, width, height);
		block = tiles.crop(width * 12, height * 6, width, height);
		glassFloor = tiles.crop(width * 2, height * 2, width, height);

		// Trees

		// Floors
		redCarpet = tiles.crop(0, height * 10, width, height);
		verWood = tiles.crop(0, height * 11, width, height);
		horWood = tiles.crop(width, height * 11, width, height);
		plateWood = tiles.crop(width, height * 12, width, height);
		blank = tiles.crop(0, height * 12, width, height);
		insideDoor = tiles.crop(width, height * 10, width, height);

		// Walls
		w1TopLef = tiles.crop(0, height * 13, width, height);
		w1TopMid = tiles.crop(0 + 16, height * 13, width, height);
		w1TopRig = tiles.crop(width, height * 13, width, height);
		w1BotLef = tiles.crop(0, height * 14, width, height);
		w1BotMid = tiles.crop(0 + 16, height * 14, width, height);
		w1BotRig = tiles.crop(width, height * 14, width, height);

		w2TopLef = tiles.crop(width * 2, height * 13, width, height);
		w2TopMid = tiles.crop((width * 2) + 16, height * 13, width, height);
		w2TopRig = tiles.crop(width * 3, height * 13, width, height);
		w2BotLef = tiles.crop(width * 2, height * 14, width, height);
		w2BotMid = tiles.crop((width * 2) + 16, height * 14, width, height);
		w2BotRig = tiles.crop(width * 3, height * 14, width, height);

		w3TopLef = tiles.crop(width * 4, height * 13, width, height);
		w3TopMid = tiles.crop((width * 4) + 16, height * 13, width, height);
		w3TopRig = tiles.crop(width * 5, height * 13, width, height);
		w3BotLef = tiles.crop(width * 4, height * 14, width, height);
		w3BotMid = tiles.crop((width * 4) + 16, height * 14, width, height);
		w3BotRig = tiles.crop(width * 5, height * 14, width, height);

		w4TopLef = tiles.crop(width * 6, height * 13, width, height);
		w4TopMid = tiles.crop((width * 6) + 16, height * 13, width, height);
		w4TopRig = tiles.crop(width * 7, height * 13, width, height);
		w4BotLef = tiles.crop(width * 6, height * 14, width, height);
		w4BotMid = tiles.crop((width * 6) + 16, height * 14, width, height);
		w4BotRig = tiles.crop(width * 7, height * 14, width, height);

		b1Top = tiles.crop((width * 2) + 16, height * 11, width, height);
		b1Bot = tiles.crop((width * 2) + 16, height * 12, width, height);
		b1Left = tiles.crop(width * 2, (height * 11) + 16, width, height);
		b1Right = tiles.crop(width * 3, (height * 11) + 16, width, height);
		b1TR = tiles.crop(width * 3, height * 11, width, height);
		b1BR = tiles.crop(width * 3, height * 12, width, height);
		b1BL = tiles.crop(width * 2, height * 12, width, height);
		b1TL = tiles.crop(width * 2, height * 11, width, height);

		b2Top = tiles.crop((width * 4) + 16, height * 11, width, height);
		b2Bot = tiles.crop((width * 4) + 16, height * 13, width, height);
		b2Left = tiles.crop(width * 4, height * 12, width, height);
		b2Right = tiles.crop(width * 5, height * 12, width, height);
		b2TR = tiles.crop(width * 5, height * 11, width, height);
		b2BR = tiles.crop(width * 5, height * 13, width, height);
		b2BL = tiles.crop(width * 4, height * 13, width, height);
		b2TL = tiles.crop(width * 4, height * 11, width, height);

		b3Top = tiles.crop((width * 6) + 16, height * 11, width, height);
		b3Bot = tiles.crop((width * 6) + 16, height * 13, width, height);
		b3Left = tiles.crop(width * 6, height * 12, width, height);
		b3Right = tiles.crop(width * 7, height * 12, width, height);
		b3TR = tiles.crop(width * 7, height * 11, width, height);
		b3BR = tiles.crop(width * 7, height * 13, width, height);
		b3BL = tiles.crop(width * 6, height * 13, width, height);
		b3TL = tiles.crop(width * 6, height * 11, width, height);
		
		//Dungeon Doors
		dungeonDoorLUp = tiles.crop(width * 11, height * 8, width, height);
		dungeonDoorLDown = tiles.crop(width * 11, height * 10, width, height);
		dungeonDoorLRight = tiles.crop(width * 12, height * 9, width, height);
		dungeonDoorLLeft = tiles.crop(width * 10, height * 9, width, height);
		dungeonDoorUUp = tiles.crop(width * 14, height * 8, width, height);
		dungeonDoorUDown = tiles.crop(width * 14, height * 10, width, height);
		dungeonDoorURight = tiles.crop(width * 15, height * 9, width, height);
		dungeonDoorULeft = tiles.crop(width * 13, height * 9, width, height);
		bossDoor= tiles.crop(width * 10, height * 10, width, height);

		// Display
		heartFull = sheet.crop(width * 25, height * 39, (width / 2), height / 2);
		heartEmpty = sheet.crop(width * 25, (height * 39) + 16, width / 2, height / 2);
		airBubbleEmpty = sheet.crop(width * 26, height * 39, width, height);
		airBubbleFull = sheet.crop(width * 27, height * 39, width, height);
		

		// Items
		key = sheet.crop((width * 24) + 16, height * 39, width/2, height/2);
		bossKey = sheet.crop(width * 24, height * 39, width/2, height/2);
		
		SpriteSheet prop = new SpriteSheet(ImageLoader.loadImage("/textures/Props.png"));
		chestOpen = sheet.crop(width * 26, height * 38, width, height);
		chestClosed = sheet.crop(width * 25, height * 38, width, height);
		schestOpen = sheet.crop(width * 22, height * 38, width, height);
		schestClosed = sheet.crop(width * 23, height * 38, width, height);
		potion = sheet.crop(width * 27, height * 38, width, height);
		selectionBox = sheet.crop(width * 28, height * 38, width, height);
		textBox = prop.crop(width * 8, height * 31, width * 16, height * 4);
		
		
		
		deadTree1 = tiles.crop(0, 0, width * 2, height * 2);
		treeCluster = tiles.crop(width * 2, 0, width * 2, height * 2);
		treeFull = tiles.crop(width * 4, 0, width * 2, height * 2);
		glassFloor = tiles.crop(width * 2, height * 2, width, height);
		deadTree2 = tiles.crop(width * 2, height * 6, width, height *2);
		pdN = tiles.crop(width * 14, 0, width, height);
		pdNw = tiles.crop(width * 13, 0, width, height);
		pdNE = tiles.crop(width * 15, 0, width, height);
		tlCorner = tiles.crop(width * 2, height * 10,(int)(width * .5),(int)(height * .5));
		trCorner = tiles.crop((width * 2) + 16, height * 10,(int)(width * .5),(int)(height * .5));
		blCorner = tiles.crop(width * 2, (height * 10) + 16,(int)(width * .5),(int)(height * .5));
		brCorner = tiles.crop((width * 2) + 16, (height* 10) + 16,(int)(width * .5),(int)(height * .5));
		wallUp = tiles.crop(width * 8, height * 9, width, height * 11);
		wallDown = tiles.crop(width * 9, height * 9, width, height * 11);
		field  = tiles.crop(width * 14, height * 14, width * 6, height * 6);
		doubleBedPink = prop.crop(0, 0, width * 2, height * 2);
		doubleBedBrown  = prop.crop(width * 2, 0, width * 2, height * 2);
		doubleBedBlue = prop.crop(0, height * 2, width * 2, height * 2);
		doubleBedOrange = prop.crop(width * 2, height * 2, width * 2, height * 2);
		doubleBedlBlue = prop.crop(0, height * 4, width * 2, height * 2);
		doubleBedPurple = prop.crop(width * 2, height * 4, width * 2, height * 2);
		canopyBed = prop.crop(width * 4, 0, width * 2, height * 3);
		bunkBed = prop.crop(width * 4, height * 3, width * 2, height * 3);
		redBed = prop.crop(width * 6, 0, width, height * 2);
		tanBed = prop.crop(width * 7, 0, width, height * 2);
		greenBed = prop.crop(width * 8, 0, width, height * 2);
		pinkBed = prop.crop(width * 9, 0, width, height * 2);
		redPuffBed = prop.crop(width * 6, height * 2, width, height * 2);
		bluePuffBed = prop.crop(width * 7, height * 2, width, height * 2);
		blueBed = prop.crop(width * 8, height * 2, width, height * 2);
		greenLineBed = prop.crop(width * 6, height * 4, width, height * 3);
		blueLineBed = prop.crop(width * 7, height * 4, width, height * 3);
		purpleLineBed = prop.crop(width * 9, height * 4, width, height * 3);
		wardrobe1 = prop.crop(width * 10, 0, width, height * 2);
		wardrobe2 = prop.crop(width * 14, height * 2, width, height * 2);
		shelf1 = prop.crop(width * 11, 0, width, height * 2);
		shelf2 = prop.crop(width * 12, 0, width, height * 2);
		shelf3 = prop.crop(width * 13, 0, width, height * 2);
		shelf4 = prop.crop(width * 14, 0, width, height * 2);
		shelf5 = prop.crop(width* 13, height * 2, width, height * 2);
		shelf6 = prop.crop(width * 15, height * 2, width * 2, height * 2);
		shelf7 = prop.crop(width * 17, height * 2, width * 2, height * 2);
		shelf8 = prop.crop(width * 13, height * 4, width, height * 2);
		shelf9 = prop.crop(width * 14, height * 4, width, height * 2);
		shelf10 = prop.crop(width * 15, height * 4, width * 2, height * 2);
		shelf11 = prop.crop(width * 17, height * 4, width * 2, height * 2);
		shelf12 = prop.crop(width * 13, height * 6, width, height * 2);
		shelf13 = prop.crop(width * 14,  height * 6, width, height* 2);
		shelf14 = prop.crop(width * 15, height * 6, width * 2, height * 2);
		shelf15 = prop.crop(width * 17, height * 6, width * 2, height * 2);
		wallShelf1 = prop.crop(width * 11, height * 2, width, height);
		wallShelf2 = prop.crop(width * 12, height * 2, width, height);
		wallShelf3 = prop.crop(width * 10, height * 3, width, height);
		wallShelf4 = prop.crop(width * 11, height * 3, width, height);
		wallShelf5 = prop.crop(width * 12, height * 3, width, height);
		wallShelf6 = prop.crop(width * 10, height * 4, width, height);
		wallShelf7 = prop.crop(width * 11, height * 4, width, height);
		wallShelf8 = prop.crop(width * 12, height * 4, width, height);
		dresserTall = prop.crop(width * 13, 0, width, height);
		dresserShort = prop.crop(width * 14, 0, width, height);
		shelfSide = prop.crop(width * 11, height * 5, width, height * 3);
		woodChairUp = prop.crop(width * 2, height * 7, width, height * 2);
		woodChairDown = prop.crop(width, height * 7, width, height * 2);
		woodChairLeft = prop.crop(width * 4, height * 7, width, height * 2);
		woodChairRight = prop.crop(width * 3, height * 7, width, height * 2);
		padChairUp = prop.crop(width * 4, height * 12, width, height);
		padChairDown = prop.crop(width * 3, height * 12, width, height);
		padChairLeft = prop.crop(width * 4, height * 13, width, height);
		padChairRight = prop.crop(width * 3, height * 13, width, height);
		chairUp = prop.crop(width * 4, height * 10, width, height);
		chairDown = prop.crop(width, height * 9, width, height * 2);
		chairLeft = prop.crop(width * 5, height * 10, width, height * 2);
		chairRight = prop.crop(width * 8, height * 10, width, height * 2);
		couch1Up = prop.crop(width * 4, height * 9, width * 2, height);
		couch1Down = prop.crop(width * 2, height * 9, width * 2, height * 2);
		couch1Left = prop.crop(width * 6, height * 9, width, height * 3);
		couch1Right = prop.crop(width * 7, height * 9, width, height * 3);
		couch2Left = prop.crop(width * 7, height * 12, width, height * 3);
		couch2Right = prop.crop(width * 8, height * 12, width, height * 3);
		tableWithMirror1 = prop.crop(width * 5, height * 12, width, height * 2);
		tableWithMirror2 = prop.crop(width, height * 15, width, height);
		sideTable = prop.crop(width * 6, height * 13, width, height);
		roundWoodStool = prop.crop(width, height * 14, width, height);
		padRoundStool = prop.crop(width * 2, height * 14, width, height);
		squareStool = prop.crop(width * 3, height * 14, width, height);
		tableFlowers1 = prop.crop(width * 2, height * 15, width, height);
		tableWashBowl1 = prop.crop(0, height * 16, width, height);
		tableWashBowl2 = prop.crop(width * 2, height * 16, width, height);
		tableMail = prop.crop(width * 4, height * 15, width, height);
		tableMap = prop.crop(width * 6, height * 15, width, height);
		tableBook = prop.crop(width * 7, height * 15, width, height);
		tableFood = prop.crop(width * 8, height * 15, width, height);
		tablePresents = prop.crop(width * 8, height * 16, width, height);
		tableToys  = prop.crop(width * 7, height * 16, width, height);
		tableFlowers = prop.crop(width * 6, height * 16, width, height);
		tableCoffee = prop.crop(width * 5, height * 16, width, height);
		tableClothes = prop.crop(width * 4, height * 16, width, height);
		tableMedicines  = prop.crop(width * 3, height * 19, width, height);
		carpTable  = prop.crop(width * 4, height * 19, width * 3, height * 2);
		deskBooks  = prop.crop(0, height * 17, width, height * 2);
		desksPaper  = prop.crop(width, height * 17, width, height * 2);
		rope  = prop.crop(0, height * 19, width, height);
		bag = prop.crop(width, height * 19, width, height);
		dTable1  = prop.crop(width * 9, height * 8, width * 2, height * 2);
		dTable2 = prop.crop(width * 9, height * 10, width * 2, height * 2);
		dTable3 = prop.crop(width * 9, height * 12, width * 2, height * 2);
		dTable4  = prop.crop(width * 9, height * 14, width * 2, height * 2);
		moonPic = prop.crop(width * 11, height * 8, width * 2, height);
		wheatPic = prop.crop(width * 11, height * 9, width * 2, height);
		flowerPic1  = prop.crop(width * 13, height * 8, width, height);
		applePic = prop.crop(width * 14, height * 8, width, height);
		princePic = prop.crop(width * 13, height * 9, width, height);
		princessPic = prop.crop(width * 14, height * 9, width, height);
		inscript1  = prop.crop(width * 11, height * 10, width * 2, height);
		inscript2  = prop.crop(width * 15, height * 11, width, height);
		plate  = prop.crop(width * 15, height * 10, width, height);
		mirror1 = prop.crop(width * 15, height * 8, width, height * 2);
		mirror2  = prop.crop(width * 16, height * 8, width, height * 2);
		mirror3 = prop.crop(width * 14, height * 10, width, height * 2);
		kingPic = prop.crop(width * 12, height * 11, width, height);
		candle = prop.crop(width * 11, height * 11, width, height);
		clock1 = prop.crop(width * 13, height * 10, width, height * 2);
		clock2 = prop.crop(width * 16, height * 10, width, height);
		chandler = prop.crop(width * 17, height * 8, width, height * 2);
		plant1 = prop.crop(width * 18, height * 8, width, height * 2);
		plant2 = prop.crop(width * 19, height * 8, width, height * 2);
		map = prop.crop(width * 17, height * 10, width * 2, height);
		ladyPic = prop.crop(width * 19, height * 10, width * 2, height);
		manPic = prop.crop(width * 17, height * 11, width, height);
		flowerPic2 = prop.crop(width * 19, height * 11, width, height);
		messageBoard = prop.crop(width * 17, height * 12, width, height);
		windowCurtainClosed = prop.crop(width * 16, height * 12, width, height * 2);
		windowCurtainOpen = prop.crop(width * 15, height * 12, width, height * 2);
		windowLight = prop.crop(width * 14, height * 12, width, height);
		window = prop.crop(width * 13, height * 12, width, height);
		shirt1 = prop.crop(width * 19, 0, width, height);
		shirt2 = prop.crop(width * 20, 0, width, height);
		shirt3 = prop.crop(width * 22, height, width, height);
		shirt4 = prop.crop(width * 23, height, width, height);
		shirt5 = prop.crop(width * 19, height * 3, width, height);
		shirt6 = prop.crop(width * 20, height * 3, width, height);
		boxCloths = prop.crop(width * 21, 0, width, height);
		hat1 = prop.crop(width * 19, height * 2, width, height);
		hat2 = prop.crop(width * 20, height * 2, width, height);
		hat3 = prop.crop(width * 21, height * 2, width, height);
		dress1 = prop.crop(width * 22, height, width, height);
		dress2 = prop.crop(width * 23, height, width, height);
		dress3 = prop.crop(width * 22, height * 2, width, height);
		dress4 = prop.crop(width  * 23, height  * 2, width, height);
		dress5 = prop.crop(width * 23, height * 3, width, height);
		coat = prop.crop(width * 22, height * 3, width, height);
		cloak = prop.crop(width * 21, height * 3, width, height);
		bakerOven = prop.crop(width * 19, height * 5, width * 2, height * 3);
		paddleBoards = prop.crop(width * 21, height * 7, width, height);
		sugarBag = prop.crop(width * 21, height * 9, width, height);
		flourBag = prop.crop(width * 21, height * 10, width, height);
		basket1 = prop.crop(width * 21, height * 13, width, height);
		basket2 = prop.crop(width * 22, height * 13, width, height);
		cake = prop.crop(width * 20, height * 12, width, height);
		bakerCounter = prop.crop(width * 18, height * 13, width * 2, height);
		breadShelf1 = prop.crop(width * 16, height * 14, width, height * 3);
		breadShelf2 = prop.crop(width * 17, height * 14, width * 2, height * 3);
		breadShelf3 = prop.crop(width * 19, height * 14, width * 2, height * 3);
		breadShelf4 = prop.crop(width * 21, height * 14, width * 2, height * 3);
		barrels = prop.crop(width  * 20, height  * 17, width * 2, height * 2);
		potCovered = prop.crop(width * 21, height * 17, width, height);
		pot  = prop.crop(width * 20, height * 20, width, height);
		basketEmpty = prop.crop(width * 22, height * 20, width, height);
		basketFull = prop.crop(width * 23, height * 20, width, height);
		boxes = prop.crop(width * 16, height * 20, width * 4, height * 2);
		bags = prop.crop(width * 19, height * 24, width, height);
		bucket = prop.crop(width * 9, height * 24, width, height);
		bucketWater = prop.crop(width * 10, height * 24, width, height);
		bucketHat = prop.crop(width * 11, height * 24, width, height);
		sacks = prop.crop(width * 14, height * 21, width, height * 2);
		openSack = prop.crop(width * 13, height * 22, width, height);
		messageBoard2 = prop.crop(width * 16, height * 23, width * 2, height * 2);
		cart = prop.crop(width * 14, height * 26, width * 2, height * 2);
		well = prop.crop(width * 12, height * 26, width * 2, height * 3);
		caldren = prop.crop(width * 10, height * 25, width, height);
		messageBoard3 = prop.crop(width * 10, height * 26, width, height * 2);
		outhouse = prop.crop(width * 9, height * 26, width, height * 2);
		washBucket = prop.crop(width * 9, height * 22, width, height);
		chestSide = prop.crop(width * 11, height * 20, width, height * 2);
		clothesLine = prop.crop(0, height * 22, width * 2, height);
		clTowels = prop.crop(width * 2, height * 22, width, height);
		clPants = prop.crop(width * 3, height * 22, width, height);
		clBlankets = prop.crop(width * 4, height * 22, width, height);
		carpSign = prop.crop(0, height * 23, width, height);
		tailorSign  = prop.crop(width, height * 23, width, height);
		traderSign = prop.crop(width * 2, height * 23, width, height);
		bakerSign = prop.crop(0, height * 24, width, height);
		shopSign = prop.crop(width, height * 24, width, height);
		cobblerSign = prop.crop(width * 2, height * 24, width, height);
		riddleBoard = prop.crop(width * 6, height * 23, width, height);
		rug1 = prop.crop(width * 3, height * 24, width * 2, height * 2);
		rug2 = prop.crop(width * 3, height * 26, width * 2, height * 2);
		rug3 = prop.crop(width * 5, height * 24, width * 2, height * 2);
		rug4  = prop.crop(width * 5, height * 26, width * 2, height * 2);
		stairsUp = prop.crop(width * 7, height * 26, width, height * 2);
		stairsDown = prop.crop(width * 7, height * 25, width, height);
		
		counter1 = prop.crop(0, height * 25, width * 2, height);
		counter2 = prop.crop(0, height * 26, width * 2, height);
		counter3 = prop.crop(0, height * 27, width * 2, height);
		counter4 = prop.crop(width, height * 28, width * 3, height);
		oven = prop.crop(0, height * 28, width, height);
		stove = prop.crop(0, height * 29, width * 2, height * 2);
		logs1 = prop.crop(width * 2, height * 29, width, height);
		logs2 = prop.crop(width * 3, height * 29, width, height);
		logs3 = prop.crop(width * 4, height * 29, width, height);
		cross1 = prop.crop(width * 4, height * 28, width, height);
		cross2 = prop.crop(width * 5, height * 28, width, height);
		memorial = prop.crop(width * 6, height * 28, width, height);
		headStone = prop.crop(width * 7, height * 28, width, height);
		sawHorse1 = prop.crop(width * 5, height * 29, width, height);
		sawHorse2 = prop.crop(width * 6, height * 29, width, height);
		hay1 = prop.crop(width * 3, height * 31, width * 2, height * 2);
		hay2 = prop.crop(0, height * 34, width, height);
		scarecrow1 = prop.crop(0, height * 33, width, height);
		scarecrow2 = prop.crop(width * 3, height * 33, width, height * 2);
		trophWater = prop.crop(width * 5, height * 31, width * 2, height);
		tropHay = prop.crop(width * 5, height * 32, width * 2, height);
		shovel = prop.crop(width * 4, height * 34, width, height);
		rope2 = prop.crop(width * 4, height * 34, width, height);
		cape = prop.crop(width * 8, height * 27, width, height);
		bear = prop.crop(width * 9, height * 27, width, height);
		bagT = prop.crop(width * 10, height * 27, width, height);
		tapestry = prop.crop(width * 11, height * 27, width, height);
		Dress = prop.crop(width * 8, height * 28, width, height);
		cookies = prop.crop(width * 9, height * 28, width, height);
		vegtables = prop.crop(width * 10, height * 28, width, height);
		bottle = prop.crop(width * 11, height * 28, width, height);
		book = prop.crop(width * 11, height * 29, width, height);
		recipe = prop.crop(width * 8, height * 29, width, height);
		portrait = prop.crop(width * 9, height * 29, width, height);
		
		riddleBoard = prop.crop(width * 6, height * 23, width, height);
		stairUp  = prop.crop(width * 7, height * 26, width, height * 2);
		stairDown = prop.crop(width * 7, height * 25, width, height);
		inventory = prop.crop(width * 8, height * 26, width, height);
		
		SpriteSheet riddles = new SpriteSheet(ImageLoader.loadImage("/textures/Riddles.png"));
		riddle1 = riddles.crop(0, 0, width* 16, height* 12);
		riddle2 = riddles.crop(width * 16, 0, width* 16, height* 12);
		riddle3 = riddles.crop(width * 32, 0, width* 16, height* 12);
		riddle4 = riddles.crop(0, height * 12, width* 16, height* 12);
		riddle5 = riddles.crop(width * 16, height * 12, width* 16, height* 12);
		riddle6 = riddles.crop(width * 32, height * 12, width* 16, height* 12);
		riddle7 = riddles.crop(0, height * 24, width* 16, height* 12);
		riddle8 = riddles.crop(width * 16, height * 24, width* 16, height* 12);
		riddle9 = riddles.crop(width * 32, height * 24, width* 16, height* 12);
		riddle10 = riddles.crop(0, height * 36, width* 16, height* 12);
		riddle11 = riddles.crop(width * 16, height * 36, width* 16, height* 12);
		riddle12 = riddles.crop(width * 32, height * 36, width* 16, height* 12);
		riddle13 = riddles.crop(0, height * 48, width* 16, height* 12);
		riddle14 = riddles.crop(width * 16, height * 48, width* 16, height* 12);
		riddle15 = riddles.crop(width * 32, height * 48, width* 16, height* 12);
		

		// Tokens
		tBlank = sheet.crop(width * 29, height * 38, width, height * 2);
		t1 = sheet.crop(width * 39, height * 38, width, height * 2);
		t2 = sheet.crop(width * 38, height * 38, width, height * 2);
		t3 = sheet.crop(width * 37, height * 38, width, height * 2);
		t4 = sheet.crop(width * 36, height * 38, width, height * 2);
		t5 = sheet.crop(width * 35, height * 38, width, height * 2);
		t6 = sheet.crop(width * 34, height * 38, width, height * 2);
		t7 = sheet.crop(width * 33, height * 38, width, height * 2);
		t8 = sheet.crop(width * 32, height * 38, width, height * 2);
		t9 = sheet.crop(width * 31, height * 38, width, height * 2);
		t10 = sheet.crop(width * 30, height * 38, width, height * 2);
		
		//Ports
		blankPortal = sheet.crop(0, height * 15, width, height);
		
		crumblePort = new BufferedImage[4];
		failurePort = new BufferedImage[4];
		injuryPort = new BufferedImage[4];
		lostPort = new BufferedImage[4];
		stupidPort = new BufferedImage[4];
		heightsPort = new BufferedImage[4];
		forgottenPort = new BufferedImage[4];
		deathPort = new BufferedImage[4];
		darkPort = new BufferedImage[4];
		drowningPort = new BufferedImage[4];
		
		crumblePort[0] = sheet.crop(0, height * 16, width, height);
		crumblePort[1] = sheet.crop(width, height * 16, width, height);
		crumblePort[2] = sheet.crop(width * 2, height * 16, width, height);
		crumblePort[3] = sheet.crop(width, height * 16, width, height);

		failurePort[0] = sheet.crop(0, height * 17, width, height);
		failurePort[1] = sheet.crop(width, height * 17, width, height);
		failurePort[2] = sheet.crop(width * 2, height * 17, width, height);
		failurePort[3] = sheet.crop(width, height * 17, width, height);
		
		injuryPort[0] = sheet.crop(0, height * 18, width, height);
		injuryPort[1] = sheet.crop(width, height * 18, width, height);
		injuryPort[2] = sheet.crop(width * 2, height * 18, width, height);
		injuryPort[3] = sheet.crop(width, height * 18, width, height);

		lostPort[0] = sheet.crop(0, height * 19, width, height);
		lostPort[1] = sheet.crop(width, height * 19, width, height);
		lostPort[2] = sheet.crop(width * 2, height * 19, width, height);
		lostPort[3] = sheet.crop(width, height * 19, width, height);
		
		stupidPort[0] = sheet.crop(0, height * 20, width, height);
		stupidPort[1] = sheet.crop(width, height * 20, width, height);
		stupidPort[2] = sheet.crop(width * 2, height * 20, width, height);
		stupidPort[3] = sheet.crop(width, height * 20, width, height);
		
		drowningPort[0] = sheet.crop(width * 3, height * 16, width, height);
		drowningPort[1] = sheet.crop(width * 4, height * 16, width, height);
		drowningPort[2] = sheet.crop(width * 5, height * 16, width, height);
		drowningPort[3] = sheet.crop(width * 4, height * 16, width, height);

		darkPort[0] = sheet.crop(width * 3, height * 17, width, height);
		darkPort[1] = sheet.crop(width * 4, height * 17, width, height);
		darkPort[2] = sheet.crop(width * 5, height * 17, width, height);
		darkPort[3] = sheet.crop(width * 4, height * 17, width, height);
		
		deathPort[0] = sheet.crop(width * 3, height * 18, width, height);
		deathPort[1] = sheet.crop(width * 4, height * 18, width, height);
		deathPort[2] = sheet.crop(width * 5, height * 18, width, height);
		deathPort[3] = sheet.crop(width * 4, height * 18, width, height);

		forgottenPort[0] = sheet.crop(width * 3, height * 19, width, height);
		forgottenPort[1] = sheet.crop(width * 4, height * 19, width, height);
		forgottenPort[2] = sheet.crop(width * 5, height * 19, width, height);
		forgottenPort[3] = sheet.crop(width * 4, height * 19, width, height);
		
		heightsPort[0] = sheet.crop(width * 3, height * 20, width, height);
		heightsPort[1] = sheet.crop(width * 4, height * 20, width, height);
		heightsPort[2] = sheet.crop(width * 5, height * 20, width, height);
		heightsPort[3] = sheet.crop(width * 4, height * 20, width, height);

		// Houses
		SpriteSheet house = new SpriteSheet(ImageLoader.loadImage("/textures/Houses.png"));
		
		emptyStall = house.crop(width * 60, height * 58, width * 4, height * 6);
		clothStall = house.crop(width * 52, height * 58, width * 4, height * 6);
		foodStall = house.crop(width * 56, height * 58, width * 4, height * 6);

		flatG = house.crop(0, 0, width * 10, height * 10);
		flatS = house.crop(width * 10, 0, width * 10, height * 10);
		flatR = house.crop(width * 20, 0, width * 10, height * 10);
		flatO = house.crop(width * 30, 0, width * 10, height * 10);

		turn1G = house.crop(0, height * 10, width * 8, height * 18);
		turn2G = house.crop(width * 8, height * 10, width * 8, height * 14);
		turn1S = house.crop(width * 16, height * 10, width * 8, height * 18);
		turn2S = house.crop(width * 24, height * 10, width * 8, height * 14);
		turn1R = house.crop(width * 32, height * 10, width * 8, height * 18);
		turn2R = house.crop(width * 40, height * 10, width * 8, height * 14);
		turn1O = house.crop(width * 48, height * 10, width * 8, height * 18);
		turn2O = house.crop(width * 56, height * 10, width * 8, height * 14);

		serp1G = house.crop(width * 6, height * 28, width * 8, height * 18);
		serp2G = house.crop(width * 14, height * 28, width * 6, height * 14);
		serp3G = house.crop(0, height * 36, width * 6, height * 10);
		serp1S = house.crop(width * 26, height * 28, width * 8, height * 18);
		serp2S = house.crop(width * 34, height * 28, width * 6, height * 14);
		serp3S = house.crop(width * 20, height * 36, width * 6, height * 10);
		serp1R = house.crop(width * 46, height * 28, width * 8, height * 18);
		serp2R = house.crop(width * 54, height * 28, width * 6, height * 14);
		serp3R = house.crop(width * 40, height * 36, width * 6, height * 10);
		serp1O = house.crop(width * 6, height * 46, width * 8, height * 18);
		serp2O = house.crop(width * 14, height * 46, width * 6, height * 14);
		serp3O = house.crop(0, height * 54, width * 6, height * 10);

		door = house.crop(width * 40, 0, width * 2, height * 2);

		// MainMenu
		SpriteSheet BG = new SpriteSheet(ImageLoader.loadImage("/textures/MMBG.png"));
		SpriteSheet startS = new SpriteSheet(ImageLoader.loadImage("/textures/Start.png"));

		menuBG = BG.crop(0, 0, 1024, 768);
		start = startS.crop(0, 0, 208, 368);

		// Pause
		SpriteSheet PBG = new SpriteSheet(ImageLoader.loadImage("/textures/PBG.png"));

		pauseBG = PBG.crop(0, 0, 1024, 768);

		// UnderWater

		// Dark

		// Maze

		// Light Mask
		SpriteSheet LM = new SpriteSheet(ImageLoader.loadImage("/textures/LightMask.png"));

		lightMask = LM.crop(0, 0, 1024, 763);

		// Intro
		SpriteSheet Intro = new SpriteSheet(ImageLoader.loadImage("/textures/intro.png"));
		intro = Intro.crop(0, 0, 1024, 763);

		// GameOver
		SpriteSheet gameOver = new SpriteSheet(ImageLoader.loadImage("/textures/GameOver.png"));
		SpriteSheet gameOverF = new SpriteSheet(ImageLoader.loadImage("/textures/GameOverFiles.png"));
		gameOverBG = gameOver.crop(0, 0, 1024, 763);
		gameOverFile = gameOverF.crop(0, 0, 1024, 763);
		
		
		//Height
		sun = tiles.crop(width * 8, height * 6, width, height);
		mnt = tiles.crop(width * 9, height * 6, width, height);
		ray = tiles.crop(width * 8, height * 7, width, height);
		range = tiles.crop(width * 9, height * 7, width, height);
		
		
		//Story
		SpriteSheet cutS = new SpriteSheet(ImageLoader.loadImage("/textures/CutScene.png"));
		SpriteSheet cutE = new SpriteSheet(ImageLoader.loadImage("/textures/EndCutScene.png"));
		SpriteSheet SC = new SpriteSheet(ImageLoader.loadImage("/textures/StoryChoice.png"));
		SpriteSheet S = new SpriteSheet(ImageLoader.loadImage("/textures/Story.png"));
		
		cutStart = new BufferedImage [27];
		
		cutStart[0] = cutS .crop(0, 0, width * 16, height * 12);
		cutStart[1] = cutS .crop(width * 16, 0, width * 16, height * 12);
		cutStart[2] = cutS .crop(width * 32, 0, width * 16, height * 12);
		cutStart[3] = cutS .crop(0, height * 12, width * 16, height * 12);
		cutStart[4] = cutS .crop(width * 16, height * 12, width * 16, height * 12);
		cutStart[5] = cutS .crop(width * 32, height * 12, width * 16, height * 12);
		cutStart[6] = cutS .crop(0, height * 24, width * 16, height * 12);
		cutStart[7] = cutS .crop(width * 16, height * 24, width * 16, height * 12);
		cutStart[8] = cutS .crop(width * 32, height * 24, width * 16, height * 12);
		cutStart[9] = cutS .crop(0, height * 36, width * 16, height * 12);
		cutStart[10] = cutS .crop(width * 16, height * 36, width * 16, height * 12);
		cutStart[11] = cutS .crop(width * 32, height * 36, width * 16, height * 12);
		cutStart[12] = cutS .crop(width * 16, height * 36, width * 16, height * 12);
		cutStart[13] = cutS .crop(0, height * 48, width * 16, height * 12);
		cutStart[14] = cutS .crop(width * 16, height * 48, width * 16, height * 12);
		cutStart[15] = cutS .crop(width * 32, height * 48, width * 16, height * 12);
		
		cutStart[16] = cutE .crop(0, 0, width * 16, height * 12);
		cutStart[17] = cutE .crop(width * 16, 0, width * 16, height * 12);
		cutStart[18] = cutE .crop(width * 32, 0, width * 16, height * 12);
		cutStart[19] = cutE .crop(0, height * 12, width * 16, height * 12);
		cutStart[20] = cutE .crop(width * 16, height * 12, width * 16, height * 12);
		cutStart[21] = cutE .crop(width * 32, height* 12, width * 16, height * 12);
		cutStart[22] = cutE .crop(0, height * 24, width * 16, height * 12);
		cutStart[23] = cutE .crop(0, height * 36, width * 16, height * 12);
		cutStart[24] = cutE .crop(width * 16, height * 36, width * 16, height * 12);
		cutStart[25] = cutE .crop(width * 32, height * 36, width * 16, height * 12);
		cutStart[26] = cutE .crop(0, height * 48, width * 16, height * 12);
		
		sChoice = SC.crop(0, 0, width * 16, height * 12);
		sStart11 = S.crop(0, 0, width * 16, height * 12);
		sStart12 = S.crop(width * 16, 0, width * 16, height * 12);
		sEnd11= S.crop(0, height * 12, width * 16, height * 12);
		sEnd12= S.crop(width * 16, height * 12, width * 16, height * 12);
		
		SpriteSheet control = new SpriteSheet(ImageLoader.loadImage("/textures/Controls.png"));
		
		
		
		mainControl = control.crop(0, 0, width * 16, height * 12);
		IgnoranceConrtol = control.crop(width * 16, 0, width * 16, height * 12);
		lostControl = control.crop(width * 32, 0, width * 16, height * 12);
		forgottenControl = control.crop(0, height * 12, width * 16, height * 12);
		darkControl = control.crop(width * 16, height * 12, width * 16, height * 12);
		heightControl = control.crop(width * 32, height * 12, width * 16, height * 12);
		injuryControl = control.crop(0, height * 24, width * 16, height * 12);
		drowningControl = control.crop(width * 16, height * 24, width * 16, height * 12);
		deathControl = control.crop(width * 32, height * 24, width * 16, height * 12);
		failControl  = control.crop(0, height * 36, width * 16, height * 12);
		crumbControl = control.crop(width * 16, height * 36, width * 16, height * 12);
		
		
		
	}
}
