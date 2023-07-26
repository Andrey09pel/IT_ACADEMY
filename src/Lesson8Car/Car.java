package Lesson8Car;

public abstract class Car {
    private String model;
    private String mark;
    private int year;
    private String color;

    public String getModel() {
        return this.model;
    }

    public String getMark() {
        return this.mark;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    public Car(String model, String mark, int year, String color) {
        this.model = model;
        this.mark = mark;
        this.year = year;
        this.color = color;
    }
}
