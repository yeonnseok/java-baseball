package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    public static final int BALLS_SIZE = 3;
    private List<Ball> playerBalls;

    public Player(Generator manualGenerator) {
        BallsFactory playerBallsFactory = new PlayerBallsFactory();
        this.playerBalls = playerBallsFactory.createBalls(manualGenerator);
        validateBallsSize();
    }

    private void validateBallsSize() {
        if (this.playerBalls.size() != BALLS_SIZE) {
            throw new IllegalArgumentException("야구 게임의 숫자를 중복없이 입력해주세요.");
        }
    }

    public List<Ball> getBalls() {
        return this.playerBalls;
    }

    public Map<BallMatch, Integer> createGameResult(ComputerPlayer computerBalls) {
        Map<BallMatch, Integer> gameResult = new HashMap<>();
        initGameResult(gameResult);
        for (int i = 0; i < BALLS_SIZE; i++) {
            Ball playerBall = playerBalls.get(i);
            computerBalls.matchResult(gameResult, playerBall, i);
        }
        return gameResult;
    }

    private void initGameResult(Map<BallMatch, Integer> gameResult) {
        for (BallMatch result : BallMatch.values()) {
            gameResult.put(result, 0);
        }
    }
}
