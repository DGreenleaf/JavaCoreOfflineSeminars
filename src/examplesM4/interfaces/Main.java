package examplesM4.interfaces;

/**
 * Created by Sergiy on 9/11/16.
 */
public class Main {

    public static void main(String[] args) {

        /*
        //можно классически задать метод
        DeveloperDbService developerDbService = new DeveloperDbService();

        //а можно и при помощи интерфейса
        DBService devDbService = new DeveloperDbService();
        */


        //declaration
        DBService devDbService;


        //initialization
        devDbService = new DeveloperDbService();


    }
}
