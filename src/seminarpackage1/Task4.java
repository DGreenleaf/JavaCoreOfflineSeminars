
public class Task4 {

    // vsegda zadaem korrektnoe nazvanie metoda (withdraw) v
    // sootvetstvii s postavlennoi zada4ey - mojem snimat lubuyu summy - int ne podhodit)

    // double balance i withdrawal - eto peremennie

    static double withdraw(double balance, double withdrawal, double commission) {
        // double commission = 1.5;
        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {

        // balance - summa na s4ety
        double balance = 100;
        // withdraw - to, 4to snimaem so s4eta
        double withdraw = 30.5;
        // commission - komissiya pri snyatii
        double commission = 2;
        // mojno pisat srazy 4isla vmesto balance, withdraw, commission

        double balanceAfter = withdraw(balance, withdraw, commission);

        if(balanceAfter >= 0) {
            // ok - esli deneg hvataet snyat nujnuyu summu s u4etom komissii
            System.out.println("ok");
            System.out.println(balanceAfter);
        }

        else {
            System.out.println("no");
        }
    }
}
