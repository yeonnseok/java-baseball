package domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class BallTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    void 야구공이_범위_내의_수가_아닌_경우_예외_처리(int ballNumber) {
        assertThatThrownBy(() -> {
            new Ball(ballNumber);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("공은 1~9 사이의 숫자여야합니다.");
    }
}
