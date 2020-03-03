package baseballGame;

import domain.BallNumber;
import domain.SourceBallNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SourceBallNumbersTest {
    @DisplayName("1~9까지의 전체 게임 볼이 잘 접근되는지 확인")
    @ParameterizedTest
    @CsvSource({"4,4", "5,5", "7,7"})
    void getSourceBallTest(int number, String numberBall){
        BallNumber ballNumber = SourceBallNumbers.getBall(number);
        assertThat(ballNumber.toString()).isEqualTo(numberBall);

    }

    @DisplayName("1~9이외의 숫자로 접근시 예외 발생 확인")
    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    void getSourceBallFailTest() {
        assertThatThrownBy(() -> {
            SourceBallNumbers.getBall(10);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자는 1~9까지만 가능합니다.");
    }

}
