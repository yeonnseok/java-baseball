package baseballGame;

import domain.BallNumbers;
import domain.RandomBallNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallNumbersTest {
    @Test
    @DisplayName("게임 볼 자리수가 3 자리 수 인지 확인")
    void checkDuplicatedNumber() {
        BallNumbers ballNumbers = new BallNumbers(new RandomBallNumberGenerator());
        assertThat(ballNumbers.getSize()).isEqualTo(3);
    }
}
