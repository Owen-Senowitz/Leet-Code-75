package Other_Questions;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Factorial_Test {
    @Test
    public void five() {
        Factorial factorial = new Factorial();
        int input = 5;
        int expect = 120;
        int actual = factorial.calculate(input);
        assertEquals(expect, actual);
    }
}
