
	package dev.Sandefur.fear.entities.Static;

	import java.awt.Color;
import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.gfx.Assets;
import dev.Sandefur.fear.states.InsideHouseState;
import dev.Sandefur.fear.states.State;
import dev.Sandefur.fear.tiles.Tile;
import dev.Sandefur.fear.utils.CreaturesUtil;
import dev.Sandefur.fear.worlds.InsideHouse;

	public class Door extends StaticEntity{
		
		private static Boolean touch;
		int house;

		public Door(Handler handler, float x, float y, int house) {
			super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
			
			this.house = house;
			touch = false;
			
			bounds.x = 8;
			bounds.y = 16;
			bounds.width = 48;
			bounds.height = 48;
			JukeBox.load("/Music/door.wav", "Door");
		}
		
		public void update(){
			if(CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY(), x + 64, y + 85) < 30)
				touch = true;
			else
				touch = false;
			
			if(touch && handler.getKeyManager().interact){
				JukeBox.play("Door");
				InsideHouse.setDoor(house);
				State.setState(new InsideHouseState(handler));
				
			}
		}
		
		@Override
		public void tick() {
			update();
		}

		@Override
		public void render(Graphics2D g) {
			g.drawImage(Assets.door, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width * 2, height * 2, null);
			//g.setColor(Color.red);
			//g.fillRect((int) (x + 64 - handler.getGameCamera().getxOffset()),	(int) (y + 85 - handler.getGameCamera().getyOffset()), 15, 15);
		}
	}

