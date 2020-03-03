package domain;

import java.util.List;

public class ResultCalculator {
    private static final int BASEBALL_NUMBERS_SIZE = 3;

    private ResultCalculator() {
    }

    public static int calculateStrike(BaseballNumbers playerNumbers, BaseballNumbers computerNumbers) {
        int strikeCount = 0;
        BaseballNumbersWrapper baseballNumbersWrapper = new BaseballNumbersWrapper(playerNumbers.getBaseballNumbers(),
                computerNumbers.getBaseballNumbers());
        return getStrikeCount(strikeCount, baseballNumbersWrapper);
    }

    private static int getStrikeCount(int strikeCount, BaseballNumbersWrapper baseballNumbersWrapper) {
        List<BaseballNumber> playerNumberList = baseballNumbersWrapper.getPlayerNumberList();
        List<BaseballNumber> computerNumberList = baseballNumbersWrapper.getComputerNumberList();

        for (int i = 0; i < BASEBALL_NUMBERS_SIZE; i++) {
            BaseballNumber playerNumber = playerNumberList.get(i);
            BaseballNumber computerNumber = computerNumberList.get(i);
            if (playerNumber.equals(computerNumber)) {
                strikeCount = strikeCount + 1;
            }
        }
        return strikeCount;
    }

    public static int calculateBall(BaseballNumbers playerNumbers, BaseballNumbers computerNumbers) {
        int ballCount = 0;
        BaseballNumbersWrapper baseballNumbersWrapper = new BaseballNumbersWrapper(playerNumbers.getBaseballNumbers(),
                computerNumbers.getBaseballNumbers());
        ballCount = getBallCount(ballCount, baseballNumbersWrapper);
        return ballCount;
    }

    private static int getBallCount(int ballCount, BaseballNumbersWrapper baseballNumbersWrapper) {
        List<BaseballNumber> playerNumberList = baseballNumbersWrapper.getPlayerNumberList();

        for (int i = 0; i < BASEBALL_NUMBERS_SIZE; i++) {
            ballCount = compareBaseballNumber(ballCount, baseballNumbersWrapper, i);
        }
        return ballCount;
    }

    private static int compareBaseballNumber(int ballCount, BaseballNumbersWrapper baseballNumbersWrapper, int index) {
        List<BaseballNumber> playerNumberList = baseballNumbersWrapper.getPlayerNumberList();
        List<BaseballNumber> computerNumberList = baseballNumbersWrapper.getComputerNumberList();

        BaseballNumber playerNumber = playerNumberList.get(index);
        for (int j = 0; j < BASEBALL_NUMBERS_SIZE; j++) {
            BaseballNumber computerNumber = computerNumberList.get(j);
            boolean isSameIndex = index != j;
            boolean isSameBaseballNumber = playerNumber.equals(computerNumber);
            ballCount = isSame(ballCount, isSameIndex, isSameBaseballNumber);
        }
        return ballCount;
    }

    private static int isSame(int ballCount, boolean isSameIndex, boolean isSameBaseballNumber) {
        if (isSameIndex && isSameBaseballNumber) {
            ballCount = ballCount + 1;
        }
        return ballCount;
    }
}
