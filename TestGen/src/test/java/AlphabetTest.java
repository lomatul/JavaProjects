import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlphabetTest {

    @Test
    void testOnlyUppercaseIncluded() {
        Alphabet alphabet = new Alphabet(true, false, false, false);
        assertEquals(Alphabet.UPPERCASE_LETTERS, alphabet.getAlphabet());
    }

    @Test
    void testOnlyLowercaseIncluded() {
        Alphabet alphabet = new Alphabet(false, true, false, false);
        assertEquals(Alphabet.LOWERCASE_LETTERS, alphabet.getAlphabet());
    }

    @Test
    void testOnlyNumbersIncluded() {
        Alphabet alphabet = new Alphabet(false, false, true, false);
        assertEquals(Alphabet.NUMBERS, alphabet.getAlphabet());
    }

    @Test
    void testOnlySymbolsIncluded() {
        Alphabet alphabet = new Alphabet(false, false, false, true);
        assertEquals(Alphabet.SYMBOLS, alphabet.getAlphabet());
    }

    @Test
    void testAllIncluded() {
        Alphabet alphabet = new Alphabet(true, true, true, true);
        String expected = Alphabet.UPPERCASE_LETTERS +
                Alphabet.LOWERCASE_LETTERS +
                Alphabet.NUMBERS +
                Alphabet.SYMBOLS;
        assertEquals(expected, alphabet.getAlphabet());
    }

    @Test
    void testNoneIncluded() {
        Alphabet alphabet = new Alphabet(false, false, false, false);
        assertEquals("", alphabet.getAlphabet());
    }

    @Test
    void testUppercaseAndNumbersIncluded() {
        Alphabet alphabet = new Alphabet(true, false, true, false);
        String expected = Alphabet.UPPERCASE_LETTERS + Alphabet.NUMBERS;
        assertEquals(expected, alphabet.getAlphabet());
    }

    @Test
    void testLowercaseAndSymbolsIncluded() {
        Alphabet alphabet = new Alphabet(false, true, false, true);
        String expected = Alphabet.LOWERCASE_LETTERS + Alphabet.SYMBOLS;
        assertEquals(expected, alphabet.getAlphabet());
    }
}
