package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("'1,2'를 split 했을 때 1과 2로 나와야 한다.")
    void givenNumber_whenSplitString_thenReturnSplittedNumber() {
        String[] actual = "1,2".split(",");
        assertThat(actual).containsExactly("1","2");
    }
}
