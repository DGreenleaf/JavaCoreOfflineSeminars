package examplesM6.statics;

/**
 * Created by Sergiy on 9/16/16.
 */
public class User {
    private String userName;
    private int age;
    private static String companyName;


    static { //static - vizivaettsa tolko 1 raz
//        int lenght = userName.length();
        companyName = "IBM";
        System.out.println("block if invoked");
    }


    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public static void setCompanyName(String companyName) {
        User.companyName = companyName;
    }

    @Override
//    public String toString() {
//        return "User{" +
//                "userName='" + userName + '\'' +
//                ", age=" + age +
//                '}';
//    }
    public String toString() {
        return "User{" + "companyName='" + companyName + '\'' + '}';
    }
}
