package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Circle extends Enemy {

	public Circle(int x, int y, int size, int health, Color color) {
		super(x, y, size, health, color);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setColor(this.color);
		g2d.fillOval(this.x, this.y, this.size, this.size);
	}
	
	@Override
	public void move() {
		this.x = this.x+2;
		this.y = this.y+2;
	}

}
