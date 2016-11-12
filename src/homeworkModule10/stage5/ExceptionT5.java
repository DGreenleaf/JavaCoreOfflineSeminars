package homeworkModule10.stage5;

/*
 Create three new types of exceptions.
 Write a class with a method that throws all three.
 In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */

public class ExceptionT5 {

    public static void test(int amount) throws FirstException, SecondException, ThirdException {
        switch (amount) {
            case 1:
                throw new FirstException ();
            case 2:
                throw new SecondException ();
            case 3:
                throw new ThirdException ();
        }

    }

    public static void main(String[] args) {

        try {
            test(3);
        } catch ( FirstException | SecondException | ThirdException exc) {
            System.out.println(exc);
        }

    }

}



