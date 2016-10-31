package homeworkModule10.stage4;

import homeworkModule10.stage2.MyException;

/**
 * Created by Sergiy on 10/31/16.
 */
public class ExceptionT4 {


    public static void main(String[] args) {
        f();
    }

    private static void f() {
        try {
            g();
        } catch (Throwable e) {
            System.err.println(e.getMessage());
        }
    }

    private static void g() throws MyException {
        throw new MyException("Wrong action");
    }
}

