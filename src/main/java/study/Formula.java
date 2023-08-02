package study;

import java.util.Objects;

public class Formula {
	private final String formula;

	public Formula(String formula) {
		Objects.requireNonNull(formula);
		this.formula = formula;
	}

	public String[] split(String delimeter) {
		return formula.split(delimeter);
	}
}
