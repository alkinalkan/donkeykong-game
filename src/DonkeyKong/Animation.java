/** 
 * The Animation class represents a sequence of frames that can be displayed 
 * to create an animation effect. It manages the timing and looping of the frames.
 */
public class Animation {
    private int speed; // The speed at which the frames are cycled (in milliseconds)
    private int index; // The index of the current frame
    private long lastTime; // The timestamp of the last frame update
    private long timer; // The elapsed time since the last frame update
    private BufferedImage[] frames; // An array of images representing the frames of the animation

    /**
     * Constructs an Animation object with the specified speed and frames.
     * 
     * @param speed  The speed at which the frames are cycled (in milliseconds)
     * @param frames An array of images representing the frames of the animation
     */
    public Animation(int speed, BufferedImage[] frames) {
        this.speed = speed;
        this.frames = frames;
        index = 0;
        lastTime = System.currentTimeMillis();
    }

    /**
     * Updates the animation by advancing to the next frame if the specified 
     * time interval has passed.
     */
    public void tick() {
        timer += System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();
        if (timer > speed) {
            index++;
            timer = 0;
            if (index >= frames.length)
                index = 0;
        }
    }

    /**
     * Returns the current frame of the animation.
     * 
     * @return The current frame as a BufferedImage
     */
    public BufferedImage getCurrentFrame() {
        return frames[index];
    }
}
 

// Comments:
// - The Animation class represents a collection of frames that can be used to create an animation.
// - It manages the timing and looping of the frames.
// - The speed determines how quickly the frames are cycled.
// - The frames are stored as an array of BufferedImages.
// - The tick() method updates the animation by advancing to the next frame if the specified time interval has passed.
// - The getCurrentFrame() method returns the current frame of the animation.
// - The lastTime and timer variables are used to track the elapsed time between frame updates.
