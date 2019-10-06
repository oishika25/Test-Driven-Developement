import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	MyFrame() {
		super("Frame");
		setSize(600, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String args[]) {
		new MyFrame();
	}

	@Override
	public void paint(Graphics g) {
		g.drawOval(50, 100, 400, 600);
	}
}