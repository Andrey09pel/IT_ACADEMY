package Lesson6Ports.Contener;

public enum diametrDiagonal {
    D20(20),
    D10(10)

    ;

    private int value;

    diametrDiagonal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
