public class FindOdd {
 public static int findIt(int[] a) {
    for (int k : a) {
            int count = 0;
            for (int i : a) {
                if (k == i)
                    count++;
            }
            if (count % 2 != 0)
                return k;
        }
        return -1;
  }
}