package Other_Questions;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String_Reverse_Test {
    @Test
    public void hello() {
        String_Reverse stringReverse = new String_Reverse();
        String input = "hello";
        String expected = "olleh";
        String actual = stringReverse.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void another() {
        String_Reverse stringReverse = new String_Reverse();
        String input = "another";
        String expected = "rehtona";
        String actual = stringReverse.reverse(input);
        assertEquals(expected, actual);
    }
}
