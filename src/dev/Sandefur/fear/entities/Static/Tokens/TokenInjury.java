package dev.Sandefur.fear.entities.Static.Tokens;

import java.awt.Graphics2D;

import dev.Sandefur.fear.Handler;
import dev.Sandefur.fear.data.JukeBox;
import dev.Sandefur.fear.entities.EntityManager;
import dev.Sandefur.fear.entities.Static.StaticEntity;
import dev.Sandefur.fear.gfx.Assets;

public class TokenInjury extends StaticEntity{
	private static Boolean recieved = false;
	private EntityManager entityManager = handler.getWorld().getEntityManager();

	public TokenInjury(Handler handler, float x, float y) {
		super(handler, x, y, 64, 128);
	}	
	
	public void recieved(){
		if (intersects(EntityManager.getPlayer())){
				recieved = true;
				JukeBox.play("Recieved");
				entityManager.removeEntity(this);
				handler.getGame().setHome(true);
		}
	}
	
	public static Boolean getToken(){
		return recieved;
	}
	
	public static void setToken(Boolean b){
		recieved = b;
	}

	@Override
	public void tick() {
		recieved();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.t8,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
