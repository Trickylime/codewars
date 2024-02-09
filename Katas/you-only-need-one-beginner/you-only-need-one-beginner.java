import java.util.Arrays;
public class Solution {
    public static boolean check(Object[] a, Object x) {

        String[] aString = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            aString[i] = String.valueOf(a[i]);
        }
        Arrays.sort(aString);
        return Arrays.binarySearch(aString, String.valueOf(x)) > -1;
    }
}