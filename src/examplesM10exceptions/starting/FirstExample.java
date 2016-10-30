package examplesM10exceptions.starting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergiy on 10/30/16.
 */
public class FirstExample {

    public static void main(String[] args) {

//        //Syntax
//        try {
//            //code
//
//        }
//
//        catch (Throwable t) {
//
//        }

        //try-catch first example
        Integer a;



        try {
            a = null;
            a.toString();



        } catch (Throwable t) {
            System.out.println("NullPointer has happened");

            a = 10;
            a.toString();

            System.out.println(a);

        }

        try {
            List<String> list = new ArrayList<>();
            list.get(0);
        } catch (Throwable t) {
            System.out.println("Cannot get missing item - element does not exist");
        }

        //the best way to handle NPE
        a = null;
        if (a != null)
            a.toString();
        else System.out.println("a is null");

    }


}

