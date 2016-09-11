package homeworkModule4;

/*
Abstract class Bank should contain fields
long id
String bankCountry
Currency currency
int numberOfEmployees
double avrSalaryOfEmployee
long rating
long totalCapital

Generate getters and setters. And create constructor with all fields.

Methods are:
abstract int getLimitOfWithdrawal()
abstract int getLimitOfFunding()
abstract int getMonthlyRate()
abstract int getCommission(int summ)
double moneyPaidMonthlyForSalary()
 */


public abstract class Bank {

    private long id;
    private String bankCountry;
    Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;




    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int summ);

    abstract double moneyPaidMonthlyForSalary();

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }


    public long getId() {
        return id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
}
