
package homework;


public class Module2HomeWork1 {

    public static void main(String[] args) {

        int[] newArray = {-14, 21, 32, 4, 54, 61, -7, 88, 9, -12};
        double[] newArrayD = {-14, 21, 32, 4, 54, 61, -7, 88, 9, -12};


        System.out.println("Total is " + sum(newArray));

        System.out.println("Maximum number is " + max(newArray));

        System.out.println("Minimal number is " + min(newArray));

        System.out.println("Maximum positive number is " + maxPositive(newArray));

        double multi = multiplication(newArrayD);
        System.out.println("The result of multiplying of array values is " + multi);


    }

    public static int sum(int[] newArray) {

        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }
        return sum;
    }

    public static double sum(double[] newArray) {

        double sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }
        return sum;
    }

    public static int max(int[] newArray) {

        int max = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (max < newArray[i])
                max = newArray[i];
        }
        return max;
    }

    public static int min(int[] newArray) {

        int min = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (min > newArray[i])
                min = newArray[i];
        }
        return min;
    }

    public static int maxPositive(int[] newArray) {

        int maxPositive = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (maxPositive < newArray[i] && newArray[i] > 0)
                maxPositive = newArray[i];
        }
        return maxPositive;
    }

    public static long multiplication(double[] newArrayD) {

        long multiplication = 1;
        for (double value : newArrayD) {
            multiplication *= (long)value;
        }
        return multiplication;
    }


}

