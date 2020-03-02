package baseball.domain;

/**
 * 클래스 이름 : .java
 *
 * @author
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameNumber {
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 9;

	private final int gameNumber;

	public GameNumber(final int inputGameNumber) {
		validate(inputGameNumber);
		this.gameNumber = inputGameNumber;
	}

	private void validate(final int inputGameNumber) {
		if (inputGameNumber < MIN_NUMBER || inputGameNumber > MAX_NUMBER) {
			throw new IllegalArgumentException("GameNumber의 범위를 초과한 입력이 있습니다.");
		}
	}
}
