package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int inputUserNumber() {
        OutputView.printInputBallNumberGuideMessage();
        return inputWithNumberValidation();
    }

    public static int inputRestartOrExitNumber() {
        OutputView.printRestartOrExitMessage();
        return inputWithNumberValidation();
    }

    private static int inputWithNumberValidation() {
        try {
            String trimmedInput = SCANNER.nextLine().trim();
            return Integer.parseInt(trimmedInput);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("숫자만 입력 가능합니다.");
        }
    }
}
