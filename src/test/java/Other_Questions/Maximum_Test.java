package Other_Questions;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Maximum_Test {
    @Test
    public void first() {
        Maximum maximum = new Maximum();
        int[] input = {3, 7, 2, 9, 5};
        int expect = 9;
        int actual = maximum.find(input);
        assertEquals(expect, actual);
    }
}
