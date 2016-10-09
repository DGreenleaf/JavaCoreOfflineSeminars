package homeworkModule7.stage2;

/*

Class User class that should contain fields

    long id
    String firstName
    String lastName
    String city
    int balance

    Class Order:

    long id
    int price
    Currency currency
    String itemName
    String shopIdentificator
    User user


 Create Main class where you create 10 Orders with 10 Users and put it to the List

 - sort list by Order price in decrease order
 - sort list by Order price in increase order AND User city
 - sort list by Order itemName AND ShopIdentificator AND User city

 - delete duplicates from the list
 - delete items where price less than 1500
 - separate list for two list - orders in USD and UAH
 - separate list for as many lists as many unique cities are in User
 */


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(20, "Drone-1", "Boo", "New York", 100000);
        User user2 = new User(30, "Drone-2", "Boo", "New York", 1000);
        User user3 = new User(40, "Drone-3", "Boo", "New York", 100);
        User user4 = new User(50, "Drone-4", "Boo", "New York", 10);
        User user5 = new User(60, "Drone-5", "Boo", "New York", 1000000);
        User user6 = new User(70, "Drone-6", "Boo", "New York", 5000);
        User user7 = new User(80, "Drone-7", "Boo", "New York", 200);
        User user8 = new User(90, "Drone-8", "Boo", "New York", 300000);
        User user9 = new User(100, "Drone-9", "Boo", "New York", 600000);
        User user10 = new User(250, "Drone-10", "Boo", "New York", 70);


//        Class Order:
//
//        long id
//        int price
//        Currency currency
//        String itemName
//        String shopIdentificator
//        User user


        Order ord1 = new Order(12324, 100, Currency.EUR, "Icecream", "Kishenya", user1);
        Order ord2 = new Order(234, 1000, Currency.EUR, "Ball", "Wallmart", user2);
        Order ord3 = new Order(234234, 200, Currency.EUR, "Axe", "Auchan", user3);
        Order ord4 = new Order(12323423524, 600, Currency.EUR, "Furshet", "Kishenya", user4);
        Order ord5 = new Order(223, 10, Currency.EUR, "Spoon", "Domik", user5);
        Order ord6 = new Order(123443224, 5, Currency.EUR, "Table", "Larek", user6);
        Order ord7 = new Order(2323, 220, Currency.EUR, "Cell Phone", "Citrus", user7);
        Order ord8 = new Order(22333, 33, Currency.EUR, "Cat", "Fora", user8);
        Order ord9 = new Order(64356, 11, Currency.EUR, "PC", "TamTam", user9);
        Order ord10 = new Order(6566, 1, Currency.EUR, "Magazine", "BookWar", user10);

        List<Order> orderList = new ArrayList<>();

        orderList.add(ord1);
        orderList.add(ord2);
        orderList.add(ord3);
        orderList.add(ord4);
        orderList.add(ord5);
        orderList.add(ord6);
        orderList.add(ord7);
        orderList.add(ord8);
        orderList.add(ord9);
        orderList.add(ord10);

        System.out.println(orderList);
    }



}
