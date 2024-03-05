package Other_Questions;

public class Prime {
    public boolean isPrime(int input) {
        for (int i = 2; i < input; i++) {
            if ((input % i) == 0) {
                System.out.println(input % i);
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
