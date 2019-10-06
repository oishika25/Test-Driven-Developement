
public class ConsoleThread extends Thread {

	public void start(SystemWrapper systemWrapper, ThreadWrapper threadWrapper) {
		int i;
		systemWrapper.println("Starting...");
		for (i = 0; i < 5; i++) {
			try {
				threadWrapper.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			systemWrapper.println("Waited ");
			systemWrapper.println(i + 1);
			systemWrapper.println(" second" + "\n");
			systemWrapper.println("");
		}
	}

}
