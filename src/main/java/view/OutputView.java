package view;

public class OutputView {

    public static final String INPUT_BALL_NUMBERS_GUIDE_MESSAGE = "숫자를 입력해 주세요 : ";

    public static void printExceptionMessage(RuntimeException e) {
        System.out.println(e.getMessage());
    }

    public static void printInputBallNumberGuideMessage() {
        System.out.print(INPUT_BALL_NUMBERS_GUIDE_MESSAGE);
    }
}
