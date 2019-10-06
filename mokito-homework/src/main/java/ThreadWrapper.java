
public class ThreadWrapper {
	public void sleep(int object) {
		try {
			Thread.sleep(object);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
