package DonkeyKong;

import java.awt.image.BufferedImage;

/**
 * The SpriteSheet class represents an image containing multiple sprites or frames of an animation.
 * It allows cropping individual sprites from the sheet for use in the game.
 */
public class SpriteSheet {
    private BufferedImage sheet;

    /**
     * Creates a new SpriteSheet instance.
     *
     * @param sheet The BufferedImage representing the sprite sheet.
     */
    public SpriteSheet(BufferedImage sheet) {
        this.sheet = sheet;
    }

    /**
     * Crops a specific region from the sprite sheet.
     *
     * @param x      The x-coordinate of the top-left corner of the region to be cropped.
     * @param y      The y-coordinate of the top-left corner of the region to be cropped.
     * @param width  The width of the region to be cropped.
     * @param height The height of the region to be cropped.
     * @return The cropped BufferedImage representing the specified region.
     */
    public BufferedImage crop(int x, int y, int width, int height) {
        return sheet.getSubimage(x, y, width, height);
    }
}
