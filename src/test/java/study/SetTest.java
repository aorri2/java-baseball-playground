package study;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@Test
	@DisplayName("set은 이미 중복된 값이 add되면, set에 추가하지 않는다.")
	void size() {
		assertThat(numbers.size()).isEqualTo(3);
	}


	@ParameterizedTest
	@DisplayName("ValueSoruce를 통해 파라미터를 외부 주입 할 수 있다.")
	@ValueSource(ints = {1,2,3})
	void contains(int number) {
		assertTrue(numbers.contains(number));
	}

	@ParameterizedTest
	@DisplayName("CsvSource를 통해 파라미터를 외부 주입 할 수 있다.")
	@CsvSource(value = {"1:true", "2:true","3:true","4:false","5:false"},delimiter = ':')
	void contains_bothCase(int number,boolean expected) {
		assertThat(numbers.contains(number)).isEqualTo(expected);
	}
}
