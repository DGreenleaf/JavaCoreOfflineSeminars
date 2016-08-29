package homeworkModule2;

public class Module2HomeWork2 {

    static double withdrawBalance (double balance, double withdrawal, double commission) {

        return balance - withdrawal - commission;

    }

    public static void main (String[] args){

        double withdrawal = 50;

        double commission = 0.05 * withdrawal;

        double balanceAfter = withdrawBalance(500, withdrawal, commission);

        if (balanceAfter >= 0){
            System.out.println("OK " + "Balance = " + balanceAfter + " Commission = " + commission);
        }
        if (balanceAfter <= 0) {
            System.out.println("NO ");
        }

    }


}


