package baseballGame;

import domain.ComputerNo;
import domain.UserNo;
import domain.CountResult;
import domain.ManualBallNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountResultTest {
    @DisplayName("스트라이크와 볼 갯수 확인")
    @Test
    void calculateStrikeCountTest() {
        ComputerNo computerNo = new ComputerNo(new ManualBallNumberGenerator(456));
        UserNo userNo = new UserNo(new ManualBallNumberGenerator(654));

        CountResult countResult = new CountResult(computerNo, userNo);
        assertThat(countResult.getStrike()).isEqualTo(1);
        assertThat(countResult.getBall()).isEqualTo(2);
    }

    @DisplayName("3 스트라이크인지 확인")
    @Test
    void isThreeStrikeTest() {
        ComputerNo computerNo = new ComputerNo(new ManualBallNumberGenerator(456));
        UserNo userNo = new UserNo(new ManualBallNumberGenerator(654));

        CountResult countResult = new CountResult(computerNo, userNo);
        assertThat(countResult.isThreeStrike()).isTrue();
    }
}
