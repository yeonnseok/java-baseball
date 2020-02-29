package domain;

public class CountResult {
    private static final int ENTIRE_CORRECT = 3;
    private static final int EMPTY_CORRECT = 0;
    private int strike;
    private int ball;

    public CountResult(final ComputerNo computerNo, final UserNo userNo) {
        this.strike = BallNumbers.calculateStrikeCount(computerNo.getBallNumbers(), userNo.getBallNumbers());
        this.ball = BallNumbers.calculateBallCount(computerNo.getBallNumbers(), userNo.getBallNumbers());
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isThreeStrike() {
        return strike == ENTIRE_CORRECT && ball == EMPTY_CORRECT;
    }
}
