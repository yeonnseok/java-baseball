package baseball.view;

import java.util.Scanner;
/**
 * 입력을 담당하는 view
 *
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class InputView {
	private static final Scanner SCANNER = new Scanner(System.in);

	private InputView() {}

	public static int getPlayerGameNumbers() {
		try {
			return Integer.parseInt(SCANNER.nextLine());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("입력이 정수가 아닙니다.");
		}
	}

	public static int getPlayAgainOrNot() {
		try {
			return Integer.parseInt(SCANNER.nextLine());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("입력이 정수가 아닙니다.");
		}
	}
}
