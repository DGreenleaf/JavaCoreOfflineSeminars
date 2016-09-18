package examplesM4.abstractclassesandmethods;

/**
 * Created by Sergiy on 9/11/16.
 */
public class HREmployee extends Employee {

    public HREmployee (int balance, int salary) {
        this.balance = balance;
        this.salary = salary;
    }

    @Override
    void paySalary() {
        double k = 1.2;
        balance += salary * k;

    }
}
