package domain;

import java.util.ArrayList;
import java.util.List;

public class BallNumbers {
    private List<BallNumber> ballNumbers = new ArrayList<>();

    public BallNumbers (final BallNumberGenerator ballNumberGenerator) {
        ballNumbers.addAll(ballNumberGenerator.getNumbers());
    }

    public int getSize() {
        return ballNumbers.size();
    }

    public int getStrikeCount(final BallNumbers userBalls) {
        int count = 0;
        for (int index = 0; index < ballNumbers.size(); index ++) {
            count = increaseStrikeCount(userBalls, count, index);
        }
        return count;
    }

    private int increaseStrikeCount(final BallNumbers userBalls, int count, final int index) {
        if (isNumberAndIndexEquals(userBalls, index)) {
            count ++;
        }
        return count;
    }

    private boolean isNumberAndIndexEquals(final BallNumbers userBalls, final int index) {
        return ballNumbers.get(index).equals(userBalls.ballNumbers.get(index));
    }

    public int getBallCount(final BallNumbers userBalls) {
        int count = 0;
        for (int index = 0; index < ballNumbers.size(); index ++) {
            count = increaseBallCount(userBalls, count, index);
        }
        return count;
    }

    private int increaseBallCount(final BallNumbers userBalls, int count, final int index) {
        if (!isNumberAndIndexEquals(userBalls, index)
                && ballNumbers.contains(userBalls.ballNumbers.get(index))) {
            count ++;
        }
        return count;
    }

    @Override
    public String toString() {
        return ballNumbers.toString();
    }
}
