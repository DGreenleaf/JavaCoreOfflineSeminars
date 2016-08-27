package homeworkModule2;

public class Module2HomeWork4 {
    static double withdraw(double balance, double withdrawal, double commissionFinal) {
        // double commission = 5% = 0,05;
        return balance - withdrawal - commissionFinal;
    }

    public static void main(String[] args) {

        int[] balances = {120, 390, 240, 1500, 200, 90000, 1100, 20, 0, 100};
        String[] ownerNames = {"Sergii ", "John ", "Viktor ", "Jackson ", "Lasley ", "Pol ", "Ted ", "Manny ", "Rocky ", "Terry "};
        double recharge = 50;
        double balanceAfter1 = balances[4] + recharge;

        if (balanceAfter1 >= 0) {

            System.out.println(ownerNames[4] + "Total recharge = " + recharge + "  Refilled balance = " + balanceAfter1);
        }
    }
}
