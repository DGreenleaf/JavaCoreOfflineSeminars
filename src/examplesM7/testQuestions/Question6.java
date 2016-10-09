package examplesM7.testQuestions;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Sergiy on 10/9/16.
 */
public class Question6 {

        public static void main(String[] args) {

            Set<String> set = new TreeSet<>();
            set.add("aaa");
            set.add("ccc");
            set.add("bbb");

            Set<Integer> set1 = new TreeSet<>();

            set1.add(11);
            set1.add(9);
            set1.add(15);

            System.out.println(set + " " + set1);
        }
    }
