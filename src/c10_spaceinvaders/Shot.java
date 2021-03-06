package c10_spaceinvaders;

import javax.swing.ImageIcon;

public class Shot extends Sprite {
	private String path = "img/shot.png";
	private final int H_SPACE = 6;
	private final int V_SPACE = 1;

	public Shot() {
	}

	public Shot(int x, int y) {
		ImageIcon ii = new ImageIcon(getClass().getResource(path));
		setImage(ii.getImage());
		setX(x + H_SPACE);
		setY(y + V_SPACE);
	}
}

