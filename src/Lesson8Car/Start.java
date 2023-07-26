package Lesson8Car;

public class Start {
    public Start() {
    }

    public static void main(String[] args) {
        new Bmw("BMW", "X5", 2010, "black", 2);
        Car bmw1 = new Bmw("BMW", "X3", 1993, "White", 3);
        new Kia("Kia", "Rio", 2013, "red", 5);
        Garage garage = new Garage();
        garage.parking(bmw1, 3);
        garage.checkOut(bmw1, 2);
        garage.amount("BMW");
        System.out.println(bmw1);
    }
}
