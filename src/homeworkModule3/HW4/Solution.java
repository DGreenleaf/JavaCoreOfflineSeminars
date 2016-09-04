package homeworkModule3.HW4;

/*
Create User class with the following fields: String name, int balance, int monthsOfEmployment,
String companyName, int salary, String currency.

Create getters and setters and constructor with all fileds.

Write methods:

void paySalary() -  that add salary to the balance of the user
withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
companyNameLenght - calculates name of the company name
monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
 */

public class Solution {

    public static void main(String[] args) {

        User Darren = new User("Darren ", 50000, 7, " ANTONOV ", 16000, " UAH ");

        Darren.withdraw(1500);
        Darren.paySalary();
        Darren.companyNameLenght();
        Darren.monthIncreaser(1);



    }
}
