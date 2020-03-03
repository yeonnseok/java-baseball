package main;

import domain.GameController;
import view.InputView;
import view.OutputView;

public class Main {
    private static final String RESTART = "1";
    private static final String STOP_GAME = "2";

    public static void main(String[] args) {
        do {
            GameController.run();
        } while (inputRestart());
    }

    private static boolean inputRestart() {
        OutputView.printRestartGame();
        String restart = InputView.inputRestartGame();
        if (RESTART.equals(restart)) {
            return true;
        }
        if (STOP_GAME.equals(restart)) {
            return false;
        }
        return false;
    }
}
