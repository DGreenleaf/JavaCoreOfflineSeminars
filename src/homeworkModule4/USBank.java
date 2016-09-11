package homeworkModule4;


/*
limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
limit of funding - 10000 if EUR and no limit if USD
monthly rate - 1% with USD and 2% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
6% if EUR and up to 1000 and 8% if EUR and more than 1000
 */
public class USBank extends Bank {


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawalLimit = 0;
        if (getCurrency() == Currency.USD) withdrawalLimit = 1000;
        if (getCurrency() == Currency.EUR) withdrawalLimit = 1200;
        return withdrawalLimit;
    }

    @Override
    int getLimitOfFunding() {
        int fundingLimit = 0;
        if (getCurrency() == Currency.EUR) fundingLimit = 10000;
        if (getCurrency() == Currency.USD) fundingLimit = Integer.MAX_VALUE;
        return fundingLimit;
    }

    @Override
    int getMonthlyRate() {
        int ratePerMonth = 0;
        if (getCurrency() == Currency.USD) ratePerMonth = 1;
        if (getCurrency() == Currency.EUR) ratePerMonth = 2;
        return ratePerMonth;
    }

    @Override
    int getCommission(int amount) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 5;
            else commission = 7;
        }
        if (getCurrency() == Currency.EUR) {
            if (amount < 1000) commission = 6;
            else commission = 8;
            return 0;
        }

        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {

        return getNumberOfEmployees() * getAvrSalaryOfEmployee();
    }
}
