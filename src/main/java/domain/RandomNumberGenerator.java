package domain;

import java.util.Random;

public class RandomNumberGenerator implements Generator {
    @Override
    public int generate() {
        return RandomNumber.generateRandomNumber();
    }
}
