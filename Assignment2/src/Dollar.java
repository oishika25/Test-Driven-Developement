class Dollar extends Money {

	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	@Override
	String currency() {
		return currency;
	}

	@Override
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
}