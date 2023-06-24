// Comment:
/**
 * The Health class represents the health power-ups in the Donkey Kong game.
 * It defines the position, size, and random generation of health power-ups.
 */
package DonkeyKong;

public class Health {

    private int x = 100; // The x-coordinate of the health power-up
    private int y = 50; // The y-coordinate of the health power-up
    private int width = 50; // The width of the health power-up
    private int height = 50; // The height of the health power-up

    public Health() {
        // Randomly generate the position of the health power-up
        int a = (int) (Math.random() * (3) + 0);
        if (a == 2) {
            y = 25;
            x = (int) (Math.random() * (385) + 140);
        } else if (a == 1) {
            y = 305;
            x = (int) (Math.random() * (525) + 0);
        } else if (a == 0) {
            y = 585;
            x = (int) (Math.random() * (525) + 0);
        }
    }

    /**
     * Returns the x-coordinate of the health power-up.
     *
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the health power-up.
     *
     * @param x the new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the y-coordinate of the health power-up.
     *
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the health power-up.
     *
     * @param y the new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns the width of the health power-up.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the width of the health power-up.
     *
     * @param width the new width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Returns the height of the health power-up.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the health power-up.
     *
     * @param height the new height
     */
    public void setHeight(int height) {
        this.height = height;
    }
}
