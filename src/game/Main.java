package src.game;
import src.window.Window;
public class Main {
	public static int height = 600;
	public static int width = 800;
	
	public static void main(String[] args){
	
	Window window = new Window();
	window.setDefaultCloseOperation(3);
	window.setSize(width, height);
	window.setVisible(true);
	
	window.createScreen();

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
