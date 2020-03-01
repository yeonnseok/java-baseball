package domain;

import java.util.ArrayList;
import java.util.List;

public class BallNumbers {
    private static final int INITIAL_COUNT = 0;
    public static final int BALL_SIZE = 3;
    private List<BallNumber> ballNumbers = new ArrayList<>();

    public BallNumbers (final BallNumberGenerator ballNumberGenerator) {
        ballNumbers.addAll(ballNumberGenerator.getNumbers());
    }

    public static int calculateStrikeCount(final BallNumbers computer, final BallNumbers user) {
        int count = INITIAL_COUNT;
        for (int index = 0; index < BALL_SIZE; index ++) {
            count = increaseCountWhenStrike(computer, user, count, index);
        }
        return count;
    }

    private static int increaseCountWhenStrike(BallNumbers computer, BallNumbers user, int count, int index) {
        if (isStrikeCondition(computer, user, index)) {
            count ++;
        }
        return count;
    }

    private static boolean isStrikeCondition(BallNumbers computer, BallNumbers user, int index) {
        return computer.getBall(index).equals(user.getBall(index));
    }

    public static int calculateBallCount(final BallNumbers computer, final BallNumbers user) {
        int count = INITIAL_COUNT;
        for (int index = 0; index < BALL_SIZE; index ++) {
            count = increaseCountWhenBall(computer, user, count, index);
        }
        return count;
    }

    private static int increaseCountWhenBall(BallNumbers computer, BallNumbers user, int count, int index) {
        if (isBallCondition(computer, user, index)) {
            count ++;
        }
        return count;
    }

    private static boolean isBallCondition(BallNumbers computer, BallNumbers user, int index) {
        return !computer.getBall(index).equals(user.getBall(index))
                && computer.ballNumbers.contains(user.getBall(index));
    }

    private BallNumber getBall(int index) {
        return ballNumbers.get(index);
    }

    public int getSize() {
        return ballNumbers.size();
    }

    @Override
    public String toString() {
        return ballNumbers.toString();
    }
}
