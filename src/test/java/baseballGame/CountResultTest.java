package baseballGame;

import domain.Computer;
import domain.User;
import domain.CountResult;
import domain.ManualBallNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountResultTest {
    @Test
    @DisplayName("스트라이크와 볼 갯수 확인")
    void calculateStrikeCountTest() {
        Computer computer = new Computer(new ManualBallNumberGenerator("456"));
        User user = new User(new ManualBallNumberGenerator("654"));

        CountResult countResult = new CountResult(computer, user);
        assertThat(countResult.getStrike()).isEqualTo(1);
        assertThat(countResult.getBall()).isEqualTo(2);
    }

    @Test
    @DisplayName("3 스트라이크인지 확인")
    void isThreeStrikeTest() {
        Computer computer = new Computer(new ManualBallNumberGenerator("456"));
        User user = new User(new ManualBallNumberGenerator("456"));

        CountResult countResult = new CountResult(computer, user);
        assertThat(countResult.isThreeStrike()).isTrue();
    }
}
