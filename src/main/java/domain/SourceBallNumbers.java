package domain;

import java.util.ArrayList;
import java.util.List;

public class SourceBallNumbers {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final int INDEX_COORDINATOR = 1;

    private static List<BallNumber> sourceBallNumbers = new ArrayList<>();

    static {
        for (int index = MIN_NUMBER; index <= MAX_NUMBER; index++) {
            sourceBallNumbers.add(new BallNumber(index));
        }
    }

    public static List<BallNumber> getSourceBallNumbers() {
        return sourceBallNumbers;
    }

    public static BallNumber getBall(int ballNumber) {
        checkNumberRightRange(ballNumber);
        return sourceBallNumbers.get(ballNumber- INDEX_COORDINATOR);
    }

    private static void checkNumberRightRange(int ballNumber) {
        if (ballNumber < MIN_NUMBER || ballNumber > MAX_NUMBER) {
            throw new IllegalArgumentException("숫자는 1~9까지만 가능합니다.");
        }
    }
}
