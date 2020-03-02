package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BaseballNumberTest {
    @DisplayName("Baseball 생성자에 유효한 값이 전달되었을 때 예외 발생 테스트")
    @ParameterizedTest
    @ValueSource(ints = {0, -1, 10})
    void baseballConstructorTest(int input) {
        Assertions.assertThatThrownBy(() -> {
            new BaseballNumber(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
