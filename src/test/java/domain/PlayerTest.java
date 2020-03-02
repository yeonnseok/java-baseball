package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayerTest {
    @Test
    void PlayerBalls가_제대로_생성되는지_테스트() {
        List<Ball> testBalls = new ArrayList<>();
        testBalls.add(Ball.createBall(1));
        testBalls.add(Ball.createBall(2));
        testBalls.add(Ball.createBall(3));
        assertThat(new Player("123").getBalls()).isEqualTo(testBalls);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "12", "1234", "12345"})
    void PlayerBalls가_3개의_숫자가_아닌_경우_예외_처리() {
        assertThatThrownBy(() -> {
            new Player("1234");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("야구 게임의 숫자는 3개로 이루어져있습니다.");
    }

    @Test
    void PlayerBalls가_중복이_있는_경우_예외_처리() {
        assertThatThrownBy(() -> {
            new Player("112");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("야구 게임의 숫자를 중복없이 입력해주세요.");
    }

    @Test
    void 게임_결과를_제대로_반환하는지_테스트() {
        Map<BallMatch, Integer> testResult = new HashMap<>();
        testResult.put(BallMatch.STRIKE, 2);
        testResult.put(BallMatch.BALL, 0);

        Generator manualNumber = new ManualNumberGenerator();
        Player playerBalls = new Player("124");
        ComputerPlayer computerBalls = new ComputerPlayer(manualNumber);

        assertThat(playerBalls.createGameResult(computerBalls)).isEqualTo(testResult);
    }
}
