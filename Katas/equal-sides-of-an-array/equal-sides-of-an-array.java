import java.util.Arrays;
public class Kata {
    public static int findEvenIndex(int[] arr) {

        int sumOfRight = Arrays.stream(arr).sum();
        int sumOfLeft = 0;

        for (int i = 0; i < arr.length; i++) {
            
            sumOfRight -= arr[i];

            if (sumOfLeft == sumOfRight) return i;

            sumOfLeft += arr[i];
        }

        return -1;
    }
}