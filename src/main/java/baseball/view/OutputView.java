package baseball.view;

/**
 * 클래스 이름 : .java
 *
 * @author
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class OutputView {
	private static final String ENTER_PLAYER_GAME_NUMBERS_GUIDE_MESSAGE = "숫자를 입력해주세요 : ";

	private OutputView() {}

	public static void askPlayerGameNumber() {
		System.out.println(ENTER_PLAYER_GAME_NUMBERS_GUIDE_MESSAGE);
	}

	public static void printExceptionMessage(Exception e) {
		System.out.println(e.getMessage());
	}

	public static void printResult(int strike, int ball) {
		if (strike == 3) {
			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
			return;
		}

		if (strike == 0 && ball == 0) {
			System.out.println("하나도 못 맞췄습니다.");
			return;
		}

		if (ball == 0) {
			System.out.printf("%d 스트라이크\n", strike);
			return;
		}

		if (strike == 0) {
			System.out.printf("%d 볼\n", ball);
			return;
		}

		System.out.printf("%d 스트라이크 %d 볼\n", strike, ball);
	}

	public static void askPlayAgain() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
	}


}
