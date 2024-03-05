package Other_Questions;

public class Factorial {
    public int calculate(int input) {
        int output = 1;
        for (int i = 1; i < input + 1; i++) {
            output = output * i;
        }
        return output;
    }
}
