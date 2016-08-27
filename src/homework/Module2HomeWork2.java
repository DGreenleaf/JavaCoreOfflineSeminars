package homework;

public class Module2HomeWork2 {

    // всегда задаем корректные названия методов (withdraw) в
    // соответствии с поставленной задачей
    // так как можем снимать любую сумму, то тип данных int не подходит

    // double balance и withdrawal - переменные

    static double withdraw(double balance, double withdrawal, double commission) {
        // double commission = 5% = 0,05;
        return balance - withdrawal - (commission * withdrawal);
    }

    public static void main(String[] args) {

        // balance - сумма денег на счету
        double balance = 150;
        // withdraw - то, что снимаем со счета
        double withdraw = 10.3;
        // commission - комиссия при снятии
        double commission = 0.05;
        // можно сразу писать численные значения вместо методов (balance, withdraw, commission)

        double balanceAfter = withdraw(balance, withdraw, commission);
        double comissionFinal = commission * withdraw;

        if(balanceAfter >= 0) {
            // ok - выдается если хватает денег на снятие указанной суммы с учетом комиссии
            System.out.println("ok " + " Discounted comission = " + comissionFinal + " Remaining balance = " + balanceAfter);
        }

        else {
            System.out.println("no");
        }
    }

}


