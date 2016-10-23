package homeworkModule9.stage1;

/**
 * Created by Sergiy on 10/24/16.
 */


import homeworkModule7.stage2.Currency;
import homeworkModule6.stage5.UserUtils;
import homeworkModule7.stage2.*;

import java.util.*;

import java.util.stream.Collectors;

public class Main {
    private static int k = 1;

    public static void main(String[] args) {

        User user1 = new User(20, "Drone-1", "Boo", "New York", 100000);
        Order ord1 = new Order(12324, 100, homeworkModule7.stage2.Currency.USD, "Icecream", "Kishenya", user1);

        User user2 = new User(30, "Drone-2", "Boo", "Miami", 1000);
        Order ord2 = new Order(234, 100, homeworkModule7.stage2.Currency.UAH, "Ball", "Wallmart", user2);

        User user3 = new User(40, "Drone-3", "Boo", "Kyiv", 100);
        Order ord3 = new Order(234234, 200, homeworkModule7.stage2.Currency.USD, "Axe", "Auchan", user3);

        User user4 = new User(50, "Drone-4", "Boo", "London", 10);
        Order ord4 = new Order(43634, 600, homeworkModule7.stage2.Currency.UAH, "Cat", "Kishenya", user4);

        User user5 = new User(60, "Drone-5", "Boo", "Lutsk", 1000000);
        Order ord5 = new Order(223, 10, homeworkModule7.stage2.Currency.USD, "Spoon", "Domik", user5);

        User user6 = new User(70, "Drone-6", "Boo", "Lviv", 5000);
        Order ord6 = new Order(5, 5, homeworkModule7.stage2.Currency.USD, "Table", "Larek", user6);

        User user7 = new User(80, "Drone-7", "Boo", "Paris", 200);
        Order ord7 = new Order(2323, 220, homeworkModule7.stage2.Currency.UAH, "Cell Phone", "Citrus", user7);

        User user8 = new User(90, "Drone-8", "Boo", "Lutsk", 300000);
        Order ord8 = new Order(22333, 33, homeworkModule7.stage2.Currency.USD, "Cat", "Kishenya", user8);

        User user10 = new User(250, "Drone-10", "Yeah", "Amsterdam", 70);
        Order ord9 = new Order(6566, 1, homeworkModule7.stage2.Currency.USD, "Magazine", "BookWar", user10);
        Order ord10 = new Order(6566, 1, homeworkModule7.stage2.Currency.USD, "Magazine", "BookWar", user10);


        List<Order> listOfOrder = new ArrayList<>();
        listOfOrder.add(ord1);
        listOfOrder.add(ord2);
        listOfOrder.add(ord3);
        listOfOrder.add(ord4);
        listOfOrder.add(ord5);
        listOfOrder.add(ord6);
        listOfOrder.add(ord7);
        listOfOrder.add(ord8);
        listOfOrder.add(ord9);
        listOfOrder.add(ord10);
        System.out.println(listOfOrder);
        System.out.println(k + " =========================================================================\n");
        k++;

        Comparator<Order> price = (o1, o2) -> o2.getPrice() - o1.getPrice();

        Comparator<Order> priceAndCity = (o1, o2) -> {
            if (o1.getPrice() == o2.getPrice()) {
                return UserUtils.alphabet(o1.getUser().getCity(), o2.getUser().getCity());
            }
            return o1.getPrice() - o2.getPrice();
        };


        Comparator<Order> cityAndShopId = (o1, o2) -> {
            if (Objects.equals(o1.getItemName(), o2.getItemName())) {
                if (UserUtils.alphabet(o1.getUser().getCity(), o2.getUser().getCity()) == 0) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getPrice() == o2.getPrice()) {
                    return UserUtils.alphabet(o1.getShopIdentificator(), o2.getShopIdentificator());

                }
            }
            return UserUtils.alphabet(o1.getItemName(), o2.getItemName());
        };

        listOfOrder.sort(price);
        System.out.println(listOfOrder);
        System.out.println(k + " =========================================================================\n");
        k++;
        listOfOrder.sort(priceAndCity);
        System.out.println(listOfOrder);
        System.out.println(k + " =========================================================================\n");
        k++;
        listOfOrder.sort(cityAndShopId);
        System.out.println(listOfOrder);
        System.out.println(k + " =========================================================================\n");
        k++;

        Set<Order> hashList = new HashSet<>();
        hashList.addAll(listOfOrder);
        List<Order> list1 = new ArrayList<>();
        list1.addAll(hashList);
        list1.removeIf(x -> (x.getPrice() < 150));//не 1500 потому что иначе масив будет пуст
        str(list1);

        List<Order> list2 = list1.stream().filter(o -> o.getCurrency() != Currency.USD).collect(Collectors.toList());
        List<Order> list3 = list1.stream().filter(o -> o.getCurrency() != Currency.EUR).collect(Collectors.toList());

        list3.removeIf(x -> (x.getCurrency() == Currency.EUR));
        list2.removeIf(x -> (x.getCurrency() == Currency.USD));
        str(list2);
        str(list3);

        Set<String> setList = list1.stream().map(o -> o.getUser().getCity()).collect(Collectors.toSet());

        List<ArrayList<Order>> megaListCity;
        megaListCity = create2dArray(setList, list1);
        //This loop for print
        for (ArrayList<Order> aMegaListCity : megaListCity) {
            aMegaListCity.forEach(System.out::print);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
        System.out.println(getK() + "========================================================================");
        setK(getK() + 1);

    }

    private static void str(List<Order> or) {
        System.out.println(or);
        System.out.println(Main.getK() + " =========================================================================\n");
        Main.setK(Main.getK() + 1);
    }

    /**
     * =============================
     */
    private static List<Order> createCityArray(String string, List<Order> orders) {
        List<Order> list = new ArrayList<>();
        for (Order order : orders) {
            if (order.getUser().getCity() == string) {
                list.add(order);
            }
        }
        return list;
    }

    private static List<ArrayList<Order>> create2dArray(Set<String> str, List<Order> orders) {
        List<ArrayList<Order>> list2d = new ArrayList<>();
        for (String string : str) {
            list2d.add((ArrayList<Order>) createCityArray(string, orders));
        }
        return list2d;
    }

    /**
     * ================================
     */
    public static int getK() {
        return k;
    }

    public static void setK(int k) {
        Main.k = k;
    }

}

