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


import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(20, "Drone-1", "Boo", "New York", 100000);
        User user2 = new User(30, "Drone-2", "Boo", "Miami", 1000);
        User user3 = new User(40, "Drone-3", "Boo", "Kyiv", 100);
        User user4 = new User(50, "Drone-4", "Boo", "London", 10);
        User user5 = new User(60, "Drone-5", "Boo", "Lutsk", 1000000);
        User user6 = new User(70, "Drone-6", "Boo", "Lviv", 5000);
        User user7 = new User(80, "Drone-7", "Boo", "Paris", 200);
        User user8 = new User(90, "Drone-8", "Boo", "Berlin", 300000);
        User user9 = new User(100, "Drone-9", "Boo", "Oslo", 600000);
        User user10 = new User(250, "Drone-10", "Yeah", "Amsterdam", 70);


//        Class Order:
//
//        long id
//        int price
//        Currency currency
//        String itemName
//        String shopIdentificator
//        User user


        Order ord1 = new Order(12324, 100, Currency.EUR, "Icecream", "Kishenya", user1);
        Order ord2 = new Order(234, 100, Currency.UAH, "Ball", "Wallmart", user2);
        Order ord3 = new Order(234234, 200, Currency.EUR, "Axe", "Auchan", user3);
        Order ord4 = new Order(43634, 600, Currency.UAH, "Cat", "Kishenya", user4);
        Order ord5 = new Order(223, 10, Currency.EUR, "Spoon", "Domik", user5);
        Order ord6 = new Order(5, 5, Currency.EUR, "Table", "Larek", user6);
        Order ord7 = new Order(2323, 220, Currency.UAH, "Cell Phone", "Citrus", user7);
        Order ord8 = new Order(22333, 33, Currency.EUR, "Cat", "Kishenya", user8);
        Order ord9 = new Order(64356, 100, Currency.UAH, "PC", "TamTam", user9);
        Order ord10 = new Order(6566, 1, Currency.EUR, "Magazine", "BookWar", user10);

        List<Order> orderList = new ArrayList<Order>();

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

        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        System.out.println(orderList);

//Sorting
        Collections.sort(orderList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                int result = Integer.compare(o1.getPrice(), o2.getPrice());
                if (result == 0) {
                    String city1 = o1.getUser().getCity();
                    String city2 = o2.getUser().getCity();
                    result = city1.compareTo(city2);
                }
                return result;
            }
        });

        System.out.println(orderList);

//sort list by Order itemName AND ShopIdentificator AND User city

        Collections.sort(orderList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                String item1 = o1.getItemName();
                String item2 = o2.getItemName();

                int result = item1.compareTo(item2);
//sravnivaem po nazvaniyu magazina esli tovari ravni
                if (result == 0) {

                    String shop1 = o1.getShopIdentificator();
                    String shop2 = o2.getShopIdentificator();

                    int result2 = shop1.compareTo(shop2);
                    //sravnivaem po city Usera esli magazini ravni
                    if (result2 == 0) {

                        String city1 = o1.getUser().getCity();
                        String city2 = o2.getUser().getCity();

                        int result3 = city1.compareTo(city2);

                    }
                }
                return result;
            }
        });

        System.out.println(orderList);
    }
}