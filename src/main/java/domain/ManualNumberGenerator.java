package domain;

public class ManualNumberGenerator implements Generator {
    private int num = 1;
    private static final int BALLS_SIZE = 3;

    private String playerNumbers;

    public ManualNumberGenerator(String playerNumbers) {
        validateBallsCount(playerNumbers);
        this.playerNumbers = playerNumbers;
    }

    private void validateBallsCount(String playerBalls) {
        if (playerBalls.length() != BALLS_SIZE) {
            throw new IllegalArgumentException("야구 게임의 숫자는 3개로 이루어져있습니다.");
        }
    }

    @Override
    public String getPlayerNumbers() {
        return this.playerNumbers;
    }

    @Override
    public int generate() {
        return num++;
    }
}
