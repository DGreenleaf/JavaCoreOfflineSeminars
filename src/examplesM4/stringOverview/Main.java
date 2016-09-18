package examplesM4.stringOverview;

/**
 * Created by Sergiy on 9/11/16.
 */
public class Main {

    public static void main(String[] args) {
        String name = "Ann";
        String name1 = new String("Ann");
        char[] chars = {'a', 'b', 'c'};
        String ch = new String (chars);

        System.out.println(ch);
        System.out.println(String.valueOf(10));

        //вызовет по заданному порядковому номеру букву в имени name
        System.out.println(name.charAt(1));

        String test = "Hello there, guys";
        //обрезка текста путем задания границ
        System.out.println(test.substring(0, 7));

        //boolean проверка на наличие в стринге test задаваемых символов
        System.out.println(test.contains("gu"));


    }
}
