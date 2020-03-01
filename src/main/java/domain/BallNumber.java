package domain;

public class BallNumber {
    private int number;

    public BallNumber(final String number) {
        checkNullNumber(number);
        checkEmptyNumber(number);
        checkNotNumber(number);
        int numberInteger = Integer.parseInt(number);
        checkNumberRange(numberInteger);
        this.number = numberInteger;
    }

    private void checkNullNumber(final String number) {
        if (number == null) {
            throw new NullPointerException("숫자가 입력되지 않았습니다.");
        }
    }

    private void checkEmptyNumber(final String number) {
        if (number.isEmpty()) {
            throw new IllegalArgumentException("숫자가 입력되지 않았습니다.");
        }
    }

    private void checkNotNumber(final String number) {
        try {
            Integer.parseInt(number);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("숫자만 입력가능합니다.");
        }
    }

    private void checkNumberRange(final int number) {
        if (number < 1 | number > 9) {
            throw new IllegalArgumentException("각 자리 숫자는 1~9까지로 이루어져야 합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        return this.number == ((BallNumber) o).number;
    }

    @Override
    public int hashCode() {
        return 31 * number;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
