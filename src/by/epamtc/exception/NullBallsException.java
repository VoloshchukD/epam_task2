package by.epamtc.exception;

public class NullBallsException extends Exception {

    public NullBallsException() {
        super();
    }

    public NullBallsException(String message) {
        super(message);
    }

    public NullBallsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullBallsException(Throwable cause) {
        super(cause);
    }

}
