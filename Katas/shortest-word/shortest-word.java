public class Kata {
    public static int findShort(String s) {

        String[] splitS = s.split(" ");
        int result = Integer.MAX_VALUE;

        for (String string : splitS) {
            if (string.length() < result)
                result = string.length();
        }

        return result;
    }
}