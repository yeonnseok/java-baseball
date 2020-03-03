package baseball.controller;

import baseball.domain.GameNumberRepository;
import baseball.domain.GameNumbers;
import baseball.domain.GameRestartChecker;
import baseball.view.InputView;
import baseball.view.OutputView;

/**
 * 숫자야구게임을 진행하는 객체
 *
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameController {

	private static final int TARGET_STRIKE_COUNT = 3;

	public void playBall() {
		do {
			playOneRound();
		} while (isRestartGame());
	}

	public void playOneRound() {
		GameNumbers targetGameNumbers = new GameNumbers(GameNumberRepository.createGameNumbers());
		GameNumbers playerGameNumbers;
		do {
			OutputView.askPlayerGameNumber();
			playerGameNumbers = new GameNumbers(InputView.getPlayerGameNumbers());
			int strikeCount = targetGameNumbers.getSamePositionGameNumberCount(playerGameNumbers);
			int totalContainingCount = targetGameNumbers.getContainingGameNumbersCount(playerGameNumbers);
			OutputView.printResult(strikeCount, totalContainingCount - strikeCount);
		} while (targetGameNumbers.getSamePositionGameNumberCount(playerGameNumbers) != TARGET_STRIKE_COUNT);
	}

	private boolean isRestartGame() {
		OutputView.askRestartGame();
		GameRestartChecker gameRestartChecker = new GameRestartChecker(InputView.getPlayAgainOrNot());
		return gameRestartChecker.isRestart();
	}
}
