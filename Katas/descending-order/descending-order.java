import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String[] s = String.valueOf(num).split("");
    Arrays.sort(s, Collections.reverseOrder());
    return Integer.parseInt(String.join("", s));
  }
}