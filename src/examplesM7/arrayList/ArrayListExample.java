package examplesM7.arrayList;

import examplesM7.sets.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by Sergiy on 10/8/16.
 */
public class ArrayListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println(list);

        list.add("item");
        list.add("item2");
        list.add("item3");


        System.out.println(list);
//add - dobavlyaet element, sdvigaya massiv na 1 poryadok
        list.add(3, "item9");

        System.out.println(list);

//set - menyaet element na tot kotoriy mi ukazivaem, ne uvili4ivaet dliny massiva
        list.set(1, "item10");

        System.out.println(list);

        List<String> list1 = new ArrayList<>();

        list1.add("test");
        list1.add("test1");

        System.out.println(list1);
//addAll - prinimayet v sebya vsyu kollekciyu
        list.addAll(list1);

        System.out.println(list);
//list - 4istit vsyu kollekciyu
//        list.clear();
//
//        System.out.println(list);

        System.out.println(list1.indexOf("test1"));

        //primer raboti replaceAll
//UnaryOperator w contains - proveryaet array na nali4ie zadannogo parametra i zamenyaet ego na ukazannoe zna4enie
//        UnaryOperator<String> operator = new UnaryOperator<String>() {
//            @Override
//            public String apply(String s) {
//                if (s.contains("i")) {
//                    return null;
//                }
//                return s;
//            }
//        };
//equals - proveryaet 100% sovpadenie
        UnaryOperator<String> operator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if (s.equals("item")) {
                    return "xD";
                }
                return s;
            }
        };

        list.replaceAll(operator);

        System.out.println(list);

        List<String> list3 = new ArrayList<>();

        list3.add("test");
        list3.add("test2");
//retainAll - udalyaet obshee mejdy dvymya listami
        list.retainAll(list3);

        System.out.println(list);

//containes - boolean proverka na nali4ie v liste zadannogo parametra
        System.out.println(list.contains("test"));

        System.out.println(list.remove("test"));
//remove - udalyaet iz lista zadanniy parametr
        System.out.println(list);

        List<String> list5 = new ArrayList<>();

        list5.add("test1");
        list5.add("test2");
        list5.add("test3");
        list5.add("test4");
        list5.add("test5");
        list5.add("test6");

        System.out.println(list5);


        List<String> list6 = new ArrayList<>();

        list6.add("test1");


//containsAll - proveryaet nali4ie VSEI kollekcii lista6 v liste5

        System.out.println(list5.containsAll(list6));

//removeAll - udalyaet iz list5 vse sostavnie list6, esli vozmojno

        System.out.println(list5.removeAll(list6));


        System.out.println(list5);



        List<User> users = new ArrayList<>();

        users.add(new User("Sergii", 28));
        users.add(new User("Andrew", 11));
        users.add(new User("Moron", 54));
//delaem sortirovky po zadannim usloviyam (v dannom slu4ae po vozrasty ot menshego k bolshemy)
        //Comparator - eto pravilo po kotoromy budem sortirovat
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(users);







    }
}
