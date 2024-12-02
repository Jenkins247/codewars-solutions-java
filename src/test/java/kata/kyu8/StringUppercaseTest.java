package kata.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUppercaseTest {
    @Test
    @DisplayName("Basic Tests")
    void basicTests() {
        assertFalse(StringUppercase.isUpperCase("c"), "Input: 'c'");
        assertTrue(StringUppercase.isUpperCase("C"), "Input: 'C'");
        assertFalse(StringUppercase.isUpperCase("hello I AM DONALD"), "Input: 'hello I AM DONALD'");
        assertTrue(StringUppercase.isUpperCase("HELLO I AM DONALD"), "Input: 'HELLO I AM DONALD'");
        assertFalse(StringUppercase.isUpperCase("ACSKLDFJSgSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSgSKLDFJSKLDFJ'");
        assertTrue(StringUppercase.isUpperCase("ACSKLDFJSGSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSGSKLDFJSKLDFJ'");
    }
}
