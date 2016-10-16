package homeworkModule7.stage3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Order> task3TreeSet = new TreeSet<>();

        //1. Creating new orders and adding them to TreeSet

        User user1 = new User(20, "Drone-1", "Boo", "New York", 100000);
        Order ord1 = new Order(12324, 100, Currency.USD, "Icecream", "Kishenya", user1);

        User user2 = new User(30, "Drone-2", "Boo", "Miami", 1000);
        Order ord2 = new Order(234, 100, Currency.UAH, "Ball", "Wallmart", user2);

        User user3 = new User(40, "Drone-3", "Boo", "Kyiv", 100);
        Order ord3 = new Order(234234, 200, Currency.USD, "Axe", "Auchan", user3);

        User user4 = new User(50, "Drone-4", "Boo", "London", 10);
        Order ord4 = new Order(43634, 600, Currency.UAH, "Cat", "Kishenya", user4);

        User user5 = new User(60, "Drone-5", "Boo", "Lutsk", 1000000);
        Order ord5 = new Order(223, 10, Currency.USD, "Spoon", "Domik", user5);

        User user6 = new User(70, "Drone-6", "Boo", "Lviv", 5000);
        Order ord6 = new Order(5, 5, Currency.USD, "Table", "Larek", user6);

        User user7 = new User(80, "Drone-7", "Boo", "Paris", 200);
        Order ord7 = new Order(2323, 220, Currency.UAH, "Cell Phone", "Citrus", user7);

        User user8 = new User(90, "Drone-8", "Boo", "Lutsk", 300000);
        Order ord8 = new Order(22333, 33, Currency.USD, "Cat", "Kishenya", user8);

        User userDup = new User(90, "Drone-9", "Petrov", "Saraevo", 300000);
        Order ord9 = new Order(6566, 1, Currency.USD, "Magazine", "BookWar", userDup);
        Order ord10 = new Order(6566, 1, Currency.USD, "Magazine", "BookWar", userDup);

        task3TreeSet.add(ord1);
        task3TreeSet.add(ord2);
        task3TreeSet.add(ord3);
        task3TreeSet.add(ord4);
        task3TreeSet.add(ord5);
        task3TreeSet.add(ord6);
        task3TreeSet.add(ord7);
        task3TreeSet.add(ord8);
        task3TreeSet.add(ord9);
        task3TreeSet.add(ord10);

        //2. Check if set contain Order where User’s lastName is - “Petrov”
        System.out.println(checkOrderForPetrovSurname(task3TreeSet, "Petrov"));

        //3. Print Order with largest price using only one set method - get
        System.out.println(task3TreeSet.iterator().next());

        //4. Delete orders where currency is USD using Iterator
        deletingUsersWithUsdCurrency(task3TreeSet);
        System.out.println(task3TreeSet);


    }

    private static boolean checkOrderForPetrovSurname(Set<Order> set, String lastName) {
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getUser().getLastName().equals(lastName))
                return true;
        }
        return false;
    }


    private static void deletingUsersWithUsdCurrency(Set<Order> set) {
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(Currency.USD))
                iterator.remove();
        }
    }


}





