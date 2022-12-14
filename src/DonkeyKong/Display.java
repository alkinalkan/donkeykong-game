package DonkeyKong;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Display {
	private JFrame frame;
	private String title;
	private int height, widht;
	private Canvas canvas;

	public Display(String title, int height, int widht) {
		this.title = title;
		this.height = height;
		this.widht = widht;
		createDisplay();
	}

	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(widht, height);

		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �arp� ile oyun kapatma
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // Oyunu ortada ba�latna
		frame.setVisible(true);

		// CANVAS ALEMLERİ

		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(widht, height));
		canvas.setMaximumSize(new Dimension(widht, height));
		canvas.setMinimumSize(new Dimension(widht, height));
		frame.add(canvas);
		frame.pack(); // Komut almama ihtimalini s�f�rlar
		canvas.setFocusable(false);
	}

	public Canvas getCanvas() {
		return canvas;
	}

	// Jframelerime ula�mak i�in
	public JFrame getFrame() {
		return frame;
	}

}
