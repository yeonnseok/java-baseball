package domain;

public enum Flag {
    RESTART(1),
    EXIT(2);

    private static final int RESTART_NUMBER = 1;
    private int no;

    Flag(int no) {
        this.no = no;
    }

    public static Flag findFlag(final int flagIntegerValue) {
        if (flagIntegerValue == RESTART_NUMBER) {
            return Flag.RESTART;
        }
        return Flag.EXIT;
    }
}
