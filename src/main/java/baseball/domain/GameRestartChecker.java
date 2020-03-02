package baseball.domain;

/**
 * 게임을 다시 진행하는지 여부에 대한 책임을 가지는 객체
 *
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameRestartChecker {
	private static final int RESTART_GAME = 1;
	private static final int TERMINATE_GAME = 2;

	private final int gameRestartChecker;

	public GameRestartChecker(int inputGameRestartChecker) {
		validate(inputGameRestartChecker);
		this.gameRestartChecker = inputGameRestartChecker;
	}

	private void validate(int inputGameRestartChecker) {
		if (inputGameRestartChecker != RESTART_GAME && inputGameRestartChecker != TERMINATE_GAME) {
			throw new IllegalArgumentException("1 혹은 2만 입력하셔야합니다.");
		}
	}

	public boolean isRestart() {
		return this.gameRestartChecker == RESTART_GAME;
	}
}
