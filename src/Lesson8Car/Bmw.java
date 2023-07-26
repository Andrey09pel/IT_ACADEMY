package Lesson8Car;

import java.util.Objects;

public class Bmw extends Car {
    private int volume;

    Bmw(String model, String mark, int year, String color, int volume) {
        super(model, mark, year, color);
        this.volume = volume;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Bmw bmw = (Bmw)o;
            return this.volume == bmw.volume;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.volume});
    }

    public String toString() {
        return "Bmw{model='" + this.getModel() + "', mark='" + this.getMark() + "', year='" + this.getYear() + "', color='" + this.getColor() + "', volume='" + this.volume + "'}";
    }
}
