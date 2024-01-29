import java.util.stream.IntStream;
public class Kata {
  public static int[] between(int a, int b) {
    return IntStream.rangeClosed(a,b).toArray();
  }
}