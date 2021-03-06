package c02_animation.c02_utilityTimer;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class UtilityTimerExample extends JFrame {
	public UtilityTimerExample() {
		initUI();
	}

	private void initUI() {
		add(new Board());
		setResizable(false);
		pack();

		setTitle("Star");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame ex = new UtilityTimerExample();
				ex.setVisible(true);
			}
		});
	}
}
