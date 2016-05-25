package src.game;
import src.window.Window;
public class Main {
	public static int height = 800;
	public static int width = 600;
	
	public static void main(String[] args){
	
	Window window = new Window();
	
	window.setDefaultCloseOperation(3);
	
	
	window.createScreen();
	window.pack();
	window.setVisible(true);
	window.repaint();
	while(true){
		
		//window.update();
		window.repaint();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {

		}
	}
	
	}
	
	
	
	
}
