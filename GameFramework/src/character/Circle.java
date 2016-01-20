package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Circle extends Enemy {

	public Circle(int health, int size, Color color) {
		super(health, size, color);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setColor(this.color);
		g2d.fillOval(x, y, this.size, this.size);
	}

	
	int x = 0;
	int y = 0;
	
	@Override
	public void move() {
		x = x+1;
		y = y+1;
	}

}
