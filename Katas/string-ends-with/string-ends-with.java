public class Kata {
    public static boolean solution(String str, String ending) {
        
        return str.length() >= ending.length() ?
                str.substring(str.length() - ending.length()).contains(ending) :
                str.contains(ending);
    }
}