package Other_Questions;

public class Maximum {
    public int find(int[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }
}
