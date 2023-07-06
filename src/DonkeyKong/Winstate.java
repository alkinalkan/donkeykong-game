package DonkeyKong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Winstate extends State {
	private BufferedImage win; // Image to display when the player wins

	public Winstate(Game game) {
		super(game);
		win = ImageLoader.loadImage("final.png"); // Load the win image from a file
	}

	@Override
	public void tick() {
		if (game.getKeyManager().res) { // If the "res" key is pressed
			State.setState(game.menuState); // Go back to the menu state
		}
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 800); // Fill the background with black color
		g.drawImage(win, 0, 0, 600, 640, null); // Draw the win image on the screen
	}

}
