package examplesM4.abstractclassesandmethods;

/**
 * Created by Sergiy on 9/11/16.
 */
public abstract class Employee {

    int balance;
    int salary;


    abstract void paySalary();

    void printBalance() {
        System.out.println(balance);
    }

    /*
    public int getBalance() {
        return balance;
    }

    public int getSalary() {
        return salary;
    }
    */
}
