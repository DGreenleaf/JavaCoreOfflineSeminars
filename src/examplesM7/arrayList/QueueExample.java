package examplesM7.arrayList;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Sergiy on 10/9/16.
 */
public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

//        queue.add("test1");
//        queue.add("test2");
//        queue.add("test3");
//        queue.add("test4");
//        queue.add("test5");
//        queue.add("test6");

        System.out.println(queue);

//queue.element - dostaet iz o4eredi pervii element po poryadky
        System.out.println(queue.element());

//queue.remove - ubirayet iz o4eredi pervii element i sdvigaet vse ostalnie vlevo na ego mesto i dalee
        queue.remove();

        System.out.println(queue.element());

        System.out.println(queue.remove());

        System.out.println(queue.element());
//peek vozvrashyaet ne exception a null (kogda v o4eredi net elementov)
        System.out.println(queue.peek());


    }
}
