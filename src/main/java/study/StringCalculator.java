package study;

public class StringCalculator {
	private String[] operators = {"+", "-", "*", "/"};

	public int calculate(String formula) {
		String[] input = formula.split(" ");
		int result = Integer.parseInt(input[0]);
		String operator = "";

		for (int i = 1; i < input.length; i++) {
			if (isPermittedOperator(input[i])) {
				operator = input[i];
			} else {
				result = partCalculate(operator, result, input[i]);
			}
		}
		return result;
	}

	private boolean isPermittedOperator(String input) {
		for (String operator : operators) {
			if (input.equals(operator)) {
				return true;
			}
		}
		return false;
	}

	private int partCalculate(String operator, int result, String input) {
		if (input == null || input.equals("")) {
			throw new IllegalArgumentException();
		}

		switch (operator) {
			case "+":
				return plus(result, input);
			case "-":
				return minus(result, input);
			case "*":
				return multiply(result, input);
			case "/":
				return division(result, input);
			default:
				throw new IllegalArgumentException();
		}

	}

	public int plus(int result, String input) {
		return result + Integer.parseInt(input);
	}

	public int minus(int result, String input) {
		return result - Integer.parseInt(input);
	}

	public int multiply(int result, String input) {
		return result * Integer.parseInt(input);
	}

	public int division(int result, String input) {
		return result / Integer.parseInt(input);
	}
}
