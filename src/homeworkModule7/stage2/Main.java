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

import java.util.*;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(20, "Drone-1", "Boo", "New York", 100000);
        User user2 = new User(30, "Drone-2", "Boo", "Miami", 1000);
        User user3 = new User(40, "Drone-3", "Boo", "Kyiv", 100);
        User user4 = new User(50, "Drone-4", "Boo", "London", 10);
        User user5 = new User(60, "Drone-5", "Boo", "Lutsk", 1000000);
        User user6 = new User(70, "Drone-6", "Boo", "Lviv", 5000);
        User user7 = new User(80, "Drone-7", "Boo", "Paris", 200);
        User user8 = new User(90, "Drone-8", "Boo", "Lutsk", 300000);
        User user9 = new User(100, "Drone-9", "Boo", "Oslo", 600000);
        User user10 = new User(250, "Drone-10", "Yeah", "Amsterdam", 70);


        ArrayList<User> userList = new ArrayList<User>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);

//        Class Order:
//
//        long id
//        int price
//        Currency currency
//        String itemName
//        String shopIdentificator
//        User user


        //>>>>>>>>>>>>      creating new orders

        Order ord1 = new Order(12324, 100, Currency.USD, "Icecream", "Kishenya", user1);
        Order ord2 = new Order(234, 100, Currency.UAH, "Ball", "Wallmart", user2);
        Order ord3 = new Order(234234, 200, Currency.USD, "Axe", "Auchan", user3);
        Order ord4 = new Order(43634, 600, Currency.UAH, "Cat", "Kishenya", user4);
        Order ord5 = new Order(223, 10, Currency.USD, "Spoon", "Domik", user5);
        Order ord6 = new Order(5, 5, Currency.USD, "Table", "Larek", user6);
        Order ord7 = new Order(2323, 220, Currency.UAH, "Cell Phone", "Citrus", user7);
        Order ord8 = new Order(22333, 33, Currency.USD, "Cat", "Kishenya", user8);
        Order ord9 = new Order(6566, 1, Currency.USD, "Magazine", "BookWar", user10);
        Order ord10 = new Order(6566, 1, Currency.USD, "Magazine", "BookWar", user10);

        //>>>>>>>>>>>>      sozdaem novii List kuda potom dobavlyaem orders

        ArrayList<Order> orderList = new ArrayList<Order>();

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

        //System.out.println(orderList);

        //>>>>>>>>>>>>      sortiruem po cene v obratnom poryadke (from expensive to cheap)

        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        //System.out.println(orderList);

//>>>>>>>>>>>>      Sorting list by price in increase order AND UserCity

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

        //System.out.println(orderList);

//>>>>>>>>>>>>      sort list by Order itemName AND ShopIdentificator AND User city

        Collections.sort(orderList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                String item1 = o1.getItemName();
                String item2 = o2.getItemName();

                int result = item1.compareTo(item2);

//>>>>>>>>>>>>      sravnivaem po nazvaniyu magazina esli tovari ravni

                if (result == 0) {

                    String shop1 = o1.getShopIdentificator();
                    String shop2 = o2.getShopIdentificator();

                    int result2 = shop1.compareTo(shop2);

                    //>>>>>>>>>>>>      sravnivaem po city Usera esli magazini ravni

                    if (result2 == 0) {

                        String city1 = o1.getUser().getCity();
                        String city2 = o2.getUser().getCity();

                        int result3 = city1.compareTo(city2);

                    }
                }
                return result;
            }
        });

        //System.out.println("Sorting by Order itemName AND ShopIdentificator AND UserCity " + " " + orderList);


        //>>>>>>>>>>>>      Delaem 4istky ot dublikatov bez zameni arraylista

        Object[] comparedList = orderList.toArray();
        for (Object s : comparedList) {
            if (orderList.indexOf(s) != orderList.lastIndexOf(s)) {
                orderList.remove(orderList.lastIndexOf(s));
            }
        }

        //System.out.println("Distinct array list without converting" + " " + orderList);

        //>>>>>>>>>>>>      Delaem 4istky ot dublikatov putem zameni arraylista na hashset

//        Set<Order> orderHashSet = new HashSet<Order>(orderList);
//
//        System.out.println("Distinct array list converted to HashSet" + " " + orderHashSet);


//        Iterator<Order> iterator = orderList.iterator();
//        while (iterator.hasNext()) {
//            Order next = iterator.next();
//            if (next.getPrice() < 1500) {
//                iterator.remove();

        //takim obrazom mi vivodim na ekran SOUT posle kajdogo remova Ordera gde Price < 1500

//                for (Order order : orderList) {
//                    System.out.println("Orders with items which prices are less than 1500 " + " " + orderList);
//                }
//            }
//
//        }

        //System.out.println("Orders with items which prices are less than 1500 " + " " + orderList);


//        for (int i = 0; i < orderList.size(); i++) {
//            Order priceValue = orderList.get(i);
//            if (priceValue.getPrice < 1500)
//            {
//                orderList.remove(i);
//            }
//        }


        //>>>>>>>>>>>>      Separate list by two by currency used in prices

        List<Order> usd = new ArrayList<>();
        List<Order> uah = new ArrayList<>();

        for (Order order : orderList) {
            if (order.getCurrency() == Currency.USD) usd.add(order);
            else uah.add(order);
        }
//        for (Order order : usd) {
//            System.out.println("List with orders that uses USD as currency " + " " + order);
//        }
//        for (Order order : uah) {
//            System.out.println("List with orders that uses UAH as currency " + " " + order);
//        }

//        System.out.println("List with orders that uses USD as currency " + " " + usd);
//        System.out.println("List with orders that uses UAH as currency " + " " + uah);


        //>>>>>>>>>>>>      Separate list by multiply lists depending on userCities

//        Set<String> uniqueByCity = new HashSet<>();
//        for (User user : userList) {
//            uniqueByCity.add(user.getCity());
//        }
//        List<List<Order>> ordersByCity = new ArrayList<>();
//        for (String city : uniqueByCity) {
//            List<Order> ordersForCity = new ArrayList<>();
//            for (Order order : orderList) {
//                if (order.getUser().getCity().equals(city)) {
//                    ordersForCity.add(order);
//                }
//            }
//            ordersByCity.add(ordersForCity);
//        }
//        System.out.println(uniqueByCity.size());
//        System.out.println(ordersByCity.size());
//
//        System.out.println(uniqueByCity);


        Set<String> citiesUnique = new TreeSet<>();
        {
            for (User user : userList) {
                citiesUnique.add(user.getCity());
            }
            System.out.println("  user Cities   ");
            for (String string : citiesUnique) {
                System.out.println(string);
            }
        }

        {
            //listUniqueSitiesInUser();
            for (String city : citiesUnique) {
                System.out.println("  List unique city: " + "'" + city + "'");
                for (Order order : orderList) {
                    if (order.getUser().getCity() == city)
                        System.out.println(order);
                }
            }
        }
    }
}