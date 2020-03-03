package domain;

public class CountResult {
    private Strike strike;
    private Ball ball;

    public CountResult(final ComputerNo computerNo, final UserNo userNo) {
        this.strike = new Strike(BallNumbers.calculateStrikeCount(computerNo.getBallNumbers(), userNo.getBallNumbers()));
        this.ball = new Ball(BallNumbers.calculateBallCount(computerNo.getBallNumbers(), userNo.getBallNumbers()));
    }

    public Strike getStrike() {
        return strike;
    }

    public Ball getBall() {
        return ball;
    }

    public boolean isThreeStrike() {
        return strike.isEntireCorrect() && ball.isEmptyCorrect();
    }
}
