package domain;

public class Computer {
    private BaseballNumbers baseballNumbers;

    public Computer() {
        this.baseballNumbers = BaseballNumbersGenerator.generateBaseballNumbers();
    }

    public boolean isContinue(GameContinue gameContinue) {
        if (gameContinue.playMore()) {
            this.baseballNumbers = BaseballNumbersGenerator.generateBaseballNumbers();
            return true;
        }
        return false;
    }

    public BaseballNumbers getComputerBaseballNumbers() {
        return this.baseballNumbers;
    }
}
