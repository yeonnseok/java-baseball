package domain;

public class RandomNumberGenerator implements Generator {
    @Override
    public int generate() {
        return RandomNumber.generateRandomNumber();
    }
}
