package domain;

import java.util.List;

public class UserBallNumberGenerator implements BallNumberGenerator {

    private List<BallNumber> ballNumbers;

    public UserBallNumberGenerator(String numbers) {
        checkNumberLength(numbers);
        for (int index = 0; index < 3; index++) {
            BallNumber ballNumber = new BallNumber(String.valueOf(numbers.charAt(index)));
            checkDuplicatedNumber(ballNumber);
            this.ballNumbers.add(ballNumber);
        }
    }

    private void checkDuplicatedNumber(BallNumber ballNumber) {
        if (ballNumbers.contains(ballNumber)) {
            throw new IllegalArgumentException("각 자리 수는 중복될 수 없습니다.");
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
