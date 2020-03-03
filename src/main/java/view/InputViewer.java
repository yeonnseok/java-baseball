package view;

import java.util.Scanner;

public class InputViewer {
    private static Scanner scanner = new Scanner(System.in);

    private InputViewer() {
    }

    public static String inputPlayerBaseballNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        return scanner.nextLine();
    }

    public static String inputContinueGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return scanner.nextLine();
    }
}
