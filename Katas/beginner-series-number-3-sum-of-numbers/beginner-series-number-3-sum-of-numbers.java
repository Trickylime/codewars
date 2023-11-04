  public class Sum
  {
    public static int GetSum(int a, int b)
    {
        if (a == b) return a; // When a and b are equal, return either one.

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        return (max - min + 1) * (min + max) / 2;
    }
  }