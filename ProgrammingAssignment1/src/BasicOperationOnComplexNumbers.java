import java.util.Scanner;

public class BasicOperationOnComplexNumbers {

	Scanner sc = new Scanner(System.in);
	int x, y, a, b;

	public void makeChoice() {
		// TODO Auto-generated constructor stub

		System.out
				.println("--------------------------Basic Operations on Complex Numbers------------------------------");

		int choice;

		System.out.println("Pick one of the options listed below: ");
		System.out.println("1. Add 2 Complex Numbers");
		System.out.println("2. Substract 2 Complex Numbers");
		System.out.println("3. Multiply 2 Complex Numbers");
		System.out.println("4. Reciprocal of a Complex Number");
		System.out.println("5. Finding Complex Conjugate of a Complex Number");

		choice = sc.nextInt();

		BasicOperationOnComplexNumbers boocn = new BasicOperationOnComplexNumbers();

		switch (choice) {
		case 1:
			boocn.addition();

		case 2:
			boocn.substraction();

		case 3:
			boocn.multiplication();

		case 4:
			boocn.division();

		case 5:
			boocn.absoluteValue();

		case 6:
			boocn.reciprocal();

		case 7:
			boocn.complexConjugate();
		}
	}

	void addition() {

		System.out.println("--------------------------Addition (x+yi) + (a+bi)------------------------------");

		System.out.println("Let the equations to be added are: 'x+yi' and 'a+bi' ");

		System.out.println("Enter the value of 'x'");
		x = sc.nextInt();

		System.out.println("Enter the value of 'y'");
		y = sc.nextInt();

		System.out.println("Enter the value of 'a'");
		a = sc.nextInt();

		System.out.println("Enter the value of 'b'");
		b = sc.nextInt();

		System.out.println("Final Solution: " + (x + a) + " + (" + (y + b) + ") i");

	}

	void substraction() {
		System.out.println("--------------------------Substraction (x+yi) + (a+bi)------------------------------");

		System.out.println("Let the equations to be substracted are: 'x+yi' and 'a+bi' ");

		System.out.println("Enter the value of 'x'");
		x = sc.nextInt();

		System.out.println("Enter the value of 'y'");
		y = sc.nextInt();

		System.out.println("Enter the value of 'a'");
		a = sc.nextInt();

		System.out.println("Enter the value of 'b'");
		b = sc.nextInt();

		System.out.println("Final Solution: " + (x - a) + " + (" + (y - b) + ") i");
	}

	void multiplication() {
		System.out.println("--------------------------Multiplication (x+yi)(a+bi)------------------------------");

		System.out.println("Let the equations to be multiplied are: 'x+yi' and 'a+bi' ");

		System.out.println("Enter the value of 'x'");
		x = sc.nextInt();

		System.out.println("Enter the value of 'y'");
		y = sc.nextInt();

		System.out.println("Enter the value of 'a'");
		a = sc.nextInt();

		System.out.println("Enter the value of 'b'");
		b = sc.nextInt();

		System.out.println("Final Solution: " + ((a * x) - (y * b)) + " + (" + ((a * y) + (x * b)) + ") i");
	}

	void absoluteValue() {
		System.out.println("--------------------------Absolute Value of |x+yi|------------------------------");

		System.out.println("Find the value of : |x+yi|");

		System.out.println("Enter the value of 'x'");
		x = sc.nextInt();

		System.out.println("Enter the value of 'y'");
		y = sc.nextInt();

		double av = 1.0 * ((x * x) + (y * y));

		System.out.println("Absolute Value = " + Math.sqrt(av));

	}

	void reciprocal() {
		System.out.println("--------------------------Reciprocal of 'x+yi'------------------------------");

		System.out.println("Find the value of : 1/x+yi");

		System.out.println("Enter the value of 'x'");
		x = sc.nextInt();

		System.out.println("Enter the value of 'y'");
		y = sc.nextInt();

		int av = (x * x) + (y * y);

		System.out.println("Reciprocal = (" + x + "/" + av + ") + (" + y * (-1) + "/" + av + ") i");
	}

	void complexConjugate() {
		System.out.println("--------------------------Complex Conjugate of 'x+yi'------------------------------");

		System.out.println("Find the value of : (x+yi)*");

		System.out.println("Enter the value of 'x'");
		x = sc.nextInt();

		System.out.println("Enter the value of 'y'");
		y = sc.nextInt();

		System.out.println("Complex Conjugate = " + x + " + (" + ((-1) * y) + ") i");
	}

	void division() {
		System.out.println("--------------------------Division : (x+yi)/(a+bi)------------------------------");

		System.out.println("Let the numerator be : 'x+yi' and the denominator be : 'a+bi' ");

		System.out.println("Enter the value of 'x'");
		x = sc.nextInt();

		System.out.println("Enter the value of 'y'");
		y = sc.nextInt();

		System.out.println("Enter the value of 'a'");
		a = sc.nextInt();

		System.out.println("Enter the value of 'b'");
		b = sc.nextInt();

		int av = (a * a) + (b * b);

		System.out.println("Final Solution: (" + ((a * x) + (b * y)) + "/" + av + ") + (" + ((a * y) - (b * x)) + "/"
				+ av + ") i");
	}

	double absoluteValue(int x, int y) {
		this.x = x;
		this.y = y;

		double av = 1.0 * ((x * x) + (y * y));

		return Math.sqrt(av);

	}
}
