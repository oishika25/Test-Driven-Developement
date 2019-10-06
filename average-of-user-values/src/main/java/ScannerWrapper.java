import java.util.Scanner;

public class ScannerWrapper {
	Scanner scanner;

	public ScannerWrapper() {
		scanner = new Scanner(System.in);
	}

	public int nextInt() {
		return scanner.nextInt();
	}

}
