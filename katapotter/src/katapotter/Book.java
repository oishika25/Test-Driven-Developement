package katapotter;

import java.util.HashMap;

public class Book {

	public static double checkout(int[] books) {
		double cost = books.length * 8;
		Map<Integer, Integer> uniqueBooks = new Map<>();
		for (int i = 0; i < books.length; i++) {
			if (!uniqueBooks.contains(books[i])) {
				uniqueBooks.add(books[i]);
			}
		}

		double discount = 0.0;
		switch (uniqueBooks.size()) {
		case 2:
			discount = .05;
			break;
		case 3:
			discount = .10;
			break;
		case 4:
			discount = .20;
			break;
		case 5:
			discount = .25;
			break;

		}

		return cost - (cost * discount);
	}

}
