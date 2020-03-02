package domain;

public enum BallMatch {
    STRIKE("스트라이크"), BALL("볼"), NONE("낫싱");

    private String result;
    BallMatch(String result) {
        this.result = result;
    }
}
