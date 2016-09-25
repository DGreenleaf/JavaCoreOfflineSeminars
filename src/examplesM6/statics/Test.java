package examplesM6.statics;


public class Test {

    public static void main(String[] args) {

        User user1 = new User("Ann", 20);
        User user2 = new User("Jack", 35);
        User user3 = new User("Manny", 18);


        //user1.setCompanyName("Google");

        //static variable perezatiraet ya4eiky pamyati pri povtornoi perezada4e
        //user2.setCompanyName("Luxoft");

        User.editCompany();

        System.out.println(user1.toString());
        System.out.println(user2.toString());


    }
}
