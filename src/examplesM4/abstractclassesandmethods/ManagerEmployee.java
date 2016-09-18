package examplesM4.abstractclassesandmethods;

/**
 * Created by Sergiy on 9/11/16.
 */
public class ManagerEmployee extends Employee{

    public ManagerEmployee(int balance, int salary) {
        this.balance = balance;
        this.salary = salary;
    }

    @Override
    void paySalary() {
        double k = 1.5;
        balance += salary * k + 200;

    }
}
