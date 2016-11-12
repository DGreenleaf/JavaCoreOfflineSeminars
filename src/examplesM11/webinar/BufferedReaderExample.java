package examplesM11.webinar;

import sun.misc.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Sergiy on 11/7/16.
 */
public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);

        int count = 3;


        while (count > 0) {

            String input = "";

            try {
                input = br.readLine();
            } catch (IOException e) {
                System.err.println("System error");
                throw e;
            }

            System.out.println("The string " + input + " is read");

            try {
                int a = Integer.valueOf(input);
                System.out.println(a + 10);
            } catch (NumberFormatException e) {
                System.out.println("It is not integer value");
            }
            count--;
        }

        System.out.println("Finished");

//        IOUtils.closeQuitely(br);

        try {
            if (br != null)
            br.close();
        } catch (IOException e) {
            System.out.println("Closing failed");
        }
    }
}
