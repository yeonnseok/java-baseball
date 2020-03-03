package baseball.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * GameNumbers test
 *
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameNumbersTest {

	@Test
	void GameNumbers_List_이용_생성자_올바른_동작_확인() {
		assertThat(new GameNumbers(GameNumberRepository.createGameNumbers())).isInstanceOf(GameNumbers.class);
	}

	@Test
	void GaemNumbers_int_이용_생성자_올바른_동작_확인() {
		assertThat(new GameNumbers(123)).isInstanceOf(GameNumbers.class);
	}

	@ParameterizedTest
	@NullSource
	void GameNumbers_null_입력시_예외처리(List<GameNumber> nullInput) {
		assertThatNullPointerException().isThrownBy(() -> {
			new GameNumbers(nullInput);
		}).withMessage("null이 입력될 수 없습니다.");
	}

	@ParameterizedTest
	@ValueSource(ints = {12, 1234})
	void GameNumbers_정해진_길이가_아닌_정수_입력시_예외처리(int input) {
		assertThatIllegalArgumentException().isThrownBy(() -> {
			new GameNumbers(input);
		}).withMessage("지정된 길이의 입력이 아닙니다.");
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

	@Test
	void GameNumbers_중복된_숫자_입력시_예외처리() {
		assertThatIllegalArgumentException().isThrownBy(() -> {
			new GameNumbers(122);
		});
	}

	@Test
	void getContainingGameNumbersCount_2개_겹칠시_2_반환() {
		GameNumbers gameNumbers = new GameNumbers(123);
		GameNumbers targetNumbers = new GameNumbers(234);

		assertThat(gameNumbers.getContainingGameNumbersCount(targetNumbers)).isEqualTo(2);
	}

	@Test
	void getSamePositionGameNumberCount_2개_겹칠시_2반환() {
		GameNumbers gameNumbers = new GameNumbers(123);
		GameNumbers targetNumbers = new GameNumbers(423);

		assertThat(gameNumbers.getSamePositionGameNumberCount(targetNumbers)).isEqualTo(2);
	}
}
