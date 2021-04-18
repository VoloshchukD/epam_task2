package by.epamtc.exception;

public class BasketOverFlowException extends Exception {

    public BasketOverFlowException() {
    }

    public BasketOverFlowException(String message) {
        super(message);
    }

    public BasketOverFlowException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketOverFlowException(Throwable cause) {
        super(cause);
    }

}
