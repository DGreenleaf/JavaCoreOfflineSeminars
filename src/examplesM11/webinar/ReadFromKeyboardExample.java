package examplesM11.webinar;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by Sergiy on 11/6/16.
 */
public class ReadFromKeyboardExample {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);

//        while (scanner.hasNext()) {
//            String read = scanner.next();
//            int res;
//            try {
//                res = Integer.valueOf(read);
//                System.out.println(res - 1000);
//            } catch (NumberFormatException e) {
//                System.err.println("wrong input, please provide an integer");
//            }
//        }


//        while (scanner.hasNextInt()) {
//            int read = scanner.nextInt();
//            if (read > 1000)
//                System.out.println("Awesome");
//
//
//        }


//        //Ограничиваем количество вводов
//        int index = 2;
//        while (index > 0 && scanner.hasNext()) {
//            String read = scanner.next();
//
//            int res;
//            try {
//                res = Integer.valueOf(read);
//                System.out.println(res - 1000);
//            } catch (NumberFormatException e) {
//                System.err.println("wrong input, please provide an integer");
//            }
//
//            index--;
//        }


        //Ограничиваем количество вводов + считываем строку инпута целиком
        int index = 2;
        while (index > 0 && scanner.hasNextLine()) {
            String read = scanner.nextLine();

            int res;
            try {
                res = Integer.valueOf(read);
                System.out.println(res - 1000);
            } catch (NumberFormatException e) {
                System.err.println("wrong input, please provide an integer");
            }

            index--;
        }

        scanner.close();
    }
}
