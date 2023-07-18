package DonkeyKong;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Kong extends Entity {

	// Array to store Kong's images for animation
	public static BufferedImage[] kong;
	
	// SpriteSheet to load Kong's sprite sheet
	SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("a.png"));
	
	// Animation object to handle Kong's animation
	private Animation kongAnim;
	
	// A boolean flag (not clear what it's used for, consider adding comment)
	public boolean a = true;

	// Constructor for Kong class
	public Kong(Game game, float x, float y) {
		// Call the superclass constructor to initialize Kong's position
		super(x, y);
		
		// Initialize the Kong array to hold the images for animation frames
		kong = new BufferedImage[2];
		
		// Crop the sprite sheet to get the first frame of Kong's animation
		kong[0] = sheet.crop(58, 152, 46, 32);
		
		// Crop the sprite sheet to get the second frame of Kong's animation
		kong[1] = sheet.crop(202, 152, 46, 32);
		
		// Initialize the animation with a delay of 820 milliseconds per frame
		kongAnim = new Animation(820, kong);
	}
	
	// Method to update Kong's animation
	@Override
	public void tick() {
		kongAnim.tick();
	}
	
	// Method to render Kong on the screen
	@Override
	public void render(Graphics g) {
		// Draw the current frame of Kong's animation at position (60, 5) with size (75, 75)
		g.drawImage(kongAnim.getCurrentFrame(), 60, 5, 75, 75, null);
	}
}
