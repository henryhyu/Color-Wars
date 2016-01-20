package gameFrameWork;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame{

	private Window(){
		this.setTitle("Color Wars");	
		this.setSize(1024,768);
		this.setLocationRelativeTo(null); //centers window on middle of screen
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
	}
	
	public static void main(String args[]) throws InterruptedException{
			
		Window window = new Window();  
		Canvas canvas = new Canvas();
		window.add(canvas);
		
		while(true){
			window.repaint();
			Thread.sleep(10);			
		}	
		
	}//end main
	
}//end class
