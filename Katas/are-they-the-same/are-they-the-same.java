import java.util.Arrays;
public class AreSame {
 
    public static boolean comp(int[] a, int[] b) {
        //Check if a and b are valid for testing
        if (a == null || b == null || a.length < b.length || b.length < a.length) return false;
        
        for (int i = 0; i < a.length; i++)
            a[i] = Math.abs(a[i]); //Convert negative numbers to positive so a and b sort correctly

        Arrays.sort(a);
        Arrays.sort(b);
        boolean result = true;

        for(int i = 0; i < a.length; i++){
            if (a[i] * a[i] != b[i]) { //If a isn't the square root of b
                result = false;
                break;
            }
        }
        return result;
    }
}