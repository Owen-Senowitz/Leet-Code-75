package Other_Questions;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prime_Test {
    @Test
    public void one() {
        Prime prime = new Prime();
        int input = 1;
        boolean expected = false;
        boolean actual = prime.isPrime(input);
        assertEquals(expected, actual);
    }

    @Test
    public void five() {
        Prime prime = new Prime();
        int input = 5;
        boolean expected = true;
        boolean actual = prime.isPrime(input);
        assertEquals(expected, actual);
    }

    @Test
    public void six() {
        Prime prime = new Prime();
        int input = 6;
        boolean expected = false;
        boolean actual = prime.isPrime(input);
        assertEquals(expected, actual);
    }
}
