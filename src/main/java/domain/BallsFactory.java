package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BallsFactory {

    public static final int BALLS_SIZE = 3;

    public static List<Ball> createPlayerBalls(String playerNumbers) {
        Set<Ball> playerBalls = new HashSet<>();
        for (int i = 0; i < playerNumbers.length(); i++) {
            char charNum = playerNumbers.charAt(i);
            String stringNum = String.valueOf(charNum);
            int playerNumber = Integer.parseInt(stringNum);
            playerBalls.add(Ball.createBall(playerNumber));
        }
        return new ArrayList<>(playerBalls);
    }

    public static List<Ball> createComputerBalls(Generator randomNumberGenerator) {
        Set<Ball> computerBalls = new HashSet<>();
        while (computerBalls.size() != BALLS_SIZE) {
            int randomNumber = randomNumberGenerator.generate();
            Ball computerBall = Ball.createBall(randomNumber);
            computerBalls.add(computerBall);
        }
        return new ArrayList<>(computerBalls);
    }
}
