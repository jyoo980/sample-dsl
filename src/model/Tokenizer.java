package model;

import model.exception.EmptyStringException;
import model.exception.InvalidExpressionException;

public class Tokenizer {

    private String separator;

    public Tokenizer(String separator) {
        this.separator = separator;
    }

    public String[] tokenize(String input) throws EmptyStringException, InvalidExpressionException {
        if (input == null || input.equals("")) {
            throw new EmptyStringException("Empty string given as input");
        }
        String[] tokenizedInput = input.split(this.separator);
        if (tokenizedInput.length < 3) {
            throw new InvalidExpressionException("Invalid expression given as input");
        }
        return tokenizedInput;
    }
}
