package examplesM7.testQuestions;

import java.util.Set;
import java.util.HashSet;

public class Question5 {

        public static void main(String[] args) {
            Set<String> set = new HashSet<String>();
            set.add("test");
            set.add("test1");
            set.add("test");
            System.out.println(set.size());
        }
    }

