import controller.BaseballGameController;
import domain.Computer;

public class BaseballApplication {
    public static void main(String[] args) {
        Computer computer = new Computer();

        BaseballGameController.run(computer);
    }
}
