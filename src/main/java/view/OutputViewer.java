package view;

public class OutputViewer {
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
        if (strikeCount == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(strikeCount));
        sb.append(" 스트라이크 ");
        System.out.print(sb.toString());
    }

    private static void printBall(int ballCount) {
        if (ballCount == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(ballCount));
        sb.append(" 볼");
        System.out.print(sb.toString());
    }

    private static void printNothing(int strikeCount, int ballCount) {
        if (strikeCount == 0 && ballCount == 0) {
            System.out.print("낫싱");
        }
    }
}
