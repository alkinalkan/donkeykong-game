package DonkeyKong;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Display {
	private JFrame frame; // The JFrame object for the game window
	private String title; // The title of the game window
	private int height, widht; // The dimensions of the game window
	private Canvas canvas; // The canvas where the game will be rendered

	public Display(String title, int height, int widht) {
		this.title = title;
		this.height = height;
		this.widht = widht;
		createDisplay();
	}

	// Create and initialize the display window
	private void createDisplay() {
		// Create the JFrame
		frame = new JFrame(title);
		frame.setSize(widht, height);

		// Set the icon image of the frame
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // Center the window on the screen
		frame.setVisible(true);

		// Create the canvas
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(widht, height));
		canvas.setMaximumSize(new Dimension(widht, height));
		canvas.setMinimumSize(new Dimension(widht, height));
		frame.add(canvas);
		frame.pack(); // Adjust the frame size to fit the canvas
		canvas.setFocusable(false); // Prevent the canvas from automatically receiving focus
	}

	// Get the canvas object
	public Canvas getCanvas() {
		return canvas;
	}

	// Get the JFrame associated with the display
	public JFrame getFrame() {
		return frame;
	}
}
