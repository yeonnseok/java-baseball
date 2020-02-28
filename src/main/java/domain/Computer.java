package domain;

public class Computer {
    private BallNumbers comBalls;

    public Computer(BallNumberGenerator ballNumberGenerator) {
        this.comBalls = new BallNumbers(ballNumberGenerator);
    }

    public int calculateStrikeCount(User user) {
        return comBalls.getStrikeCount(user.getUserBalls());
    }

    public int calculateBallCount(User user) {
        return comBalls.getBallCount(user.getUserBalls());
    }

    public BallNumbers getBallNumbers() {
        return comBalls;
    }
}
