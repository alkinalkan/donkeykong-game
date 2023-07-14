package DonkeyKong;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

    /**
     * Loads an image from the specified path.
     *
     * @param path the path to the image file
     * @return the loaded image as a BufferedImage
     */
    public static BufferedImage loadImage(String path) {

        try {
            // Use ImageIO to read the image from the specified path
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException e) {
            // If an error occurs during image loading, print the stack trace
            e.printStackTrace();
            // Exit the program with a non-zero status code
            System.exit(1);
        }
        return null;
    }
}
