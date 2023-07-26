package Lesson8Car;

import java.util.Objects;

public class Kia extends Car {
    private int door;

    public String toString() {
        return "Kia{model='" + this.getModel() + "', mark='" + this.getMark() + "', year='" + this.getYear() + "', color='" + this.getColor() + "', door='" + this.door + "'}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Kia kia = (Kia)o;
            return this.door == kia.door;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.door});
    }

    public Kia(String model, String mark, int year, String color, int door) {
        super(model, mark, year, color);
        this.door = door;
    }
}
