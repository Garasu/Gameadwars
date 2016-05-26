package players;

import javax.swing.*;
import java.awt.*;

public class UnitOne(){
	private int posX;
	private int posY;
	
	
	
	public UnitOne(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}

	public void drawg(Graphics g){
		g.setColor(Color.ORANGE);	
		g.fillRect(50, 50, 25, 25);
	}
}

