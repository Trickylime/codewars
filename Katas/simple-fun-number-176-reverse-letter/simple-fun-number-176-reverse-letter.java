public class Kata {
    public static String reverseLetter(final String str) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(str.replaceAll("[^a-zA-Z]", ""));
        
        return sb.reverse().toString();
    }
}