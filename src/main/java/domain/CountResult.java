package domain;

public class CountResult {
    private static final int ENTIRE_CORRECT = 3;
    private static final int EMPTY_CORRECT = 0;
    private int strikeCountResult;
    private int ballCountResult;

    public CountResult(final Computer computer, final User user) {
        this.strikeCountResult = computer.calculateStrikeCount(user);
        this.ballCountResult = computer.calculateBallCount(user);
    }

    public int getStrikeCountResult() {
        return strikeCountResult;
    }

    public int getBallCountResult() {
        return ballCountResult;
    }

    public boolean isThreeStrike() {
        return strikeCountResult == ENTIRE_CORRECT && ballCountResult == EMPTY_CORRECT;
    }
}
