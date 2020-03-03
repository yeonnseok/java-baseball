package domain;

public class Computer {
    private BaseballNumbers baseballNumbers;

    public Computer() {
        this.baseballNumbers = BaseballNumbersGenerator.generateBaseballNumbers();
    }

    public BaseballNumbers getComputerBaseballNumbers() {
        return this.baseballNumbers;
    }
}
