package src.Spielfeld;

import java.awt.Graphics;

import javax.swing.JLabel;
import java.awt.Color;
import src.window.Window;
import src.game.Main;
public class Spielfeld extends JLabel{
	private String[] tiles = {"Wasser", "Land", "Berg"};
	private String[][] landscape;
	private int size = 50;
	private int height = 600;
	private int width = 800;
	private PlayerOne player;
	public Spielfeld(){
		landscape = new String[height / size][width / size];
		for(int i = 0; i < landscape.length ; i++){
			for(int p = 0; p < landscape[0].length; p++){
				landscape[i][p] = tiles[(int) (Math.random() * 3)];
			}
		}
		player = new PlayerOne();
	}
	
	public void update(){
		
	}
	
	public void repaint(){
		
	}
	
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		for(int i = 0; i < landscape.length ; i++){
			for(int p = 0; p < landscape[0].length; p++){
				switch(landscape[i][p]){
					case "Wasser": 
						g.setColor(Color.BLUE);
						g.fillRect(i*50, p*50, 50, 50);
						break;
					case "Land":
						g.setColor(Color.GREEN);
						g.fillRect(i*50, p*50, 50, 50);
						break;
					case "Berg":
						g.setColor(Color.DARK_GRAY);
						g.fillRect(i*50, p*50, 50, 50);
						break;
				}
			}
		}
		Player player = new Player();
		player.draw();e
	}
}

