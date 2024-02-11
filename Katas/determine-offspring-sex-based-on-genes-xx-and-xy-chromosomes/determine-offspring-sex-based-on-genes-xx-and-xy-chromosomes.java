public class Kata {
  public static String chromosomeCheck(String sperm) {
return "Congratulations! You're going to have a %s."
  .formatted(sperm.equals("XX") ? "daughter" : "son");
  }
}