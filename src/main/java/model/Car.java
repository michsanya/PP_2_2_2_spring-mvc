package model;

public class Car {
    String model;
    int number;
    int length;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Car() {
    }

    public Car(String model, int number, int length) {
        this.model = model;
        this.number = number;
        this.length = length;
    }

    @Override
    public String toString() {
        return model;
    }
}
