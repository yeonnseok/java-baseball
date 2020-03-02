package baseball;

import baseball.controller.GameController;
import baseball.view.OutputView;

/**
 * 클래스 이름 : .java
 *
 * @author
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class BaseballApplication {
	public static void main(String[] args) {
		try {
			GameController gameController = new GameController();
			gameController.playBall();
		} catch (Exception e) {
			OutputView.printExceptionMessage(e);
		}
	}
}
