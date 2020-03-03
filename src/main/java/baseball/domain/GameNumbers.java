package baseball.domain;

import java.util.*;
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
		this(generateBy(inputIntGameNumbers));
	}

	public GameNumbers(List<GameNumber> inputGameNumbers) {
		Objects.requireNonNull(inputGameNumbers, "null이 입력될 수 없습니다.");
		validateLength(inputGameNumbers);
		validateDuplication(inputGameNumbers);
		this.gameNumbers = inputGameNumbers;
	}

	private static List<GameNumber> generateBy(int inputIntGameNumbers) {
		validateLength(inputIntGameNumbers);
		List<GameNumber> inputGameNumbers = new ArrayList<>();
		for (int i = 0, end = (int)(Math.log10(inputIntGameNumbers)+1); i < end; i++) {
			inputGameNumbers.add(0, GameNumberRepository.createGameNumber(inputIntGameNumbers % 10));
			inputIntGameNumbers = inputIntGameNumbers / 10;
		}
		return inputGameNumbers;
	}

	private static void validateLength(int inputIntGameNumbers) {
		if ((int)(Math.log10(inputIntGameNumbers)+1) != GAME_NUMBERS_LENGTH) {
			throw new IllegalArgumentException("지정된 길이의 입력이 아닙니다.");
		}
	}

	private void validateLength(List<GameNumber> inputGameNumbers) {
		if (inputGameNumbers.size() != GAME_NUMBERS_LENGTH) {
			throw new IllegalArgumentException("지정된 길이의 입력이 아닙니다.");
		}
	}

	private void validateDuplication(List<GameNumber> inputGameNumbers) {
		Set<GameNumber> duplicatedGameNumber = new HashSet<>(inputGameNumbers);
		if (duplicatedGameNumber.size() != GAME_NUMBERS_LENGTH) {
			throw new IllegalArgumentException("입력한 숫자에 중복이 있습니다.");
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
		return (int) IntStream.range(0, GAME_NUMBERS_LENGTH)
				.filter(index -> this.gameNumbers.get(index).equals(inputGameNumbers.gameNumbers.get(index)))
				.count();
	}
}
