package homeworkModule7.stage5;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Sergiy on 11/4/16.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<String>();


        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 10000; i++) {
            linkedList.add("i");
        }

        long startTime1 = System.nanoTime();
        arrayList.add(1);
        long endTime1 = System.nanoTime() - startTime1 / 1000000; // ms
        System.out.print("Current Time in milliseconds while adding to ArrayList = ");
        System.out.println(endTime1);


        long startTime2 = System.nanoTime();
        linkedList.add("1");
        long endTime2 = System.nanoTime() - startTime2 / 1000000; // ms
        System.out.print("Current Time in milliseconds while adding to LinkedList = ");
        System.out.println(endTime2);



        long startTime3 = System.nanoTime();
        arrayList.set(500, 200);
        long endTime3 = System.nanoTime() - startTime1 / 1000000; // ms
        System.out.print("Current Time in milliseconds while setting to ArrayList = ");
        System.out.println(endTime3);


        long startTime4 = System.nanoTime();
        linkedList.set(9999, "1");
        long endTime4 = System.nanoTime() - startTime2 / 1000000; // ms
        System.out.print("Current Time in milliseconds while setting to LinkedList = ");
        System.out.println(endTime4);


        long startTime5 = System.nanoTime();
        arrayList.get(200);
        long endTime5 = System.nanoTime() - startTime1 / 1000000; // ms
        System.out.print("Current Time in milliseconds while getting to ArrayList = ");
        System.out.println(endTime5);


        long startTime6 = System.nanoTime();
        linkedList.get(9999);
        long endTime6 = System.nanoTime() - startTime2 / 1000000; // ms
        System.out.print("Current Time in milliseconds while getting to LinkedList = ");
        System.out.println(endTime6);


        long startTime7 = System.nanoTime();
        arrayList.remove(400);
        long endTime7 = System.nanoTime() - startTime1 / 1000000; // ms
        System.out.print("Current Time in milliseconds while removing from ArrayList = ");
        System.out.println(endTime7);


        long startTime8 = System.nanoTime();
        linkedList.remove(9999);
        long endTime8 = System.nanoTime() - startTime2 / 1000000; // ms
        System.out.print("Current Time in milliseconds while removing from LinkedList = ");
        System.out.println(endTime8);



    }
}

