import java.awt.Color;

@SuppressWarnings("serial")
public class CenterPanel extends MyJPanel {
	Init init;
	static Color myColor;

	public CenterPanel(Color myColor, Init init) {
		super(myColor);
		this.init = init;
	}

	public CenterPanel() {
		super(myColor);
	}

	@Override
	public void clicked() {
		Color temp[] = { init.panels[0].getBackground(), init.panels[1].getBackground(), init.panels[2].getBackground(),
				init.panels[3].getBackground(), init.panels[4].getBackground(), init.panels[5].getBackground(),
				init.panels[6].getBackground(), init.panels[7].getBackground(), init.panels[8].getBackground() };

		init.panels[0].setMyColor(temp[3]);
		init.panels[1].setMyColor(temp[0]);
		init.panels[2].setMyColor(temp[1]);
		init.panels[3].setMyColor(temp[6]);
		init.panels[5].setMyColor(temp[2]);
		init.panels[6].setMyColor(temp[7]);
		init.panels[7].setMyColor(temp[8]);
		init.panels[8].setMyColor(temp[5]);
	}
}