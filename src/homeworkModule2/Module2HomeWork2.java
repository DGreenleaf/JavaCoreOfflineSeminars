package homeworkModule2;

public class Module2HomeWork2 {

    // всегда задаем корректные названия методов (withdraw) в
    // соответствии с поставленной задачей
    // так как можем снимать любую сумму, то тип данных int не подходит

    // double balance и withdrawal - переменные

    static double withdraw(double balance, double withdrawal, double commissionFinal) {
        // double commission = 5% = 0,05;
        return balance - withdrawal - commissionFinal;
    }

    public static void main(String[] args) {

        // balance - сумма денег на счету
        double balance = 150;
        // withdraw - то, что снимаем со счета
        double firstWithdraw = 10.3;
        double secondWithdraw = 150;
        // commission - комиссия при снятии
        double commission = 0.05;
        // можно сразу писать численные значения вместо методов (balance, withdraw, commission)

        double balanceAfter = withdraw(balance, firstWithdraw, commission);
        double balanceAfter2 = withdraw(balanceAfter, secondWithdraw, commission);
        double commissionFinal = commission * firstWithdraw;
        double commissionFinal2 = commission * secondWithdraw;

        if(balanceAfter >= 0) {
            // ok - выдается если хватает денег на снятие указанной суммы с учетом комиссии
            System.out.println("ok " + " Discounted comission = " + commissionFinal + " Remaining balance = " + balanceAfter);
        }

        else {
            System.out.println("no");
        }

        if(balanceAfter2 >= 0) {
            // ok - выдается если хватает денег на снятие указанной суммы с учетом комиссии
            System.out.println("ok " + " Discounted comission = " + commissionFinal2 + " Remaining balance = " + balanceAfter2);
        }

        else {
            System.out.println("no");
        }
    }

}


