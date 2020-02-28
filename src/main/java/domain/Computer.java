package domain;

public class Computer {
    private BallNumbers computerBalls;

    public Computer(BallNumberGenerator ballNumberGenerator) {
        this.computerBalls = new BallNumbers(ballNumberGenerator);
    }

    public int calculateStrikeCount(User user) {
        return computerBalls.getStrikeCount(user.getUserBalls());
    }

    public int calculateBallCount(User user) {
        return computerBalls.getBallCount(user.getUserBalls());
    }
}
