package Other_Questions;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vowels_Test {
    @Test
    public void hello() {
        Vowels vowels = new Vowels();
        String input = "hello";
        int expected = 2;
        int actual = vowels.count(input);
        assertEquals(expected, actual);
    }
}
