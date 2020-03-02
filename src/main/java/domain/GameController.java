package domain;

import view.InputView;
import view.OutputView;

import java.io.OutputStream;

public class GameController {
    public static void run() {
        Generator randomNumberGenreator = new RandomNumberGenerator();
        ComputerPlayer computerPlayer = new ComputerPlayer(randomNumberGenreator);
        Player player = new Player(inputPlayerNumbers());
        GameResult gameResult = new GameResult(player, computerPlayer);
        OutputView.printGameResult(gameResult.getResult());
    }

    private static String inputPlayerNumbers() {
        return InputView.inputPlayerNumbers();
    }
}
