package homeworkModule6.stage4;

//You need to create two classes ArraysUtils and UserUtils with static and final methods
// and use ArraysUtils methods in HW2 to symplify it.
//
//        Create ArraysUtils with following methods
//
//        sum(int array[])
//        min(int array[])
//        max(int array[])
//        maxPositive(int array[])
//        multiplication  (int array[])
//        modulus(int array[])
//        secondLargest(int array[])
//
//        these should be just copied from your HW2.
//
//        In addition add new methods
//
//        int[] reverse(int[] array)
//        int[] findEvenElements(int[] array)


public final class ArraysUtils {

    //1 - Просчитываем сумму элементов массива типа int

    public static int sum(int[] array) {

        int sum = 0;
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


    //3 - Находим минимальное значение числа в массиве типа int

    public static int min(int[] array) {

        int min = array[0];
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


    //6 - Находим результат деления по модулю первого и последнего чисел в массиве типа int

    public static long modulus(int[] array) {

        long modulus = 1;
        long firstNumber = array[0];
        long lastNumber = array[array.length-1];

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


//    public static int[] reverse(int[] array) {                //pervii variant - ne rabotaet
//        int[] reverse = new int[array.length];
//        for(int i = 0; i < array.length / 2; i++)
//        {
//            int tmp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = tmp;
//        }
//        return reverse;
//    }

    public static int[] reverse(int[] array) {                  //vtoroy variant - rabotaet

        int[] revers = new int[array.length];
        int count = array.length - 1;
        for(int num : array) {
            revers[count--] = num;

        }
        return revers;
    }


    public static int[] findEvenElements(int[] array) {
        int evenElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenElements++;
            }
        }
        int[] evens = new int[evenElements];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens[count] = array[i];
                count++;
            }
        }


        return evens;
    }

}
