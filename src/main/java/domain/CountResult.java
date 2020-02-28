package domain;

public class CountResult {
    private int strikeCountResult;
    private int ballCountResult;

    public CountResult(Computer computer, User user) {
        this.strikeCountResult = computer.calculateStrikeCount(user);
        this.ballCountResult = computer.calculateBallCount(user);
    }

    public int getStrikeCountResult() {
        return strikeCountResult;
    }

    public int getBallCountResult() {
        return ballCountResult;
    }
}
