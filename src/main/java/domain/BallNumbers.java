package domain;

import java.util.ArrayList;
import java.util.List;

public class BallNumbers {
    private List<BallNumber> ballNumbers = new ArrayList<>();

    public BallNumbers (BallNumberGenerator ballNumberGenerator) {
        ballNumbers.addAll(ballNumberGenerator.getNumbers());
    }
}
