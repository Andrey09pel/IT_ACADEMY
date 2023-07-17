package Lesson6Ports.Сrisper;
// контенер
public enum  Сrisper {

    Crisper1k(1000),
    Crrisper2k(2000)

    ;
    private int value;

    public int getValue() {
        return value;
    }

    Сrisper(){};

    Сrisper(int value) {
        this.value = value;
    }


}
