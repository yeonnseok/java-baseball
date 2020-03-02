package domain;

import java.util.Map;

public class GameResult {
    public static final int THREE_STRIKE = 3;

    private Map<BallMatch, Integer> gameResult;

    public GameResult(Player playerBalls, ComputerPlayer computerBalls) {
        this.gameResult = playerBalls.createGameResult(computerBalls);
    }

    public boolean isThreeStrike() {
        return gameResult.get(BallMatch.STRIKE) == THREE_STRIKE;
    }

    public Map<BallMatch, Integer> getResult() {
        return this.gameResult;
    }
}
