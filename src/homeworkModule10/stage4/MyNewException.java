package homeworkModule10.stage4;

/**
 * Created by Sergiy on 11/14/16.
 */

public class MyNewException extends Exception {

    private String message;

    public MyNewException(String message) {
        this.message = message;
    }

    public MyNewException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public MyNewException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public MyNewException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public MyNewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
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
