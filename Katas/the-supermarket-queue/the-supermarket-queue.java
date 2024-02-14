import java.util.Arrays;
import java.util.stream.IntStream;
public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int n) {

        if (n == 1) {
            return IntStream.of(customers).sum();
        }

        int[] till = new int[n];

        for (int customer : customers) {

            int tillTime = Integer.MAX_VALUE;
            int tillTimeIndex = -1;

            for (int j = 0; j < n; j++) {
                if (till[j] == 0) {
                    till[j] += customer;
                    break;
                }

                if (till[j] < tillTime) {
                    tillTime = till[j];
                    tillTimeIndex = j;
                }

                if(j == n - 1){
                    till[tillTimeIndex] += customer;
                }
            }
        }

        Arrays.sort(till);

        return till[n - 1];
    }
}