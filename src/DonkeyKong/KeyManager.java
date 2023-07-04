package DonkeyKong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

	private boolean[] keys; // Array to store the status of each key
	public boolean up, left, right, jump, down, start, res; // Variables to store the status of specific keys
	private int counter = 1; // Counter variable
	static boolean check = true; // Static boolean variable

	public KeyManager() {
		keys = new boolean[256]; // Initialize the keys array to hold 256 keys (ASCII range)
	}

	public void tick() {
		// Update the status of specific keys based on the keys array
		jump = keys[KeyEvent.VK_SPACE];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		start = keys[KeyEvent.VK_ENTER];
		res = keys[KeyEvent.VK_UP];
	}

	public boolean isenter() {
		return start;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true; // Set the corresponding key in the keys array to true when a key is pressed

		int c = e.getKeyCode();
		if (c == KeyEvent.VK_SPACE) {
			if (check) {
				Mario.bastý = true;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false; // Set the corresponding key in the keys array to false when a key is released

		int c = e.getKeyCode();
		if (c == KeyEvent.VK_SPACE) {
			Mario.bastý = false;
			if (check && Mario.bastý == false) {
				check = false;
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Not used in this implementation
	}

	public boolean[] getKeys() {
		return keys; // Return the keys array
	}

	public void setKeys(boolean[] keys) {
		this.keys = keys; // Set the keys array to the provided array
	}

	public boolean isUp() {
		return up; // Return the status of the up key
	}

	public void setUp(boolean up) {
		this.up = up; // Set the status of the up key
	}

	public int getCounter() {
		return counter; // Return the counter variable
	}

	public void setCounter(int counter) {
		this.counter = counter; // Set the counter variable to the provided value
	}

}
