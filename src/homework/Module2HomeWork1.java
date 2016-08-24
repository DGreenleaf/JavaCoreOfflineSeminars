
package homework;


public class Module2HomeWork1 {

    public static void main(String[] args) {

        int[] newArray = {-14, 21, 32, 4, -54, 61, -7, 88, 9, -12};
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }

        System.out.println("Total is " + sum);

        int max = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (max < newArray[i])
                max = newArray[i];
        }

        System.out.println("Maximum number is " + max);

        int min = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (min > newArray[i])
                min = newArray[i];
        }

        System.out.println("Minimal number is " + min);

    }


}

