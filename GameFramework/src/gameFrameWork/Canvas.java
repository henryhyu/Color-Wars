package gameFrameWork;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import character.Circle;

@SuppressWarnings("serial")
public class Canvas extends JPanel{

	Circle c = new Circle(-50,-50,10, 100, Color.RED);
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		t.draw(g);
		c.draw(g);
		c.move();
		
	    
	}

}
