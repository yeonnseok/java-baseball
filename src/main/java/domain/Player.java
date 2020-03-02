package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    public static final int BALLS_SIZE = 3;
    private List<Ball> playerBalls;

    public Player(String playerBalls) {
        validateBallsCount(playerBalls);
        this.playerBalls = BallsFactory.createPlayerBalls(playerBalls);
        validateBallsSize();
    }

    private void validateBallsCount(String playerBalls) {
        if (playerBalls.length() != BALLS_SIZE) {
            throw new IllegalArgumentException("야구 게임의 숫자는 3개로 이루어져있습니다.");
        }
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
        for (int i = 0; i < 3; i++) {
            computerBalls.matchResult(gameResult, playerBalls.get(i), i);
        }
        return gameResult;
    }

    private void initGameResult(Map<BallMatch, Integer> gameResult) {
        for (BallMatch result : BallMatch.values()) {
            gameResult.put(result, 0);
        }
    }
}
