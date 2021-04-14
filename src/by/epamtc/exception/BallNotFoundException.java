package by.epamtc.exception;

public class BallNotFoundException extends Exception {

    public BallNotFoundException() {
        super();
    }

    public BallNotFoundException(String message) {
        super(message);
    }

    public BallNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BallNotFoundException(Throwable cause) {
        super(cause);
    }

}
