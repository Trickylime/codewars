import java.util.Arrays;
import java.util.List;

public class Vowels {

  public static int getCount(String str) {
    List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
    return (int) Arrays.stream(str.split("")).filter(vowels::contains).count();
  }
}