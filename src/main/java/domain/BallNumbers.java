package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BallNumbers {
    private static final int INITIAL_COUNT = 0;
    private static final int BALL_SIZE = 3;

    private List<BallNumber> ballNumbers = new ArrayList<>();

    public BallNumbers (final BallNumberGenerator ballNumberGenerator) {
        ballNumbers.addAll(ballNumberGenerator.getNumbers());
    }

    public static int calculateStrikeCount(final BallNumbers computer, final BallNumbers user) {
        return (int)IntStream.range(INITIAL_COUNT, BALL_SIZE)
                .filter(index -> computer.getBall(index).equals(user.getBall(index)))
                .count();
    }

    public static int calculateBallCount(final BallNumbers computer, final BallNumbers user) {
        return (int)IntStream.range(INITIAL_COUNT, BALL_SIZE)
                .filter(index -> isBallCondition(computer, user, index))
                .count();
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
