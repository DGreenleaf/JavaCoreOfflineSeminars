package homeworkModule10.stage3;

import homeworkModule7.stage1.User;

/**
 * Created by Sergiy on 10/31/16.
 */
public class ExceptionT3 {

    public static void main(String[] args) {
        User user = null;

        try {
            user.getId();
        } catch (Throwable e) {
            System.err.println("Your user isn't found");
        } finally {
            user = new User(345, "Darren", "Greenleaf", "New York", 50000);
            System.out.println(user);
        }
    }
}

