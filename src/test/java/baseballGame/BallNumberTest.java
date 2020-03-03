package baseballGame;

import domain.BallNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallNumberTest {
    @DisplayName("1~9까지 범위를 벗어나는지 확인")
    @ParameterizedTest
    @ValueSource(ints = {0, 10, 100})
    void checkNumberRangeTest(int input){
        assertThatThrownBy(() -> {
            new BallNumber(input);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("각 자리 숫자는 1~9까지로 이루어져야 합니다.");
    }
}
