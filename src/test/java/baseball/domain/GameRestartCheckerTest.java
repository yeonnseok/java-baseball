package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * 클래스 이름 : .java
 *
 * @author
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameRestartCheckerTest {

	@Test
	void GameRestartChecker_생성자_올바른_동작_확인() {
		assertThat(new GameRestartChecker(1)).isInstanceOf(GameRestartChecker.class);
	}

	@Test
	void GameRestartChecker_지정된_입력_이외의_입력시_예외처리() {
		assertThatIllegalArgumentException().isThrownBy(() -> {
			new GameRestartChecker(4);
		}).withMessage("1 혹은 2만 입력하셔야합니다.");
	}

	@Test
	void isRestart_1을_포함한_객체_true_반환() {
		GameRestartChecker gameRestartChecker = new GameRestartChecker(1);
		assertThat(gameRestartChecker.isRestart()).isEqualTo(true);
	}

	@Test
	void isRestart_2을_포함한_객체_false_반환() {
		GameRestartChecker gameRestartChecker = new GameRestartChecker(2);
		assertThat(gameRestartChecker.isRestart()).isEqualTo(false);
	}
}
