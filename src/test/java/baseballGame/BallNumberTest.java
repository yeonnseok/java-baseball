package baseballGame;

import domain.BallNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallNumberTest {
    @Test
    @DisplayName("1~9까지 범위를 벗어나는지 확인")
    void checkNumberRangeTest(){
        assertThatThrownBy(() -> {
            new BallNumber(0);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("각 자리 숫자는 1~9까지로 이루어져야 합니다.");
    }
}
