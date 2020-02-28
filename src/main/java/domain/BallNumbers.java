package domain;

import java.util.ArrayList;
import java.util.List;

public class BallNumbers {
    private List<BallNumber> ballNumbers = new ArrayList<>();

    public BallNumbers (BallNumberGenerator ballNumberGenerator) {
        ballNumbers.addAll(ballNumberGenerator.getNumbers());
    }

    public int getSize() {
        return ballNumbers.size();
    }

    public int getStrikeCount(BallNumbers userBalls) {
        int count = 0;
        for (int index = 0; index < ballNumbers.size(); index ++) {
            count = increaseStrikeCount(userBalls, count, index);
        }
        return count;
    }

    private int increaseStrikeCount(BallNumbers userBalls, int count, int index) {
        if (isNumberAndIndexEquals(userBalls, index)) {
            count ++;
        }
        return count;
    }

    private boolean isNumberAndIndexEquals(BallNumbers userBalls, int index) {
        return ballNumbers.get(index).equals(userBalls.ballNumbers.get(index));
    }

    public int getBallCount(BallNumbers userBalls) {
        int count = 0;
        for (int index = 0; index < ballNumbers.size(); index ++) {
            count = increaseBallCount(userBalls, count, index);
        }
        return count;
    }

    private int increaseBallCount(BallNumbers userBalls, int count, int index) {
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
