package domain;

public class Strike {
    private static final int ENTIRE_CORRECT = 3;
    private static final int EMPTY_CORRECT = 0;

    private int strike;

    public Strike(int strike) {
        this.strike = strike;
    }

    public boolean isEntireCorrect() {
        return strike == ENTIRE_CORRECT;
    }

    public boolean isExist() {
        return strike > EMPTY_CORRECT;
    }

    public int getStrike() {
        return strike;
    }
}
