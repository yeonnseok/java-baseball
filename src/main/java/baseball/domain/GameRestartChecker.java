package baseball.domain;

import baseball.view.OutputView;

/**
 * 게임을 다시 진행하는지 여부에 대한 책임을 가지는 Enum 객체
 *
 * @author
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/03
 */
public enum GameRestartChecker {
	RESTART_GAME(1),
	TERMINATE_GAME(2);

	private static final int RESTART_NUMBER = 1;
	private static final int TERMINATE_NUMBER = 2;
	private int status;

	GameRestartChecker(int status) {
		try {
			validate(status);
			this.status = status;
		} catch (IllegalArgumentException e) {
			OutputView.printExceptionMessage(e);
		}
	}

	private static void validate(final int inputStatus) {
		if (inputStatus != RESTART_NUMBER && inputStatus != TERMINATE_NUMBER) {
			throw new IllegalArgumentException("1 혹은 2만 입력하셔야합니다.");
		}
	}

	public static GameRestartChecker findGameRestartChecker(final int inputStatus) {
		validate(inputStatus);
		if (inputStatus == RESTART_NUMBER) {
			return RESTART_GAME;
		}
		return TERMINATE_GAME;
	}

	public boolean isRestart() {
		return this.status == RESTART_GAME.status;
	}
}
