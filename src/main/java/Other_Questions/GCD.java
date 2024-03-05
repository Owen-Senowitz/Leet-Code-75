package Other_Questions;

public class GCD {
    public int find(int input1, int input2) {
        int smallestInput;
        int gcd = 0;
        if (input1 > input2) {
            smallestInput = input1;
        } else {
            smallestInput = input2;
        }
        for (int i = 1; i < smallestInput; i++) {
            if (((input1 % i) == 0) && ((input2 % i) == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}
