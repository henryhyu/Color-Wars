package character;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Enemy {
	
	int x;
	int y;
	int health;
	int size;
	Color color;

	Enemy(int x, int y, int size, int health, Color color) {
		this.x = x;
		this.y = y;
		this.size = size;
		
		this.color = color;
		this.health = health;
	}
	
	abstract void draw(Graphics g);
	abstract void move();
	
}
