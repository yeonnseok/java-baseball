package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTest {
    @DisplayName("랜덤으로 생성하는 숫자의 범위가 유효한지 테스트")
    @Test
    void numberRangeTest() {
        for (int i = 0; i < 10000; i++) {
            Assertions.assertThat(RandomNumberGenerator.generateRandomNumber()).isBetween(1, 9);
        }
    }
}
