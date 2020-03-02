package view;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputPlayerNumbers() {
        try {
            return validateNumber(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            OutputView.printError(e);
            return inputPlayerNumbers();
        }
    }

    public static String inputRestartGame() {
        try {
            String restart = validateNumber(scanner.nextLine());
            checkValidNumber(restart);
            return restart;
        } catch (IllegalArgumentException e) {
            OutputView.printError(e);
            return inputRestartGame();
        }
    }

    private static void checkValidNumber(String restart) {
        if (!"1".equals(restart) && !"2".equals(restart)) {
            throw new IllegalArgumentException("1 또는 2의 숫자를 입력해주세요.");
        }
    }

    private static String validateNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자 야구 게임의 입력값은 숫자여야합니다.");
        }
        return input;
    }
}
