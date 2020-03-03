package domain;

import java.util.Random;

public class RandomNumber {
    private static final int MAX_BALL_NUMBER = 9;
    private static Random random = new Random();

    public static int generateRandomNumber() {
        return random.nextInt(MAX_BALL_NUMBER) + 1;
    }
}
