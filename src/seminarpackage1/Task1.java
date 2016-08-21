
public class Task1 {


    public static void main(String[] args) {

        int[] balances = {34523, 111111, 355345, 2424, 3254325, 34323, 242, 245352, 35465, 232};

        int sum = 0;

        for (int i = 0; i < balances.length; i++) {

            if (balances[i] > 1000 && balances[i] < 5000) {
                sum += balances[i];
            }
        }


        System.out.println(sum);

    }
}

