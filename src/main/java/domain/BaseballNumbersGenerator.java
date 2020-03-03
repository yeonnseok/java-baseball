package domain;

import java.util.List;

public class BaseballNumbersGenerator {
    private BaseballNumbersGenerator() {
    }

    public static BaseballNumbers generateBaseballNumbers() {
        List<BaseballNumber> baseballNumberList = BaseballNumberPool.getNonDuplicateNumber();
        return new BaseballNumbers(baseballNumberList);
    }
}
