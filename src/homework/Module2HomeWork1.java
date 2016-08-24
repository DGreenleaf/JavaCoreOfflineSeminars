
package homework;


public class Module2HomeWork1 {

    public static void main(String[] args) {

        int[] newArray = {-14, 21, 32, 4, 54, 61, -7, 88, 9, -12};
        sum(newArray);
        max(newArray);
        min(newArray);
        maxPositive(newArray);

        long[] newArray2 = {-14, 21, 32, 4, 54, 61, -7, 88, 9, -12};

        multiplication(newArray2);


    }

    public static void sum(int[] newArray) {

        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }
        System.out.println("Total is " + sum);
    }


    public static void max(int[] newArray) {

        int max = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (max < newArray[i])
                max = newArray[i];
        }
        System.out.println("Maximum number is " + max);
    }

    public static void min(int[] newArray) {

        int min = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (min > newArray[i])
                min = newArray[i];
        }
        System.out.println("Minimal number is " + min);
    }

    public static void maxPositive(int[] newArray) {

        int maxPosititive = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (maxPosititive < newArray[i] && newArray[i] > 0)
                maxPosititive = newArray[i];
        }
        System.out.println("Maximum positive number is " + maxPosititive);
    }

    public static void multiplication(long[] newArray2) {

        long multiplication = 1;
        for (long value : newArray2) {
            multiplication *= value;
        }
        System.out.println("The result of multiplying of array values is " + multiplication);
    }


}

