package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BallsFactory {
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
}
