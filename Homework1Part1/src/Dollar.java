
class Dollar extends Money {

	private String currency;

	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	@Override
	String currency() {
		return currency;
	}

	@Override
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

}