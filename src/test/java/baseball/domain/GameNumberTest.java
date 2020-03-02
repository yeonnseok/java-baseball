package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


/**
 * GameNumber test
 *
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameNumberTest {

	@Test
	void GameNumber_생성자_올바른_동작_확인() {
		assertThat(new GameNumber(1)).isInstanceOf(GameNumber.class);
	}

	@Test
	void GameNumber_생성자_허용_범위_미만_입력시_예외처리() {
		assertThatThrownBy(() -> new GameNumber(0))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("GameNumber의 범위를 초과한 입력이 있습니다.");
	}

	@Test
	void GameNumber_생성자_허용_범위_초과_입력시_예외처리() {
		assertThatThrownBy(() -> new GameNumber(10))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("GameNumber의 범위를 초과한 입력이 있습니다.");
	}
}
