import controller.BaseballGame;
import domain.Flag;
import view.InputView;
import view.OutputView;

public class Main {

    public static void main(String[] args) {
        BaseballGame baseBallGame = new BaseballGame();
        Flag restartFlag = Flag.RESTART;
        while (restartFlag != Flag.EXIT) {
            baseBallGame.play();
            restartFlag = inputRestartFlagWithValidation();
        }
    }

    private static Flag inputRestartFlagWithValidation() {
        try {
            String input = InputView.inputRestartOrExitNumber();
            checkNotNumber(input);
            int flagIntegerValue = Integer.parseInt(input);
            checkFlagRange(flagIntegerValue);
            return Flag.findFlag(flagIntegerValue);
        } catch (IllegalArgumentException | NullPointerException e) {
            OutputView.printExceptionMessage(e);
            return inputRestartFlagWithValidation();
        }
    }

    private static void checkFlagRange(int flagIntegerValue) {
        if (flagIntegerValue != 1 && flagIntegerValue != 2) {
            throw new IllegalArgumentException("입력할 수 있는 범위가 아닙니다.");
        }
    }

    private static void checkNotNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }
}
