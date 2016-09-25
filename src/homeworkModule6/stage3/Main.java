package homeworkModule6.stage3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {-14, 21, 32, 4, 54, 61, -7, 88, 9, -12};

        System.out.println(ArraysUtils.max(array));
        System.out.println(ArraysUtils.min(array));
        System.out.println(ArraysUtils.maxPositive(array));
        System.out.println(ArraysUtils.modulus(array));
        System.out.println(ArraysUtils.sum(array));
        System.out.println(ArraysUtils.multiplication(array));
        System.out.println(ArraysUtils.secondLargest(array));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array)));


//        List<Integer> list = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);

    }
}
