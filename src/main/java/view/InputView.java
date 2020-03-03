package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputUserNumber() {
        OutputView.printInputBallNumberGuideMessage();
        return SCANNER.nextLine();
    }

    public static int inputRestartOrExitNumber() {
        OutputView.printRestartOrExitMessage();
        return inputWithNumberValidation();
    }

    private static int inputWithNumberValidation() {
        try {
            return Integer.parseInt(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("숫자만 입력 가능합니다.");
        }
    }
}
