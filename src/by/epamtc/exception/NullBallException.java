package by.epamtc.exception;

public class NullBallException extends Exception {

    public NullBallException() {
    }

    public NullBallException(String message) {
        super(message);
    }

    public NullBallException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullBallException(Throwable cause) {
        super(cause);
    }

}
