package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class BallTest {
    @Test
    void 야구공이_범위_내의_수인지_검증() {
        assertThatThrownBy(() -> {
            Ball.createBall(0);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("공은 1~9 사이의 숫자여야합니다.");
    }
}
