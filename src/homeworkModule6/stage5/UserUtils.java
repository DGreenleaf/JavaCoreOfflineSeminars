package homeworkModule6.stage5;

//Create сlass UserUtils with following methods
//
//        User[] uniqueUsers(User[] users)
//        User[] usersWithContitionalBalance(User[] users, int balance)
//        User[] paySalaryToUsers(User[] users)
//        long[] getUsersId(User[] users)
//        User[] deleteEmptyUsers(User[] users)
//
//        Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other classes.

public class UserUtils {
    public static User[] uniqueUsers(User[] users){
        for(int i=0;i<users.length;i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i] != null && i != j)
                    if (users[i].equals(users[j])) users[j] = null;
            }
        }
        User[] uniqueUs=deleteEmptyUsers(users);

        return uniqueUs;
    }
    public User[] usersWithConditionalBalance(User[] users, int balance){
        int count=0;
        for(User user: users){
            if(user.getBalance()==balance)count++;
        }
        User[] uWCB = new User[count];                //users With Conditional Balance
        count=0;
        for(User user: users){
            if(user.getBalance()==balance){
                uWCB[count]=user;
                count++;
            }
        }
        return uWCB;
    }
    public static User[] paySalaryToUsers(User[] users){
        int newBalance;
        for (User user : users) {
            if(user!=null) {
                newBalance = user.getBalance() + user.getSalary();
                user.setBalance(newBalance);
            }
        }
        return users;
    }

    public static long[] getUsersId(User[] users){
        long[] userId=new long[users.length];
        for (int i=0;i<userId.length;i++) {
            if(users[i]!=null)
                userId[i]=users[i].getId();
        }
        return userId;
    }
    public static User[] deleteEmptyUsers(User[] users){
        int count=0;
        for(User user:users){
            if(user!=null)count++;
        }
        User[] afterUser=new User[count];
        count=0;
        for(User user:users){
            if(user!=null){
                afterUser[count]=user;
                count++;
            }
        }
        return afterUser;
    }
    public static int alphabet(String o1, String o2){
        char[] alphabet=new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k', 'l', 'm',
                'n', 'o', 'p', 'w', 'r', 's' ,'t' ,'v' ,'x' ,'y', 'z',' '};
        int f = 0;
        for (int i = 0; i < o1.length(); i++) {
            for (int j = 0; j < o2.length(); j++) {
                int a=finderArray(o1.charAt(i),alphabet);
                int b=finderArray(o2.charAt(j),alphabet);
                f=a-b;
            }
        }
        return f;
    }

    private static int finderArray(char city,char[] alp){
        int find=0;
        for(int i=0;i<alp.length;i++){
            if(city==alp[i])find=i;
        }
        return find;
    }
    public static String generatorString(){
        String str="";
        char[] alphabet=new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k', 'l', 'm',
                'n', 'o', 'p', 'w', 'r', 's' ,'t' ,'v' ,'x' ,'y', 'z',' ','1'};
        for(int i=0;i<25;i++){
            double x =Math.random()* 100 / 4.16;
            int b=(int) x;
            str=str+alphabet[b];
        }

        return str;
    }
    public static int generatorInt(){
        int i=0;
        for(int g=0;g<5;g++){
            double x =Math.random()* 100 / 2;
            int b=(int) x;
            i=+b;
        }
        i=i-6;
        return i;
    }

}
