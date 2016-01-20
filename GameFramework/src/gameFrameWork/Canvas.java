package gameFrameWork;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import character.Circle;
import character.Triangle;

@SuppressWarnings("serial")
public class Canvas extends JPanel{

	Circle c = new Circle(100, 100, Color.RED);
	Triangle t = new Triangle(50, 50, Color.GREEN);
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		t.draw(g);
		t.move();
		c.draw(g);
		c.move();
	    
	}
	
}
