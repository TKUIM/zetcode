package c07_breakout;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Paddle extends Sprite implements Commons {
	String paddle = "resources/paddle.png";

	int dx;

	public Paddle() {
		ImageIcon ii = new ImageIcon(getClass().getResource(paddle));
		image = ii.getImage();

		width = image.getWidth(null);
		height = image.getHeight(null);

		resetState();
	}

	public void move() {
		x += dx;
		if (x <= 2) {
			x = 2;
		}
		if (x >= Commons.PADDLE_RIGHT) {
			x = Commons.PADDLE_RIGHT;
		}
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = -2;
		}

		else if (key == KeyEvent.VK_RIGHT) {
			dx = 2;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		else if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
	}

	public void resetState() {
		x = 200;
		y = 360;
	}
}
