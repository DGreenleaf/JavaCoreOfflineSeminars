package examplesM7.sets;

import java.util.Set;



public class TreeSet {

    //TreeSet - sortiruyet po alfavity ili int kak kujno
    public static void main(String[] args) {
         Set<String> set = new java.util.TreeSet<>();

        set.add("Davis");
        set.add("Bob");
        set.add("Sergii");
        set.add("Xiy");
        set.add("Yuri");

        System.out.println(set);


        Set<Integer> set1 = new java.util.TreeSet<>();

        set1.add(2);
        set1.add(1);
        set1.add(7574);
        set1.add(345);
        set1.add(353);
        set1.add(5768);

        System.out.println(set1);

        Set<User> set2 = new java.util.TreeSet<>();

        set2.add(new User("Sergii", 16));
        set2.add(new User("Sergii", 11));
        set2.add(new User("Sergii", 21));
        set2.add(new User("Sergii", 45));
        set2.add(new User("Sergii", 18));

        System.out.println(set2);

        //Comparable ispolzuetsa dlya setov/dlya sravneniya, Comparator dlya listov/dlya sortirovok listov

        Set<User> set3 = new java.util.TreeSet<>();

        set3.add(new User("Serg", 16));
        set3.add(new User("Serhio", 11));
        set3.add(new User("Ser", 21));
        set3.add(new User("Sergi", 45));
        set3.add(new User("Sergiotto", 18));

        System.out.println(set3);


    }

}
