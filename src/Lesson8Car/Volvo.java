package Lesson8Car;

import java.util.Objects;

public class Volvo extends Car {
    private int speed;

    public String toString() {
        return "Volvo{model='" + this.getModel() + "', mark='" + this.getMark() + "', year='" + this.getYear() + "', color='" + this.getColor() + "', speed='" + this.speed + "'}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Volvo volvo = (Volvo)o;
            return this.speed == volvo.speed;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.speed});
    }

    public Volvo(String model, String mark, int year, String color, int speed) {
        super(model, mark, year, color);
        this.speed = speed;
    }
}
