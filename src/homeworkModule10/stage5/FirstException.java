package homeworkModule10.stage5;

/**
 * Created by Sergiy on 11/12/16.
 */
public class FirstException extends Exception{
    private String exceptionOne;

    @Override
    public String toString() {
        return "FirstException{" +
                "exceptionOne='" + exceptionOne + '\'' +
                '}';
    }
}
