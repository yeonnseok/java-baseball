package domain;

import view.InputView;

public class GameController {
    public static void run() {
        Generator randomNumberGenreator = new RandomNumberGenerator();
        ComputerPlayer computerPlayer = new ComputerPlayer(randomNumberGenreator);
        Player player = new Player(inputPlayerNumbers());
    }

    private static String inputPlayerNumbers() {
        return InputView.inputPlayerNumbers();
    }
}
