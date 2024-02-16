public class Kata {
    public static String position(char alphabet) {
        return "Position of alphabet: %s".formatted(String.valueOf(alphabet - 96));
    }
}