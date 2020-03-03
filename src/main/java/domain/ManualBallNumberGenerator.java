package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ManualBallNumberGenerator implements BallNumberGenerator {
    private static final int BALL_SIZE = 3;
    private static final int LENGTH_COORDINATOR = 1;
    private static final int DIVIDER = 10;

    private List<BallNumber> ballNumbers = new ArrayList<>();

    public ManualBallNumberGenerator(final int numbers) {
        checkNumberLength(numbers);
        createUserBallSize(numbers);
        checkDuplicatedNumber();
    }

    private void checkNumberLength(final int numbers) {
        if ((int)(Math.log10(numbers)+ LENGTH_COORDINATOR) != BALL_SIZE) {
            throw new IllegalArgumentException("세자리 정수를 입력해 주세요");
        }
    }

    private void createUserBallSize(int numbers) {
        while(numbers != 0){
            int ballNumber = numbers % DIVIDER;
            ballNumbers.add(SourceBallNumbers.getBall(ballNumber));
            numbers /= DIVIDER;
        }
    }

    private void checkDuplicatedNumber() {
        Set<BallNumber> ballNumberSet = new HashSet<>(ballNumbers);
        if (ballNumberSet.size() < ballNumbers.size()) {
            throw new IllegalArgumentException("각 자리 숫자는 중복 될 수 없습니다.");
        }
    }

    @Override
    public List<BallNumber> getNumbers() {
        return ballNumbers;
    }
}
