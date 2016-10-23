package examplesM9.com.company;

import examplesM9.org.app.model.model.Dog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Sergiy on 10/19/16.
 */
public class AppFor8 {

    public static void main(String[] args) {
        //sample1();
        //sample2();
        sample3();
    }

    public static void sample3() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer i:list) {

        }
        list.forEach(i -> {
            Dog dog = new Dog("T", 1);
            System.out.println(i);
            if (i%2==0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        });
    }

    public static void sample2() {
        Stream<Integer> str = Stream.of(1, 2, 5, 4);
        Stream<Integer> str1 = str.map(new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer integer) {
                return integer+100;
            }
        });

        Stream<Integer> str3 = str1.map(p -> p+100);
        str1.forEach(integer -> System.out.println(integer));

        //str.count();
//        Object obj = str1.toArray();
//        System.out.println(Arrays.toString(obj));
//        System.out.println(obj);

        //str1.forEach(Integer -> System.out.println(integer));

    }


    public static void sample1() {
        Stream<Integer> str = Stream.of(1, 2, 5, 4);
    }
}
