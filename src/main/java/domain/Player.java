package domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Ball> playerBalls;

    public Player(String playerBalls) {
        validateBallsCount(playerBalls);
        this.playerBalls = BallsFactory.createPlayerBalls(playerBalls);
        validateBallsSize();
    }

    private void validateBallsCount(String playerBalls) {
        if (playerBalls.length() != 3) {
            throw new IllegalArgumentException("야구 게임의 숫자는 3개로 이루어져있습니다.");
        }
    }

    private void validateBallsSize() {
        if (this.playerBalls.size() != 3) {
            throw new IllegalArgumentException("야구 게임의 숫자를 중복없이 입력해주세요.");
        }
    }

    public List<Ball> getBalls() {
        return this.playerBalls;
    }
}
