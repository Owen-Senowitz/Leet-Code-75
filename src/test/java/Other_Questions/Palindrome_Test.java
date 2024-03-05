package Other_Questions;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class Palindrome_Test {

    @Test
    public void raceCar() {
        Palindrome palindrome = new Palindrome();
        String input = "racecar";
        boolean expected = true;
        boolean actual = palindrome.isPalindrome(input);
        assertEquals(expected, actual);
    }
    @Test
    public void hello() {
        Palindrome palindrome = new Palindrome();
        String input = "hello";
        boolean expected = false;
        boolean actual = palindrome.isPalindrome(input);
        assertEquals(expected, actual);
    }
}
