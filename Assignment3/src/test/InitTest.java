import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InitTest {
//	Init init = new Init();
	Init init;

	@BeforeEach
	public void setUp() {
		init = new Init();
	}

	@Test
	public void rotating_swapping_colors_0_time() {

		assertEquals(init.colors[0], init.panels[0].getBackground());
		assertEquals(init.colors[1], init.panels[1].getBackground());
		assertEquals(init.colors[2], init.panels[2].getBackground());
		assertEquals(init.colors[3], init.panels[3].getBackground());
		assertEquals(init.colors[5], init.panels[5].getBackground());
		assertEquals(init.colors[6], init.panels[6].getBackground());
		assertEquals(init.colors[7], init.panels[7].getBackground());
		assertEquals(init.colors[8], init.panels[8].getBackground());

	}

	@Test
	public void rotating_colors_1_time() {

		for (int i = 0; i < 1; i++) {
			init.panels[4].clicked();
		}
		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());

	}

	@Test
	public void rotating_colors_4_times() {

		for (int i = 0; i < 4; i++) {
			init.panels[4].clicked();
		}
		assertEquals(init.colors[8], init.panels[0].getBackground());
		assertEquals(init.colors[7], init.panels[1].getBackground());
		assertEquals(init.colors[6], init.panels[2].getBackground());
		assertEquals(init.colors[5], init.panels[3].getBackground());
		assertEquals(init.colors[3], init.panels[5].getBackground());
		assertEquals(init.colors[2], init.panels[6].getBackground());
		assertEquals(init.colors[1], init.panels[7].getBackground());
		assertEquals(init.colors[0], init.panels[8].getBackground());

	}

	@Test
	public void rotating_colors_8_times() {

		for (int i = 0; i < 8; i++) {
			init.panels[4].clicked();
		}
		assertEquals(init.colors[0], init.panels[0].getBackground());
		assertEquals(init.colors[1], init.panels[1].getBackground());
		assertEquals(init.colors[2], init.panels[2].getBackground());
		assertEquals(init.colors[3], init.panels[3].getBackground());
		assertEquals(init.colors[5], init.panels[5].getBackground());
		assertEquals(init.colors[6], init.panels[6].getBackground());
		assertEquals(init.colors[7], init.panels[7].getBackground());
		assertEquals(init.colors[8], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_0_and_1() {
		init.panels[0].clicked();
		init.panels[1].clicked();

		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[0].getBackground());

	}

	@Test
	public void swapping_colors_0_and_2() {
		init.panels[0].clicked();
		init.panels[2].clicked();

		assertEquals(init.colors[0], init.panels[2].getBackground());
		assertEquals(init.colors[2], init.panels[0].getBackground());

	}

	@Test
	public void swapping_colors_0_and_3() {
		init.panels[0].clicked();
		init.panels[3].clicked();

		assertEquals(init.colors[0], init.panels[3].getBackground());
		assertEquals(init.colors[3], init.panels[0].getBackground());

	}

	@Test
	public void swapping_colors_0_and_4() {
		init.panels[0].clicked();
		init.panels[4].clicked();

		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_0_and_5() {
		init.panels[0].clicked();
		init.panels[5].clicked();

		assertEquals(init.colors[0], init.panels[5].getBackground());
		assertEquals(init.colors[5], init.panels[0].getBackground());

	}

	@Test
	public void swapping_colors_0_and_6() {
		init.panels[0].clicked();
		init.panels[6].clicked();

		assertEquals(init.colors[0], init.panels[6].getBackground());
		assertEquals(init.colors[6], init.panels[0].getBackground());

	}

	@Test
	public void swapping_colors_0_and_7() {
		init.panels[0].clicked();
		init.panels[7].clicked();

		assertEquals(init.colors[0], init.panels[7].getBackground());
		assertEquals(init.colors[7], init.panels[0].getBackground());

	}

	@Test
	public void swapping_colors_0_and_8() {
		init.panels[0].clicked();
		init.panels[8].clicked();

		assertEquals(init.colors[0], init.panels[8].getBackground());
		assertEquals(init.colors[8], init.panels[0].getBackground());

	}

	@Test
	public void swapping_colors_0_and_0() {
		init.panels[0].clicked();
		init.panels[0].clicked();

		assertEquals(init.colors[0], init.panels[0].getBackground());
	}

	@Test
	public void swapping_colors_1_and_0() {
		init.panels[1].clicked();
		init.panels[0].clicked();

		assertEquals(init.colors[1], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());

	}

	@Test
	public void swapping_colors_1_and_2() {
		init.panels[1].clicked();
		init.panels[2].clicked();

		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[2], init.panels[1].getBackground());

	}

	@Test
	public void swapping_colors_1_and_3() {
		init.panels[1].clicked();
		init.panels[3].clicked();

		assertEquals(init.colors[1], init.panels[3].getBackground());
		assertEquals(init.colors[3], init.panels[1].getBackground());

	}

	@Test
	public void swapping_colors_1_and_4() {
		init.panels[1].clicked();
		init.panels[4].clicked();

		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_1_and_5() {
		init.panels[1].clicked();
		init.panels[5].clicked();

		assertEquals(init.colors[1], init.panels[5].getBackground());
		assertEquals(init.colors[5], init.panels[1].getBackground());

	}

	@Test
	public void swapping_colors_1_and_6() {
		init.panels[1].clicked();
		init.panels[6].clicked();

		assertEquals(init.colors[1], init.panels[6].getBackground());
		assertEquals(init.colors[6], init.panels[1].getBackground());

	}

	@Test
	public void swapping_colors_1_and_7() {
		init.panels[1].clicked();
		init.panels[7].clicked();

		assertEquals(init.colors[1], init.panels[7].getBackground());
		assertEquals(init.colors[7], init.panels[1].getBackground());

	}

	@Test
	public void swapping_colors_1_and_8() {
		init.panels[1].clicked();
		init.panels[8].clicked();

		assertEquals(init.colors[1], init.panels[8].getBackground());
		assertEquals(init.colors[8], init.panels[1].getBackground());

	}

	@Test
	public void swapping_colors_1_and_1() {
		init.panels[1].clicked();
		init.panels[1].clicked();

		assertEquals(init.colors[1], init.panels[1].getBackground());
	}

	@Test
	public void swapping_colors_2_and_1() {
		init.panels[2].clicked();
		init.panels[1].clicked();

		assertEquals(init.colors[2], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());

	}

	@Test
	public void swapping_colors_2_and_0() {
		init.panels[2].clicked();
		init.panels[0].clicked();

		assertEquals(init.colors[2], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[2].getBackground());

	}

	@Test
	public void swapping_colors_2_and_3() {
		init.panels[2].clicked();
		init.panels[3].clicked();

		assertEquals(init.colors[2], init.panels[3].getBackground());
		assertEquals(init.colors[3], init.panels[2].getBackground());

	}

	@Test
	public void swapping_colors_2_and_4() {
		init.panels[2].clicked();
		init.panels[4].clicked();

		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_2_and_5() {
		init.panels[2].clicked();
		init.panels[5].clicked();

		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[5], init.panels[2].getBackground());

	}

	@Test
	public void swapping_colors_2_and_6() {
		init.panels[2].clicked();
		init.panels[6].clicked();

		assertEquals(init.colors[2], init.panels[6].getBackground());
		assertEquals(init.colors[6], init.panels[2].getBackground());

	}

	@Test
	public void swapping_colors_2_and_7() {
		init.panels[2].clicked();
		init.panels[7].clicked();

		assertEquals(init.colors[2], init.panels[7].getBackground());
		assertEquals(init.colors[7], init.panels[2].getBackground());

	}

	@Test
	public void swapping_colors_2_and_8() {
		init.panels[2].clicked();
		init.panels[8].clicked();

		assertEquals(init.colors[2], init.panels[8].getBackground());
		assertEquals(init.colors[8], init.panels[2].getBackground());

	}

	@Test
	public void swapping_colors_2_and_2() {
		init.panels[2].clicked();
		init.panels[2].clicked();

		assertEquals(init.colors[2], init.panels[2].getBackground());
	}

	@Test
	public void swapping_colors_3_and_1() {
		init.panels[3].clicked();
		init.panels[1].clicked();

		assertEquals(init.colors[3], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[3].getBackground());

	}

	@Test
	public void swapping_colors_3_and_2() {
		init.panels[3].clicked();
		init.panels[2].clicked();

		assertEquals(init.colors[3], init.panels[2].getBackground());
		assertEquals(init.colors[2], init.panels[3].getBackground());

	}

	@Test
	public void swapping_colors_3_and_0() {
		init.panels[3].clicked();
		init.panels[0].clicked();

		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[3].getBackground());

	}

	@Test
	public void swapping_colors_3_and_4() {
		init.panels[3].clicked();
		init.panels[4].clicked();

		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_3_and_5() {
		init.panels[3].clicked();
		init.panels[5].clicked();

		assertEquals(init.colors[3], init.panels[5].getBackground());
		assertEquals(init.colors[5], init.panels[3].getBackground());

	}

	@Test
	public void swapping_colors_3_and_7() {
		init.panels[3].clicked();
		init.panels[7].clicked();

		assertEquals(init.colors[3], init.panels[7].getBackground());
		assertEquals(init.colors[7], init.panels[3].getBackground());

	}

	@Test
	public void swapping_colors_3_and_8() {
		init.panels[3].clicked();
		init.panels[8].clicked();

		assertEquals(init.colors[3], init.panels[8].getBackground());
		assertEquals(init.colors[8], init.panels[3].getBackground());

	}

	@Test
	public void swapping_colors_3_and_3() {
		init.panels[3].clicked();
		init.panels[3].clicked();

		assertEquals(init.colors[3], init.panels[3].getBackground());
	}

	@Test
	public void swapping_colors_5_and_1() {
		init.panels[5].clicked();
		init.panels[1].clicked();

		assertEquals(init.colors[5], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[5].getBackground());

	}

	@Test
	public void swapping_colors_5_and_2() {
		init.panels[5].clicked();
		init.panels[2].clicked();

		assertEquals(init.colors[5], init.panels[2].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());

	}

	@Test
	public void swapping_colors_5_and_3() {
		init.panels[5].clicked();
		init.panels[3].clicked();

		assertEquals(init.colors[5], init.panels[3].getBackground());
		assertEquals(init.colors[3], init.panels[5].getBackground());

	}

	@Test
	public void swapping_colors_5_and_4() {
		init.panels[5].clicked();
		init.panels[4].clicked();

		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_5_and_0() {
		init.panels[5].clicked();
		init.panels[0].clicked();

		assertEquals(init.colors[5], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[5].getBackground());

	}

	@Test
	public void swapping_colors_5_and_6() {
		init.panels[5].clicked();
		init.panels[6].clicked();

		assertEquals(init.colors[5], init.panels[6].getBackground());
		assertEquals(init.colors[6], init.panels[5].getBackground());

	}

	@Test
	public void swapping_colors_5_and_7() {
		init.panels[5].clicked();
		init.panels[7].clicked();

		assertEquals(init.colors[5], init.panels[7].getBackground());
		assertEquals(init.colors[7], init.panels[5].getBackground());

	}

	@Test
	public void swapping_colors_5_and_8() {
		init.panels[5].clicked();
		init.panels[8].clicked();

		assertEquals(init.colors[5], init.panels[8].getBackground());
		assertEquals(init.colors[8], init.panels[5].getBackground());

	}

	@Test
	public void swapping_colors_5_and_5() {
		init.panels[5].clicked();
		init.panels[5].clicked();

		assertEquals(init.colors[5], init.panels[5].getBackground());
	}

	@Test
	public void swapping_colors_6_and_1() {
		init.panels[6].clicked();
		init.panels[1].clicked();

		assertEquals(init.colors[6], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[6].getBackground());

	}

	@Test
	public void swapping_colors_6_and_2() {
		init.panels[6].clicked();
		init.panels[2].clicked();

		assertEquals(init.colors[6], init.panels[2].getBackground());
		assertEquals(init.colors[2], init.panels[6].getBackground());

	}

	@Test
	public void swapping_colors_6_and_3() {
		init.panels[6].clicked();
		init.panels[3].clicked();

		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[3], init.panels[6].getBackground());

	}

	@Test
	public void swapping_colors_6_and_4() {
		init.panels[6].clicked();
		init.panels[4].clicked();

		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());
	}

	@Test
	public void swapping_colors_6_and_5() {
		init.panels[6].clicked();
		init.panels[5].clicked();

		assertEquals(init.colors[6], init.panels[5].getBackground());
		assertEquals(init.colors[5], init.panels[6].getBackground());

	}

	@Test
	public void swapping_colors_6_and_0() {
		init.panels[6].clicked();
		init.panels[0].clicked();

		assertEquals(init.colors[6], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[6].getBackground());

	}

	@Test
	public void swapping_colors_6_and_7() {
		init.panels[6].clicked();
		init.panels[7].clicked();

		assertEquals(init.colors[6], init.panels[7].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());

	}

	@Test
	public void swapping_colors_6_and_8() {
		init.panels[6].clicked();
		init.panels[8].clicked();

		assertEquals(init.colors[6], init.panels[8].getBackground());
		assertEquals(init.colors[8], init.panels[6].getBackground());

	}

	@Test
	public void swapping_colors_6_and_6() {
		init.panels[6].clicked();
		init.panels[6].clicked();

		assertEquals(init.colors[6], init.panels[6].getBackground());
	}

	@Test
	public void swapping_colors_7_and_1() {
		init.panels[7].clicked();
		init.panels[1].clicked();

		assertEquals(init.colors[7], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[7].getBackground());

	}

	@Test
	public void swapping_colors_7_and_2() {
		init.panels[7].clicked();
		init.panels[2].clicked();

		assertEquals(init.colors[7], init.panels[2].getBackground());
		assertEquals(init.colors[2], init.panels[7].getBackground());

	}

	@Test
	public void swapping_colors_7_and_3() {
		init.panels[7].clicked();
		init.panels[3].clicked();

		assertEquals(init.colors[7], init.panels[3].getBackground());
		assertEquals(init.colors[3], init.panels[7].getBackground());

	}

	@Test
	public void swapping_colors_7_and_4() {
		init.panels[7].clicked();
		init.panels[4].clicked();

		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_7_and_5() {
		init.panels[7].clicked();
		init.panels[5].clicked();

		assertEquals(init.colors[7], init.panels[5].getBackground());
		assertEquals(init.colors[5], init.panels[7].getBackground());

	}

	@Test
	public void swapping_colors_7_and_6() {
		init.panels[7].clicked();
		init.panels[6].clicked();

		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[6], init.panels[7].getBackground());

	}

	@Test
	public void swapping_colors_7_and_0() {
		init.panels[7].clicked();
		init.panels[0].clicked();

		assertEquals(init.colors[7], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[7].getBackground());

	}

	@Test
	public void swapping_colors_7_and_8() {
		init.panels[7].clicked();
		init.panels[8].clicked();

		assertEquals(init.colors[7], init.panels[8].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());

	}

	@Test
	public void swapping_colors_7_and_7() {
		init.panels[7].clicked();
		init.panels[7].clicked();

		assertEquals(init.colors[7], init.panels[7].getBackground());
	}

	@Test
	public void swapping_colors_8_and_1() {
		init.panels[8].clicked();
		init.panels[1].clicked();

		assertEquals(init.colors[8], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_8_and_2() {
		init.panels[8].clicked();
		init.panels[2].clicked();

		assertEquals(init.colors[8], init.panels[2].getBackground());
		assertEquals(init.colors[2], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_8_and_3() {
		init.panels[8].clicked();
		init.panels[3].clicked();

		assertEquals(init.colors[8], init.panels[3].getBackground());
		assertEquals(init.colors[3], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_8_and_4() {
		init.panels[8].clicked();
		init.panels[4].clicked();

		assertEquals(init.colors[3], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[1].getBackground());
		assertEquals(init.colors[1], init.panels[2].getBackground());
		assertEquals(init.colors[6], init.panels[3].getBackground());
		assertEquals(init.colors[2], init.panels[5].getBackground());
		assertEquals(init.colors[7], init.panels[6].getBackground());
		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_8_and_5() {
		init.panels[8].clicked();
		init.panels[5].clicked();

		assertEquals(init.colors[8], init.panels[5].getBackground());
		assertEquals(init.colors[5], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_8_and_6() {
		init.panels[8].clicked();
		init.panels[6].clicked();

		assertEquals(init.colors[8], init.panels[6].getBackground());
		assertEquals(init.colors[6], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_8_and_7() {
		init.panels[8].clicked();
		init.panels[7].clicked();

		assertEquals(init.colors[8], init.panels[7].getBackground());
		assertEquals(init.colors[7], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_8_and_0() {
		init.panels[8].clicked();
		init.panels[0].clicked();

		assertEquals(init.colors[8], init.panels[0].getBackground());
		assertEquals(init.colors[0], init.panels[8].getBackground());

	}

	@Test
	public void swapping_colors_8_and_8() {
		init.panels[8].clicked();
		init.panels[8].clicked();

		assertEquals(init.colors[8], init.panels[8].getBackground());

	}

}
