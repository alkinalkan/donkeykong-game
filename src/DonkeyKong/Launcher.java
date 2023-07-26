// The "DonkeyKong" package contains the classes related to the Donkey Kong game.
package DonkeyKong;

// The Launcher class serves as the entry point for the Donkey Kong game.
public class Launcher {

    // The main method is the starting point of the application.
    public static void main(String[] args) {

        // Create a new instance of the Game class, which represents the Donkey Kong game.
        // The constructor of the Game class takes three arguments:
        // 1. The title of the game ("Donkey Kong" in this case).
        // 2. The width of the game window (800 pixels).
        // 3. The height of the game window (600 pixels).
        Game game = new Game("Donkey Kong", 800, 600);

        // Call the start() method of the Game class to begin the game.
        // This method will initialize the game, create the game window, and start the game loop.
        game.start();
    }
}
