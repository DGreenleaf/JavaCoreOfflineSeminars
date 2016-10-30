package homeworkModule10.stage1;

/**
 * Created by Sergiy on 10/30/16.
 */
public class ExceptionTask {

    public static void main(String[] args) throws Exception {

        String a = "Some error message";

        try {
            throw new Exception(a);

        } catch (Throwable t) {

            System.err.println(a);
        }

        System.out.println("Finally done");
    }
}

