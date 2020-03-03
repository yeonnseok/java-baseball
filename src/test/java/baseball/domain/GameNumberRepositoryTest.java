package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * GameNumberRepository test
 *
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/03
 */
public class GameNumberRepositoryTest {
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
