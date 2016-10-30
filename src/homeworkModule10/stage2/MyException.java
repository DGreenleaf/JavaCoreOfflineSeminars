package homeworkModule10.stage2;

public class MyException extends Exception {

    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public MyException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public MyException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public MyException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
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
