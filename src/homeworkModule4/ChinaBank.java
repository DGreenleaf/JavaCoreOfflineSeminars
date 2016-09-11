package homeworkModule4;



/*
ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
limit of funding - 5000 if EUR and 10000 if USD
monthly rate - 1% with USD and 0% with EUR
commision - 3% if USD and up to 1000, 5% if USD and more than 1000
10% if EUR and up to 1000 and 11% if EUR and more than 1000
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);


    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawalLimit = 0;
        if (getCurrency() == Currency.USD) withdrawalLimit = 100;
        if (getCurrency() == Currency.EUR) withdrawalLimit = 150;
        return withdrawalLimit;
    }

    @Override
    int getLimitOfFunding() {
        int fundingLimit = 0;
        if (getCurrency() == Currency.EUR) fundingLimit = 5000;
        if (getCurrency() == Currency.USD) fundingLimit = 10000;
        return fundingLimit;
    }

    @Override
    int getMonthlyRate() {
        int ratePerMonth = 0;
        if (getCurrency() == Currency.USD) ratePerMonth = 1;
        if (getCurrency() == Currency.EUR) ratePerMonth = 0;
        return ratePerMonth;
    }

    @Override
    int getCommission(int amount) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 3;
            else commission = 5;
        }
        if (getCurrency() == Currency.EUR) {
            if (amount < 1000) commission = 10;
            else commission = 11;
            return 0;
        }

        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {

        return getNumberOfEmployees() * getAvrSalaryOfEmployee();
    }


}
