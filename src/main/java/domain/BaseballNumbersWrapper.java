package domain;

import java.util.List;

public class BaseballNumbersWrapper {
    private List<BaseballNumber> playerNumberList;
    private List<BaseballNumber> computerNumberList;

    public BaseballNumbersWrapper(List<BaseballNumber> playerNumberList, List<BaseballNumber> computerNumberList) {
        this.playerNumberList = playerNumberList;
        this.computerNumberList = computerNumberList;
    }

    public List<BaseballNumber> getPlayerNumberList() {
        return this.playerNumberList;
    }

    public List<BaseballNumber> getComputerNumberList() {
        return this.computerNumberList;
    }
}
