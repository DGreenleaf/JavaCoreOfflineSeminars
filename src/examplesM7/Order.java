package examplesM7;

import java.util.Date;

/**
 * Created by Sergiy on 9/20/16.
 */
public class Order {

    private Item item;
    private User user;
    private Date date;
    private static int counter;

    private boolean isActive;
    private boolean isShipped;


    public Order(Item item, User user, Date date) {
        this.item = item;
        this.user = user;
        this.date = date;
    }

    public static int getCounter() {
        return counter;
    }
}

