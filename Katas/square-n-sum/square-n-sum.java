import java.util.stream.IntStream;

public class Kata
 {
    public static int squareSum(int[] n)
    {
        return IntStream.of(n).map(n1 -> (n1 * n1)).sum();
    }
 }