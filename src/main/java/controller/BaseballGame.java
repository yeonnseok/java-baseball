package controller;

import domain.*;
import view.InputView;
import view.OutputView;

public class BaseballGame {
    private ComputerNo computerNo;
    private UserNo userNo;

    public void play() {
        computerNo = new ComputerNo(new RandomBallNumberGenerator());
        boolean isCorrect = false;
        repeatUntilAnswerCorrect(isCorrect);
        OutputView.printCorrectBallsMessage();
    }

    private void repeatUntilAnswerCorrect(boolean isCorrect) {
        while (!isCorrect) {
            createUserWithInputValidation();
            CountResult countResult = new CountResult(computerNo, userNo);
            OutputView.printCountResultMessage(countResult);
            isCorrect = countResult.isThreeStrike();
        }
    }

    private void createUserWithInputValidation() {
        try {
            userNo = new UserNo(new ManualBallNumberGenerator(InputView.inputUserNumber()));
        } catch (IllegalArgumentException | NullPointerException e) {
            OutputView.printExceptionMessage(e);
            createUserWithInputValidation();
        }
    }

}
