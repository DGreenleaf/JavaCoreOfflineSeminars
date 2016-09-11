package homeworkModule4;


public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(amount) / 100;
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission) {
            //do logic if rules allow
            double newBalance = user.getBalance() - amount - amount * commission;
            user.setBalance(newBalance);
            //System.out.println(newBalance + " withdraw " + user.getName());
        } else {
            System.out.println("Error");
        }

    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        double balanceAfterFunding = user.getBalance() + amount;
        user.setBalance(balanceAfterFunding);
        //System.out.println(balanceAfterFunding + " fund " + user.getName());

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank fromUserBank = fromUser.getBank();
        Bank toUserBank = toUser.getBank();
        int funding = toUserBank.getLimitOfFunding();
        //вопрос - как сюда загнать переменную комиссию?
        double commission = fromUserBank.getCommission(amount) * (amount/100);
        if (fromUserBank.getLimitOfWithdrawal() >= amount * commission) {
            if (funding >= amount || funding == 0) fromUser.setBalance(fromUser.getBalance() - amount * commission);
            toUser.setBalance(toUser.getBalance() + amount);
        }

    }

    @Override
    public void paySalary(User user) {
        Bank userBank = user.getBank();
        double newBalance = user.getBalance() + user.getSalary();
        user.setBalance(newBalance);

    }
}
