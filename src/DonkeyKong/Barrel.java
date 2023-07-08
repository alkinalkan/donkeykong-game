package DonkeyKong;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Barrel {
	public int x = 120; // Initial x position
	public int y = 50; // Initial y position
	public int height;
	public int widht; // Typo: should be 'width'
	public int barrelMoveX = 2; // Barrel movement speed along the x-axis
	private int r = 0; // Counter variable for barrel movement
	public ArrayList<Barrel> Barrels = new ArrayList<Barrel>(); // List to hold multiple barrels
	int timer = 350; // Timer variable

	public static BufferedImage[] barrelb;
	SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("a.png")); // Loading sprite sheet
	private Animation barrela;

	public Barrel() {
		barrelb = new BufferedImage[4]; // Array to hold barrel images
		barrelb[0] = sheet.crop(66, 258, 12, 10); // Crop the first barrel image from the sprite sheet
		barrelb[1] = sheet.crop(81, 258, 12, 10); // Crop the second barrel image from the sprite sheet
		barrelb[2] = sheet.crop(66, 270, 12, 10); // Crop the third barrel image from the sprite sheet
		barrelb[3] = sheet.crop(81, 270, 12, 10); // Crop the fourth barrel image from the sprite sheet
		barrela = new Animation(250, barrelb); // Create animation with barrel images
	}

	public void move() {
		// Move the barrel horizontally
		if (r == 0) {
			this.setX(this.getX() + this.getBarrelMoveX());
		}

		// Change direction and move the barrel down when it reaches the end of the platform
		if (this.getX() == 566 || this.getX() == 4) {
			this.setY(this.getY() + 4); // Move the barrel down by 4 units
			r++;

			// Reset the position and change the direction after 35 steps
			if (r == 35) {
				this.setX(this.getX() - this.getBarrelMoveX());
				r = 0;
				this.setBarrelMoveX((-1) * this.getBarrelMoveX());
			}
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return widht; // Typo: should be 'width'
	}

	public void setWidth(int width) {
		this.widht = width; // Typo: should be 'width'
	}

	public int getBarrelMoveX() {
		return barrelMoveX;
	}

	public void setBarrelMoveX(int barrelMoveX) {
		this.barrelMoveX = barrelMoveX;
	}

	public void tick() {
		barrela.tick(); // Update the animation

		if (timer == 350) {
			// Add a new barrel to the list every 350 ticks
			Barrel newBarrel = new Barrel();
			Barrels.add(newBarrel);
			timer = 0;
		}

		if (Barrels.size() == 7) {
			// Remove the oldest barrel from the list when there are already 7 barrels
			Barrels.remove(0);
		}
		timer++;

		// Move all the barrels in the list
		for (int i = 0; i < Barrels.size(); i++) {
			Barrels.get(i).move();
		}
	}

	public void render(Graphics g) {
		for (int i = 0; i < Barrels.size(); i++) {
			// Draw the barrels on the screen
			g.drawImage(barrela.getCurrentFrame(), Barrels.get(i).getX(), Barrels.get(i).getY(), 30, 30, null);
		}
	}
}
