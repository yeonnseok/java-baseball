package baseball.controller;

import baseball.view.InputView;
import baseball.view.OutputView;

/**
 * 클래스 이름 : .java
 *
 * @author
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameController {

	public void playBall() {
		OutputView.askPlayerGameNumber();
		int inputPlayerGameNumbers = InputView.getPlayerGameNumbers();
	}
}
