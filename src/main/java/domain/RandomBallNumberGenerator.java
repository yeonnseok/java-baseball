package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RandomBallNumberGenerator implements BallNumberGenerator {
    private static final int BALL_SIZE = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static List<BallNumber> sourceBallNumber = new ArrayList<>();

    static {
        for (int index = MIN_NUMBER; index <= MAX_NUMBER; index++){
            sourceBallNumber.add(new BallNumber(String.valueOf(index)));
        }
    }

    @Override
    public List<BallNumber> getNumbers() {
        Collections.shuffle(sourceBallNumber);
        return sourceBallNumber.stream()
                .limit(BALL_SIZE)
                .collect(Collectors.toList());
    }
}
