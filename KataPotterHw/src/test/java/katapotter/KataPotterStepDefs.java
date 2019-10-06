package katapotter;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KataPotterStepDefs {
	int choice;
	KataPotter katapotter = new KataPotter();
	int[] books = new int[20];
	int book;
	float cost = 8;
	float totalPrice;
	double actual;
	int i = 0;

	@Given("^the user chose book (\\d+)$")
	public void the_user_chooses_book(int book) throws Throwable {
		this.book = book;
		books = katapotter.storeInBooks(book);
		System.out.println("Books[] : ");
		for (i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
	}

	@When("^the user checks out $")
	public void the_user_checks_out() throws Throwable {
		books[0] = book;
		actual = katapotter.getPrice(books);
	}

	@Then("^the system should charge (.+) EUR$")
	public void the_system_should_charge_EUR(double expected) throws Throwable {
		assertEquals(expected, actual, 0);
	}

}
