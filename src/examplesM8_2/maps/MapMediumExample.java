package examplesM8_2.maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Sergiy on 10/20/16.
 */
public class MapMediumExample {

    private static int TESTS_COUNT = 10;

    private static Task task = new Task();

    public static void main(String[] args) {

        Map<Integer, Boolean> map = new TreeMap<>();

        //emulates tests results
        int index = 0;
        while (TESTS_COUNT > 0) {
            boolean res = false;
            if (index % 2 == 0) res = true;
            map.put(index, res);
            index++;

            TESTS_COUNT--;

        }


        System.out.println(map);


        //create solutions
        Solution solution = new Solution(map);

        List<Solution> solutions = new ArrayList<>();

        //update Task

        task.setSolutions(solutions);
    }


}
