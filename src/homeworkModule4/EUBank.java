package homeworkModule4;


/*
EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
limit of funding - 20000 if EUR and 10000 if USD
monthly rate - 0% with USD and 1% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
2% if EUR and up to 1000 and 4% if EUR and more than 1000
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawalLimit = 0;
        if (getCurrency() == Currency.USD) withdrawalLimit = 2000;
        if (getCurrency() == Currency.EUR) withdrawalLimit = 2200;
        return withdrawalLimit;
    }

    @Override
    int getLimitOfFunding() {
        int fundingLimit = 0;
        if (getCurrency() == Currency.EUR) fundingLimit = 20000;
        if (getCurrency() == Currency.USD) fundingLimit = 10000;
        return fundingLimit;
    }

    @Override
    int getMonthlyRate() {
        int ratePerMonth = 0;
        if (getCurrency() == Currency.USD) ratePerMonth = 0;
        if (getCurrency() == Currency.EUR) ratePerMonth = 1;
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
            if (amount < 1000) commission = 2;
            else commission = 4;
            return 0;
        }

        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {

        return getNumberOfEmployees() * getAvrSalaryOfEmployee();
    }
}
