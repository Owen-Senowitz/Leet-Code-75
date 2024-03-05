package Other_Questions;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCD_Test {
    @Test
    public void first() {
        GCD gcd = new GCD();
        int input1 = 12;
        int input2 = 18;
        int expected = 6;
        int actual = gcd.find(input1, input2);
        assertEquals(expected, actual);
    }
    @Test
    public void second() {
        GCD gcd = new GCD();
        int input1 = 18;
        int input2 = 12;
        int expected = 6;
        int actual = gcd.find(input1, input2);
        assertEquals(expected, actual);
    }

    @Test
    public void third() {
        GCD gcd = new GCD();
        int input1 = 25;
        int input2 = 35;
        int expected = 5; // The GCD of 25 and 35 is 5
        int actual = gcd.find(input1, input2);
        assertEquals(expected, actual);
    }
}
