import java.awt.Color;

@SuppressWarnings("serial")
public class OuterPanel extends MyJPanel {
	Init init;
	static Color myColor;
	static OuterPanel previousClick;

	public OuterPanel(Color myColor, Init init) {
		super(myColor);
		this.init = init;
	}

	public OuterPanel() {
		super(myColor);
	}

	@Override
	public void clicked() {
		
		if(previousClick == null) {
			for(int i = 0 ; i < init.panels.length; i++) {
				if(init.panels[i].getBackground() == this.getBackground()) {
					previousClick = (OuterPanel) init.panels[i];
					
				}
			}
		}
		else {
			Color temp = this.getMyColor();;
			this.setMyColor(previousClick.getBackground());
			previousClick.setMyColor(temp);
			previousClick = null;
		}
	}
}