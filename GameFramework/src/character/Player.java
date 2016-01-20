package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Player {
	
	public int x;
	public int y;
	int health;
	int size;
	Color color;
	
	public Player(int x, int y, int size, int health, Color color) {
		this.x = x;
		this.y = y;
		this.size = size;
		
		this.color = color;
		this.health = health;
	}
	
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
	
		int[] xCoords = {x, x+size, x+this.size/2};
		int[] yCoords = {y, y, y-size};
		
		g2d.setColor(this.color);
		g2d.fillPolygon(xCoords, yCoords, 3);
	}
	
	public void move(){
				
	}
	
	public void setColor(Color c) {
		this.color = c;
	}

}
