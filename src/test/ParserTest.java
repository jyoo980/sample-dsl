package test;

import model.Parser;
import model.Tokenizer;
import model.exception.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

class ParserTest {

    private Tokenizer tokenizer;
    private Parser parser;

    @BeforeEach
    void runBefore() {
        this.tokenizer = new Tokenizer(" ");
        this.parser = new Parser(this.tokenizer);
    }

    @Test
    void testShouldThrowParseException() {
        assertThrows(ParseException.class, () -> this.parser.parse(""));
    }

    @Test
    void testParseCorrectTokens() {
        try {
            this.parser.parse("5 + 4");
        } catch (Exception e) {
            fail(e);
        }
    }
}
