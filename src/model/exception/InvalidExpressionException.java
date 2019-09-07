package model.exception;

public class InvalidExpressionException extends ParseException {

    public InvalidExpressionException() {
        super();
    }

    public InvalidExpressionException(String msg) {
        super(msg);
    }
}
