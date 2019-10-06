import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.awt.Graphics;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MyFrameTest {

	MyFrame frame;

	@Before
	public void setUp() {
		frame = new MyFrame();
	}

	@Test
	public void title() {
		assertSame("Frame", frame.getTitle());
	}

	@Test
	public void size() {
		assertEquals(600, frame.getWidth());
		assertEquals(800, frame.getHeight());
	}

	@Test
	public void exit_on_close() {
		assertSame(JFrame.EXIT_ON_CLOSE, frame.getDefaultCloseOperation());
	}

	@Test
	public void visible() {
		assertSame(true, frame.isVisible());
	}

	@Test
	public void oval() {
		Graphics graphics = Mockito.mock(Graphics.class);

		frame.paint(graphics);

		Mockito.verify(graphics).drawOval(50, 100, 400, 600);
	}

}