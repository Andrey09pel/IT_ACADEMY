package Lesson11;

import Lesson8Car.Car;

import java.util.Date;
import java.util.Objects;

public class OrderShit extends libActionOrderShit {
    private int volume;
    public OrderShit(Integer idx, String name, Date dateBeg) {
        super(idx, name, dateBeg);
        this.volume = volume;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            OrderShit OrderShit = (OrderShit)o;
            return this.volume == OrderShit.volume;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.volume});
    }

    public String toString() {
        return  "\n"+"|"+this.getIdx()+"|" + this.getName() + "|" + this.getdateBeg()+"|";
    }
}
