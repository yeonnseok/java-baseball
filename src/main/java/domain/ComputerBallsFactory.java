package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComputerBallsFactory implements BallsFactory {
    public static final int BALLS_SIZE = 3;

    @Override
    public List<Ball> createBalls(Generator randomGenerator) {
        Set<Ball> computerBalls = new HashSet<>();
        while (computerBalls.size() != BALLS_SIZE) {
            int randomNumber = randomGenerator.generate();
            Ball computerBall = Ball.createBall(randomNumber);
            computerBalls.add(computerBall);
        }
        return new ArrayList<>(computerBalls);
    }
}
