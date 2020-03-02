package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {
    @Test
    void 랜덤한_숫자가_범위내에_있는지_테스트() {
        assertThat(RandomNumber.generateRandomNumber()).isBetween(1,9);
    }
}
