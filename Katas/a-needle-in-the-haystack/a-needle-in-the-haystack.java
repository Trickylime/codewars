public class Kata {
    public static String findNeedle(Object[] haystack) {
        
        int position = 0;
        for(int i = 0; i < haystack.length; i++)
            if (haystack[i] == "needle") position = i;
        
        return "found the needle at position %d".formatted(position);
    }
}