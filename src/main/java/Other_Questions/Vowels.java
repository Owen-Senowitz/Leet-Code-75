package Other_Questions;

public class Vowels {

    public int count(String input) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == input.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }
}
