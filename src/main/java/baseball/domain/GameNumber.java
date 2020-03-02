package baseball.domain;

/**
 * 숫자 야구 게임의 숫자를 감싸는 래퍼 객체
 *
 * @author 토니
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

	@Override
	public String toString() {
		return Integer.toString(this.gameNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		GameNumber that = (GameNumber)obj ;
		return this.gameNumber == that.gameNumber;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
