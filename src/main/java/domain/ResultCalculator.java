package domain;

import java.util.List;
import java.util.stream.IntStream;

public class ResultCalculator {
    private static final int BASEBALL_NUMBERS_SIZE = 3;

    private ResultCalculator() {
    }

    public static int calculateStrike(BaseballNumbers playerNumbers, BaseballNumbers computerNumbers) {
        List<BaseballNumber> playerBaseballNumbers = playerNumbers.getBaseballNumbers();
        List<BaseballNumber> computerBaseballNumbers = computerNumbers.getBaseballNumbers();

        return (int) IntStream.range(0, BASEBALL_NUMBERS_SIZE)
                .filter(index -> playerBaseballNumbers.get(index).equals(computerBaseballNumbers.get(index)))
                .count();
    }

    public static int calculateBall(BaseballNumbers playerNumbers, BaseballNumbers computerNumbers) {
        List<BaseballNumber> playerBaseballNumbers = playerNumbers.getBaseballNumbers();
        List<BaseballNumber> computerBaseballNumbers = computerNumbers.getBaseballNumbers();

        int allMatch = (int) IntStream.range(0, BASEBALL_NUMBERS_SIZE)
                .filter(index -> containsBaseballNumber(playerBaseballNumbers.get(index), computerBaseballNumbers))
                .count();
        return allMatch - calculateStrike(playerNumbers, computerNumbers);
    }

    private static boolean containsBaseballNumber(BaseballNumber baseballNumber,
                                                  List<BaseballNumber> baseballNumbers) {
        return baseballNumbers.contains(baseballNumber);
    }
}
