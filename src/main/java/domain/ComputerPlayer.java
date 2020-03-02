package domain;

import java.util.List;

public class ComputerPlayer {
    List<Ball> computerBalls;

    public ComputerPlayer(Generator randomNumberGenerator) {
      this.computerBalls = BallsFactory.createComputerBalls(randomNumberGenerator);
    }
}
