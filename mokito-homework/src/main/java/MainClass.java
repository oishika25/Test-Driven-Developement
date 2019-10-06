
public class MainClass {

	public static void main(String... args) {
		ConsoleThread ct = new ConsoleThread();
		SystemWrapper pw = new SystemWrapper();
		ThreadWrapper tw = new ThreadWrapper();
		ct.start(pw, tw);
	}
}
