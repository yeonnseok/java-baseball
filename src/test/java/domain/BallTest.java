package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class BallTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    @DisplayName("오류를 일으키는 경계값을 테스트")
    void 야구공이_범위_내의_수가_아닌_경우_예외_처리(int ballNumber) {
        assertThatThrownBy(() -> {
            Ball.createBall(ballNumber);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("공은 1~9 사이의 숫자여야합니다.");
    }
}
