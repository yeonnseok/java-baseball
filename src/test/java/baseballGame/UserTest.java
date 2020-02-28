package baseballGame;

import domain.BallNumbers;
import domain.ManualBallNumberGenerator;
import domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    @Test
    @DisplayName("유저가 입력한 볼이 세 자리 수가 맞는지 확인")
    void checkBallLengthIsThree() {
        User user = new User(new ManualBallNumberGenerator("456"));
        BallNumbers ballNumbers = user.getUserBalls();
        assertThat(ballNumbers.getSize()).isEqualTo(3);
    }
}
