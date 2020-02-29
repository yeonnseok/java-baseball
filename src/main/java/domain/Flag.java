package domain;

public enum Flag {
    RESTART(1),
    EXIT(2);

    private int no;

    Flag(int no) {
        this.no = no;
    }

    public static Flag findFlag(final int flagIntegerValue) {
        if (flagIntegerValue == 1) {
            return Flag.RESTART;
        }
        return Flag.EXIT;
    }
}
