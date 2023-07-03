package DonkeyKong;

public class Level {
    public int x;        // x-coordinate of the level
    public int y;        // y-coordinate of the level
    public int width;    // width of the level
    public int height;   // height of the level

    public Level(int x, int y, int width, int height) {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Getter method for x-coordinate
    public int getX() {
        return x;
    }

    // Setter method for x-coordinate
    public void setX(int x) {
        this.x = x;
    }

    // Getter method for y-coordinate
    public int getY() {
        return y;
    }

    // Setter method for y-coordinate
    public void setY(int y) {
        this.y = y;
    }

    // Getter method for width
    public int getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(int width) {
        this.width = width;
    }

    // Getter method for height
    public int getHeight() {
        return height;
    }

    // Setter method for height
    public void setHeight(int height) {
        this.height = height;
    }
}
