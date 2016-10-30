package homeworkModule10.stage2;

/**
 * Created by Sergiy on 10/31/16.
 */
public class ExceptionT2 {


    public static void main(String[] args) throws Exception {

        try {
            throw new MyException("This is my error");
        } catch (MyException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("In finally block");
        }
    }
}

