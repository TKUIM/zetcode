package c02_animation.c03_thread;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ThreadAnimationExample extends JFrame {
	public ThreadAnimationExample() {
		initUI();
	}

	private void initUI() {
		add(new Board());

		setResizable(false);
		pack();

		setTitle("Star");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame ex = new ThreadAnimationExample();
				ex.setVisible(true);
			}
		});
	}
}
