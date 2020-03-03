package domain;

import java.util.List;

public class Computer {
    private BaseballNumbers baseballNumbers;

    public Computer() {
        this(BaseballNumbersGenerator.getBaseballNumberList());
    }

    public Computer(List<BaseballNumber> baseballNumberList) {
        BaseballNumbers baseballNumbers = BaseballNumbersGenerator.getBaseballNumbers(baseballNumberList);
        this.baseballNumbers = baseballNumbers;
    }

    public boolean isContinue(GameContinue gameContinue) {
        if (gameContinue.playMore()) {
            List<BaseballNumber> baseballNumberList = BaseballNumbersGenerator.getBaseballNumberList();
            this.baseballNumbers = BaseballNumbersGenerator.getBaseballNumbers(baseballNumberList);
            return true;
        }
        return false;
    }

    public BaseballNumbers getComputerBaseballNumbers() {
        return this.baseballNumbers;
    }
}
