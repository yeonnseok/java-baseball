package controller;

import domain.*;
import view.InputViewer;
import view.OutputViewer;

public class BaseballGameController {
    public static void run(Computer computer) {
        BaseballNumbers computerNumbers;
        int strikeCount = 0;

        do {
            computerNumbers = computer.getComputerBaseballNumbers();
            BaseballNumbers playerNumbers = getPlayerBaseballNumbers();
            strikeCount = ResultCalculator.calculateStrike(playerNumbers, computerNumbers);
            int ballCount = ResultCalculator.calculateBall(playerNumbers, computerNumbers);
            OutputViewer.printResult(strikeCount, ballCount);
        } while (strikeCount != 3);

        isEnd(computer);
    }

    private static BaseballNumbers getPlayerBaseballNumbers() {
        try {
            String playerNumber = InputViewer.inputPlayerBaseballNumbers();
            return PlayerBaseballNumbersGenerator.generateBaseballNumbers(playerNumber);
        } catch (IllegalArgumentException e) {
            OutputViewer.printErrorMessage(e.getMessage());
            return getPlayerBaseballNumbers();
        }
    }

    private static void isEnd(Computer computer) {
        GameContinue gameContinue = getGameContinue();
        if (computer.isContinue(gameContinue)) {
            run(computer);
        }
    }

    private static GameContinue getGameContinue() {
        try {
            String continueNumber = InputViewer.inputContinueGame();
            return new GameContinue(continueNumber);
        } catch (IllegalArgumentException e) {
            OutputViewer.printErrorMessage(e.getMessage());
            return getGameContinue();
        }
    }
}
