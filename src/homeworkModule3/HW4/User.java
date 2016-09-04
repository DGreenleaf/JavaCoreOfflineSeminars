package homeworkModule3.HW4;


public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    protected User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    int totalBalance;

    void paySalary() {
        totalBalance = balance + salary;
        System.out.println("Final balance with salary after " + monthsOfEmployment + " monthes of work = " + totalBalance + currency);
    }

    void withdraw (int summ) {
        if(summ < 1000) {
            System.out.println("Balance after withdrawal = " + (balance - summ * 1.05) + currency);
            System.out.println("Withdrawal with comission = " + summ * 1.05 + currency);
        }
        else {
            System.out.println("Balance after withdrawal = " + (balance - summ * 1.1) + currency);
            System.out.println("Withdrawal with comission = " + summ * 1.1 + currency);
        }
    }

    void monthIncreaser(int addMonth) {
        System.out.println("Total monthes on " + companyName + " = " + (monthsOfEmployment + addMonth));
    }

    void companyNameLenght() {
         companyName.length();
        System.out.println("Employer - " + companyName);
    }



}
