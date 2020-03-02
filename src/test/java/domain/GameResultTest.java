package domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GameResultTest {
    @Test
    void 게임의_결과를_제대로_반환하는지_테스트() {
        Map<BallMatch, Integer> testResult = new HashMap<>();
        testResult.put(BallMatch.STRIKE, 2);
        testResult.put(BallMatch.BALL, 1);
        testResult.put(BallMatch.NONE, 6);

        List<Ball> playerBalls = new ArrayList<>();
        List<Ball> computerBalls = new ArrayList<>();

        GameResult result = new GameResult();
        assertThat(result.countGameResult(playerBalls, computerBalls)).isEqualTo(testResult);
    }
}
