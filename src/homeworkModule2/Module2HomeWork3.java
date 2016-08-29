package homeworkModule2;

public class Module2HomeWork3 {


    static double withdraw(double balance, double withdrawal, double commissionFinal) {

        return balance - withdrawal - commissionFinal;
    }

    static String withdrawBalance(String ownerName, double balance) {

        return ownerName + "Initial balance = " + balance;
    }

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane ", "Ann ", "Jack ", "Oww ", "Lane "};
        int i = 0;
        double balance = balances[i];
        double commission = 0.05;
        double withdrawal = 100;
        double commissionFinal = commission * withdrawal;
        String ownerName = ownerNames[i];
        double balanceAfter = withdraw(balance, withdrawal, commissionFinal);
        String initialBalance = withdrawBalance(ownerName, balance);


        if(balanceAfter >= 0) {
            //System.out.println("OK. Client " + ownerName + "Withdrawal = " + withdrawal + " Remaining balance = " + balanceAfter);
            System.out.println(initialBalance + " Withdrawal = "  + withdrawal + " Remaining balance = " + balanceAfter);
        }

        if (balanceAfter <= 0) {
            System.out.println(ownerName + "NO");
        }

        }
    }

