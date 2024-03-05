package Other_Questions;

public class String_Reverse {
    public String reverse(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        return output;
    }
}
