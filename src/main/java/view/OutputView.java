package view;

import domain.CountResult;

public class OutputView {

    private static final String INPUT_BALL_NUMBERS_GUIDE_MESSAGE = "숫자를 입력해 주세요 : ";
    private static final String BOTH_RESULT = "%d 스트라이크 %d 볼";
    private static final String ONLY_STRIKE = "%d 스트라이크";
    private static final String ONLY_BALL = "%d 볼";
    private static final String CORRECT_BALLS_MESSAGE = "3개의숫자를모두맞히셨습니다!게임종료";
    private static final String RESTART_OR_EXIT_GUIDE_MESSAGE = "게임을새로시작하려면1,종료하려면2를입력하세요.";

    public static void printExceptionMessage(String message) {
        System.out.println(message);
    }

    public static void printInputBallNumberGuideMessage() {
        System.out.print(INPUT_BALL_NUMBERS_GUIDE_MESSAGE);
    }

    public static void printCountResultMessage(final CountResult countResult) {
        int strike = countResult.getStrike();
        int ball = countResult.getBall();
        if (strike > 0 && ball > 0) {
            System.out.println(String.format(BOTH_RESULT, strike, ball));
            return;
        }
        printOneSideResult(strike, ball);
    }

    private static void printOneSideResult(final int strike, final int ball) {
        if (strike > 0) {
            System.out.println(String.format(ONLY_STRIKE, strike));
            return;
        }
        System.out.println(String.format(ONLY_BALL, ball));
    }

    public static void printCorrectBallsMessage() {
        System.out.println(CORRECT_BALLS_MESSAGE);
    }

    public static void printRestartOrExitMessage() {
        System.out.println(RESTART_OR_EXIT_GUIDE_MESSAGE);
    }
}
