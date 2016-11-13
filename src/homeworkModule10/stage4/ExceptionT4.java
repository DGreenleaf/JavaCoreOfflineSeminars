package homeworkModule10.stage4;

import homeworkModule10.stage2.MyException;

/*
 Create a class with two methods, f( ) and g( ).
 In g( ), throw an exception of a new type that you define.
 In f( ), call g( ), catch its exception and, in the catch clause,
 throw a different exception (of a second type that you define).
 Test your code in main( ).
 */
public class ExceptionT4 {


    public static void main(String[] args) {
        f();
    }

    private static void g() throws MyException {
        throw new MyException("Wrong action");
    }

    private static void f() throws ClassCastException{
        try {
            g();
        } catch (MyException e) {
            throw new ClassCastException(e.getMessage());
        }
    }
}



