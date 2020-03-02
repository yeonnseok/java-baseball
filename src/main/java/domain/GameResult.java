package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameResult {
    private Map<BallMatch, Integer> gameResult;
    public GameResult(Player playerBalls, ComputerPlayer computerBalls) {
        this.gameResult = playerBalls.createGameResult(computerBalls);
    }

}
