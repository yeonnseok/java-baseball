package main;

import domain.*;
import view.InputView;
import view.OutputView;

public class GameController {
    public static void run() {
        Generator randomNumberGenerator = new RandomNumberGenerator();
        ComputerPlayer computerPlayer = new ComputerPlayer(randomNumberGenerator);
        boolean threeStrike;
        do {
            OutputView.printInputPlayerNumbers();
            Player player = createPlayer();
            GameResult gameResult = new GameResult(player, computerPlayer);
            OutputView.printGameResult(gameResult.getResult());
            threeStrike = gameResult.isThreeStrike();
        } while(!threeStrike);
        OutputView.printEnd();
    }

    private static Player createPlayer() {
        try {
            Generator manualGenerator = new ManualNumberGenerator(InputView.inputPlayerNumbers());
            return new Player(manualGenerator);
        } catch (IllegalArgumentException e) {
            OutputView.printError(e);
            return createPlayer();
        }
    }

    private static String inputPlayerNumbers() {
        try {
            return InputView.inputPlayerNumbers();
        } catch (IllegalArgumentException e) {
            OutputView.printError(e);
            return inputPlayerNumbers();
        }
    }
}
