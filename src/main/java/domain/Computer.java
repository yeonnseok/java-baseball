package domain;

public class Computer {
    private BallNumbers comBalls;

    public Computer(BallNumberGenerator ballNumberGenerator) {
        this.comBalls = new BallNumbers(ballNumberGenerator);
    }

}
