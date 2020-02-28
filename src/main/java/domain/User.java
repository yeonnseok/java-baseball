package domain;

public class User {
    private BallNumbers userBalls;

    public User(BallNumberGenerator ballNumberGenerator) {
        this.userBalls = new BallNumbers(ballNumberGenerator);
    }

    public BallNumbers getUserBalls() {
        return userBalls;
    }
}
