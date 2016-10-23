package examplesM9.com.company.fake;

/**
 * Created by Sergiy on 10/19/16.
 */
public class A {

    public A() {
        System.out.println("A.constructor");
    }

    static {
        System.out.println("A.static1");
    }

    {
        System.out.println("A.init1");
    }

    {
        System.out.println("A.init2");
    }

    static {
        System.out.println("A.static2");
    }
}
