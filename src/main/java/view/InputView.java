package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputUserNumber() {
        OutputView.printInputBallNumberGuideMessage();
        return SCANNER.nextLine();
    }

    public static String inputRestartOrExitNumber() {
        OutputView.printRestartOrExitMessage();
        return SCANNER.nextLine();
    }
}
