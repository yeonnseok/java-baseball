package baseball;

import baseball.controller.GameController;
import baseball.view.OutputView;

/**
 * main 함수가 담긴 application
 *
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */

public class BaseballApplication {
	public static void main(String[] args) {
		try {
			GameController gameController = new GameController();
			gameController.playBall();
		} catch (NullPointerException | IllegalArgumentException e) {
			OutputView.printExceptionMessage(e);
		}
	}
}
