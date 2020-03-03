package domain;

import java.util.ArrayList;
import java.util.List;

public class BaseballNumbersGenerator {
    private static final int MAX_BASEBALL_NUMBER_SIZE = 3;

    private BaseballNumbersGenerator() {
    }

    public static BaseballNumbers getBaseballNumbers(List<BaseballNumber> baseballNumberList) {
        try {
            BaseballNumbers baseballNumbers = new BaseballNumbers(baseballNumberList);
            return baseballNumbers;
        } catch (IllegalArgumentException e) {
            return getBaseballNumbers(getBaseballNumberList());
        }
    }

    public static List<BaseballNumber> getBaseballNumberList() {
        List<BaseballNumber> baseballNumberList = new ArrayList<>();
        for (int i = 0; i < MAX_BASEBALL_NUMBER_SIZE; i++) {
            int randomNumber = RandomNumberGenerator.generateRandomNumber();
            BaseballNumber baseballNumber = new BaseballNumber(randomNumber);
            baseballNumberList.add(baseballNumber);
        }
        return baseballNumberList;
    }
}
