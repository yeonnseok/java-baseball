package domain;

import java.util.List;

public interface BallsFactory {
    List<Ball> createBalls(Generator generator);
}
