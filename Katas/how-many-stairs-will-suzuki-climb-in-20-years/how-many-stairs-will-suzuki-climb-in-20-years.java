import java.util.Arrays;
public class Kata {
    public static long stairsIn20(int[][] stairs) {

        long total = 0;

        for (int[] day : stairs) {
            for (int steps : day) {
                total += steps;
            }
        }

        return total * 20;
    }
}