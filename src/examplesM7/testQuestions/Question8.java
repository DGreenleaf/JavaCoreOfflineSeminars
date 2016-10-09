package examplesM7.testQuestions;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Question8 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");
        set.remove("ccc");

        List<String> list = new ArrayList<>(set);
        list.add("bbb");

        System.out.println(list);
    }
}
