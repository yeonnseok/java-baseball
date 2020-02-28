package controller;

import domain.*;
import view.InputView;
import view.OutputView;

public class BaseBallGame {
    private Computer computer;
    private User user;

    public BaseBallGame() {
        BallNumberGenerator ballNumberGenerator = new RandomBallNumberGenerator();
        computer = new Computer(ballNumberGenerator);
        createUserWithInputValidation();
    }

    private void createUserWithInputValidation() {
        try {
            BallNumberGenerator ballNumberGenerator =
                    new UserBallNumberGenerator(InputView.inputUserNumberWithValidation());
            user = new User(ballNumberGenerator);
        } catch (IllegalArgumentException | NullPointerException e) {
            OutputView.printExceptionMessage(e);
            createUserWithInputValidation();
        }

    }

}
