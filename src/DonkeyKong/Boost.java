package DonkeyKong;

public class Boost {

	// Position and size variables for the Boost object
	private int x = 100;    // x-coordinate of the Boost
	private int y = 50;     // y-coordinate of the Boost
	private int width = 50; // width of the Boost
	private int height = 50;// height of the Boost
	public static int a;    // static variable to determine Boost type

	public Boost() {
		// Constructor for the Boost object

		// Randomly select a number between 0 and 2 and store it in 'a'
		a = (int) (Math.random() * (3) + 0);

		// Depending on the value of 'a', set the Boost at different positions on the screen
		if (a == 2) {
			// If 'a' is 2, set the Boost in the middle row (y = 160) with a random x-coordinate
			y = 160;
			x = (int) (Math.random() * (515) + 35);
		} else if (a == 1) {
			// If 'a' is 1, set the Boost in the bottom row (y = 440) with a random x-coordinate
			y = 440;
			x = (int) (Math.random() * (515) + 35);
		} else if (a == 0) {
			// If 'a' is 0, set the Boost in the last row (y = 725) with a random x-coordinate
			y = 725;
			x = (int) (Math.random() * (400) + 140);
		}
	}

	// Getter method for the x-coordinate of the Boost
	public int getX() {
		return x;
	}

	// Setter method to update the x-coordinate of the Boost
	public void setX(int x) {
		this.x = x;
	}

	// Getter method for the y-coordinate of the Boost
	public int getY() {
		return y;
	}

	// Setter method to update the y-coordinate of the Boost
	public void setY(int y) {
		this.y = y;
	}

	// Getter method for the width of the Boost
	public int getWidth() {
		return width;
	}

	// Setter method to update the width of the Boost
	public void setWidth(int width) {
		this.width = width;
	}

	// Getter method for the height of the Boost
	public int getHeight() {
		return height;
	}

	// Setter method to update the height of the Boost
	public void setHeight(int height) {
		this.height = height;
	}
}
