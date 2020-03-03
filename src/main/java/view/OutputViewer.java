package view;

public class OutputViewer {
    private static final int NO_COUNT = 0;

    private OutputViewer() {
    }

    public static void printErrorMessage(String message) {
        System.out.println(message);
    }

    public static void printResult(int strikeCount, int ballCount) {
        printStrike(strikeCount);
        printBall(ballCount);
        printNothing(strikeCount, ballCount);
        System.out.println();
    }

    private static void printStrike(int strikeCount) {
        if (strikeCount == NO_COUNT) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(strikeCount));
        sb.append(" 스트라이크 ");
        System.out.print(sb.toString());
    }

    private static void printBall(int ballCount) {
        if (ballCount == NO_COUNT) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(ballCount));
        sb.append(" 볼");
        System.out.print(sb.toString());
    }

    private static void printNothing(int strikeCount, int ballCount) {
        if (strikeCount == NO_COUNT && ballCount == NO_COUNT) {
            System.out.print("낫싱");
        }
    }
}
