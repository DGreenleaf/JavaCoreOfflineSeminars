package examplesM3;

public class Car {

    int year;
    String model;
    int price;
    String ownersName;

    public Car(int year, String model, int price, String ownersName) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.ownersName = ownersName;
    }

    void printOwnerName () {
        System.out.println(ownersName);
    }
}
