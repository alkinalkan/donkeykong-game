package DonkeyKong;

import java.awt.Graphics;

public class GameState extends State {
    Game game;
    private Mario mario;
    private Kong kong;
    private Barrel barrel;

    public GameState(Game game) {
        // Call the constructor of the parent class (State) passing the 'game' parameter
        super(game);
        
        // Create a new Barrel object
        barrel = new Barrel();
        
        // Create a new Mario object with initial position (50, 750) and size (39, 28)
        // Pass the 'game' and 'barrel' objects as parameters to Mario's constructor
        mario = new Mario(game, barrel, 50, 750, 39, 28);
        
        // Create a new Kong object with initial position (0, 760)
        kong = new Kong(game, 0, 760);
    }

    @Override
    public void tick() {
        // Call the tick method for each object to update their state
        mario.tick();   // Update Mario's state
        barrel.tick();  // Update Barrel's state
        kong.tick();    // Update Kong's state
    }

    @Override
    public void render(Graphics g) {
        // Call the render method for each object to draw them on the screen
        mario.render(g);    // Draw Mario on the screen
        barrel.render(g);   // Draw Barrel on the screen
        kong.render(g);     // Draw Kong on the screen
    }
}
