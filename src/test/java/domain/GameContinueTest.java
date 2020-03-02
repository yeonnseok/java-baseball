package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GameContinueTest {
    @DisplayName("게임 재개 시 유효하지 않은 값이 들어왔을 때 예외 처리 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"0", "3", "aasd", " ", ""})
    void continueConstructorTest(String input) {
        Assertions.assertThatThrownBy(() -> {
            new GameContinue(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
