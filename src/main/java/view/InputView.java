package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputUserNumber() {
        OutputView.printInputBallNumberGuideMessage();
        return scanner.nextLine();
    }

    public static String inputRestartOrExitNumber() {
        OutputView.printRestartOrExitMessage();
        return scanner.nextLine();
    }
}
