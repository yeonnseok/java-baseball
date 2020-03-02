package view;

import domain.BallMatch;
import domain.GameResult;

import java.util.Arrays;
import java.util.Map;

public class OutputView {
    public static final String SPACE = " ";

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
}
