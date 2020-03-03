package domain;

public class Ball {
    private static final int EMPTY_CORRECT = 0;

    private int ball;

    public Ball(int ball) {
        this.ball = ball;
    }

    public boolean isEmptyCorrect() {
        return ball == EMPTY_CORRECT;
    }

    public boolean isExist() {
        return ball > EMPTY_CORRECT;
    }

    public int getBall() {
        return ball;
    }
}
