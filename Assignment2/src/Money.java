class Money implements Expression {
	protected int amount;

	protected String currency;

	String currency() {
		return currency;
	}

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	@Override
	public Expression times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	@Override
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}

//	Money times(int multiplier) {
//		return new Money(amount * multiplier, currency);
//	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

	@Override
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}

	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
}