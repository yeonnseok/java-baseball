package baseballGame;

import domain.Computer;
import domain.User;
import domain.UserBallNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerTest {
    @Test
    @DisplayName("스트라이크 갯수 확인")
    void calculateStrikeCountTest() {
        Computer computer = new Computer(new UserBallNumberGenerator("456"));
        User user = new User(new UserBallNumberGenerator("654"));

        int strike = computer.calculateStrikeCount(user);
        assertThat(strike).isEqualTo(1);
    }

    @Test
    @DisplayName("볼 갯수 확인")
    void calculateBallCountTest() {
        Computer computer = new Computer(new UserBallNumberGenerator("456"));
        User user = new User(new UserBallNumberGenerator("654"));

        int ball = computer.calculateBallCount(user);
        assertThat(ball).isEqualTo(2);
    }
}
