package domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerPlayerTest {
    @Test
    void ComputerPlayer가_랜덤한_숫자들을_잘_생성하는지_테스트() {
        Generator manualNumber = new ManualNumberGenerator();
        List<Ball> testComputerBalls = Arrays.asList(Ball.createBall(1),Ball.createBall(2), Ball.createBall(3));
        assertThat(new ComputerPlayer(manualNumber).getBalls()).isEqualTo(testComputerBalls);
    }
}
