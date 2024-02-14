import java.util.Arrays;

public class Maps {
  public static int[] map(int[] arr) {
    Arrays.setAll(arr, i -> arr[i] * 2);

    return arr;
  }
}