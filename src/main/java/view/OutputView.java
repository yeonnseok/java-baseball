package view;

import domain.BallMatch;
import domain.GameResult;

import java.util.Arrays;
import java.util.Map;

public class OutputView {
    public static final String SPACE = " ";

    public static void printGameResult(Map<BallMatch, Integer> gameResult) {
        StringBuilder results = new StringBuilder();
        for (BallMatch result : BallMatch.values()) {
            results.append(gameResult.get(result))
                    .append(result.getMatchName() + SPACE);
        }
        System.out.println(results);
    }
}
