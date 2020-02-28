package controller;

import domain.*;

public class BaseBallGame {
    private Computer computer;
    private User user;

    public BaseBallGame() {
        BallNumberGenerator ballNumberGenerator = new RandomBallNumberGenerator();
        computer = new Computer(ballNumberGenerator);

        ballNumberGenerator = new UserBallNumberGenerator("123");
        user = new User(ballNumberGenerator);
    }

}
