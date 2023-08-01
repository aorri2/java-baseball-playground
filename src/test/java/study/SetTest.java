package study;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SetTest {
	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		numbers.add(2);
	}

	@Test
	@DisplayName("set은 이미 중복된 값이 add되면, set에 추가하지 않는다.")
	void size() {
		assertThat(numbers.size()).isEqualTo(2);
	}
}
