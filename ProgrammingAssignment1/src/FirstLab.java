import java.text.DecimalFormat;
import java.util.Scanner;

// Implement your own Complex Number, Matrix, and Vector class.
//Verify your classes work by recomputing the problems from Lab 1 and Lab 2.

public class FirstLab {

	DecimalFormat decFormat3 = new DecimalFormat("#.000");
	DecimalFormat decFormat4 = new DecimalFormat("#.0000");
	static Scanner sc = new Scanner(System.in);

	public static void main(String... args) {
		int choice;
		FirstLab m = new FirstLab();
		System.out.println("Pick one of the options listed below: ");
		System.out.println("1. Solving Quadratic Equation");
		System.out.println("2. Evaluating 'i' with given power");
		System.out.println("3. Finding Complex number for e^(ix)");
		System.out.println("4. Basic operations on Complex Numbers");
		System.out.println("5. Calculating 'r' and 'theta' ");

		choice = sc.nextInt();
		switch (choice) {
		case 1:
			m.quadraticEquation();

		case 2:
			m.evaluatei();

		case 3:
			m.findComplexEqnForeix();

		case 4:
			BasicOperationOnComplexNumbers b = new BasicOperationOnComplexNumbers();
			b.makeChoice();

		case 5:
			m.thetaAndr();
		}

//		int temp, rootValue;
//		double z, dec, tem;
//		double val = 32.0;
//		z = Math.sqrt(val);
//		temp = (int) z;
//		rootValue = (int) val - (temp * temp);
//		System.out.println(temp + "sqrt(" + rootValue + ")");
//
//		Main m = new Main();
//		m.quadraticEquation(6, 4, 5);

	}

	void quadraticEquation() {

		System.out.println("--------------------------Quadratic Equation------------------------------");

		int a; // a is the numerical coefficient of x^2 of the quadratic equation
		int b; // b is the numerical coefficient of x of the quadratic equation
		int c; // c is the numerical constant of the quadratic equation

		System.out.println("Enter the numerical coefficient of x^2");
		a = sc.nextInt();

		System.out.println("Enter the numerical coefficient of x");
		b = sc.nextInt();

		System.out.println("Enter the constant");
		c = sc.nextInt();

		double x;
		double z;

		x = (b * b) - (4.0 * a * c);

		if (x < 0) {

			x = x * (-1);

			z = Math.sqrt(x);

			System.out.println("(" + b * (-1) + " + " + decFormat3.format(z) + " i " + ") /" + (2 * a));
			System.out.println("(" + b * (-1) + " - " + decFormat3.format(z) + " i " + ") /" + (2 * a));
		}

		else {
			z = Math.sqrt(x);

			double root, rootPos, rootNeg, decPos, decNeg;
			int a2 = a * 2;
			root = b * (-1);
			rootPos = (root + z) / (a2);
			rootNeg = (root - z) / (a2);

			decPos = (root + z) - (int) rootPos * a2;
			decNeg = (root + z) - (int) rootNeg * a2;

			System.out.print("First Root : ");
			if (decPos < 0) {
				System.out.println((int) rootPos + (int) decPos + "/" + a2);
			} else if (decPos == 0) {
				System.out.println((int) rootPos);
			} else {
				System.out.println((int) rootPos + " + " + (int) decPos + "/" + a2);
			}

			System.out.print("Second Root : ");
			if (decNeg > 0) {
				System.out.println((int) rootNeg + (int) decNeg + "/" + a2);
			} else if (decNeg == 0) {
				System.out.println((int) rootNeg);
			} else {
				System.out.println((int) rootNeg + " + " + (int) decNeg + "/" + a2);
			}
		}

	}

	void evaluatei() {
		System.out.println("--------------------------Evaluating i^a------------------------------");

		System.out.println("Enter the value of a : "); // a is the power of i
		int a;
		a = sc.nextInt();

		if (a % 4 == 0)
			System.out.println("Value of i^" + a + " = 1");
		else if (a % 4 == 1)
			System.out.println("Value of i^" + a + " = i");
		else if (a % 4 == 2)
			System.out.println("Value of i^" + a + " = -1");
		else
			System.out.println("Value of i^" + a + " = -i");
	}

	void findComplexEqnForeix() {
		System.out.println("--------------------------Complex number for e^(ix)------------------------------");

		System.out.println("Enter the value of x in e^(ix) : "); // Value of x in e^(ix)
		double x;
		x = sc.nextDouble();

		if (Math.sin(x) < 0) {
			if (Math.cos(x) == 0)
				System.out.println("Final Equation: " + decFormat4.format(Math.sin(x)) + " i");
			else
				System.out.println("Final Equation: " + decFormat4.format(Math.cos(x)) + " "
						+ decFormat4.format(Math.sin(x)) + " i");
		} else if (Math.sin(x) == 0) {
			if (Math.cos(x) == 0)
				System.out.println("Final Equation: " + 0);
			else
				System.out.println("Final Equation: " + decFormat4.format(Math.cos(x)));

		} else if (Math.sin(x) > 0) {
			if (Math.cos(x) == 0)
				System.out.println("Final Equation: " + decFormat4.format(Math.sin(x)) + " i");
			else
				System.out.println("Final Equation: " + decFormat4.format(Math.cos(x)) + " + "
						+ decFormat4.format(Math.sin(x)) + " i");
		}
	}

	void thetaAndr() {
		System.out.println("--------------------------Theta and Value of r------------------------------");

		System.out.println("Find the value of theta : tan^(-1)(y/x) and r : |x+yi|");
		int x, y;

		double r;

		System.out.println("Enter the value of 'x'");
		x = sc.nextInt();

		System.out.println("Enter the value of 'y'");
		y = sc.nextInt();

		BasicOperationOnComplexNumbers bc = new BasicOperationOnComplexNumbers();
		r = bc.absoluteValue(x, y);

		System.out.println("Value of r = " + decFormat4.format(r));

		double angle = ((y * 1.0) / (x * 1.0));

		System.out.println(angle);
		System.out.println("Theta =" + decFormat4.format(Math.atan(angle)));
	}

}
