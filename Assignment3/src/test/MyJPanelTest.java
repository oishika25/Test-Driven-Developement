import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class MyJPanelTest {
	private static final Color COLOR = Color.BLACK;
	private static final Color MAGENTA = Color.magenta;
	MyJPanel myJPanel;

	@Before
	public void setUp() {
		myJPanel = new MyJPanel(COLOR);
	}

	@Test
	public void set_selected_color() {
		myJPanel.setSelectedColor();
		assertEquals(MAGENTA, myJPanel.getBackground());
	}

	@Test
	public void set_original_color() {
		myJPanel.setOriginalColor();
		assertEquals(COLOR, myJPanel.getBackground());
	}

}