package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerPlayerTest {
    @Test
    @DisplayName("manualNumber를 넣어서 숫자가 잘 생성되는지 확인")
    void ComputerPlayer가_지정한_숫자들을_잘_생성하는지_테스트() {
        Generator manualNumber = new ManualNumberGenerator();
        List<Ball> testComputerBalls = Arrays.asList(Ball.createBall(1), Ball.createBall(2), Ball.createBall(3));
        assertThat(new ComputerPlayer(manualNumber).getBalls()).isEqualTo(testComputerBalls);
    }
}
