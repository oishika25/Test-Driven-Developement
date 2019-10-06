import java.awt.Color;

@SuppressWarnings("serial")
public class OuterPanel extends MyJPanel {
	Init init;
	Color myColor;

	public OuterPanel(Color myColor, Init init) {
		super(myColor);
		this.init = init;
	}

	@Override
	public void clicked() {
		if (init.previousClick == null) {
			for (int i = 0; i < init.panels.length; i++) {
				if (init.panels[i].getBackground() == this.getBackground()) {
					init.previousClick = (OuterPanel) init.panels[i];
				}
			}
		} else {
			Color temp = this.getMyColor();
			this.setMyColor(init.previousClick.getBackground());
			init.previousClick.setMyColor(temp);
			init.previousClick = null;
		}
	}

//			for (int j = 0; j < 9; j++) {
//				if (init.panels[j].getBackground() == b) {
//					init.panels[j].setMyColor(a);
//				} else
//					continue;
//
//			}
//		}
//	}
}