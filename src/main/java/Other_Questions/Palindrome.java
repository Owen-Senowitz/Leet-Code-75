package Other_Questions;

public class Palindrome {
    public boolean isPalindrome(String input) {
        String inputReversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            inputReversed = inputReversed + input.charAt(i);
        }
        if (input.equals(inputReversed)) {
            return true;
        } else {
            return false;
        }
    }
}
