package model;

import model.exception.ParseException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    private Tokenizer tokenizer;
    private List<String> validOps;

    public Parser(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
        this.validOps = new ArrayList<>();
        this.validOps.add("+");
        this.validOps.add("-");
    }

    public void parse(String input)  throws ParseException {
        try {
            String[] tokens = this.tokenizer.tokenize(input);
            if (this.representValidExpr(tokens)) {
                Arrays.stream(tokens).forEach(System.out::println);
                // TODO: transform the validated tokens into an AST using the Expr interface
            } else {
                throw new ParseException("Error: invalid input string provided: " + input);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private boolean representValidExpr(String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            if (i % 2 != 0) {
                String operand = tokens[i];
                if (!this.validOps.contains(operand)) {
                    return false;
                }
            } else {
                String numStr = tokens[i];
                if (this.validOps.contains(numStr)) {
                    return false;
                }
            }
        }
        return true;
    }
}
