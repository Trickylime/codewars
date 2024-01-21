import java.util.Arrays;
public class Kata {
    public static boolean isAnagram(String test, String original) {

        String[] a = test.toLowerCase().split("");
        Arrays.sort(a);

        String[] b = original.toLowerCase().split("");
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}