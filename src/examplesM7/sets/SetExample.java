package examplesM7.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sergiy on 10/9/16.
 */
public class SetExample {

    public static void main(String[] args) {
//v sete vse elementi unikalni - net dublikatov
        Set<String> set = new HashSet<>();

        set.add("test");
        set.add("test1");
        set.add("test2");
        set.add("test");


        System.out.println(set);

        Set<User> users = new HashSet<>();

        users.add(new User("Sergiotto", 28));
        users.add(new User("Serg", 10));
        users.add(new User("Sergio", 28));
        users.add(new User("Ser", 28));

        System.out.println(users);






    }
}
