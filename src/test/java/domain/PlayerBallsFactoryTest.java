package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerBallsFactoryTest {
    @Test
    @DisplayName("사용자의 야구공 리스트가 잘 만들어지는지 테스트")
    void Player_야구공_리스트를_제대로_생성하는지_테스트() {
        BallsFactory playerFactory = new PlayerBallsFactory();
        Generator manualGenerator = new ManualNumberGenerator("123");
        List<Ball> testBalls = Arrays.asList(Ball.createBall(1)
                , Ball.createBall(2)
                , Ball.createBall(3));

        assertThat(playerFactory.createBalls(manualGenerator)).isEqualTo(testBalls);
    }

    @Test
    @DisplayName("컴퓨터의 야구공 리스트가 잘 만들어지는지 테스트")
    void Computer_야구공_리스트를_제대로_생성하는지_테스트() {
        BallsFactory computerFactory = new ComputerBallsFactory();
        List<Ball> testBalls = Arrays.asList(Ball.createBall(1)
                , Ball.createBall(2)
                , Ball.createBall(3));
        Generator manualNumberGenerator = new ManualNumberGenerator("123");

        assertThat(computerFactory.createBalls(manualNumberGenerator)).isEqualTo(testBalls);
    }
}
