package homework;

public class Module2HomeWork3 {

    static double withdraw(double balance, double withdrawal, double commissionFinal) {
        // double commission = 5% = 0,05;
        return balance - withdrawal - commissionFinal;
    }

    public static void main(String[] args) {

        int[] balances = {120, 390, 240, 1500, 200, 90000, 1100, 20, 0, 100};
        String[] ownerNames = {"Sergii ", "John ", "Viktor ", "Jackson ", "Lasley ", "Pol ", "Ted ", "Manny ", "Rocky ", "Terry "};
        double commission = 0.05;
        double withdraw = 100;
        double commissionFinal = commission * withdraw;
        double balanceAfter1 = balances[1] - withdraw - commissionFinal;
        double balanceAfter2 = balances[balances.length-2] - withdraw - commissionFinal;


        if(balanceAfter1 >= 0) {

            System.out.println(ownerNames[1] + withdraw + " Remaining balance = " + balanceAfter1);
        }

        else {
            System.out.println(ownerNames[1] + "no");
        }

        if(balanceAfter2 >= 0) {

            System.out.println(ownerNames[balances.length-2] + withdraw + " Remaining balance = " + balanceAfter2);
        }

        else {
            System.out.println(ownerNames[balances.length-2] + " no");
        }

        }
    }

