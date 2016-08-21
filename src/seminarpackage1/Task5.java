// Zada4a task2updated - napisat pisma tem owneram s4etov
// u kogo est opredelennaya summa na s4ety, sperva opredeliv etih ludey

public class Task5 {

    static int balancesSum (int[] balances) {

        int sum = 0;

        for (int balance : balances) {

            if (balance > 10000 && balance < 50000) {
                sum += balance;
            }
        }
        return sum;


    }

    static String[] getOwnerNames(int[] balances, String[] names) {


        int ownersCount = 0;
        for (int balance : balances) {
            if(balance > 2000) ownersCount++;
        }

        String[] result = new String[ownersCount];
        // dvoinoy cikl - ne o4en horosho, poka ne proidet ves cikl dlya i=0 ()
        for (int i = 0; i < balances.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (balances[j] > 2000) result[j] = names[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String text = " ";

        int[] balances = {34523, 111111, 355345, 2424, 3254325, 34323, 242, 245352, 35465, 232};
        String[] ownerNames = {"Sergii", "John", "Viktor", "Jackson", "Lasley", "Pol", "Ted", "Manny", "Rocky", "Terry"};
        int[] balances1 = {121, 34235, 231, 8789, 3435, 35453, 10995, 4535, 775, 2498};



        System.out.println(balancesSum(balances));

        System.out.println(balancesSum(balances1));

    }
}