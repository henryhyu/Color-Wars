package gameFrameWork;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Window extends JFrame{
	
	private Window(){
		this.setTitle("Color Wars");	
		this.setSize(1024,768);
		this.setLocationRelativeTo(null); //centers window on middle of screen
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
	}
	
	public static void main(String args[]){
			SwingUtilities.invokeLater(new Runnable() { //creates a new thread (more research to come)
				@Override
				public void run(){ //run() is defined by the Runnable interface and is used to execute
					new Window();  //this line of code
				}
			});
		}
}