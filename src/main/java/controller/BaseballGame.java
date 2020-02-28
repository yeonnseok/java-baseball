package controller;

import domain.*;
import view.InputView;
import view.OutputView;

public class BaseballGame {
    private Computer computer;
    private User user;

    public void play() {
        BallNumberGenerator ballNumberGenerator = new RandomBallNumberGenerator();
        computer = new Computer(ballNumberGenerator);
        boolean isCorrect = false;
        repeatUntilAnswerCorrect(isCorrect);
        OutputView.printCorrectBallsMessage();
    }

    private void repeatUntilAnswerCorrect(boolean isCorrect) {
        while (!isCorrect) {
            createUserWithInputValidation();
            CountResult countResult = new CountResult(computer, user);
            OutputView.printCountResultMessage(countResult);
            isCorrect = countResult.isThreeStrike();
        }
    }

    private void createUserWithInputValidation() {
        try {
            BallNumberGenerator ballNumberGenerator =
                    new ManualBallNumberGenerator(InputView.inputUserNumber());
            user = new User(ballNumberGenerator);
        } catch (IllegalArgumentException | NullPointerException e) {
            OutputView.printExceptionMessage(e);
            createUserWithInputValidation();
        }
    }

}
