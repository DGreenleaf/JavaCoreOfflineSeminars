package homeworkModule10.stage4;

/**
 * Created by Sergiy on 11/14/16.
 */
public class MyFirstException extends Exception {

    private String message;

    public MyFirstException(String message) {
        this.message = message;
    }

    public MyFirstException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public MyFirstException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public MyFirstException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public MyFirstException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}