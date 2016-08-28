package homeworkModule2;

public class Module2HomeWork2 {

    // всегда задаем корректные названия методов (withdraw) в
    // соответствии с поставленной задачей
    // так как можем снимать любую сумму, то тип данных int не подходит

    // double balance и withdrawal - переменные

    /*
    static double withdraw(double balance, double withdrawal, double commissionFinal) {
        // double commission = 5% = 0,05;
        return balance - withdrawal - commissionFinal;
    }
    */

    public static void main(String[] args) {

        // balance - сумма денег на счету
        double balance = 150;
        // withdraw - то, что снимаем со счета
        double withdrawal = 10.3;
        // commission - комиссия при снятии
        double commission = 0.05;
        // можно сразу писать численные значения вместо методов (balance, withdraw, commission)
        double commissionFinal = commission * withdrawal;
        double outputMoney = 0;

        System.out.println(withdrawal + commissionFinal + outputMoney);
    }

    static double output(double balance, double commissionFinal, double withdrawal, double outputMoney) {

        if (withdrawal + commissionFinal < balance) {
            withdrawal = withdrawal + commissionFinal;
            outputMoney = balance - withdrawal;
        }
        if (withdrawal + commissionFinal > balance ) {
            System.out.print("NO");
        }

        return outputMoney;
    }


}


