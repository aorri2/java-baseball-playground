package study;

import java.util.Collections;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operator {
	PLUS("+",(firstOperand,secondOperand) -> firstOperand + secondOperand),
	MINUS("-",(firstOperand,secondOperand) -> firstOperand - secondOperand),
	MULTIPLY("*",(firstOperand,secondOperand) -> firstOperand * secondOperand),
	DIVIDE("/",(firstOperand,secondOperand) -> firstOperand / secondOperand),
	;

	private static final Map<String,Operator> operators = Collections.unmodifiableMap(
		Stream.of(values()).collect(Collectors.toMap(operator->operator.getSymbol(),operator -> operator)));
	private final String symbol;
	private final BinaryOperator<Integer> operation;
	Operator(String symbol, BinaryOperator<Integer> operation) {
		this.symbol = symbol;
		this.operation = operation;
	}

	public String getSymbol() {
		return symbol;
	}

	public static Operator findOperator(String symbol) {
		Operator operator = operators.get(symbol);

		if (operator == null) {
			throw new IllegalArgumentException();
		}
		return operator;
	}

	public int operate(int firstOperand, int secondOperand) {
		return operation.apply(firstOperand, secondOperand);
	}
}
