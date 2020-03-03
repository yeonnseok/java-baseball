package domain;

import java.util.Objects;

public class BallNumber {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private int number;

    public BallNumber(final int number) {
        checkNumberRange(number);
        this.number = number;
    }

    private void checkNumberRange(final int number) {
        if (number < MIN_NUMBER | number > MAX_NUMBER) {
            throw new IllegalArgumentException("각 자리 숫자는 1~9까지로 이루어져야 합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BallNumber that = (BallNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
