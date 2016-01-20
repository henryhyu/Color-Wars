package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Triangle extends Enemy{

	public Triangle(int x, int y, int sideLen, int health, Color color) {
		super(x, y, sideLen, health, color);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
	
		int[] xCoords = {x, x+size, x+this.size/2};
		int[] yCoords = {y, y, (int) (y*(1/Math.sqrt(3)))};
		
		g2d.setColor(this.color);
		g2d.fillPolygon(xCoords, yCoords, 3);
	}

	
	@Override
	public void move() {
		
	}

}
