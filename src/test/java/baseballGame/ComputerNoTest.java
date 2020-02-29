package baseballGame;

import domain.BallNumbers;
import domain.ComputerNo;
import domain.ManualBallNumberGenerator;
import domain.UserNo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerNoTest {
    @Test
    @DisplayName("스트라이크 갯수 확인")
    void calculateStrikeCountTest() {
        ComputerNo computerNo = new ComputerNo(new ManualBallNumberGenerator("456"));
        UserNo userNo = new UserNo(new ManualBallNumberGenerator("654"));

        int strike = BallNumbers.calculateStrikeCount(computerNo.getBallNumbers(), userNo.getBallNumbers());
        assertThat(strike).isEqualTo(1);
    }

    @Test
    @DisplayName("볼 갯수 확인")
    void calculateBallCountTest() {
        ComputerNo computerNo = new ComputerNo(new ManualBallNumberGenerator("456"));
        UserNo userNo = new UserNo(new ManualBallNumberGenerator("654"));

        int ball = BallNumbers.calculateBallCount(computerNo.getBallNumbers(), userNo.getBallNumbers());
        assertThat(ball).isEqualTo(2);
    }
}
