package model.exception;

public class EmptyStringException extends ParseException {

    public EmptyStringException() {
        super();
    }

    public EmptyStringException(String msg) {
        super(msg);
    }
}
