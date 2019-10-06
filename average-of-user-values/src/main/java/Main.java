
public class Main {

	public static void main(String[] args) {
		Average average = new Average();
		float avg = average.getAverage(new ScannerWrapper());
		System.out.println(avg);
	}

}
