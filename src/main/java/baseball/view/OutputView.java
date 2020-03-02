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


}
