package view;

import domain.BallMatch;

import java.util.Map;

public class OutputView {
    private static final String SPACE = " ";

    private OutputView() {}

    public static void printInputPlayerNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printGameResult(Map<BallMatch, Integer> gameResult) {
        StringBuilder results = new StringBuilder();
        for (BallMatch result : BallMatch.values()) {
            results.append(gameResult.get(result))
                    .append(result.getMatchName() + SPACE);
        }
        System.out.println(results);
    }

    public static void printEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다. 게임종료!");
    }

    public static void printRestartGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printError(IllegalArgumentException e) {
        System.err.println(e.getMessage());
    }
}
