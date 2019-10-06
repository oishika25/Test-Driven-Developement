import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyJPanel extends JPanel {
	private Color myColor;
	Init init;
	MyJPanel pan;

	public MyJPanel(Color myColor) {
		this.myColor = myColor;
		setBackground(myColor);
		addMouseListener(new MouseWatcher());
		System.out.println(this);
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
		setOriginalColor();
	}

	public Color getMyColor() {
		return this.myColor;
	}

	public void setSelectedColor() {
		setBackground(Color.magenta);
	}

	public void setOriginalColor() {
		setBackground(myColor);
	}

	class MouseWatcher extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent me) {
			setSelectedColor();
		}

		@Override
		public void mouseExited(MouseEvent me) {
			setOriginalColor();
		}

		@Override
		public void mouseClicked(MouseEvent me) {
			clicked();
		}
	}

	public void clicked() {
		// init.outerPanelClicked(myColor);
	}
}