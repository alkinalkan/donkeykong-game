package DonkeyKong;

import java.awt.image.BufferedImage;

public class Princess {
    private int x; // X-coordinate of the princess
    private int y; // Y-coordinate of the princess
    private int width = 38; // Width of the princess image
    private int height = 52; // Height of the princess image
    public static BufferedImage princess; // Image of the princess

    public Princess(int x, int y) {
        this.x = x; // Set the initial X-coordinate of the princess
        this.y = y; // Set the initial Y-coordinate of the princess
    }

    // Getter method for retrieving the X-coordinate of the princess
    public int getX() {
        return x;
    }

    // Setter method for updating the X-coordinate of the princess
    public void setX(int x) {
        this.x = x;
    }

    // Getter method for retrieving the Y-coordinate of the princess
    public int getY() {
        return y;
    }

    // Setter method for updating the Y-coordinate of the princess
    public void setY(int y) {
        this.y = y;
    }

    // Getter method for retrieving the width of the princess image
    public int getWidth() {
        return width;
    }

    // Setter method for updating the width of the princess image
    public void setWidth(int width) {
        this.width = width;
    }

    // Getter method for retrieving the height of the princess image
    public int getHeight() {
        return height;
    }

    // Setter method for updating the height of the princess image
    public void setHeight(int height) {
        this.height = height;
    }
}
