package character;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Enemy {
	
	int health;
	int size;
	Color color;

	Enemy(int health, int size, Color color) {
		this.health = health;
		this.size = size;
		this.color = color;
	}
	
	abstract void draw(Graphics g);
	abstract void move();
	
}
