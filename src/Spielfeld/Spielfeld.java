package Spielfeld;

import java.awt.Graphics;

import javax.swing.JLabel;
import window.Window;
import game.Main;
public class Spielfeld extends JLabel{
	private String[] tiles = {"Wasser", "Land", "Berg"};
	private String[][] landscape;
	private int size = 50;
	public Spielfeld(){
		landscape = new String[Main.height / size][Main.width / size];
		for(int i = 0; i < landscape.length ; i++){
			for(int p = 0; p < landscape[0].length; p++){
				landscape[i][p] = tiles[(int) (Math.random() * 3)];
			}
		}
		
		
		
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
						g.fillRect(i, p, 50, 50);
						break;
					case "Land":
						g.fillRect(i, p, 50, 50);
						break;
					case "Berg":
						g.fillRect(i, p, 50, 50);
						break;
				}
			}
		}
	}
	
	
}
