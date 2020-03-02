package domain;

public class RandomNumberGenerator {
    private RandomNumberGenerator() {
    }

    public static int generateRandomNumber() {
        Double randomValue = (Math.random() * 9) + 1;
        return randomValue.intValue();
    }
}
