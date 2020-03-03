package domain;

public class CountResult {
    private static final int ENTIRE_CORRECT = 3;
    private static final int EMPTY_CORRECT = 0;

    private Strike strike;
    private Ball ball;

    public CountResult(final ComputerNo computerNo, final UserNo userNo) {
        this.strike = new Strike(BallNumbers.calculateStrikeCount(computerNo.getBallNumbers(), userNo.getBallNumbers()));
        this.ball = new Ball(BallNumbers.calculateBallCount(computerNo.getBallNumbers(), userNo.getBallNumbers()));
    }

    public int getStrike() {
        return strike.getStrike();
    }

    public int getBall() {
        return ball.getBall();
    }

    public boolean isThreeStrike() {
        return strike.getStrike() == ENTIRE_CORRECT && ball.getBall() == EMPTY_CORRECT;
    }
}
