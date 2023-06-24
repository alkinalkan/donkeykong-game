package DonkeyKong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 * The GameOver class represents the game state when the player loses in the Donkey Kong game.
 * It extends the State class and handles the rendering of the game over screen.
 * When the restart key is pressed, it transitions the game state to the menu state.
 */
public class GameOver extends State {
	private BufferedImage lose;

	public GameOver(Game game) {
		super(game);
		lose = ImageLoader.loadImage("lose.png");
	}

	@Override
	public void tick() {
		if (game.getKeyManager().res) {
			State.setState(game.menuState);
		}
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 800);
		g.drawImage(lose, 0, 0, 600, 640, null);
	}

}
