package homeworkModule10.stage1;

/*
 Create a class with a main( ) that throws an object of class Exception inside a try block.
 Give the constructor for Exception a String argument.
 Catch the exception inside a catch clause and print the String argument.
 Add a finally clause and print a message to prove you were there.
 */

public class ExceptionTask {

    public static void main(String[] args) throws Exception {

        String a = "Some error message";

        try {
            throw new Exception(a);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finally done");

        }
    }
}


