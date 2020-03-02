package view;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputPlayerNumbers() {
        return validateNumber(scanner.nextLine());
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
