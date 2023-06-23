package DonkeyKong;

import java.awt.Graphics;

public abstract class State {

    private static State currentState = null;

    // Sets the current state of the game
    public static void setState(State state) {
        currentState = state;
    }

    // Returns the current state of the game
    public static State getState() {
        return currentState;
    }

    // Instance variable
    protected Game game;

    // Constructor
    public State(Game game) {
        this.game = game;
    }

    // Abstract method to update the state of the game
    public abstract void tick();

    // Abstract method to render the game graphics
    public abstract void render(Graphics g);
}
