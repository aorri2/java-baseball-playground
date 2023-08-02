package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	@Test
	@DisplayName("2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.")
	void CalculatorTest() {
		String input = "2 + 3 * 4 / 2";
		StringCalculator stringCalculator = new StringCalculator();
		assertThat(stringCalculator.calculate(input)).isEqualTo(10);
	}

}

