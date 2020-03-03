package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayerTest {
    @Test
    @DisplayName("test create PlayerBalls")
    void PlayerBalls가_제대로_생성되는지_테스트() {
        Generator manualGenerator = new ManualNumberGenerator("123");
        List<Ball> testBalls = new ArrayList<>();
        testBalls.add(Ball.createBall(1));
        testBalls.add(Ball.createBall(2));
        testBalls.add(Ball.createBall(3));
        assertThat(new Player(manualGenerator).getBalls()).isEqualTo(testBalls);
    }

    @Test
    @DisplayName("validate Duplicated Numbers")
    void PlayerBalls가_중복이_있는_경우_예외_처리() {
        Generator manualGenerator = new ManualNumberGenerator("122");
        assertThatThrownBy(() -> {
            new Player(manualGenerator);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("야구 게임의 숫자를 중복없이 입력해주세요.");
    }

    @Test
    @DisplayName("test return game result")
    void 게임_결과를_제대로_반환하는지_테스트() {
        Map<BallMatch, Integer> testResult = new HashMap<>();
        testResult.put(BallMatch.STRIKE, 2);
        testResult.put(BallMatch.BALL, 0);

        Generator manualNumber = new ManualNumberGenerator("124");
        Player playerBalls = new Player(manualNumber);
        ComputerPlayer computerBalls = new ComputerPlayer(manualNumber);

        assertThat(playerBalls.createGameResult(computerBalls)).isEqualTo(testResult);
    }
}
