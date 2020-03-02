package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    @DisplayName("GameContinue 에 의해 게임 재개 테스트")
    @Test
    void resetGameTest() {
        Computer computer = new Computer();
        GameContinue continueGame = new GameContinue("1");
        GameContinue stopGame = new GameContinue("2");

        Assertions.assertThat(computer.isContinue(continueGame)).isTrue();
        Assertions.assertThat(!computer.isContinue(stopGame)).isTrue();
    }
}
