package examplesM4.abstractclassesandmethods;


public class Solution {

    //статический из-за того, что вызывается из мейна

    static void paySalary (Employee[] employees) {
        for (Employee employee : employees)
        employee.paySalary();

    }

    public static void main(String[] args) {


        /*
        МОЖНО ДЕЛАТЬ И ТАК, НО ЭТО НЕ КРАСИВО (МНОГО ОДИНАКОВЫХ СТРОК)

        DeveloperEmployee developerEmployee = new DeveloperEmployee(0, 700);
        ManagerEmployee managerEmployee = new ManagerEmployee(100, 600);

        developerEmployee.paySalary();
        managerEmployee.paySalary();

        System.out.println(developerEmployee.balance);
        System.out.println(managerEmployee.balance);
        */

        DeveloperEmployee developerEmployee = new DeveloperEmployee(0, 700);
        ManagerEmployee managerEmployee = new ManagerEmployee(100, 600);

        Employee[] employees = {developerEmployee, managerEmployee};

        paySalary(employees);

        System.out.println(developerEmployee.balance);
        System.out.println(managerEmployee.balance);



    }
}
