package baseball.domain;

/**
 * 클래스 이름 : .java
 *
 * @author
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameRestartChecker {
	private final int gameRestartChecker;

	public GameRestartChecker(int inputGameRestartChecker) {
		validate(inputGameRestartChecker);
		this.gameRestartChecker = inputGameRestartChecker;
	}

	private void validate(int inputGameRestartChecker) {
		if (inputGameRestartChecker != 1 && inputGameRestartChecker != 2) {
			throw new IllegalArgumentException("1 혹은 2만 입력하셔야합니다.");
		}
	}

	public boolean isRestart() {
		return this.gameRestartChecker == 1;
	}
}
