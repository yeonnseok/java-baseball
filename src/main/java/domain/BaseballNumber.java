package domain;

public class BaseballNumber {
    private static final int MIN_BASEBALL_NUMBER = 1;
    private static final int MAX_BASEBALL_NUMBER = 9;

    private int baseballNumber;

    public BaseballNumber(int baseballNumber) {
        validateBaseballNumberRange(baseballNumber);
        this.baseballNumber = baseballNumber;
    }

    private void validateBaseballNumberRange(int baseballNumber) {
        if (baseballNumber < MIN_BASEBALL_NUMBER || baseballNumber > MAX_BASEBALL_NUMBER) {
            throw new IllegalArgumentException("잘못된 범위의 숫자를 입력하였습니다.");
        }
    }
}
