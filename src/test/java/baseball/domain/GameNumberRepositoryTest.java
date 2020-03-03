package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * GameNumberRepository test
 *
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/03
 */
@SuppressWarnings("NonAsciiCharacters")
public class GameNumberRepositoryTest {
	@Test
	void createGameNumber_유효한_범위의_수_입력시_GameNumber_캐시_가져오는지_확인() {
		assertThat(GameNumberRepository.createGameNumber(1))
				.isEqualTo(new GameNumber(1));
	}

	@Test
	void createGameNumber_유효하지_않은_수_입력시_예외처리() {
		assertThatIllegalArgumentException().isThrownBy(() -> {
			GameNumberRepository.createGameNumber(11);
		}).withMessage("범위에 없는 수를 입력했습니다.");
	}

	@Test
	void createGameNumbers_1부터_9까지의_수만_생성되는지_확인() {
		for (int i = 0; i < 100 ; i++) {
			int check = (int)GameNumberRepository.createGameNumbers().stream()
					.map(GameNumber::getGameNumber)
					.filter(value -> value < 10 && value > 0)
					.count();

			assertThat(check).isEqualTo(3);
		}
	}
}
