package DonkeyKong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class MenuState extends State {

	public static BufferedImage[] kong;
	SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("a.png"));
	private Animation kongAnim;
	Random random;
	int timer = 300;
	public static BufferedImage[] barrelb;
	private Animation barrela;

	public MenuState(Game game) {
		super(game);
		random = new Random();
		
		// Load Kong sprites from the sprite sheet
		kong = new BufferedImage[2];
		kong[0] = sheet.crop(58, 152, 46, 32);
		kong[1] = sheet.crop(202, 152, 46, 32);
		kongAnim = new Animation(300, kong);
		
		// Load barrel sprites from the sprite sheet
		barrelb = new BufferedImage[4];
		barrelb[0] = sheet.crop(66, 258, 12, 10);
		barrelb[1] = sheet.crop(81, 258, 12, 10);
		barrelb[2] = sheet.crop(66, 270, 12, 10);
		barrelb[3] = sheet.crop(81, 270, 12, 10);
		barrela = new Animation(180, barrelb);
	}

	@Override
	public void tick() {
		// Update animations
		kongAnim.tick();
		barrela.tick();
		
		// Check if the start key is pressed to switch to the game state
		if (game.getKeyManager().start) {
			State.setState(game.gameState);
		}
	}

	@Override
	public void render(Graphics g) {
		// Clear the screen
		g.clearRect(0, 0, 600, 800);
		
		// Set the background color
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 800);
		
		// Render Kong animation
		g.drawImage(kongAnim.getCurrentFrame(), 235, 90, 100, 100, null);
		
		// Generate random RGB values for barrel color
		float r = (float) (random.nextFloat());
		float s = (float) (random.nextFloat());
		float b = (float) (random.nextFloat());
		
		// Render barrel animations
		g.drawImage(barrela.getCurrentFrame(), 30, 90, 100, 100, null);
		g.drawImage(barrela.getCurrentFrame(), 470, 90, 100, 100, null);
		
		// Set font and color for text
		g.setColor(new Color(r, s, b));
		g.setFont(new Font("TimesRoman PLAIN", Font.BOLD, 40));
		
		// Render game title and credits
		g.drawString("DONKEY KONG", 140, 70);
		g.drawString("Alkýn ALKAN", 165, 240);
		g.drawString("Doruk ARSLAN", 145, 310);
		g.drawString("Melih BENLÝOÐLU", 120, 380);
		g.drawString("Doðuhan CUMAOÐLU", 100, 450);
		
		// Render start prompt
		g.setColor(Color.RED);
		g.drawString("Press enter to play", 125, 600);
	}
}
