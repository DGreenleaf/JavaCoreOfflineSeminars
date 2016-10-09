package examplesM7.testQuestions;

import java.util.Set;
import java.util.HashSet;

public class Question7 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");
        set.remove("ccc");

        System.out.println(set.size());
    }
}
