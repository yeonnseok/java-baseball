package domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RandomBallNumberGenerator implements BallNumberGenerator {
    private static final int BALL_SIZE = 3;

    @Override
    public List<BallNumber> getNumbers() {
        List<BallNumber> sourceBallNumbers = SourceBallNumbers.getSourceBallNumbers();
        Collections.shuffle(sourceBallNumbers);
        return sourceBallNumbers.stream()
                .limit(BALL_SIZE)
                .collect(Collectors.toList());
    }
}
