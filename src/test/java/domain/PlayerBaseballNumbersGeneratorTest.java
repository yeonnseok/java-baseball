package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PlayerBaseballNumbersGeneratorTest {
    @DisplayName("사용자의 숫자가 유효하지 않을 때 예외 처리 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "1234", "103", "1a2"})
    void generatePlayerBaseballNumbersTest(String input) {
        Assertions.assertThatThrownBy(() -> {
            PlayerBaseballNumbersGenerator.generateBaseballNumbers(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
