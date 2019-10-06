package katapotter;

import java.util.HashMap;
import java.util.Map;

public class KataPotter {
	int i = 0;
	int books[] = new int[20];

	public double getPrice(int[] books) {
		double cost = books.length * 8;
		Map<Integer, Integer> uniqueBooks;
		uniqueBooks = new HashMap<Integer, Integer>();
		for (int i = 0; i < books.length; i++) {
			if (!uniqueBooks.containsKey(books[i])) {
				uniqueBooks.put(books[i], 0);
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

	public int[] storeInBooks(int book) {
		System.out.println("Book : " + book);
		books[i] = book;
		return books;
	}

	public static void main(String... args) {
		KataPotter katapotter = new KataPotter();
		int books[] = { 0, 1, 2, 3, 4 };
		katapotter.getPrice(books);
	}
}
