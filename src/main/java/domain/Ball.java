package domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ball {
    private static final int MIN_BALL_NUMBER = 1;
    private static final int MAX_BALL_NUMBER = 9;
    private static Map<Integer, Ball> ballCreator = new HashMap<>();

    private int ball;
    private Ball(int ballNumber) {
        this.ball = ballNumber;
    }

    static {
        for (int i = MIN_BALL_NUMBER; i <= MAX_BALL_NUMBER; i++) {
            ballCreator.put(i, new Ball(i));
        }
    }

    public static Ball createBall(int ballNumber) {
        validateBallRange(ballNumber);
        return ballCreator.get(ballNumber);
    }

    private static void validateBallRange(int ballNumber) {
        if (ballNumber < MIN_BALL_NUMBER || ballNumber > MAX_BALL_NUMBER) {
            throw new IllegalArgumentException("공은 1~9 사이의 숫자여야합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball1 = (Ball) o;
        return ball == ball1.ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball);
    }
}
