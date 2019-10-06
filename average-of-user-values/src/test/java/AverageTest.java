import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class AverageTest {

	@Mock
	ScannerWrapper user_input;
	float DELTA = 0.00001;

	@Test
	public void check_that_user_input_is_gotten_five_times() {
		Average average = new Average();
		user_input = Mockito.mock(ScannerWrapper.class);
		average.getInput(user_input);
		Mockito.verify(user_input, Mockito.times(5)).nextInt();

	}

	@Test
	public void check_average_given_1_to_5() {
		Average average = new Average();
		user_input = Mockito.mock(ScannerWrapper.class);
		Mockito.when(user_input.nextInt()).thenReturn(1).thenReturn(2).thenReturn(3).thenReturn(4).thenReturn(5);
		assertEquals(3, average.getAverage(user_input), DELTA);
	}

}
