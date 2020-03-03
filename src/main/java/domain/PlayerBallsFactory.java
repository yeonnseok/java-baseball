package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlayerBallsFactory implements BallsFactory {
    public static final int BALLS_SIZE = 3;

    @Override
    public List<Ball> createBalls(Generator manualGenerator) {
        Set<Ball> playerBalls = new HashSet<>();
        String playerNumbers = manualGenerator.getPlayerNumbers();
        for (int i = 0; i < playerNumbers.length(); i++) {
            char charNum = playerNumbers.charAt(i);
            String stringNum = String.valueOf(charNum);
            int playerNumber = Integer.parseInt(stringNum);
            playerBalls.add(Ball.createBall(playerNumber));
        }
        return new ArrayList<>(playerBalls);
    }
}
