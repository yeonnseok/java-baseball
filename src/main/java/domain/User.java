package domain;

public class User {
    private BallNumbers userBalls;

    public User(final BallNumberGenerator ballNumberGenerator) {
        this.userBalls = new BallNumbers(ballNumberGenerator);
    }

    public BallNumbers getUserBalls() {
        return userBalls;
    }
}
