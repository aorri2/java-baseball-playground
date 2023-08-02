package study;

import java.util.function.BinaryOperator;

public enum Operator {
	PLUS("+",(firstOperand,secondOperand) -> firstOperand + secondOperand),
	MINUS("-",(firstOperand,secondOperand) -> firstOperand - secondOperand),
	MULTIPLY("*",(firstOperand,secondOperand) -> firstOperand * secondOperand),
	DIVIDE("/",(firstOperand,secondOperand) -> firstOperand / secondOperand),
	;

	private final String symbol;
	private final BinaryOperator<Integer> operation;
	Operator(String symbol, BinaryOperator<Integer> operation) {
		this.symbol = symbol;
		this.operation = operation;
	}

	public String getSymbol() {
		return symbol;
	}

	public int operate(int firstOperand, int secondOperand) {
		return operation.apply(firstOperand, secondOperand);
	}
}
