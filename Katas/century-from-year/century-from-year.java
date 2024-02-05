public class Solution {
  public static int century(int number) {
    return (--number / 100) + 1;
  }
}