package homeworkModule10.stage5;

import homeworkModule10.stage2.MyException;

/**
 * Created by Sergiy on 10/31/16.
 */
public class ExceptionT5 {

    public static void main(String[] args) {
        try {
            threeErrors();
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void threeErrors() throws MyException {
        throw new MyException("First exception");
    }
}

