package src.window;

import src.Spielfeld.Spielfeld;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{
	private Screen screen;
	private Spielfeld feld = new Spielfeld();
	public void createScreen(){
		screen = new Screen();
		//screen.setPreferredSize(new Dimension(50,50));
		add(screen);
	}
	
	public void update(){
		
	}
	
	public void repaint(){
		screen.repaint();
	}
	
	private class Screen extends JLabel{
	
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			feld.draw(g);
		}
	}
	
}
