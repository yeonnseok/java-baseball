package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ManualBallNumberGenerator implements BallNumberGenerator {
    private static final int START_INDEX = 0;
    private static final int BALL_SIZE = 3;
    private List<BallNumber> ballNumbers = new ArrayList<>();

    public ManualBallNumberGenerator(String numbers) {
        checkNumberLength(numbers);
        createUserBallSize(numbers);
        checkDuplicatedNumber();
    }

    private void createUserBallSize(String numbers) {
        for (int index = START_INDEX; index < BALL_SIZE; index++) {
            String eachNumber = String.valueOf(numbers.charAt(index));
            BallNumber ballNumber = new BallNumber(eachNumber);
            this.ballNumbers.add(ballNumber);
        }
    }

    private void checkDuplicatedNumber() {
        Set<BallNumber> ballNumberSet = new HashSet<>(ballNumbers);
        if (ballNumberSet.size() < ballNumbers.size()){
            throw new IllegalArgumentException("각 자리 숫자는 중복 될 수 없습니다.");
        }
    }

    private void checkNumberLength(String numbers) {
        if (numbers.length() != 3) {
            throw new IllegalArgumentException("세자리 정수를 입력해 주세요");
        }
    }

    @Override
    public List<BallNumber> getNumbers() {
        return ballNumbers;
    }
}
