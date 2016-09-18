package examplesM4.abstractclassesandmethods;

/**
 * Created by Sergiy on 9/11/16.
 */
public class DeveloperEmployee extends Employee{

    public DeveloperEmployee (int balance, int salary) {
        this.balance = balance;
        this.salary = salary;
    }


    @Override
    void paySalary() {
        balance += salary + 100;
    }
}
