package domain;

public class CountResult {
    private static final int ENTIRE_CORRECT = 3;
    private static final int EMPTY_CORRECT = 0;
    private int strike;
    private int ball;

    public CountResult(final Computer computer, final User user) {
        this.strike = computer.calculateStrikeCount(user);
        this.ball = computer.calculateBallCount(user);
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
