import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @Test
    public void testCharTypeUppercase() {
        Password p = new Password("A");
        assertEquals(1, p.CharType('A'));
    }

    @Test
    public void testCharTypeLowercase() {
        Password p = new Password("a");
        assertEquals(2, p.CharType('a'));
    }

    @Test
    public void testCharTypeDigit() {
        Password p = new Password("5");
        assertEquals(3, p.CharType('5'));
    }

    @Test
    public void testCharTypeSymbol() {
        Password p = new Password("@");
        assertEquals(4, p.CharType('@'));
    }

    @Test
    public void testPasswordStrength_AllTypesLength16() {
        Password p = new Password("Aa1!Aa1!Aa1!Aa1!");
        assertEquals(6, p.PasswordStrength());
    }

    @Test
    public void testPasswordStrength_Medium() {
        Password p = new Password("abc123"); // lower, digit, <8
        assertEquals(2, p.PasswordStrength());
    }

    @Test
    public void testCalculateScore_Weak() {
        Password p = new Password("abc");
        assertEquals("This is a weak password :( definitely find a new one", p.calculateScore());
    }

    @Test
    public void testCalculateScore_Medium() {
        Password p = new Password("abc123");
        assertEquals("This is a medium password :/ try making it better", p.calculateScore());
    }

    @Test
    public void testCalculateScore_Good() {
        Password p = new Password("abc123AB$");
        assertEquals("This is a good password :) but you can still do better", p.calculateScore());
    }

    @Test
    public void testCalculateScore_VeryGood() {
        Password p = new Password("Abc123!@StrongPass");
        assertEquals("This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines", p.calculateScore());
    }

    @Test
    public void testToString_ReturnsPassword() {
        Password p = new Password("testPass");
        assertEquals("testPass", p.toString());
    }
}
