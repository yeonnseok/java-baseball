package domain;

public class ManualNumberGenerator implements Generator {
    private int num = 1;
    @Override
    public int generate() {
        return num++;
    }
}
