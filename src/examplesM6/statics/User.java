package examplesM6.statics;


public class User {
    private String userName;
    private int age;
    private static String companyName;
    static String description = "some text";

//static block example
    static {
        //pustoy block vipolnyaetsa pri kajdom sozdanii objekta
        //cel sozdaniya bloka - kak pravilo inicializaciya peremennoy
        //int lenght = userName.length();
        companyName = "IBM";
        System.out.println("block is invoked");
        //any logic

    }


//    static { //static - vizivaettsa tolko 1 raz
////        int lenght = userName.length();
//        companyName = "IBM";
//        System.out.println("block if invoked");
//    }

//    static String editCompany() {
//        if (companyName != null)
//            companyName = "IBM";
//        return companyName;
//    }

    //static method example

    void gender() {
        userName += "Mr.";
    }

    static String editCompany() {
        if (companyName != null && !companyName.equals("EPAM")) companyName = "EPAM";
        return companyName;
    }

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        User.companyName = companyName;
    }

    @Override
    public String toString() {
        return companyName;
    }
}
