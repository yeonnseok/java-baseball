package baseballGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ComputerTest {
    @Test
    @DisplayName("세자리 랜덤 수가 중복인지 확인")
    void checkDuplicatedNumber() {
        assertThatThrownBy(() -> {

        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자가 중복되었습니다.");
    }
}
