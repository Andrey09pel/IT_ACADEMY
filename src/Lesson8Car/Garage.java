package Lesson8Car;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> garage = new HashMap();

    public Garage() {
    }

    public void parking(Car car, int a) {
        if (!this.garage.containsKey(car)) {
            this.garage.put(car, a);
        } else {
            this.garage.replace(car, (Integer)this.garage.get(car) + a);
        }

        System.out.println(a + " " + car.getModel() + " " + car.getMark() + " parked");
    }

    public void checkOut(Car car, int a) {
        if (this.garage.containsKey(car)) {
            this.garage.replace(car, (Integer)this.garage.get(car) - a);
            System.out.println(a + " " + car.getModel() + " " + car.getMark() + " set out");
        } else {
            this.garage.replace(car, 0);
        }

    }

    public void amount(String car) {
        int amountCarInGarage = 0;
        Iterator var3 = this.garage.entrySet().iterator();

        while(var3.hasNext()) {
            Map.Entry<Car, Integer> item = (Map.Entry)var3.next();
            if (((Car)item.getKey()).getModel().equals(car)) {
                amountCarInGarage += (Integer)item.getValue();
            }
        }

        System.out.println("in garage " + amountCarInGarage + " " + car);
    }
}
