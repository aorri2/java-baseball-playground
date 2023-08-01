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
    void givenNumber_whenSplitString_thenReturnSplittedNumbers() {
        String[] actual = "1,2".split(",");
        assertThat(actual).containsExactly("1","2");
    }

    @Test
    @DisplayName("'1,'를 split 했을 때 1로 나와야 한다.")
    void givenNumber_whenSplitString_thenReturnSplittedNumber() {
        String[] actual = "1,".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    @DisplayName("('1,2)'를 subString 했을 때 ()를 제거하고 '1,2'를 반환해야 한다.")
    void givenNumberInParentheses_whensubstring_thenReturnNumber() {
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }


}
