public class ConsonantValue {
    public static int solve(final String s) {

        int max = 0;
        int sum = 0;

        for (char c : s.toCharArray())
            if (!isVowel(c)) {
                sum += c - 'a' + 1;
            }
            else {
                max = Math.max(sum, max);
                sum = 0;
            }

        max = Math.max(sum, max);
            
        return max;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}