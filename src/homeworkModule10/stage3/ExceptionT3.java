package homeworkModule10.stage3;

import homeworkModule7.stage1.User;



/*
 Define an object reference and initialize it to null.
 Try to call a method through this reference.
 Now wrap the code in a try-catch clause to catch the exception.
 */

public class ExceptionT3 {

    public static void main(String[] args) {
        User user = null;

//        user.getId();

        try {
            user.getId();
        } catch (NullPointerException e) {
            System.err.println("Your user isn't found");
        } finally {
            user = new User(345, "Darren", "Greenleaf", "New York", 50000);
            System.out.println(user);
        }
    }
}

