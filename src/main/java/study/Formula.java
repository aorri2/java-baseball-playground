package study;

import java.util.Objects;

public class Formula {
	private final String formula;

	public Formula(String formula) {
		this.formula = formula;
		notEmpty();
	}

	public void notEmpty() {
		if (formula == null || formula.equals("")) {
			throw new IllegalArgumentException();
		}
	}

	public String[] split(String delimeter) {
		return formula.split(delimeter);
	}
}
