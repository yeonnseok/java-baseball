package domain;

public class RandomNumberGenerator {
    private static final int MAX_RANDOM_NUMBER_RANGE = 9;
    private static final int MIN_RANDOM_NUMBER_RANGE = 1;

    private RandomNumberGenerator() {
    }

    public static int generateRandomNumber() {
        Double randomValue = (Math.random() * MAX_RANDOM_NUMBER_RANGE) + MIN_RANDOM_NUMBER_RANGE;
        return randomValue.intValue();
    }
}
