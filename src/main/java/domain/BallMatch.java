package domain;

public enum BallMatch {
    STRIKE("스트라이크"), BALL("볼");

    private String matchName;
    BallMatch(String matchName) {
        this.matchName = matchName;
    }

    public String getMatchName() {
        return matchName;
    }
}
