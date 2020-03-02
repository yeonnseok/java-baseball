package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ResultCalculatorTest {
    BaseballNumbers input;
    BaseballNumbers expected;

    @BeforeEach
    private void setUp() {
        input = new BaseballNumbers(
                new ArrayList(Arrays.asList(
                        new BaseballNumber(1),
                        new BaseballNumber(2),
                        new BaseballNumber(3)
                ))
        );
        expected = new BaseballNumbers(
                new ArrayList(Arrays.asList(
                        new BaseballNumber(1),
                        new BaseballNumber(3),
                        new BaseballNumber(2)
                ))
        );
    }

    @DisplayName("스트라이크 계산 테스트")
    @Test
    void calculateStrikeTest() {
        Assertions.assertThat(ResultCalculator.calculateStrike(input, expected)).isEqualTo(1);
    }

    @DisplayName("볼 계산 테스트")
    @Test
    void calculateBallTest() {
        Assertions.assertThat(ResultCalculator.calculateBall(input, expected)).isEqualTo(2);
    }
}
