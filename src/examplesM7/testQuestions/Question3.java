package examplesM7.testQuestions;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Sergiy on 10/9/16.
 */
public class Question3 {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        queue.add(-11);
        queue.add(0);
        int a = queue.element();

        System.out.println(a);
    }


}
