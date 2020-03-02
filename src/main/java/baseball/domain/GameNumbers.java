package baseball.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * 숫자 객체들을 List형태로 가지고 있는 일급 컬렉션 
 *
 * @author 토니 
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameNumbers {
	private static final int GAME_NUMBERS_LENGTH = 3;

	private List<GameNumber> gameNumbers;

	public GameNumbers(int inputIntGameNumbers) {
		this(generate(inputIntGameNumbers));
	}

	public GameNumbers(List<GameNumber> inputGameNumbers) {
		Objects.requireNonNull(inputGameNumbers, "null이 입력될 수 없습니다.");
		validate(inputGameNumbers);
		this.gameNumbers = inputGameNumbers;
	}

	private static List<GameNumber> generate(int inputIntGameNumbers) {
		List<GameNumber> inputGameNumbers = new ArrayList<>();
		for (int i = 0, end = (int)(Math.log10(inputIntGameNumbers)+1); i < end; i++) {
			inputGameNumbers.add(new GameNumber(inputIntGameNumbers % 10));
			inputIntGameNumbers = inputIntGameNumbers / 10;
		}
		Collections.reverse(inputGameNumbers);
		return inputGameNumbers;
	}

	private void validate(List<GameNumber> inputGameNumbers) {
		if (inputGameNumbers.size() != GAME_NUMBERS_LENGTH) {
			throw new IllegalArgumentException("지정된 길이의 입력이 아닙니다.");
		}
	}

	public int getContainingGameNumbersCount(final GameNumbers inputGameNumbers) {
		return (int) this.gameNumbers.stream()
				.filter(inputGameNumbers::isContains)
				.count();
	}

	private boolean isContains(final GameNumber inputGameNumber) {
		return this.gameNumbers.stream()
				.anyMatch(gameNumber -> gameNumber.equals(inputGameNumber));
	}

	public int getSamePositionGameNumberCount(final GameNumbers inputGameNumbers) {
		return (int) IntStream.range(0, this.gameNumbers.size())
				.filter(index -> this.gameNumbers.get(index).equals(inputGameNumbers.gameNumbers.get(index)))
				.count();
	}
}
