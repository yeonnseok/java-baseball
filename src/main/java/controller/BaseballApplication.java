package controller;

import domain.*;
import view.InputView;
import view.OutputView;

public class BaseballApplication {

    private static final int RESTART = 1;
    private static final int EXIT = 2;

    public static void main(String[] args) {
        Flag restartFlag = Flag.RESTART;
        while (restartFlag != Flag.EXIT) {
            ComputerNo computerNo = new ComputerNo(new RandomBallNumberGenerator());
            boolean isCorrect = false;
            repeatUntilAnswerCorrect(isCorrect, computerNo);
            OutputView.printCorrectBallsMessage();
            restartFlag = inputRestartFlagWithValidation();
        }
    }

    private static void repeatUntilAnswerCorrect(boolean isCorrect, ComputerNo computerNo) {
        while (!isCorrect) {
            UserNo userNo = createUserWithInputValidation();
            CountResult countResult = new CountResult(computerNo, userNo);
            OutputView.printCountResultMessage(countResult);
            isCorrect = countResult.isThreeStrike();
        }
    }

    private static UserNo createUserWithInputValidation() {
        try {
            return new UserNo(new ManualBallNumberGenerator(InputView.inputUserNumber()));
        } catch (IllegalArgumentException | NullPointerException e) {
            OutputView.printExceptionMessage(e.getMessage());
            return createUserWithInputValidation();
        }
    }

    private static Flag inputRestartFlagWithValidation() {
        try {
            int input = InputView.inputRestartOrExitNumber();
            checkFlagRange(input);
            return Flag.findFlag(input);
        } catch (IllegalArgumentException | NullPointerException e) {
            OutputView.printExceptionMessage(e.getMessage());
            return inputRestartFlagWithValidation();
        }
    }

    private static void checkFlagRange(int flagIntegerValue) {
        if (flagIntegerValue != RESTART && flagIntegerValue != EXIT) {
            throw new IllegalArgumentException("입력할 수 있는 범위가 아닙니다.");
        }
    }

}
