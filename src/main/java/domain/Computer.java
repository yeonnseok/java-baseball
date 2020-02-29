package domain;

public class Computer {
    private BallNumbers computerBalls;

    public Computer(final BallNumberGenerator ballNumberGenerator) {
        this.computerBalls = new BallNumbers(ballNumberGenerator);
    }

    public int calculateStrikeCount(final User user) {
        return computerBalls.getStrikeCount(user.getUserBalls());
    }

    public int calculateBallCount(final User user) {
        return computerBalls.getBallCount(user.getUserBalls());
    }
}
