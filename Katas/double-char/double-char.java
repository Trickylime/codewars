public class Solution{
  public static String doubleChar(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      result.append((s.charAt(i))).append((s.charAt(i)));
    }
    return result.toString();
  }
}