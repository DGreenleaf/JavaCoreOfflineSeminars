public class Task2 {

    static int balancesSum (int[] balances) {

        int sum = 0;

        for (int balance : balances) {

            if (balance > 10000 && balance < 50000) {
                sum += balance;
            }
        }
        return sum;


    }


    public static void main(String[] args) {

        int[] balances = {34523, 111111, 355345, 2424, 3254325, 34323, 242, 245352, 35465, 232};
        int[] balances1 = {121, 34235, 231, 8789, 3435, 35453, 10995, 4535, 775, 2498};



        System.out.println(balancesSum(balances));

        System.out.println(balancesSum(balances1));

    }
}