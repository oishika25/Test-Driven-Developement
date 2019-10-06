
public class Average {

	private int[] userNumbers;

	public Average() {
		userNumbers = new int[5];
	}

	public void getInput(ScannerWrapper scanner) {
		for (int i = 0; i < 5; i++) {
			userNumbers[i] = scanner.nextInt();
		}

	}

	public float getAverage(ScannerWrapper scanner) {
		getInput(scanner);
		float sum = 0;
		for (int n = 0; n < 5; n++) {
			sum += userNumbers[n];
		}
		float avg = 0;
		avg = sum / 5;
		return avg;
	}

}
