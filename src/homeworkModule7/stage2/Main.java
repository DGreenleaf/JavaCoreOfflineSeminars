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


//        ArrayList<User> userList = new ArrayList<User>();
//
//        userList.add(user1);
//        userList.add(user2);
//        userList.add(user3);
//        userList.add(user4);
//        userList.add(user5);
//        userList.add(user6);
//        userList.add(user7);
//        userList.add(user8);
//        userList.add(user9);
//        userList.add(user10);

        //1. Creating new orders

        //private static void

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

        User user10 = new User(250, "Drone-10", "Yeah", "Amsterdam", 70);
        Order ord9 = new Order(6566, 1, Currency.USD, "Magazine", "BookWar", user10);
        Order ord10 = new Order(6566, 1, Currency.USD, "Magazine", "BookWar", user10);

        //1. Create new List, then add there Orders

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


        //2. Sort list by Order price in decrease/descending order
        sortedOrderListByPriceDesc(orderList);
        //System.out.println("Sorted list by orderPrice in descending order = " + System.lineSeparator() + orderList);

        //3. Sort list by Order price in increase order AND User city
        sortedOrderListByPriceAscAndUserCity(orderList);
        //System.out.println("Sorted list by orderPrice AND userCity = " + System.lineSeparator() + orderList);

        //4. Sort list by Order itemName AND ShopIdentificator AND User city
        sortedOrderListByItemNameAndShopIdAndUserCity(orderList);
        //System.out.println("Sorted list by orderItemName AND shopIdentificator AND userCity = " + System.lineSeparator() + orderList);

        //5.1 Delete duplicates from orderList without changing to HashSet
        deletingDuplicatesWithoutListConverting(orderList);
        //System.out.println("Distinct arrayList without converting to hashSet " + System.lineSeparator() + orderList);

        //5.2 Delete duplicates from orderList by changing ArrayList to LinkedHashSet
        deletingDuplicatesByConvertingListToSet(orderList);
        //System.out.println("Distinct arrayList by converting to linkedHashSet " + System.lineSeparator() + orderList);

        //6. Delete items from orderList with price less than 1500
        deleteItemsWithPriceLessThanInTask(orderList);
        //System.out.println("Items with price quals or more than 1500 points = " + orderList);

        //7. Separate orderList by currencies
        separateListByCurrencies(orderList);
        //System.out.println("List with prices in USD " + System.lineSeparator() + usdList);
        //System.out.println("List with prices in UAH " + System.lineSeparator() + uahList);

        //8. Separate orderList by multiple lists by unique cities
        separateListByMultiplyingByUniqueCities(orderList);


    }

    private static void sortedOrderListByPriceDesc(List orderList) {

        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }

    public static void sortedOrderListByPriceAscAndUserCity(List orderList) {

        Collections.sort(orderList, new Comparator<Order>()

        {
            @Override
            public int compare(Order o1, Order o2) {

                int result = Integer.compare(o1.getPrice(), o2.getPrice());
                if (result == 0) {
                    String city1 = o1.getUser().getCity();
                    String city2 = o2.getUser().getCity();
                    result = city1.compareTo(city2);
                }
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

    public static void sortedOrderListByItemNameAndShopIdAndUserCity(List orderList) {

        Collections.sort(orderList, new Comparator<Order>()

        {
            @Override
            public int compare(Order o1, Order o2) {

                final String item1 = o1.getItemName();
                final String item2 = o2.getItemName();

                if (item1.compareTo(item2) == 0) {

                    String shop1 = o1.getShopIdentificator();
                    String shop2 = o2.getShopIdentificator();

                    if (shop1.compareTo(shop2) == 0) {

                        String city1 = o1.getUser().getCity();
                        String city2 = o2.getUser().getCity();

                        int result = city1.compareTo(city2);
                    }
                }
                return item1.compareTo(item2);
            }
        });

    }

    private static void deletingDuplicatesWithoutListConverting(List orderList) {

        Object[] comparedList = orderList.toArray();
        for (
                Object s : comparedList)

        {
            if (orderList.indexOf(s) != orderList.lastIndexOf(s)) {
                orderList.remove(orderList.lastIndexOf(s));
            }
        }
    }

    private static void deletingDuplicatesByConvertingListToSet(List orderList) {

        Set<Order> orderLinkedHashSet = new LinkedHashSet<Order>(orderList);
    }

    private static void deleteItemsWithPriceLessThanInTask(List<Order> orderList) {
        Iterator<Order> iterator = orderList.iterator();
        while (iterator.hasNext()) {
            Order next = iterator.next();
            if (next.getPrice() < 1500) {
                iterator.remove();
            }
        }
    }

    private static void separateListByCurrencies(List<Order> orderList) {
        List<Order> usdList = new ArrayList<>();
        List<Order> uahList = new ArrayList<>();

        for (
                Order order : orderList)

        {
            if (order.getCurrency() == Currency.USD) usdList.add(order);
            else uahList.add(order);
        }

    }




    private static void separateListByMultiplyingByUniqueCities(List<Order> orderList) {

        List<List<Order>> listOfOrders = new ArrayList<>();
        Set<String> listUniqueByCity = new LinkedHashSet<>();

        for (Order order : orderList) {
            listUniqueByCity.add(order.getUser().getCity());
        }

        List<List<Order>> ordersByCity = new ArrayList<>();

        for (String city : listUniqueByCity) {
            List<Order> ordersForCity = new ArrayList<>();
            for (Order order : orderList) {
                if (order.getUser().getCity().equals(city)) {
                    ordersForCity.add(order);
                }
            }
            ordersByCity.add(ordersForCity);
        }

    }
}


