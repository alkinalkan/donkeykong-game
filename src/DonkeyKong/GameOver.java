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

    // The image displayed when the player loses the game
    private BufferedImage lose;

    /**
     * Constructor for the GameOver class.
     *
     * @param game The Game object that manages the game's state.
     */
    public GameOver(Game game) {
        // Call the constructor of the parent class (State) to set up the game reference
        super(game);
        // Load the "lose.png" image to display on the game over screen
        lose = ImageLoader.loadImage("lose.png");
    }

    /**
     * Update method for the GameOver state.
     * It checks if the restart key is pressed, and if so, transitions the game state to the menu state.
     */
    @Override
    public void tick() {
        // Check if the restart key is pressed (assumed to be stored in the game's key manager)
        if (game.getKeyManager().res) {
            // Set the game state to the menu state to restart the game
            State.setState(game.menuState);
        }
    }

    /**
     * Render method for the GameOver state.
     * It displays the game over screen with a black background and the "lose.png" image on top.
     *
     * @param g The Graphics object used for rendering.
     */
    @Override
    public void render(Graphics g) {
        // Set the background color to black
        g.setColor(Color.BLACK);
        // Fill the entire screen with the black color to clear any previous state's rendering
        g.fillRect(0, 0, 600, 800);
        // Draw the "lose.png" image on the game over screen, scaled to fit the screen size (600x640)
        g.drawImage(lose, 0, 0, 600, 640, null);
    }
}
