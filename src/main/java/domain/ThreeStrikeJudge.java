package domain;

public class ThreeStrikeJudge {
    private boolean threeStrike = false;

    public boolean isThreeStrike() {
        return threeStrike;
    }

    public void clearStrike() {
        this.threeStrike = false;
    }

    public void countStrike(GameResult gameResult) {
        threeStrike = gameResult.isThreeStrike();
    }
}
