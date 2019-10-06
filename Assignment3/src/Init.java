import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Init {
	public JFrame jFrame;
	public int pos;
	MyJPanel panels[];
	Color colors[] = { Color.blue, Color.green, Color.red, Color.white, Color.yellow, Color.black, Color.orange,
			Color.cyan, Color.gray };
//	int count = 0;
//	Color a, b, temp;
	Color firstClicked;
	OuterPanel previousClick;

	public Init() {
		panels = new MyJPanel[9];
		jFrame = new JFrame("NINE SQUARES PROGRAM");
		jFrame.setSize(500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.getContentPane().setLayout(new GridLayout(3, 3));
		for (int i = 0; i < panels.length; i++) {

			if (i == 4) {
				panels[i] = new CenterPanel(colors[i], this);
			} else {
				panels[i] = new OuterPanel(colors[i], this);
			}
			// panels[i].setInit(this);
			jFrame.getContentPane().add(panels[i]);
		}
		jFrame.setVisible(true);

	}

//	public void outerPanelClicked(Color c) {
//		System.out.println("Outer Panel Called");
//		System.out.println("Count ="+count);
//		if (count == 0) {
//			a = c;
//			count = 1;
//			System.out.println("count = " + count);
//		} else {
//			b = c;
//			temp = b;
//			count = 0;
//			for (int i = 0; i < 9; i++) {
//				if (this.panels[i].getBackground() == b) {
//					this.panels[i].setMyColor(a);
//				} else
//					continue;
//
//			}
//
//			for (int j = 0; j < 9; j++) {
//				if (this.panels[j].getBackground() == b) {
//					this.panels[j].setMyColor(temp);
//				} else
//					continue;
//
//			}
//		}
//	}
//
	public static void main(String[] args) {
		new Init();
	}

}