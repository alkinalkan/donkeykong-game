// Comment:
/**
 * The Health class represents health power-ups in the Donkey Kong game.
 * It defines attributes such as position, size, and random generation for health power-ups.
 */
package DonkeyKong;

public class Health {

    private int x = 100; // Initial x-coordinate of the health power-up
    private int y = 50; // Initial y-coordinate of the health power-up
    private int width = 50; // Initial width of the health power-up
    private int height = 50; // Initial height of the health power-up

    public Health() {
        // Randomly generate the position of the health power-up within specified areas
        int areaSelector = (int) (Math.random() * 3); // Choose one of three areas
        if (areaSelector == 2) {
            y = 25;
            x = (int) (Math.random() * 385 + 140);
        } else if (areaSelector == 1) {
            y = 305;
            x = (int) (Math.random() * 525);
        } else { // areaSelector == 0
            y = 585;
            x = (int) (Math.random() * 525);
        }
    }

    /**
     * Retrieve the x-coordinate of the health power-up.
     *
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Set the x-coordinate of the health power-up.
     *
     * @param x the new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Retrieve the y-coordinate of the health power-up.
     *
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Set the y-coordinate of the health power-up.
     *
     * @param y the new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Retrieve the width of the health power-up.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the width of the health power-up.
     *
     * @param width the new width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Retrieve the height of the health power-up.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the height of the health power-up.
     *
     * @param height the new height
     */
    public void setHeight(int height) {
        this.height = height;
    }
}
