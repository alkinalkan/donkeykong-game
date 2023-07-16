package DonkeyKong; // The class belongs to the package DonkeyKong

public class Ladder {
    public int x; // X-coordinate of the ladder's top-left corner
    public int ybottom; // Y-coordinate of the ladder's bottom-right corner
    public int height; // The height of the ladder
    public int width; // The width of the ladder

    // Constructor to initialize the ladder with its position and dimensions
    public Ladder(int x, int y, int width, int height) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.ybottom = y;
    }

    // The creation() method seems to be empty and doesn't perform any action.
    // It might be intended to handle the ladder creation process in the game.

    // Getter and setter methods for the ladder's properties

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getYbottom() {
        return ybottom;
    }

    public void setYbottom(int ybottom) {
        this.ybottom = ybottom;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
