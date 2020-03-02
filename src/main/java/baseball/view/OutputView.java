package baseball.view;

/**
 * 출력을 담당하는 view
 *
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class OutputView {
	private static final String ENTER_PLAYER_GAME_NUMBERS_GUIDE_MESSAGE = "숫자를 입력해주세요 : ";
	private static final String WINNING_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
	private static final String ZERO_MATCH_MESSAGE = "하나도 못 맞췄습니다.";
	private static final String STRIKE_MESSAGE = "%d 스트라이크\n";
	private static final String BALL_MESSAGE = "%d 볼\n";
	private static final String STRIKE_AND_BALL_MESSAGE = "%d 스트라이크 %d 볼\n";
	private static final String ENTER_RESTART_OR_NOT_GUIDE_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	private OutputView() {}

	public static void askPlayerGameNumber() {
		System.out.println(ENTER_PLAYER_GAME_NUMBERS_GUIDE_MESSAGE);
	}

	public static void printExceptionMessage(Exception e) {
		System.out.println(e.getMessage());
	}

	public static void printResult(int strike, int ball) {
		if (strike == 3) {
			System.out.println(WINNING_MESSAGE);
			return;
		}

		if (strike == 0 && ball == 0) {
			System.out.println(ZERO_MATCH_MESSAGE);
			return;
		}

		if (ball == 0) {
			System.out.printf(STRIKE_MESSAGE, strike);
			return;
		}

		if (strike == 0) {
			System.out.printf(BALL_MESSAGE, ball);
			return;
		}

		System.out.printf(STRIKE_AND_BALL_MESSAGE, strike, ball);
	}

	public static void askRestartGame() {
		System.out.println(ENTER_RESTART_OR_NOT_GUIDE_MESSAGE);
	}
}
