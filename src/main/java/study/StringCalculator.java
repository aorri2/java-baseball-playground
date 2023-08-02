package study;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {

	private Formula formula;
	private int result = 0;
	private Operator currentOperator = Operator.PLUS;

	public StringCalculator(Formula formula) {
		this.formula = formula;
	}

	public int calculateFormula() {
		for (String input : formula.split(" ")) {
			calculatePartial(input);
		}
		return result;
	}

	private void calculatePartial(String input) {
		String regulaExpression = "\\d";

		if (Pattern.matches(regulaExpression,input)) {
			result = currentOperator.operate(result, Integer.parseInt(input));
			return;
		}

		Arrays.stream(Operator.values())
			.filter(operator -> operator.getSymbol().equals(input))
			.forEach(operator -> currentOperator = operator);

		throw new IllegalArgumentException();
	}
}
