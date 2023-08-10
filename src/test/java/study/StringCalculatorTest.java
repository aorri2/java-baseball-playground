package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	private Formula input;
	private StringCalculator stringCalculator;

	@BeforeEach
	void setUp() {
		input = new Formula("2 + 3 * 4 / 2");
		stringCalculator = new StringCalculator(input);
	}

	@Test
	@DisplayName("2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.")
	void CalculatorTest() {

		assertThat(stringCalculator.calculateFormula()).isEqualTo(10);

	}

	@Test
	@DisplayName("입력 값 중 사칙연산이 아닌 기호가 들어갈 경우 IllegalArgumentException을 던진다.")
	void unPermittedOperator() {
		input = new Formula("2 $ 6 + 5 / 4");
		StringCalculator calculator = new StringCalculator(input);
		assertThatThrownBy(calculator::calculateFormula).isInstanceOf(IllegalArgumentException.class);
	}
}

