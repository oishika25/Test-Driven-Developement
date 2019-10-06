import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DollarTest {

	@Test
	void Multiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	public void Equality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}

	@Test
	void Franc_Multiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}

	@Test
	public void Currency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}

	@Test
	public void Different_Class_Equality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}

	@Test
	public void Simple_Addition() {
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
	}

	@Test
	public void Plus_Returns_Sum() {
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
	}

	@Test
	public void Reduce_Sum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(7), result);
	}

	@Test
	public void Reduce_Money() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(1), "USD");
		assertEquals(Money.dollar(1), result);
	}

	@Test
	public void Reduce_Money_Different_Currency() {
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result = bank.reduce(Money.franc(2), "USD");
		assertEquals(Money.dollar(1), result);
	}

//	@Test
//	public void Array_Equals() {
//		assertEquals(new Object[] { "abc" }, new Object[] { "abc" });
//	}

	@Test
	public void Identity_Rate() {
		assertEquals(1, new Bank().rate("USD", "USD"));
	}

	@Test
	public void Mixed_Addition() {
		Expression fiveBucks = Money.dollar(5);
		Expression tenFrancs = Money.franc(10);
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
		assertEquals(Money.dollar(10), result);
	}

	@Test
	public void Sum_Plus_Money() {
		Expression fiveBucks = Money.dollar(5);
		Expression tenFrancs = Money.franc(10);
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);
		Expression sum = new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(15), result);
	}

	@Test
	public void Sum_Times() {
		Expression fiveBucks = Money.dollar(5);
		Expression tenFrancs = Money.franc(10);
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);
		Expression sum = new Sum(fiveBucks, tenFrancs).times(2);
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(20), result);
	}
}