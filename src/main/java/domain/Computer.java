package domain;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private BaseballNumbers baseballNumbers;

    public Computer() {
        List<BaseballNumber> baseballNumberList = getBaseballNumberList();
        BaseballNumbers baseballNumbers = getBaseballNumbers(baseballNumberList);
        this.baseballNumbers = baseballNumbers;
    }

    private BaseballNumbers getBaseballNumbers(List<BaseballNumber> baseballNumberList) {
        try {
            return new BaseballNumbers(baseballNumberList);
        } catch (IllegalArgumentException e) {
            return getBaseballNumbers(getBaseballNumberList());
        }
    }

    private List<BaseballNumber> getBaseballNumberList() {
        List<BaseballNumber> baseballNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int randomNumber = RandomNumberGenerator.generateRandomNumber();
            BaseballNumber baseballNumber = new BaseballNumber(randomNumber);
            baseballNumberList.add(baseballNumber);
        }
        return baseballNumberList;
    }

    public boolean isContinue(GameContinue gameContinue) {
        if (gameContinue.playMore()) {
            this.baseballNumbers = getBaseballNumbers(getBaseballNumberList());
            return true;
        }
        return false;
    }
}
