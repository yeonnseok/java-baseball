package baseballGame;

import domain.Computer;
import domain.User;
import domain.CountResult;
import domain.UserBallNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountResultTest {
    @Test
    @DisplayName("스트라이크와 볼 갯수 확인")
    void calculateStrikeCountTest() {
        Computer computer = new Computer(new UserBallNumberGenerator("456"));
        User user = new User(new UserBallNumberGenerator("654"));

        CountResult countResult = new CountResult(computer, user);
        assertThat(countResult.getStrikeCountResult()).isEqualTo(1);
        assertThat(countResult.getBallCountResult()).isEqualTo(2);
    }
}
