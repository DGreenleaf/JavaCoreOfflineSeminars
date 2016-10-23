package examplesM9.com.company.fake;

/**
 * Created by Sergiy on 10/19/16.
 */
public class B extends A{

    public B() {
        System.out.println("\tB.constructor");
    }

    static {
        System.out.println("\tB.static1");
    }

    {
        System.out.println("\tB.init1");
    }

    {
        System.out.println("\tB.init2");
    }

    static {
        System.out.println("\tB.static2");
    }
}
