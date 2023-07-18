package mingroup.AnalysisSys.utils;

public enum Const {
    YEAR(2023);

    private final int value;

    Const(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
