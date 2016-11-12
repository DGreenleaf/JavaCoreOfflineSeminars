package homeworkModule10.stage5;

/**
 * Created by Sergiy on 11/12/16.
 */
public class SecondException extends Exception{

    private String exceptionTwo;

    @Override
    public String toString() {
        return "SecondException{" +
                "exceptionTwo='" + exceptionTwo + '\'' +
                '}';
    }
}

