package homeworkModule2;

public class Module2HomeWork2v2 {

    static double withdrawBalance (double balance, double withdrawal, double commission) {

        if (balance - withdrawal - commission >= 0) {
            double balanceAfter = balance - withdrawal - commission;
            System.out.println("OK " + "Balance = " + balanceAfter + " Commission = " + commission);
        }
        else  {
            System.out.println("NO ");
        }

        return 0;

    }

    public static void main (String[] args){

        double balance = 500;
        double withdrawal = 50;
        double commission = 0.05 * withdrawal;


        withdrawBalance(balance, withdrawal, commission);

    }

}
