class Franc extends Money {

	Franc(int amount, String currency) {
		super(amount, currency);
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	@Override
	String currency() {
		return currency;
	}

	@Override
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
}