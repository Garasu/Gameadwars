package src.window;

import src.Spielfeld.Spielfeld;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JButton;

public class Window extends JFrame{
	private Screen screen;
	private Spielfeld feld = new Spielfeld();
	private JPanel gamePanel = new JPanel();
	private JPanel menuPanel = new JPanel();
	private JButton testbutton = new JButton("test");

	public void createScreen(){
		screen = new Screen();
gamePanel.setPreferredSize(new Dimension(800,600));
		gamePanel.add(screen);
		add( gamePanel, BorderLayout.CENTER); 
	}
	
	public Window(){
		setLayout(new BorderLayout());
		menuPanel.setPreferredSize(new Dimension( 100, 600 ));
		menuPanel.setLayout(new FlowLayout());
		menuPanel.add(testbutton);
		menuPanel.add(testbutton);
		menuPanel.add(testbutton);
		add(menuPanel, BorderLayout.NORTH);
	}
	public void update(){
		
	}
	
	public void repaint(){
		screen.repaint();
		//gamePanel.repaint();
	}
	
	private class Screen extends JLabel{
		public Screen(){
			setPreferredSize(new Dimension(800,600));
		}
		public  void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			feld.draw(g);
		}
	}
	
}
