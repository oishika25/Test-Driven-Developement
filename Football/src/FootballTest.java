import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FootballTest {

	@Test
	void read_file() {
		Football football = new Football();
		football.load_data();
		assertEquals(football.data.get(0)[0], "1.");
	}

	@Test
	void get_for() {
		Football football = new Football();
		football.load_data();
		int data = football.get_for(1);
		assertEquals(data, 79);
		assertEquals(football.get_for(18), 41);
	}

	@Test
	void get_against() {
		Football football = new Football();
		football.load_data();
		int data = football.get_against(1);
		assertEquals(data, 36);
		assertEquals(football.get_against(18), 64);
	}

	@Test
	void get_for_against_difference() {
		Football football = new Football();
		football.load_data();
		int data = football.get_for_against_difference(1);
		assertEquals(data, 43);
		assertEquals(football.get_for_against_difference(18), 23);
	}

	@Test
	void get_team_with_smallest_difference() {
		Football football = new Football();
		football.load_data();
		String data = football.get_team_with_smallest_difference();
		assertEquals(data, "Aston_Villa");
	}
}
