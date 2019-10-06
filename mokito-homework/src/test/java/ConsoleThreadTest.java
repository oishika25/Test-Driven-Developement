import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ConsoleThreadTest {

	ConsoleThread consoleThread;

	@Mock
	ThreadWrapper threadWrapper;

	@Test
	public void start_thread() {
		ConsoleThread ctw = new ConsoleThread();

		SystemWrapper systemWrapper = Mockito.mock(SystemWrapper.class);
		ThreadWrapper threadWrapper = Mockito.mock(ThreadWrapper.class);

		ctw.start(systemWrapper, threadWrapper);

// dynamic		
//		for (int i = 1; i <= 5; i++) {
//			Mockito.verify(SystemWrapper).print(1);
//		}

//hardcoded
		Mockito.verify(systemWrapper).println(1);
		Mockito.verify(systemWrapper).println(2);
		Mockito.verify(systemWrapper).println(3);
		Mockito.verify(systemWrapper).println(4);
		Mockito.verify(systemWrapper).println(5);
		Mockito.verify(threadWrapper, Mockito.times(5)).sleep(1000);
	}

}
