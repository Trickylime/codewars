import java.util.Arrays;

public class Kata
{
  public static boolean smallEnough(int[] a, int limit)
  {
    Arrays.sort(a);
    return a[a.length - 1] <= limit;
  }
}