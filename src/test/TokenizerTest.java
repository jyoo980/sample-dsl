package test;

import model.Tokenizer;
import model.exception.EmptyStringException;
import model.exception.InvalidExpressionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenizerTest {

    private Tokenizer tokenizer;

    @BeforeEach
    void runBefore() {
        this.tokenizer = new Tokenizer(" ");
    }

    @Test
    void testShouldThrowEmptyStringException() {
        assertThrows(EmptyStringException.class, () -> this.tokenizer.tokenize(""));
    }

    @Test
    void shouldThrowInvalidExpressionException() {
        assertThrows(InvalidExpressionException.class, () -> this.tokenizer.tokenize("5 +"));
    }

    @Test
    void testShouldParseAddExpr() {
        try {
            String[] result = this.tokenizer.tokenize("5 + 4");
            assertArrayEquals(new String[]{"5", "+", "4"}, result);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void testShouldParseSubExpr() {
        try {
            String[] result = this.tokenizer.tokenize("5 - 4");
            assertArrayEquals(new String[]{"5", "-", "4"}, result);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void testShouldParseMixedExpr() throws EmptyStringException {
        try {
            String[] result = this.tokenizer.tokenize("5 - 4 + 4 + 5 - 3");
            assertArrayEquals(new String[]{"5", "-", "4", "+", "4", "+", "5", "-", "3"}, result);
        } catch (Exception e) {
            fail();
        }
    }
}
