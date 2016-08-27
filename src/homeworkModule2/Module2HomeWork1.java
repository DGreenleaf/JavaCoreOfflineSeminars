
package homeworkModule2;


public class Module2HomeWork1 {

    public static void main(String[] args) {

        int[] array = {-14, 21, 32, 4, 54, 61, -7, 88, 9, -12};
        double[] arrayD = {-14, 21, 32, 4, 54, 61, -7, 88, 9, -12};


        System.out.println("Total is " + sum(array));

        System.out.println("Maximum number is " + max(array));

        System.out.println("Minimal number is " + min(array));

        System.out.println("Maximum positive number is " + maxPositive(array));

        System.out.println("Second maximum number after " + max(array) + " is " + secondLargest(array));

        double multi = multiplication(arrayD);

        double mod = modulus(arrayD);

        System.out.println("The result of multiplying of array values is " + multi);

        System.out.println("The result of modulus operation is " + mod);


    }

    //1 - Просчитываем сумму элементов массива типа int

    public static int sum(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //1 - Просчитываем сумму элементов массива типа double

    public static double sum(double[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //2 - Находим максимальное значение числа в массиве типа int

    public static int max(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    //2 - Находим максимальное значение числа в массиве типа double

    public static double max(double[] array) {

        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    //3 - Находим минимальное значение числа в массиве типа int

    public static int min(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    //3 - Находим минимальное значение числа в массиве типа double

    public static double min(double[] array) {

        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    //4 - Находим максимальное положительное значение числа в массиве типа int

    public static int maxPositive(int[] array) {

        int maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i] && array[i] > 0)
                maxPositive = array[i];
        }
        return maxPositive;
    }

    //4 - Находим максимальное положительное значение числа в массиве типа double

    public static double maxPositive(double[] array) {

        double maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i] && array[i] > 0)
                maxPositive = array[i];
        }
        return maxPositive;
    }

    //5 - Находим результат умножения всех чисел в массиве типа int

    public static long multiplication(int[] array) {

        long multiplication = 1;
        for (int i = 0; i < array.length; i++) {
                multiplication *= array[i];
        /*for (double value : array) {
            multiplication *= (long)value;
        */
        }
        return multiplication;
    }

    //5 - Находим результат умножения всех чисел в массиве типа double

    public static double multiplication(double[] arrayD) {

        double multiplication = 1;
        for (int i = 0; i < arrayD.length; i++) {
                multiplication *= arrayD[i];
            /*for (double value : arrayD) {
            //   multiplication *= (long)value;
            */
        }
        return multiplication;
    }

    //6 - Находим результат деления по модулю первого и последнего чисел в массиве типа int

    public static long modulus(int[] array) {

        long modulus = 1;
        long firstNumber = array[0];
        long lastNumber = array[array.length-1];

        modulus = firstNumber % lastNumber;

        return modulus;
    }

    //6 - Находим результат деления по модулю первого и последнего чисел в массиве типа double

    public static double modulus(double[] arrayD) {

        double modulus = 1;
        double firstNumber = arrayD[0];
        double lastNumber = arrayD[arrayD.length-1];

        modulus = firstNumber % lastNumber;

        return modulus;
    }

    //7 - Находим второе наибольшее число в массиве типа int (после того, как первое наибольшее уже найдено)

    public static int secondLargest(int[] array) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    //7 - Находим второе наибольшее число в массиве типа double (после того, как первое наибольшее уже найдено)

    public static double secondLargest(double[] array) {

        double largest = Integer.MIN_VALUE;
        double secondLargest = Integer.MIN_VALUE;
        for (double num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

}

