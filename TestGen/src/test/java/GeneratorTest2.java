//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import java.util.Scanner;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class GeneratorTest2 {
//
//    private Generator generator;
//    private Scanner mockScanner;
//
//    @BeforeEach
//    public void setUp() {
//        // Initialize a dummy scanner for the constructor
//        mockScanner = new Scanner(System.in);
//        generator = new Generator(mockScanner);
//    }
//
//    @Test
//    public void testGeneratePasswordLength() {
//        Generator testGenerator = new Generator(true, true, true, true);
//        Password generatedPassword = testGenerator.GeneratePassword(12);
//        assertEquals(12, generatedPassword.toString().length());
//    }
//
//    @Test
//    public void testGeneratePasswordIncludesOnlyAllowedCharacters() {
//        Generator testGenerator = new Generator(true, false, false, false);
//        Password password = testGenerator.GeneratePassword(10);
//        assertTrue(password.toString().matches("[A-Z]+"));
//
//        testGenerator = new Generator(false, true, false, false);
//        password = testGenerator.GeneratePassword(10);
//        assertTrue(password.toString().matches("[a-z]+"));
//
//        testGenerator = new Generator(false, false, true, false);
//        password = testGenerator.GeneratePassword(10);
//        assertTrue(password.toString().matches("[0-9]+"));
//
//        testGenerator = new Generator(false, false, false, true);
//        password = testGenerator.GeneratePassword(10);
//        assertTrue(password.toString().matches("[!@#$%^&*()\-_=+\\/~?]+"));
//    }
//
//    @Test
//    public void testIsIncludeReturnsTrueForYes() {
//        assertTrue(generator.isInclude("yes"));
//        assertTrue(generator.isInclude("YES"));
//    }
//
//    @Test
//    public void testIsIncludeReturnsFalseForNo() {
//        assertFalse(generator.isInclude("no"));
//        assertFalse(generator.isInclude("NO"));
//    }
//
//    @Test
//    public void testIsIncludeReturnsFalseForInvalidInput() {
//        assertFalse(generator.isInclude("maybe"));
//        assertFalse(generator.isInclude("123"));
//    }
//}
