package domain;

import view.InputView;
import view.OutputView;

public class GameController {
    public static void run() {
        Generator randomNumberGenerator = new RandomNumberGenerator();
        ComputerPlayer computerPlayer = new ComputerPlayer(randomNumberGenerator);
        ThreeStrikeJudge judge = new ThreeStrikeJudge();
        while (!judge.isThreeStrike()) {
            judge.clearStrike();
            OutputView.printInputPlayerNumbers();
            Player player = new Player(inputPlayerNumbers());
            GameResult gameResult = new GameResult(player, computerPlayer);
            OutputView.printGameResult(gameResult.getResult());
            judge.countStrike(gameResult);
        }
        OutputView.printEnd();
    }

    private static String inputPlayerNumbers() {
        return InputView.inputPlayerNumbers();
    }
}
