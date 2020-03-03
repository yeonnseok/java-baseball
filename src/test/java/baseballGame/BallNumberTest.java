package baseballGame;

import domain.BallNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallNumberTest {
    @Test
    @DisplayName("1~9까지 범위를 벗어나는지 확인")
    void checkNumberRangeTest(){
        assertThatThrownBy(() -> {
            new BallNumber("0");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("각 자리 숫자는 1~9까지로 이루어져야 합니다.");
    }

    @Test
    @DisplayName("숫자가 아닌 문자가 입력되는 지 확인")
    void checkNotNumberTest(){
        assertThatThrownBy(() -> {
            new BallNumber("가");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자만 입력가능합니다.");
    }

    @ParameterizedTest
    @DisplayName("빈문자열이나 공백이 입력되는 지 확인")
    @EmptySource
    void checkEmptyNumberTest(String input){
        assertThatThrownBy(() -> {
            new BallNumber(input);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자가 입력되지 않았습니다.");
    }

    @ParameterizedTest
    @DisplayName("null 이 입력되는 지 확인")
    @NullSource
    void checkNullNumberTest(String input){
        assertThatThrownBy(() -> {
            new BallNumber(input);
        }).isInstanceOf(NullPointerException.class)
                .hasMessage("숫자가 입력되지 않았습니다.");
    }
}
