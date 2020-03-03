package domain;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ComputerPlayer {
    private static final int BALLS_SIZE = 3;

    private List<Ball> computerBalls;

    public ComputerPlayer(Generator randomNumberGenerator) {
        BallsFactory computerBallsFactory = new ComputerBallsFactory();
        this.computerBalls = computerBallsFactory.createBalls(randomNumberGenerator);
    }

    public void matchResult(Map<BallMatch, Integer> gameResult, Ball ball, int idx) {
        for (int i = 0; i < BALLS_SIZE; i++) {
            boolean havingBall = ball.equals(computerBalls.get(i));
            boolean sameLocation = idx == i;
            countStrike(gameResult, havingBall, sameLocation);
            countBall(gameResult, havingBall, sameLocation);
        }
    }

    private void countStrike(Map<BallMatch, Integer> gameResult, boolean havingBall, boolean sameLocation) {
        if (havingBall && sameLocation) {
            gameResult.put(BallMatch.STRIKE, gameResult.get(BallMatch.STRIKE) + 1);
        }
    }

    private void countBall(Map<BallMatch, Integer> gameResult, boolean havingBall, boolean sameLocation) {
        if (havingBall && !sameLocation) {
            gameResult.put(BallMatch.BALL, gameResult.get(BallMatch.BALL) + 1);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerPlayer that = (ComputerPlayer) o;
        return Objects.equals(computerBalls, that.computerBalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerBalls);
    }

    public List<Ball> getBalls() {
        return this.computerBalls;
    }
}
