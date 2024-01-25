import java.util.Arrays; 
public class Kata {
    public static double findUniq(double[] arr) {

        Arrays.sort(arr);
        double start = arr[1];
        double end = arr[arr.length - 1];

        return start == end ? arr[0] : end;
    }
}