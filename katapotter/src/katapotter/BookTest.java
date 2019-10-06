package katapotter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BookTest {

	@Test
	public void checkout_nothing() {
		int[] books = new int[0];
		assertEquals(0, Book.checkout(books));
	}

	@Test
	public void checkout_one_book() {
		int[] books = { 1 };
		assertEquals(8, Book.checkout(books));
	}

	@Test
	public void checkout_two_books() {
		int[] books = { 1, 1 };
		assertEquals(16, Book.checkout(books));
	}

	@Test
	public void checkout_two_different_books() {
		int[] books = { 1, 2 };
		assertEquals(15.2, Book.checkout(books));
	}

	@Test
	public void checkout_one_different_two_same_books() {
		int[] books = { 1, 1, 3 };
		assertEquals(22.8, Book.checkout(books));
	}

	@Test
	public void checkout_five_different_books() {
		int[] books = { 1, 2, 3, 4, 5 };
		assertEquals(30, Book.checkout(books));
	}

	@Test
	public void checkout_8_books_6_same_5_differences() {
		int[] books = { 0, 0, 1, 1, 2, 2, 3, 4 };
		assertEquals(48, Book.checkout(books));
	}

	@Test
	public void checkout_23_books_23_same_5_differences() {
		int[] books = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4 };
		assertEquals(138, Book.checkout(books));
	}

	@Test
	public void boris_test_case() {
		int[] books = { 0, 0, 1, 1, 2, 2, 3, 4 };
		assertEquals(51.2, Book.checkout(books));
	}
}
