package homeworkModule10.stage4;

/*
 Create a class with two methods, f( ) and g( ).
 In g( ), throw an exception of a new type that you define.
 In f( ), call g( ), catch its exception and, in the catch clause,
 throw a different exception (of a second type that you define).
 Test your code in main( ).
 */

import homeworkModule10.stage2.MyException;

public class ExceptionT4 {


    public static void main(String[] args) throws MyNewException{
        f();

    }

    private static void g() throws MyFirstException {
        throw new MyFirstException("Wrong action");
    }

    private static void f() throws MyNewException {
        try {
            g();
        } catch (MyFirstException e) {
            throw new MyNewException(e.getMessage());
        }
    }
}



