package domain;

public class Ball {
    public static final int MIN_BALL_NUMBER = 1;
    public static final int MAX_BALL_NUMBER = 9;
    private int ball;

    public Ball(int ballNumber) {
        this.ball = ballNumber;
        validateBallRange();
    }

    private void validateBallRange() {
        if (this.ball < MIN_BALL_NUMBER || this.ball > MAX_BALL_NUMBER) {
            throw new IllegalArgumentException("공은 1~9 사이의 숫자여야합니다.");
        }
    }
}
