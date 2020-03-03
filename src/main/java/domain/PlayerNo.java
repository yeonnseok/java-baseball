package domain;

abstract public class PlayerNo {
    protected BallNumbers ballNumbers;

    public PlayerNo(final BallNumberGenerator ballNumberGenerator) {
        this.ballNumbers = new BallNumbers(ballNumberGenerator);
    }

    public BallNumbers getBallNumbers() {
        return ballNumbers;
    }
}
