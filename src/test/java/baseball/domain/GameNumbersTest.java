package baseball.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * 클래스 이름 : .java
 *
 * @author
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameNumbersTest {

	@Test
	void GameNumbers_생성자_올바른_동작_확인() {
		assertThat(new GameNumbers(GameNumberRepository.createGameNumbers())).isInstanceOf(GameNumbers.class);
	}

	@ParameterizedTest
	@NullSource
	void GameNumbers_null_입력시_예외처리(List<GameNumber> nullInput) {
		assertThatNullPointerException().isThrownBy(() -> {
			new GameNumbers(nullInput);
		}).withMessage("null이 입력될 수 없습니다.");
	}

	@Test
	void GameNumbers_정해진_길이_초과의_입력시_예외처리() {
		List<GameNumber> inputGameNumbers = Arrays.asList(
				new GameNumber(1),
				new GameNumber(2),
				new GameNumber(3),
				new GameNumber(4)
		);
		assertThatIllegalArgumentException().isThrownBy(() -> {
			new GameNumbers(inputGameNumbers);
		}).withMessage("지정된 길이의 입력이 아닙니다.");
	}

	@Test
	void GameNumbers_정해진_길이_미만의_입력시_예외처리() {
		List<GameNumber> inputGameNumbers = Arrays.asList(
				new GameNumber(1),
				new GameNumber(2)
		);
		assertThatIllegalArgumentException().isThrownBy(() -> {
			new GameNumbers(inputGameNumbers);
		}).withMessage("지정된 길이의 입력이 아닙니다.");
	}
}
