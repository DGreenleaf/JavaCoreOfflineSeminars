package examplesM11.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergiy on 10/31/16.
 */
public class ReadFromConsole {

    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        List<Double> doubles = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        //Reader vsegda vozvrashaet string - esli ne polu4aesa to exception

        String line;
        while (!(line = reader.readLine()).equals("q")) {

            //testim na double, esli da - dobavlyaem v list, esli net - proveryaem dalshe

            try {
//                double res = Double.valueOf(line);
//                doubles.add(res);

                doubles.add(Double.valueOf(line));
            } catch (NumberFormatException e) {

                try {
                    integers.add(Integer.valueOf(line));
                } catch (NumberFormatException e1) {
                    strings.add(line);
                }
            }

        }


            reader.close();

            if (!integers.isEmpty()) {
                System.out.println(integers);
            }

            if (!doubles.isEmpty()) {
                System.out.println(doubles);
            }

            if (!strings.isEmpty()) {
                System.out.println(strings);
            }

    }
}
